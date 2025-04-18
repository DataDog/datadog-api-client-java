@endpoint(logs-indexes) @endpoint(logs-indexes-v1)
Feature: Logs Indexes
  Manage configuration of [log
  indexes](https://docs.datadoghq.com/logs/indexes/).

  Background:
    Given a valid "apiKeyAuth" key in the system
    And a valid "appKeyAuth" key in the system
    And an instance of "LogsIndexes" API

  @generated @skip @team:DataDog/logs-backend @team:DataDog/logs-core
  Scenario: Create an index returns "Invalid Parameter Error" response
    Given new "CreateLogsIndex" request
    And body with value {"daily_limit": 300000000, "daily_limit_reset": {"reset_time": "14:00", "reset_utc_offset": "+02:00"}, "daily_limit_warning_threshold_percentage": 70, "exclusion_filters": [{"filter": {"query": "*", "sample_rate": 1.0}, "name": "payment"}], "filter": {"query": "source:python"}, "name": "main", "num_flex_logs_retention_days": 360, "num_retention_days": 15}
    When the request is sent
    Then the response status is 400 Invalid Parameter Error

  @generated @skip @team:DataDog/logs-backend @team:DataDog/logs-core
  Scenario: Create an index returns "OK" response
    Given new "CreateLogsIndex" request
    And body with value {"daily_limit": 300000000, "daily_limit_reset": {"reset_time": "14:00", "reset_utc_offset": "+02:00"}, "daily_limit_warning_threshold_percentage": 70, "exclusion_filters": [{"filter": {"query": "*", "sample_rate": 1.0}, "name": "payment"}], "filter": {"query": "source:python"}, "name": "main", "num_flex_logs_retention_days": 360, "num_retention_days": 15}
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/logs-backend @team:DataDog/logs-core
  Scenario: Delete an index returns "Not Found" response
    Given new "DeleteLogsIndex" request
    And request contains "name" parameter from "REPLACE.ME"
    When the request is sent
    Then the response status is 404 Not Found

  @generated @skip @team:DataDog/logs-backend @team:DataDog/logs-core
  Scenario: Delete an index returns "OK" response
    Given new "DeleteLogsIndex" request
    And request contains "name" parameter from "REPLACE.ME"
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/logs-backend @team:DataDog/logs-core
  Scenario: Get all indexes returns "OK" response
    Given new "ListLogIndexes" request
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/logs-backend @team:DataDog/logs-core
  Scenario: Get an index returns "Not Found" response
    Given new "GetLogsIndex" request
    And request contains "name" parameter from "REPLACE.ME"
    When the request is sent
    Then the response status is 404 Not Found

  @generated @skip @team:DataDog/logs-backend @team:DataDog/logs-core
  Scenario: Get an index returns "OK" response
    Given new "GetLogsIndex" request
    And request contains "name" parameter from "REPLACE.ME"
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/logs-backend @team:DataDog/logs-core
  Scenario: Get indexes order returns "OK" response
    Given new "GetLogsIndexOrder" request
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/logs-backend @team:DataDog/logs-core
  Scenario: Update an index returns "Invalid Parameter Error" response
    Given new "UpdateLogsIndex" request
    And request contains "name" parameter from "REPLACE.ME"
    And body with value {"daily_limit": 300000000, "daily_limit_reset": {"reset_time": "14:00", "reset_utc_offset": "+02:00"}, "daily_limit_warning_threshold_percentage": 70, "disable_daily_limit": false, "exclusion_filters": [{"filter": {"query": "*", "sample_rate": 1.0}, "name": "payment"}], "filter": {"query": "source:python"}, "num_flex_logs_retention_days": 360, "num_retention_days": 15}
    When the request is sent
    Then the response status is 400 Invalid Parameter Error

  @generated @skip @team:DataDog/logs-backend @team:DataDog/logs-core
  Scenario: Update an index returns "OK" response
    Given new "UpdateLogsIndex" request
    And request contains "name" parameter from "REPLACE.ME"
    And body with value {"daily_limit": 300000000, "daily_limit_reset": {"reset_time": "14:00", "reset_utc_offset": "+02:00"}, "daily_limit_warning_threshold_percentage": 70, "disable_daily_limit": false, "exclusion_filters": [{"filter": {"query": "*", "sample_rate": 1.0}, "name": "payment"}], "filter": {"query": "source:python"}, "num_flex_logs_retention_days": 360, "num_retention_days": 15}
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/logs-backend @team:DataDog/logs-core
  Scenario: Update indexes order returns "Bad Request" response
    Given new "UpdateLogsIndexOrder" request
    And body with value {"index_names": ["main", "payments", "web"]}
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip @team:DataDog/logs-backend @team:DataDog/logs-core
  Scenario: Update indexes order returns "OK" response
    Given new "UpdateLogsIndexOrder" request
    And body with value {"index_names": ["main", "payments", "web"]}
    When the request is sent
    Then the response status is 200 OK
