package restassured.board.create;

import model.creators.RequestCreator;
import model.creators.ResponseCreator;
import model.domain.Board;
import model.test.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import restassured.client.RestAssuredClient;
import utility.config.BoardConfig;

public class CreateBoardTests extends BaseTest<Board> {

    @Test(groups="creationRest", dependsOnGroups="authenticationRest")
    void shouldCreateNewBoard() {
        //Given

        //When

        //Then
        validator.checkStatusCode();
        validator.checkHasBody();
        validator.checkResponse();
    }

    @BeforeMethod
    @Override
    public void sendRequest() {
        actualResponse = httpClient.postNewBoard();
        id = actualResponse.getBody().getId();
        createValidator();
    }

    @BeforeClass
    @Override
    public void createHttpClient() {
        httpClient = new RestAssuredClient(RequestCreator.getRequestWithName(
                BoardConfig.getCreatedBoardName()));
    }

    @BeforeClass
    @Override
    public void createUserValue() {
        expectedResponse = ResponseCreator.getBoardResponse();
    }
}
