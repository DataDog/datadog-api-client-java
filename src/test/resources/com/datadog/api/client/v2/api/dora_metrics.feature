@endpoint(dora-metrics) @endpoint(dora-metrics-v2)
Feature: DORA Metrics
  Send events for DORA Metrics to measure and improve software delivery. See
  the [DORA Metrics page](https://docs.datadoghq.com/dora_metrics/) for more
  information.

  Background:
    Given a valid "apiKeyAuth" key in the system
    And an instance of "DORAMetrics" API

  @skip @team:DataDog/ci-app-backend
  Scenario: Send a deployment event for DORA Metrics returns "Bad Request" response
    Given operation "CreateDORADeployment" enabled
    And new "CreateDORADeployment" request
    And body with value {"data": {"attributes": {}}}
    When the request is sent
    Then the response status is 400 Bad Request

  @skip @team:DataDog/ci-app-backend
  Scenario: Send a deployment event for DORA Metrics returns "OK - but delayed due to incident" response
    Given operation "CreateDORADeployment" enabled
    And new "CreateDORADeployment" request
    And body with value {"data": {"attributes": {"finished_at": 1693491984000000000, "git": {"commit_sha": "66adc9350f2cc9b250b69abddab733dd55e1a588", "repository_url": "https://github.com/organization/example-repository"}, "service": "shopist", "started_at": 1693491974000000000, "version": "v1.12.07"}}}
    When the request is sent
    Then the response status is 202 OK - but delayed due to incident

  @replay-only @team:DataDog/ci-app-backend
  Scenario: Send a deployment event for DORA Metrics returns "OK" response
    Given operation "CreateDORADeployment" enabled
    And new "CreateDORADeployment" request
    And body with value {"data": {"attributes": {"finished_at": 1693491984000000000, "git": {"commit_sha": "66adc9350f2cc9b250b69abddab733dd55e1a588", "repository_url": "https://github.com/organization/example-repository"}, "service": "shopist", "started_at": 1693491974000000000, "version": "v1.12.07"}}}
    When the request is sent
    Then the response status is 200 OK

  @skip @team:DataDog/ci-app-backend
  Scenario: Send an incident event for DORA Metrics returns "Bad Request" response
    Given operation "CreateDORAIncident" enabled
    And new "CreateDORAIncident" request
    And body with value {"data": {"attributes": {}}}
    When the request is sent
    Then the response status is 400 Bad Request

  @generated @skip @team:DataDog/ci-app-backend
  Scenario: Send an incident event for DORA Metrics returns "OK - but delayed due to incident" response
    Given operation "CreateDORAIncident" enabled
    And new "CreateDORAIncident" request
    And body with value {"data": {"attributes": {"env": "staging", "finished_at": 1693491984000000000, "git": {"commit_sha": "66adc9350f2cc9b250b69abddab733dd55e1a588", "repository_url": "https://github.com/organization/example-repository"}, "name": "Webserver is down failing all requests.", "services": ["shopist"], "severity": "High", "started_at": 1693491974000000000, "team": "backend", "version": "v1.12.07"}}}
    When the request is sent
    Then the response status is 202 OK - but delayed due to incident

  @replay-only @team:DataDog/ci-app-backend
  Scenario: Send an incident event for DORA Metrics returns "OK" response
    Given operation "CreateDORAIncident" enabled
    And new "CreateDORAIncident" request
    And body with value {"data": {"attributes": {"finished_at": 1707842944600000000, "git": {"commit_sha": "66adc9350f2cc9b250b69abddab733dd55e1a588", "repository_url": "https://github.com/organization/example-repository"}, "name": "Webserver is down failing all requests", "services": ["shopist"], "severity": "High", "started_at": 1707842944500000000, "team": "backend", "version": "v1.12.07"}}}
    When the request is sent
    Then the response status is 200 OK
