@endpoint(key-management) @endpoint(key-management-v2)
Feature: Personal Access Tokens
  Manage personal access tokens (PATs) and service account access tokens (SATs)
  for your organization. PATs provide scoped, time-limited access to the Datadog
  API for individual users, while SATs provide the same for service accounts.

  Background:
    Given a valid "apiKeyAuth" key in the system
    And a valid "appKeyAuth" key in the system
    And an instance of "KeyManagement" API

  @team:DataDog/credentials-management
  Scenario: Create a personal access token returns "Created" response
    Given new "CreatePersonalAccessToken" request
    And body with value {"data": {"type": "personal_access_tokens", "attributes": {"name": "{{ unique }}", "scopes": ["dashboards_read"], "expires_at": "{{ timeISO('now+365d') }}"}}}
    When the request is sent
    Then the response status is 201 Created
    And the response "data.type" is equal to "personal_access_tokens"
    And the response "data.attributes.name" is equal to "{{ unique }}"
    And the response "data.attributes.scopes" is equal to ["dashboards_read"]
    And the response "data.attributes" has field "key"

  @generated @skip @team:DataDog/credentials-management
  Scenario: Create a personal access token returns "Bad Request" response
    Given new "CreatePersonalAccessToken" request
    And body with value {"data": {"type": "personal_access_tokens", "attributes": {"name": "", "scopes": ["dashboards_read"], "expires_at": "{{ timeISO('now+365d') }}"}}}
    When the request is sent
    Then the response status is 400 Bad Request

  @team:DataDog/credentials-management
  Scenario: Get all personal access tokens returns "OK" response
    Given there is a valid "personal_access_token" in the system
    And new "ListPersonalAccessTokens" request
    When the request is sent
    Then the response status is 200 OK
    And the response "data" has item with field "type" with value "personal_access_tokens"

  @team:DataDog/credentials-management
  Scenario: Get a personal access token returns "OK" response
    Given there is a valid "personal_access_token" in the system
    And new "GetPersonalAccessToken" request
    And request contains "pat_uuid" parameter from "personal_access_token.data.id"
    When the request is sent
    Then the response status is 200 OK
    And the response "data.type" is equal to "personal_access_tokens"
    And the response "data.id" has the same value as "personal_access_token.data.id"

  @generated @skip @team:DataDog/credentials-management
  Scenario: Get a personal access token returns "Not Found" response
    Given new "GetPersonalAccessToken" request
    And request contains "pat_uuid" parameter with value "00000000-0000-0000-0000-000000000000"
    When the request is sent
    Then the response status is 404 Not Found

  @team:DataDog/credentials-management
  Scenario: Update a personal access token returns "OK" response
    Given there is a valid "personal_access_token" in the system
    And new "UpdatePersonalAccessToken" request
    And request contains "pat_uuid" parameter from "personal_access_token.data.id"
    And body with value {"data": {"type": "personal_access_tokens", "id": "{{ personal_access_token.data.id }}", "attributes": {"name": "{{ unique }}-updated"}}}
    When the request is sent
    Then the response status is 200 OK
    And the response "data.attributes.name" is equal to "{{ unique }}-updated"

  @generated @skip @team:DataDog/credentials-management
  Scenario: Update a personal access token returns "Not Found" response
    Given new "UpdatePersonalAccessToken" request
    And request contains "pat_uuid" parameter with value "00000000-0000-0000-0000-000000000000"
    And body with value {"data": {"type": "personal_access_tokens", "id": "00000000-0000-0000-0000-000000000000", "attributes": {"name": "updated"}}}
    When the request is sent
    Then the response status is 404 Not Found

  @team:DataDog/credentials-management
  Scenario: Revoke a personal access token returns "No Content" response
    Given there is a valid "personal_access_token" in the system
    And new "RevokePersonalAccessToken" request
    And request contains "pat_uuid" parameter from "personal_access_token.data.id"
    When the request is sent
    Then the response status is 204 No Content

  @generated @skip @team:DataDog/credentials-management
  Scenario: Revoke a personal access token returns "Not Found" response
    Given new "RevokePersonalAccessToken" request
    And request contains "pat_uuid" parameter with value "00000000-0000-0000-0000-000000000000"
    When the request is sent
    Then the response status is 404 Not Found

  @team:DataDog/credentials-management
  Scenario: Create a service account access token returns "Created" response
    Given there is a valid "service_account_user" in the system
    And new "CreateServiceAccountAccessToken" request
    And request contains "service_account_id" parameter from "service_account_user.data.id"
    And body with value {"data": {"type": "personal_access_tokens", "attributes": {"name": "{{ unique }}", "scopes": ["dashboards_read"]}}}
    When the request is sent
    Then the response status is 201 Created
    And the response "data.type" is equal to "personal_access_tokens"
    And the response "data.attributes.name" is equal to "{{ unique }}"
    And the response "data.attributes" has field "key"
