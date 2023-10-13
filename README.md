Create API tests on Java 

Now please automate previous task by using Java 8. You will need to implement automation tests using 3 different API Automation Libraries.


Clarification: useful guide: rest api automation guide. Project reference template: link2

- Tests should extend BaseTest which will hide all API related manipulation as well as basic api validations.

- Test should be in the test package, models (Pojos) should be in main package

- rest client (based on RestAssured) should be created before test started and should be 1 for all tests

- Use TestSteps utility classes to hide implementation of basic steps:

BuildRequest
SendRequest
CheckResponseIsValid
PrepareActualResponse
PrepareExpectedResponse
CheckActualVsExpectedResponses
- Try to use both TestNG Assertions and AssertJ assertions, to see the difference and the advantages of each



1. Create new Maven project

2. Add dependency to Maven: TestNG (search on Maven Repo new version) ApacheHTTPClient, Jackson

3. Create the model classes for serialization and deserialization of API calls - json to pojo tool

4. Create corresponding step classes to implement Postman task from above.

- Creating a new board (POST)

- Getting board by ID (GET)

- Updating board (PUT)

- Removing board (DELETE)


5. Each test should contain Assertion (you should check not only response code)

6. Add REST Assured library to your Maven

7. Create test class with the same verifications using REST Assured library

8. Add Retrofit and OkHttp libraries

9. Create test class with the same verifications using Retrofit and OkHttp libraries