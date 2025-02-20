@endpoint(aws-integration) @endpoint(aws-integration-v1)
Feature: AWS Integration
  Configure your Datadog-AWS integration directly through the Datadog API.
  For more information, see the [AWS integration
  page](https://docs.datadoghq.com/integrations/amazon_web_services).

  Background:
    Given a valid "apiKeyAuth" key in the system
    And a valid "appKeyAuth" key in the system
    And an instance of "AWSIntegration" API

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Create an AWS integration returns "Bad Request" response
    Given new "CreateAWSAccount" request
    And body with value {"account_id": "123456789012", "account_specific_namespace_rules": {"auto_scaling": false, "opswork": false}, "cspm_resource_collection_enabled": true, "excluded_regions": ["us-east-1", "us-west-2"], "extended_resource_collection_enabled": true, "filter_tags": ["$KEY:$VALUE"], "host_tags": ["$KEY:$VALUE"], "metrics_collection_enabled": false, "resource_collection_enabled": true, "role_name": "DatadogAWSIntegrationRole"}
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Create an AWS integration returns "Conflict Error" response
    Given new "CreateAWSAccount" request
    And body with value {"account_id": "123456789012", "account_specific_namespace_rules": {"auto_scaling": false, "opswork": false}, "cspm_resource_collection_enabled": true, "excluded_regions": ["us-east-1", "us-west-2"], "extended_resource_collection_enabled": true, "filter_tags": ["$KEY:$VALUE"], "host_tags": ["$KEY:$VALUE"], "metrics_collection_enabled": false, "resource_collection_enabled": true, "role_name": "DatadogAWSIntegrationRole"}
    When the request is sent
    Then the response status is 409 Conflict Error

  @team:DataDog/aws-integrations
  Scenario: Create an AWS integration returns "OK" response
    Given new "CreateAWSAccount" request
    And body with value {"account_id": "{{ timestamp("now") }}00", "account_specific_namespace_rules": {"auto_scaling": false}, "cspm_resource_collection_enabled": true, "excluded_regions": ["us-east-1", "us-west-2"], "extended_resource_collection_enabled": true, "filter_tags": ["$KEY:$VALUE"], "host_tags": ["$KEY:$VALUE"], "metrics_collection_enabled": false, "role_name": "DatadogAWSIntegrationRole"}
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Create an Amazon EventBridge source returns "Bad Request" response
    Given new "CreateAWSEventBridgeSource" request
    And body with value {"account_id": "123456789012", "create_event_bus": true, "event_generator_name": "app-alerts", "region": "us-east-1"}
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Create an Amazon EventBridge source returns "OK" response
    Given new "CreateAWSEventBridgeSource" request
    And body with value {"account_id": "123456789012", "create_event_bus": true, "event_generator_name": "app-alerts", "region": "us-east-1"}
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Delete a tag filtering entry returns "Bad Request" response
    Given new "DeleteAWSTagFilter" request
    And body with value {"account_id": "FAKEAC0FAKEAC2FAKEAC", "namespace": "elb"}
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Delete a tag filtering entry returns "OK" response
    Given new "DeleteAWSTagFilter" request
    And body with value {"account_id": "FAKEAC0FAKEAC2FAKEAC", "namespace": "elb"}
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Delete an AWS integration returns "Bad Request" response
    Given new "DeleteAWSAccount" request
    And body with value {"account_id": "123456789012", "role_name": "DatadogAWSIntegrationRole"}
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Delete an AWS integration returns "Conflict Error" response
    Given new "DeleteAWSAccount" request
    And body with value {"account_id": "123456789012", "role_name": "DatadogAWSIntegrationRole"}
    When the request is sent
    Then the response status is 409 Conflict Error

  @team:DataDog/aws-integrations
  Scenario: Delete an AWS integration returns "OK" response
    Given there is a valid "aws_account" in the system
    And new "DeleteAWSAccount" request
    And body with value {"account_id": "{{ timestamp("now") }}00", "role_name": "DatadogAWSIntegrationRole"}
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Delete an Amazon EventBridge source returns "Bad Request" response
    Given new "DeleteAWSEventBridgeSource" request
    And body with value {"account_id": "123456789012", "event_generator_name": "app-alerts-zyxw3210", "region": "us-east-1"}
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Delete an Amazon EventBridge source returns "OK" response
    Given new "DeleteAWSEventBridgeSource" request
    And body with value {"account_id": "123456789012", "event_generator_name": "app-alerts-zyxw3210", "region": "us-east-1"}
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Generate a new external ID returns "Bad Request" response
    Given new "CreateNewAWSExternalID" request
    And body with value {"account_id": "123456789012", "account_specific_namespace_rules": {"auto_scaling": false, "opswork": false}, "cspm_resource_collection_enabled": true, "excluded_regions": ["us-east-1", "us-west-2"], "extended_resource_collection_enabled": true, "filter_tags": ["$KEY:$VALUE"], "host_tags": ["$KEY:$VALUE"], "metrics_collection_enabled": false, "resource_collection_enabled": true, "role_name": "DatadogAWSIntegrationRole"}
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Generate a new external ID returns "OK" response
    Given new "CreateNewAWSExternalID" request
    And body with value {"account_id": "123456789012", "account_specific_namespace_rules": {"auto_scaling": false, "opswork": false}, "cspm_resource_collection_enabled": true, "excluded_regions": ["us-east-1", "us-west-2"], "extended_resource_collection_enabled": true, "filter_tags": ["$KEY:$VALUE"], "host_tags": ["$KEY:$VALUE"], "metrics_collection_enabled": false, "resource_collection_enabled": true, "role_name": "DatadogAWSIntegrationRole"}
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Get all AWS tag filters returns "Bad Request" response
    Given new "ListAWSTagFilters" request
    And request contains "account_id" parameter from "REPLACE.ME"
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Get all AWS tag filters returns "OK" response
    Given new "ListAWSTagFilters" request
    And request contains "account_id" parameter from "REPLACE.ME"
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Get all Amazon EventBridge sources returns "Bad Request" response
    Given new "ListAWSEventBridgeSources" request
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Get all Amazon EventBridge sources returns "OK" response
    Given new "ListAWSEventBridgeSources" request
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/aws-integrations
  Scenario: List all AWS integrations returns "Bad Request" response
    Given new "ListAWSAccounts" request
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip @team:DataDog/aws-integrations
  Scenario: List all AWS integrations returns "OK" response
    Given new "ListAWSAccounts" request
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/aws-integrations
  Scenario: List namespace rules returns "OK" response
    Given new "ListAvailableAWSNamespaces" request
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Set an AWS tag filter returns "Bad Request" response
    Given new "CreateAWSTagFilter" request
    And body with value {"account_id": "123456789012", "namespace": "elb", "tag_filter_str": "prod*"}
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Set an AWS tag filter returns "OK" response
    Given new "CreateAWSTagFilter" request
    And body with value {"account_id": "123456789012", "namespace": "elb", "tag_filter_str": "prod*"}
    When the request is sent
    Then the response status is 200 OK

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Update an AWS integration returns "Bad Request" response
    Given new "UpdateAWSAccount" request
    And body with value {"account_id": "123456789012", "account_specific_namespace_rules": {"auto_scaling": false, "opswork": false}, "cspm_resource_collection_enabled": true, "excluded_regions": ["us-east-1", "us-west-2"], "extended_resource_collection_enabled": true, "filter_tags": ["$KEY:$VALUE"], "host_tags": ["$KEY:$VALUE"], "metrics_collection_enabled": false, "resource_collection_enabled": true, "role_name": "DatadogAWSIntegrationRole"}
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip @team:DataDog/aws-integrations
  Scenario: Update an AWS integration returns "Conflict Error" response
    Given new "UpdateAWSAccount" request
    And body with value {"account_id": "123456789012", "account_specific_namespace_rules": {"auto_scaling": false, "opswork": false}, "cspm_resource_collection_enabled": true, "excluded_regions": ["us-east-1", "us-west-2"], "extended_resource_collection_enabled": true, "filter_tags": ["$KEY:$VALUE"], "host_tags": ["$KEY:$VALUE"], "metrics_collection_enabled": false, "resource_collection_enabled": true, "role_name": "DatadogAWSIntegrationRole"}
    When the request is sent
    Then the response status is 409 Conflict Error

  @team:DataDog/aws-integrations
  Scenario: Update an AWS integration returns "OK" response
    Given there is a valid "aws_account" in the system
    And new "UpdateAWSAccount" request
    And body with value {"account_id": "{{ timestamp("now") }}00", "account_specific_namespace_rules": {"auto_scaling": false}, "cspm_resource_collection_enabled": false, "excluded_regions": ["us-east-1", "us-west-2"], "extended_resource_collection_enabled": true, "filter_tags": ["$KEY:$VALUE"], "host_tags": ["$KEY:$VALUE"], "metrics_collection_enabled": true, "role_name": "DatadogAWSIntegrationRole"}
    And request contains "account_id" parameter with value "{{ timestamp("now") }}00"
    And request contains "role_name" parameter with value "DatadogAWSIntegrationRole"
    When the request is sent
    Then the response status is 200 OK
