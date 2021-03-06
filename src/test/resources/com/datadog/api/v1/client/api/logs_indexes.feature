@endpoint(logs-indexes)
Feature: Logs Indexes
  Manage configuration of [log
  indexes](https://docs.datadoghq.com/logs/indexes/). You need an API and
  application key with Admin rights to interact with this endpoint.

  Background:
    Given a valid "apiKeyAuth" key in the system
    And a valid "appKeyAuth" key in the system
    And an instance of "LogsIndexes" API

  @generated @skip
  Scenario: Create an index returns "Invalid Parameter Error" response
    Given new "CreateLogsIndex" request
    And body {}
    When the request is sent
    Then the response status is 400 Invalid Parameter Error

  @generated @skip
  Scenario: Create an index returns "OK" response
    Given new "CreateLogsIndex" request
    And body {}
    When the request is sent
    Then the response status is 200 OK

  @generated @skip
  Scenario: Get all indexes returns "OK" response
    Given new "ListLogIndexes" request
    When the request is sent
    Then the response status is 200 OK

  @generated @skip
  Scenario: Get an index returns "Not Found" response
    Given new "GetLogsIndex" request
    And request contains "name" parameter from "<PATH>"
    When the request is sent
    Then the response status is 404 Not Found

  @generated @skip
  Scenario: Get an index returns "OK" response
    Given new "GetLogsIndex" request
    And request contains "name" parameter from "<PATH>"
    When the request is sent
    Then the response status is 200 OK

  @generated @skip
  Scenario: Get indexes order returns "OK" response
    Given new "GetLogsIndexOrder" request
    When the request is sent
    Then the response status is 200 OK

  @generated @skip
  Scenario: Update an index returns "Invalid Parameter Error" response
    Given new "UpdateLogsIndex" request
    And request contains "name" parameter from "<PATH>"
    And body {}
    When the request is sent
    Then the response status is 400 Invalid Parameter Error

  @generated @skip
  Scenario: Update an index returns "OK" response
    Given new "UpdateLogsIndex" request
    And request contains "name" parameter from "<PATH>"
    And body {}
    When the request is sent
    Then the response status is 200 OK

  @generated @skip
  Scenario: Update an index returns "Too Many Requests" response
    Given new "UpdateLogsIndex" request
    And request contains "name" parameter from "<PATH>"
    And body {}
    When the request is sent
    Then the response status is 429 Too Many Requests

  @generated @skip
  Scenario: Update indexes order returns "Bad Request" response
    Given new "UpdateLogsIndexOrder" request
    And body {}
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip
  Scenario: Update indexes order returns "OK" response
    Given new "UpdateLogsIndexOrder" request
    And body {}
    When the request is sent
    Then the response status is 200 OK
