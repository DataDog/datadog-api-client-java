# datadog-api-client-java

This repository contains a Java API client for the [Datadog API](https://docs.datadoghq.com/api/).
The code is generated using [openapi-generator](https://github.com/OpenAPITools/openapi-generator)
and [apigentools](https://github.com/DataDog/apigentools).

Datadog API Collection

- API version: 1.0

Collection of all Datadog Public endpoints.

  For more information, please visit [https://www.datadoghq.com/support/](https://www.datadoghq.com/support/)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.datadoghq</groupId>
  <artifactId>datadog-api-client</artifactId>
  <version>1.0.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "com.datadoghq:datadog-api-client:1.0.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/datadog-api-client-1.0.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import com.datadog.api.v1.client.*;
import com.datadog.api.v1.client.auth.*;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

public class AwsIntegrationApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.datadoghq.com");
        
        // Configure API key authorization: apiKeyAuth
        ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
        apiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //apiKeyAuth.setApiKeyPrefix("Token");

        // Configure API key authorization: appKeyAuth
        ApiKeyAuth appKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("appKeyAuth");
        appKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //appKeyAuth.setApiKeyPrefix("Token");

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSAccount body = new AWSAccount(); // AWSAccount | AWS request object
        try {
            AWSAccountCreateResponse result = apiInstance.createAWSAccount(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#createAWSAccount");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.datadoghq.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AwsIntegrationApi* | [**createAWSAccount**](docs/AwsIntegrationApi.md#createAWSAccount) | **POST** /api/v1/integration/aws | Create an AWS Account
*AwsIntegrationApi* | [**deleteAWSAccount**](docs/AwsIntegrationApi.md#deleteAWSAccount) | **DELETE** /api/v1/integration/aws | Delete an AWS Account
*AwsIntegrationApi* | [**generateNewAWSExternalID**](docs/AwsIntegrationApi.md#generateNewAWSExternalID) | **PUT** /api/v1/integration/aws/generate_new_external_id | Generate New External ID
*AwsIntegrationApi* | [**getAllAWSAccounts**](docs/AwsIntegrationApi.md#getAllAWSAccounts) | **GET** /api/v1/integration/aws | Get Installed AWS Accounts
*AwsIntegrationApi* | [**listAvailableAWSNamespaces**](docs/AwsIntegrationApi.md#listAvailableAWSNamespaces) | **GET** /api/v1/integration/aws/available_namespace_rules | List available namespaces.
*AwsIntegrationApi* | [**updateAWSAccount**](docs/AwsIntegrationApi.md#updateAWSAccount) | **PUT** /api/v1/integration/aws | Update an AWS Account
*AwsLogsIntegrationApi* | [**aWSLogsCheckLambdaAsync**](docs/AwsLogsIntegrationApi.md#aWSLogsCheckLambdaAsync) | **POST** /api/v1/integration/aws/logs/check_async | Check function to see if a lambda_arn exists within an account.
*AwsLogsIntegrationApi* | [**aWSLogsCheckServicesAsync**](docs/AwsLogsIntegrationApi.md#aWSLogsCheckServicesAsync) | **POST** /api/v1/integration/aws/logs/services_async | Asynchronous check for permissions for AWS log lambda config.
*AwsLogsIntegrationApi* | [**aWSLogsList**](docs/AwsLogsIntegrationApi.md#aWSLogsList) | **GET** /api/v1/integration/aws/logs | List configured AWS log integrations.
*AwsLogsIntegrationApi* | [**aWSLogsServicesList**](docs/AwsLogsIntegrationApi.md#aWSLogsServicesList) | **GET** /api/v1/integration/aws/logs/services | Get list of AWS log ready services.
*AwsLogsIntegrationApi* | [**addAWSLambdaARN**](docs/AwsLogsIntegrationApi.md#addAWSLambdaARN) | **POST** /api/v1/integration/aws/logs | Add a AWS Lambda ARN to your Datadog account.
*AwsLogsIntegrationApi* | [**deleteAWSLambdaARN**](docs/AwsLogsIntegrationApi.md#deleteAWSLambdaARN) | **DELETE** /api/v1/integration/aws/logs | Delete a AWS Lambda ARN from your Datadog account.
*AwsLogsIntegrationApi* | [**enableAWSLogServices**](docs/AwsLogsIntegrationApi.md#enableAWSLogServices) | **POST** /api/v1/integration/aws/logs/services | Enable Automatic Log collection for your AWS services.
*AzureIntegrationApi* | [**azureUpdateHostFilters**](docs/AzureIntegrationApi.md#azureUpdateHostFilters) | **POST** /api/v1/integration/azure/host_filters | Update the defined list of host filters for a given Datadog-Azure integration.
*AzureIntegrationApi* | [**createAzureIntegration**](docs/AzureIntegrationApi.md#createAzureIntegration) | **POST** /api/v1/integration/azure | Add a Azure integration to your Datadog account.
*AzureIntegrationApi* | [**deleteAzureIntegration**](docs/AzureIntegrationApi.md#deleteAzureIntegration) | **DELETE** /api/v1/integration/azure | Delete an Azure Integration from your Datadog account.
*AzureIntegrationApi* | [**listAzureIntegration**](docs/AzureIntegrationApi.md#listAzureIntegration) | **GET** /api/v1/integration/azure | List configured Azure integrations.
*AzureIntegrationApi* | [**updateAzureIntegration**](docs/AzureIntegrationApi.md#updateAzureIntegration) | **PUT** /api/v1/integration/azure | Update an Azure integration to your Datadog account.
*DashboardListsApi* | [**createDashboardList**](docs/DashboardListsApi.md#createDashboardList) | **POST** /api/v1/dashboard/lists/manual | Create a dashboard list
*DashboardListsApi* | [**deleteDashboardList**](docs/DashboardListsApi.md#deleteDashboardList) | **DELETE** /api/v1/dashboard/lists/manual/{list_id} | Delete a dashboard list
*DashboardListsApi* | [**getAllDashboardLists**](docs/DashboardListsApi.md#getAllDashboardLists) | **GET** /api/v1/dashboard/lists/manual | Get all dashboard lists
*DashboardListsApi* | [**getDashboardList**](docs/DashboardListsApi.md#getDashboardList) | **GET** /api/v1/dashboard/lists/manual/{list_id} | Get a dashboard list
*DashboardListsApi* | [**updateDashboardList**](docs/DashboardListsApi.md#updateDashboardList) | **PUT** /api/v1/dashboard/lists/manual/{list_id} | Update a dashboard list
*DowntimesApi* | [**cancelDowntime**](docs/DowntimesApi.md#cancelDowntime) | **DELETE** /api/v1/downtime/{downtime_id} | Cancel a downtime
*DowntimesApi* | [**cancelDowntimesByScope**](docs/DowntimesApi.md#cancelDowntimesByScope) | **POST** /api/v1/downtime/cancel/by_scope | Cancel downtimes by scope
*DowntimesApi* | [**createDowntime**](docs/DowntimesApi.md#createDowntime) | **POST** /api/v1/downtime | Schedule a downtime
*DowntimesApi* | [**getAllDowntimes**](docs/DowntimesApi.md#getAllDowntimes) | **GET** /api/v1/downtime | Get all downtimes
*DowntimesApi* | [**getDowntime**](docs/DowntimesApi.md#getDowntime) | **GET** /api/v1/downtime/{downtime_id} | Get a downtime
*DowntimesApi* | [**updateDowntime**](docs/DowntimesApi.md#updateDowntime) | **PUT** /api/v1/downtime/{downtime_id} | Update a downtime
*EventsApi* | [**createEvent**](docs/EventsApi.md#createEvent) | **POST** /api/v1/events | Post an event
*EventsApi* | [**getEvent**](docs/EventsApi.md#getEvent) | **GET** /api/v1/events/{event_id} | Get an event
*EventsApi* | [**listEvents**](docs/EventsApi.md#listEvents) | **GET** /api/v1/events | Query the event stream.
*GcpIntegrationApi* | [**createGCPIntegration**](docs/GcpIntegrationApi.md#createGCPIntegration) | **POST** /api/v1/integration/gcp | Add a GCP integration to your Datadog account.
*GcpIntegrationApi* | [**deleteGCPIntegration**](docs/GcpIntegrationApi.md#deleteGCPIntegration) | **DELETE** /api/v1/integration/gcp | Delete a GCP Integration from your Datadog account.
*GcpIntegrationApi* | [**listGCPIntegration**](docs/GcpIntegrationApi.md#listGCPIntegration) | **GET** /api/v1/integration/gcp | List configured GCP integrations.
*GcpIntegrationApi* | [**updateGCPIntegration**](docs/GcpIntegrationApi.md#updateGCPIntegration) | **PUT** /api/v1/integration/gcp | Update a GCP integration in your Datadog account.
*HostsApi* | [**getAllHosts**](docs/HostsApi.md#getAllHosts) | **GET** /api/v1/hosts | Get all hosts for your organization
*HostsApi* | [**getHostTotals**](docs/HostsApi.md#getHostTotals) | **GET** /api/v1/hosts/totals | Get total number of active hosts in your Datadog Account
*HostsApi* | [**muteHost**](docs/HostsApi.md#muteHost) | **POST** /api/v1/host/{host_name}/mute | Mute a Host
*HostsApi* | [**unmuteHost**](docs/HostsApi.md#unmuteHost) | **POST** /api/v1/host/{host_name}/unmute | Unmute a Host
*IpRangesApi* | [**getIPRanges**](docs/IpRangesApi.md#getIPRanges) | **GET** / | 
*KeysApi* | [**createAPIKey**](docs/KeysApi.md#createAPIKey) | **POST** /api/v1/api_key | Create an API key with a given name.
*KeysApi* | [**createApplicationKey**](docs/KeysApi.md#createApplicationKey) | **POST** /api/v1/application_key | Create an application key with a given name.
*KeysApi* | [**deleteAPIKey**](docs/KeysApi.md#deleteAPIKey) | **DELETE** /api/v1/api_key/{key} | Delete a given API key.
*KeysApi* | [**deleteApplicationKey**](docs/KeysApi.md#deleteApplicationKey) | **DELETE** /api/v1/application_key/{key} | Delete a given application key.
*KeysApi* | [**editAPIKey**](docs/KeysApi.md#editAPIKey) | **PUT** /api/v1/api_key/{key} | Edit an API key name.
*KeysApi* | [**editApplicationKey**](docs/KeysApi.md#editApplicationKey) | **PUT** /api/v1/application_key/{key} | Edit an application key name.
*KeysApi* | [**getAPIKey**](docs/KeysApi.md#getAPIKey) | **GET** /api/v1/api_key/{key} | Get a given API key.
*KeysApi* | [**getAllAPIKeys**](docs/KeysApi.md#getAllAPIKeys) | **GET** /api/v1/api_key | Get all API keys available for your account.
*KeysApi* | [**getAllApplicationKeys**](docs/KeysApi.md#getAllApplicationKeys) | **GET** /api/v1/application_key | Get all application keys available for your account.
*KeysApi* | [**getApplicationKey**](docs/KeysApi.md#getApplicationKey) | **GET** /api/v1/application_key/{key} | Get a given application key.
*LogsHttpIntakeApi* | [**sendLog**](docs/LogsHttpIntakeApi.md#sendLog) | **POST** /v1/input | 
*LogsIndexesApi* | [**getAllLogIndexes**](docs/LogsIndexesApi.md#getAllLogIndexes) | **GET** /api/v1/logs/config/indexes | This endpoint returns an array of the LogIndex objects of your organization.
*LogsIndexesApi* | [**getLogsIndex**](docs/LogsIndexesApi.md#getLogsIndex) | **GET** /api/v1/logs/config/indexes/{name} | This endpoint returns an Index identified by its name.
*LogsIndexesApi* | [**getLogsIndexOrder**](docs/LogsIndexesApi.md#getLogsIndexOrder) | **GET** /api/v1/logs/config/index-order | Get the current order of your log indexes.
*LogsIndexesApi* | [**updateLogsIndex**](docs/LogsIndexesApi.md#updateLogsIndex) | **PUT** /api/v1/logs/config/indexes/{name} | This endpoint updates an Index identified by its name.
*LogsIndexesApi* | [**updateLogsIndexOrder**](docs/LogsIndexesApi.md#updateLogsIndexOrder) | **PUT** /api/v1/logs/config/index-order | Update the order of your log indexes.
*LogsPipelinesApi* | [**createLogsPipeline**](docs/LogsPipelinesApi.md#createLogsPipeline) | **POST** /api/v1/logs/config/pipelines | Create a pipeline in your organization.
*LogsPipelinesApi* | [**deleteLogsPipeline**](docs/LogsPipelinesApi.md#deleteLogsPipeline) | **DELETE** /api/v1/logs/config/pipelines/{pipeline_id} | Delete a given pipeline from your organization.
*LogsPipelinesApi* | [**getAllLogsPipelines**](docs/LogsPipelinesApi.md#getAllLogsPipelines) | **GET** /api/v1/logs/config/pipelines | Get all pipelines from your organization.
*LogsPipelinesApi* | [**getLogsPipeline**](docs/LogsPipelinesApi.md#getLogsPipeline) | **GET** /api/v1/logs/config/pipelines/{pipeline_id} | Get a specific pipeline from your organization.
*LogsPipelinesApi* | [**getLogsPipelineOrder**](docs/LogsPipelinesApi.md#getLogsPipelineOrder) | **GET** /api/v1/logs/config/pipeline-order | Get the current order of your pipelines.
*LogsPipelinesApi* | [**updateLogsPipeline**](docs/LogsPipelinesApi.md#updateLogsPipeline) | **PUT** /api/v1/logs/config/pipelines/{pipeline_id} | Update a pipeline in your organization.
*LogsPipelinesApi* | [**updateLogsPipelineOrder**](docs/LogsPipelinesApi.md#updateLogsPipelineOrder) | **PUT** /api/v1/logs/config/pipeline-order | Update the order of your pipelines.
*MetricsApi* | [**editMetricMetadata**](docs/MetricsApi.md#editMetricMetadata) | **PUT** /api/v1/metrics/{metric_name} | Edit metric metadata
*MetricsApi* | [**getAllActiveMetrics**](docs/MetricsApi.md#getAllActiveMetrics) | **GET** /api/v1/metrics | Get active metrics list
*MetricsApi* | [**getMetricMetadata**](docs/MetricsApi.md#getMetricMetadata) | **GET** /api/v1/metrics/{metric_name} | Get metric metadata
*MetricsApi* | [**queryMetrics**](docs/MetricsApi.md#queryMetrics) | **GET** /api/v1/query | Query timeseries points
*MetricsApi* | [**searchMetrics**](docs/MetricsApi.md#searchMetrics) | **GET** /api/v1/search | Search metrics
*MetricsApi* | [**submitMetrics**](docs/MetricsApi.md#submitMetrics) | **POST** /api/v1/series | Submit metrics
*MonitorsApi* | [**createMonitor**](docs/MonitorsApi.md#createMonitor) | **POST** /api/v1/monitor | Create a new Monitor
*MonitorsApi* | [**deleteMonitor**](docs/MonitorsApi.md#deleteMonitor) | **DELETE** /api/v1/monitor/{monitor_id} | Delete the specified monitor.
*MonitorsApi* | [**editMonitor**](docs/MonitorsApi.md#editMonitor) | **PUT** /api/v1/monitor/{monitor_id} | Edit the specified monitor
*MonitorsApi* | [**getAllMonitors**](docs/MonitorsApi.md#getAllMonitors) | **GET** /api/v1/monitor | Get details about the specified monitor.
*MonitorsApi* | [**getMonitor**](docs/MonitorsApi.md#getMonitor) | **GET** /api/v1/monitor/{monitor_id} | Get details about the specified monitor.
*MonitorsApi* | [**validateMonitor**](docs/MonitorsApi.md#validateMonitor) | **POST** /api/v1/monitor/validate | 
*OrgsApi* | [**createChildOrg**](docs/OrgsApi.md#createChildOrg) | **POST** /api/v1/org | Create child-organization.
*OrgsApi* | [**getOrg**](docs/OrgsApi.md#getOrg) | **GET** /api/v1/org | Get the organization
*OrgsApi* | [**updateOrg**](docs/OrgsApi.md#updateOrg) | **PUT** /api/v1/org/{public_id} | Update the organization
*OrgsApi* | [**uploadIdPForOrg**](docs/OrgsApi.md#uploadIdPForOrg) | **POST** /api/v1/org/{public_id}/idp_metadata | Upload IdP metadata
*ServiceChecksApi* | [**submitServiceCheck**](docs/ServiceChecksApi.md#submitServiceCheck) | **POST** /api/v1/check_run | Submit a Service Check
*SloApi* | [**bulkPartialDeleteSLO**](docs/SloApi.md#bulkPartialDeleteSLO) | **POST** /api/v1/slo/bulk_delete | Delete (or partially delete) multiple service level objective objects.
*SloApi* | [**checkCanDeleteSLO**](docs/SloApi.md#checkCanDeleteSLO) | **GET** /api/v1/slo/can_delete | Check if SLOs can be safely deleted.
*SloApi* | [**createSLO**](docs/SloApi.md#createSLO) | **POST** /api/v1/slo | Create a service level objective object.
*SloApi* | [**deleteSLO**](docs/SloApi.md#deleteSLO) | **DELETE** /api/v1/slo/{slo_id} | Delete the specified service level objective object.
*SloApi* | [**editSLO**](docs/SloApi.md#editSLO) | **PUT** /api/v1/slo/{slo_id} | Edit the specified service level objective
*SloApi* | [**getSLO**](docs/SloApi.md#getSLO) | **GET** /api/v1/slo/{slo_id} | Get a service level objective object
*SloApi* | [**getSLOs**](docs/SloApi.md#getSLOs) | **GET** /api/v1/slo | Get multiple service level objective objects by their IDs.
*SloApi* | [**historyForSLO**](docs/SloApi.md#historyForSLO) | **GET** /api/v1/slo/{slo_id}/history | Get the history of the service level objective.
*SnapshotsApi* | [**getGraphSnapshot**](docs/SnapshotsApi.md#getGraphSnapshot) | **GET** /api/v1/graph/snapshot | Take graph snapshots
*SyntheticsApi* | [**createTest**](docs/SyntheticsApi.md#createTest) | **POST** /api/v1/synthetics/tests | Create or clone test
*SyntheticsApi* | [**deleteTests**](docs/SyntheticsApi.md#deleteTests) | **POST** /api/v1/synthetics/tests/delete | Delete multiple tests
*SyntheticsApi* | [**getAPITestLatestResults**](docs/SyntheticsApi.md#getAPITestLatestResults) | **GET** /api/v1/synthetics/tests/{public_id}/results | Get test latest results (as summaries)
*SyntheticsApi* | [**getAPITestResult**](docs/SyntheticsApi.md#getAPITestResult) | **GET** /api/v1/synthetics/tests/{public_id}/results/{result_id} | Get test result (API)
*SyntheticsApi* | [**getAllDevices**](docs/SyntheticsApi.md#getAllDevices) | **GET** /api/v1/synthetics/browser/devices | Get all devices
*SyntheticsApi* | [**getAllLocations**](docs/SyntheticsApi.md#getAllLocations) | **GET** /api/v1/synthetics/locations | Get all locations (public and private)
*SyntheticsApi* | [**getAllTests**](docs/SyntheticsApi.md#getAllTests) | **GET** /api/v1/synthetics/tests | Get all test
*SyntheticsApi* | [**getBrowserTestLatestResults**](docs/SyntheticsApi.md#getBrowserTestLatestResults) | **GET** /api/v1/synthetics/tests/browser/{public_id}/results | Get test latest results (as summaries)
*SyntheticsApi* | [**getBrowserTestResult**](docs/SyntheticsApi.md#getBrowserTestResult) | **GET** /api/v1/synthetics/tests/browser/{public_id}/results/{result_id} | Get test result (browser)
*SyntheticsApi* | [**getTest**](docs/SyntheticsApi.md#getTest) | **GET** /api/v1/synthetics/tests/{public_id} | Get test
*SyntheticsApi* | [**setTestPauseStatus**](docs/SyntheticsApi.md#setTestPauseStatus) | **PUT** /api/v1/synthetics/tests/{public_id}/status | Change test pause/live status
*SyntheticsApi* | [**updateTest**](docs/SyntheticsApi.md#updateTest) | **PUT** /api/v1/synthetics/tests/{public_id} | Update test
*TagsApi* | [**addToHostTags**](docs/TagsApi.md#addToHostTags) | **POST** /api/v1/tags/hosts/{host_name} | Add tags to a host
*TagsApi* | [**getAllHostTags**](docs/TagsApi.md#getAllHostTags) | **GET** /api/v1/tags/hosts | Get a mapping of tags to hosts for your whole infrastrucutre
*TagsApi* | [**getHostTags**](docs/TagsApi.md#getHostTags) | **GET** /api/v1/tags/hosts/{host_name} | Get list of tags for a specific hosts
*TagsApi* | [**removeHostTags**](docs/TagsApi.md#removeHostTags) | **DELETE** /api/v1/tags/hosts/{host_name} | Remove Host Tags
*TagsApi* | [**updateHostTags**](docs/TagsApi.md#updateHostTags) | **PUT** /api/v1/tags/hosts/{host_name} | Update a tags on a host
*UsageApi* | [**getUsageFargate**](docs/UsageApi.md#getUsageFargate) | **GET** /api/v1/usage/fargate | Get hourly usage for fargate.
*UsageApi* | [**getUsageHosts**](docs/UsageApi.md#getUsageHosts) | **GET** /api/v1/usage/hosts | Get hourly usage for hosts and containers.
*UsageApi* | [**getUsageLogs**](docs/UsageApi.md#getUsageLogs) | **GET** /api/v1/usage/logs | Get hourly usage for logs.
*UsageApi* | [**getUsageSummary**](docs/UsageApi.md#getUsageSummary) | **GET** /api/v1/usage/summary | Get usage across your multi-org account.
*UsageApi* | [**getUsageSynthetics**](docs/UsageApi.md#getUsageSynthetics) | **GET** /api/v1/usage/synthetics | Get hourly usage for synthetics.
*UsageApi* | [**getUsageTimeseries**](docs/UsageApi.md#getUsageTimeseries) | **GET** /api/v1/usage/timeseries | Get hourly usage for custom metrics.
*UsageApi* | [**getUsageTopAvgMetrics**](docs/UsageApi.md#getUsageTopAvgMetrics) | **GET** /api/v1/usage/top_avg_metrics | Get top custom metrics by hourly average.
*UsageApi* | [**getUsageTrace**](docs/UsageApi.md#getUsageTrace) | **GET** /api/v1/usage/traces | Get hourly usage for trace search.
*UsersApi* | [**createUser**](docs/UsersApi.md#createUser) | **POST** /api/v1/user | Create user
*UsersApi* | [**disableUser**](docs/UsersApi.md#disableUser) | **DELETE** /api/v1/user/{user_handle} | Disable user
*UsersApi* | [**getAllUsers**](docs/UsersApi.md#getAllUsers) | **GET** /api/v1/user | Get all users
*UsersApi* | [**getUser**](docs/UsersApi.md#getUser) | **GET** /api/v1/user/{user_handle} | Get user
*UsersApi* | [**updateUser**](docs/UsersApi.md#updateUser) | **PUT** /api/v1/user/{user_handle} | Update user


## Documentation for Models

 - [APIErrorResponse](docs/APIErrorResponse.md)
 - [AWSAccount](docs/AWSAccount.md)
 - [AWSAccountAndLambdaRequest](docs/AWSAccountAndLambdaRequest.md)
 - [AWSAccountCreateResponse](docs/AWSAccountCreateResponse.md)
 - [AWSAccountListResponse](docs/AWSAccountListResponse.md)
 - [AWSLogsAsyncResponse](docs/AWSLogsAsyncResponse.md)
 - [AWSLogsAsyncResponseErrors](docs/AWSLogsAsyncResponseErrors.md)
 - [AWSLogsListResponse](docs/AWSLogsListResponse.md)
 - [AWSLogsListResponseLambdas](docs/AWSLogsListResponseLambdas.md)
 - [AWSLogsListServicesResponse](docs/AWSLogsListServicesResponse.md)
 - [AWSLogsServicesRequest](docs/AWSLogsServicesRequest.md)
 - [ApiKey](docs/ApiKey.md)
 - [ApiKeyListResponse](docs/ApiKeyListResponse.md)
 - [ApiKeyResponse](docs/ApiKeyResponse.md)
 - [ApplicationKey](docs/ApplicationKey.md)
 - [ApplicationKeyListResponse](docs/ApplicationKeyListResponse.md)
 - [ApplicationKeyResponse](docs/ApplicationKeyResponse.md)
 - [AzureAccount](docs/AzureAccount.md)
 - [CancelDowntimesByScopeRequest](docs/CancelDowntimesByScopeRequest.md)
 - [CanceledDowntimesIds](docs/CanceledDowntimesIds.md)
 - [CheckCanDeleteServiceLevelObjectiveResponse](docs/CheckCanDeleteServiceLevelObjectiveResponse.md)
 - [CheckCanDeleteServiceLevelObjectiveResponseData](docs/CheckCanDeleteServiceLevelObjectiveResponseData.md)
 - [Creator](docs/Creator.md)
 - [DashboardList](docs/DashboardList.md)
 - [DashboardListDeleteResponse](docs/DashboardListDeleteResponse.md)
 - [DashboardListListResponse](docs/DashboardListListResponse.md)
 - [DeletedMonitor](docs/DeletedMonitor.md)
 - [Downtime](docs/Downtime.md)
 - [DowntimeRecurrence](docs/DowntimeRecurrence.md)
 - [Event](docs/Event.md)
 - [EventListResponse](docs/EventListResponse.md)
 - [EventResponse](docs/EventResponse.md)
 - [GCPAccount](docs/GCPAccount.md)
 - [GraphSnapshot](docs/GraphSnapshot.md)
 - [HTTPLog](docs/HTTPLog.md)
 - [HTTPLogError](docs/HTTPLogError.md)
 - [HTTPMethod](docs/HTTPMethod.md)
 - [HistoryServiceLevelObjectiveGroups](docs/HistoryServiceLevelObjectiveGroups.md)
 - [HistoryServiceLevelObjectiveMetrics](docs/HistoryServiceLevelObjectiveMetrics.md)
 - [HistoryServiceLevelObjectiveMetricsSeries](docs/HistoryServiceLevelObjectiveMetricsSeries.md)
 - [HistoryServiceLevelObjectiveMetricsSeriesMetadata](docs/HistoryServiceLevelObjectiveMetricsSeriesMetadata.md)
 - [HistoryServiceLevelObjectiveOverall](docs/HistoryServiceLevelObjectiveOverall.md)
 - [HistoryServiceLevelObjectiveResponse](docs/HistoryServiceLevelObjectiveResponse.md)
 - [HistoryServiceLevelObjectiveResponseData](docs/HistoryServiceLevelObjectiveResponseData.md)
 - [HistoryServiceLevelObjectiveResponseError](docs/HistoryServiceLevelObjectiveResponseError.md)
 - [Host](docs/Host.md)
 - [HostListResponse](docs/HostListResponse.md)
 - [HostMeta](docs/HostMeta.md)
 - [HostMetrics](docs/HostMetrics.md)
 - [HostMuteResponse](docs/HostMuteResponse.md)
 - [HostMuteSettings](docs/HostMuteSettings.md)
 - [HostTags](docs/HostTags.md)
 - [HostTotals](docs/HostTotals.md)
 - [IPPrefixes](docs/IPPrefixes.md)
 - [IPRanges](docs/IPRanges.md)
 - [IdpFormData](docs/IdpFormData.md)
 - [IdpResponse](docs/IdpResponse.md)
 - [IntakePayloadAccepted](docs/IntakePayloadAccepted.md)
 - [LogsAPIError](docs/LogsAPIError.md)
 - [LogsAPIErrorResponse](docs/LogsAPIErrorResponse.md)
 - [LogsArithmeticProcessor](docs/LogsArithmeticProcessor.md)
 - [LogsCategoryProcessor](docs/LogsCategoryProcessor.md)
 - [LogsCategoryProcessorCategories](docs/LogsCategoryProcessorCategories.md)
 - [LogsDateRemapper](docs/LogsDateRemapper.md)
 - [LogsExclusion](docs/LogsExclusion.md)
 - [LogsExclusionFilter](docs/LogsExclusionFilter.md)
 - [LogsFilter](docs/LogsFilter.md)
 - [LogsGeoIPParser](docs/LogsGeoIPParser.md)
 - [LogsGrokParser](docs/LogsGrokParser.md)
 - [LogsGrokParserRules](docs/LogsGrokParserRules.md)
 - [LogsIndex](docs/LogsIndex.md)
 - [LogsIndexFilter](docs/LogsIndexFilter.md)
 - [LogsIndexesOrder](docs/LogsIndexesOrder.md)
 - [LogsIndexesResponse](docs/LogsIndexesResponse.md)
 - [LogsLookupProcessor](docs/LogsLookupProcessor.md)
 - [LogsMessageRemapper](docs/LogsMessageRemapper.md)
 - [LogsPipeline](docs/LogsPipeline.md)
 - [LogsPipelinesOrder](docs/LogsPipelinesOrder.md)
 - [LogsProcessor](docs/LogsProcessor.md)
 - [LogsRemapper](docs/LogsRemapper.md)
 - [LogsServiceRemapper](docs/LogsServiceRemapper.md)
 - [LogsStatusRemapper](docs/LogsStatusRemapper.md)
 - [LogsStringBuilderProcessor](docs/LogsStringBuilderProcessor.md)
 - [LogsTraceRemapper](docs/LogsTraceRemapper.md)
 - [LogsURLParser](docs/LogsURLParser.md)
 - [LogsUserAgentParser](docs/LogsUserAgentParser.md)
 - [MetricMetadata](docs/MetricMetadata.md)
 - [MetricSearchResponse](docs/MetricSearchResponse.md)
 - [MetricSearchResponseResults](docs/MetricSearchResponseResults.md)
 - [MetricsListResponse](docs/MetricsListResponse.md)
 - [MetricsPayload](docs/MetricsPayload.md)
 - [MetricsQueryResponse](docs/MetricsQueryResponse.md)
 - [MetricsQueryResponseSeries](docs/MetricsQueryResponseSeries.md)
 - [MetricsQueryResponseUnit](docs/MetricsQueryResponseUnit.md)
 - [Monitor](docs/Monitor.md)
 - [MonitorOptions](docs/MonitorOptions.md)
 - [MonitorOptionsAggregation](docs/MonitorOptionsAggregation.md)
 - [MonitorOverallStates](docs/MonitorOverallStates.md)
 - [MonitorState](docs/MonitorState.md)
 - [MonitorStateGroup](docs/MonitorStateGroup.md)
 - [MonitorStateGroupValue](docs/MonitorStateGroupValue.md)
 - [MonitorThresholdWindowOptions](docs/MonitorThresholdWindowOptions.md)
 - [MonitorThresholds](docs/MonitorThresholds.md)
 - [Org](docs/Org.md)
 - [OrgBilling](docs/OrgBilling.md)
 - [OrgCreateBody](docs/OrgCreateBody.md)
 - [OrgCreateResponse](docs/OrgCreateResponse.md)
 - [OrgListResponse](docs/OrgListResponse.md)
 - [OrgResponse](docs/OrgResponse.md)
 - [OrgSettings](docs/OrgSettings.md)
 - [OrgSettingsSaml](docs/OrgSettingsSaml.md)
 - [OrgSettingsSamlAutocreateUsersDomains](docs/OrgSettingsSamlAutocreateUsersDomains.md)
 - [OrgSubscription](docs/OrgSubscription.md)
 - [SLOThreshold](docs/SLOThreshold.md)
 - [SLOTimeframe](docs/SLOTimeframe.md)
 - [Series](docs/Series.md)
 - [ServiceCheck](docs/ServiceCheck.md)
 - [ServiceCheckStatus](docs/ServiceCheckStatus.md)
 - [ServiceLevelObjective](docs/ServiceLevelObjective.md)
 - [ServiceLevelObjectiveDeleted](docs/ServiceLevelObjectiveDeleted.md)
 - [ServiceLevelObjectiveListResponse](docs/ServiceLevelObjectiveListResponse.md)
 - [ServiceLevelObjectiveQuery](docs/ServiceLevelObjectiveQuery.md)
 - [ServiceLevelObjectiveResponse](docs/ServiceLevelObjectiveResponse.md)
 - [ServiceLevelObjectivesBulkDeleted](docs/ServiceLevelObjectivesBulkDeleted.md)
 - [ServiceLevelObjectivesBulkDeletedData](docs/ServiceLevelObjectivesBulkDeletedData.md)
 - [ServiceLevelObjectivesBulkDeletedErrors](docs/ServiceLevelObjectivesBulkDeletedErrors.md)
 - [SyntheticsAPITestResultData](docs/SyntheticsAPITestResultData.md)
 - [SyntheticsAPITestResultFull](docs/SyntheticsAPITestResultFull.md)
 - [SyntheticsAPITestResultFullCheck](docs/SyntheticsAPITestResultFullCheck.md)
 - [SyntheticsAPITestResultShort](docs/SyntheticsAPITestResultShort.md)
 - [SyntheticsAPITestResultShortResult](docs/SyntheticsAPITestResultShortResult.md)
 - [SyntheticsAssertion](docs/SyntheticsAssertion.md)
 - [SyntheticsAssertionOperator](docs/SyntheticsAssertionOperator.md)
 - [SyntheticsAssertionType](docs/SyntheticsAssertionType.md)
 - [SyntheticsBrowserError](docs/SyntheticsBrowserError.md)
 - [SyntheticsBrowserTestResultData](docs/SyntheticsBrowserTestResultData.md)
 - [SyntheticsBrowserTestResultFull](docs/SyntheticsBrowserTestResultFull.md)
 - [SyntheticsBrowserTestResultShort](docs/SyntheticsBrowserTestResultShort.md)
 - [SyntheticsBrowserTestResultShortResult](docs/SyntheticsBrowserTestResultShortResult.md)
 - [SyntheticsBrowserVariable](docs/SyntheticsBrowserVariable.md)
 - [SyntheticsBrowserVariableType](docs/SyntheticsBrowserVariableType.md)
 - [SyntheticsCheckType](docs/SyntheticsCheckType.md)
 - [SyntheticsDeleteTestsPayload](docs/SyntheticsDeleteTestsPayload.md)
 - [SyntheticsDeleteTestsResponse](docs/SyntheticsDeleteTestsResponse.md)
 - [SyntheticsDeleteTestsResponseDeletedTests](docs/SyntheticsDeleteTestsResponseDeletedTests.md)
 - [SyntheticsDevice](docs/SyntheticsDevice.md)
 - [SyntheticsDeviceID](docs/SyntheticsDeviceID.md)
 - [SyntheticsDevices](docs/SyntheticsDevices.md)
 - [SyntheticsErrorCode](docs/SyntheticsErrorCode.md)
 - [SyntheticsGetAPITestLatestResultsResponse](docs/SyntheticsGetAPITestLatestResultsResponse.md)
 - [SyntheticsGetAllTestsResponse](docs/SyntheticsGetAllTestsResponse.md)
 - [SyntheticsGetBrowserTestLatestResultsResponse](docs/SyntheticsGetBrowserTestLatestResultsResponse.md)
 - [SyntheticsGetTestLatestResultsPayload](docs/SyntheticsGetTestLatestResultsPayload.md)
 - [SyntheticsLocation](docs/SyntheticsLocation.md)
 - [SyntheticsLocations](docs/SyntheticsLocations.md)
 - [SyntheticsResource](docs/SyntheticsResource.md)
 - [SyntheticsSSLCertificate](docs/SyntheticsSSLCertificate.md)
 - [SyntheticsSSLCertificateIssuer](docs/SyntheticsSSLCertificateIssuer.md)
 - [SyntheticsSSLCertificateSubject](docs/SyntheticsSSLCertificateSubject.md)
 - [SyntheticsSetTestPauseStatusPayload](docs/SyntheticsSetTestPauseStatusPayload.md)
 - [SyntheticsStepDetail](docs/SyntheticsStepDetail.md)
 - [SyntheticsStepDetailWarnings](docs/SyntheticsStepDetailWarnings.md)
 - [SyntheticsStepType](docs/SyntheticsStepType.md)
 - [SyntheticsTestAuthor](docs/SyntheticsTestAuthor.md)
 - [SyntheticsTestConfig](docs/SyntheticsTestConfig.md)
 - [SyntheticsTestDetails](docs/SyntheticsTestDetails.md)
 - [SyntheticsTestMonitorStatus](docs/SyntheticsTestMonitorStatus.md)
 - [SyntheticsTestOptions](docs/SyntheticsTestOptions.md)
 - [SyntheticsTestOptionsRetry](docs/SyntheticsTestOptionsRetry.md)
 - [SyntheticsTestPauseStatus](docs/SyntheticsTestPauseStatus.md)
 - [SyntheticsTestProcessStatus](docs/SyntheticsTestProcessStatus.md)
 - [SyntheticsTestRequest](docs/SyntheticsTestRequest.md)
 - [SyntheticsTestRequestBasicAuth](docs/SyntheticsTestRequestBasicAuth.md)
 - [SyntheticsTiming](docs/SyntheticsTiming.md)
 - [TagToHosts](docs/TagToHosts.md)
 - [UsageFargateHour](docs/UsageFargateHour.md)
 - [UsageFargateResponse](docs/UsageFargateResponse.md)
 - [UsageHostHour](docs/UsageHostHour.md)
 - [UsageHostsResponse](docs/UsageHostsResponse.md)
 - [UsageLogsHour](docs/UsageLogsHour.md)
 - [UsageLogsResponse](docs/UsageLogsResponse.md)
 - [UsageSummaryDate](docs/UsageSummaryDate.md)
 - [UsageSummaryDateOrg](docs/UsageSummaryDateOrg.md)
 - [UsageSummaryResponse](docs/UsageSummaryResponse.md)
 - [UsageSyntheticsHour](docs/UsageSyntheticsHour.md)
 - [UsageSyntheticsResponse](docs/UsageSyntheticsResponse.md)
 - [UsageTimeseriesHour](docs/UsageTimeseriesHour.md)
 - [UsageTimeseriesResponse](docs/UsageTimeseriesResponse.md)
 - [UsageTopAvgMetricsHour](docs/UsageTopAvgMetricsHour.md)
 - [UsageTopAvgMetricsResponse](docs/UsageTopAvgMetricsResponse.md)
 - [UsageTraceHour](docs/UsageTraceHour.md)
 - [UsageTraceResponse](docs/UsageTraceResponse.md)
 - [User](docs/User.md)
 - [UserDisableResponse](docs/UserDisableResponse.md)
 - [UserListResponse](docs/UserListResponse.md)
 - [UserResponse](docs/UserResponse.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKeyAuth


- **Type**: API key
- **API key parameter name**: api_key
- **Location**: URL query string

### apiKeyAuthHeader


- **Type**: API key
- **API key parameter name**: DD-API-KEY
- **Location**: HTTP header

### appKeyAuth


- **Type**: API key
- **API key parameter name**: application_key
- **Location**: URL query string

### appKeyAuthHeader


- **Type**: API key
- **API key parameter name**: DD-APPLICATION-KEY
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@datadoghq.com

