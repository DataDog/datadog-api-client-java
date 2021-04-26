## Documentation for API Endpoints

All URIs are relative to *https://api.datadoghq.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*AuthenticationApi* | [**validate**](AuthenticationApi.md#validate) | **GET** /api/v1/validate | Validate API key
*AwsIntegrationApi* | [**createAWSAccount**](AwsIntegrationApi.md#createAWSAccount) | **POST** /api/v1/integration/aws | Create an AWS integration
*AwsIntegrationApi* | [**createAWSTagFilter**](AwsIntegrationApi.md#createAWSTagFilter) | **POST** /api/v1/integration/aws/filtering | Set an AWS tag filter
*AwsIntegrationApi* | [**createNewAWSExternalID**](AwsIntegrationApi.md#createNewAWSExternalID) | **PUT** /api/v1/integration/aws/generate_new_external_id | Generate a new external ID
*AwsIntegrationApi* | [**deleteAWSAccount**](AwsIntegrationApi.md#deleteAWSAccount) | **DELETE** /api/v1/integration/aws | Delete an AWS integration
*AwsIntegrationApi* | [**deleteAWSTagFilter**](AwsIntegrationApi.md#deleteAWSTagFilter) | **DELETE** /api/v1/integration/aws/filtering | Delete a tag filtering entry
*AwsIntegrationApi* | [**listAWSAccounts**](AwsIntegrationApi.md#listAWSAccounts) | **GET** /api/v1/integration/aws | List all AWS integrations
*AwsIntegrationApi* | [**listAWSTagFilters**](AwsIntegrationApi.md#listAWSTagFilters) | **GET** /api/v1/integration/aws/filtering | Get all AWS tag filters
*AwsIntegrationApi* | [**listAvailableAWSNamespaces**](AwsIntegrationApi.md#listAvailableAWSNamespaces) | **GET** /api/v1/integration/aws/available_namespace_rules | List namespace rules
*AwsIntegrationApi* | [**updateAWSAccount**](AwsIntegrationApi.md#updateAWSAccount) | **PUT** /api/v1/integration/aws | Update an AWS integration
*AwsLogsIntegrationApi* | [**checkAWSLogsLambdaAsync**](AwsLogsIntegrationApi.md#checkAWSLogsLambdaAsync) | **POST** /api/v1/integration/aws/logs/check_async | Check that an AWS Lambda Function exists
*AwsLogsIntegrationApi* | [**checkAWSLogsServicesAsync**](AwsLogsIntegrationApi.md#checkAWSLogsServicesAsync) | **POST** /api/v1/integration/aws/logs/services_async | Check permissions for log services
*AwsLogsIntegrationApi* | [**createAWSLambdaARN**](AwsLogsIntegrationApi.md#createAWSLambdaARN) | **POST** /api/v1/integration/aws/logs | Add AWS Log Lambda ARN
*AwsLogsIntegrationApi* | [**deleteAWSLambdaARN**](AwsLogsIntegrationApi.md#deleteAWSLambdaARN) | **DELETE** /api/v1/integration/aws/logs | Delete an AWS Logs integration
*AwsLogsIntegrationApi* | [**enableAWSLogServices**](AwsLogsIntegrationApi.md#enableAWSLogServices) | **POST** /api/v1/integration/aws/logs/services | Enable an AWS Logs integration
*AwsLogsIntegrationApi* | [**listAWSLogsIntegrations**](AwsLogsIntegrationApi.md#listAWSLogsIntegrations) | **GET** /api/v1/integration/aws/logs | List all AWS Logs integrations
*AwsLogsIntegrationApi* | [**listAWSLogsServices**](AwsLogsIntegrationApi.md#listAWSLogsServices) | **GET** /api/v1/integration/aws/logs/services | Get list of AWS log ready services
*AzureIntegrationApi* | [**createAzureIntegration**](AzureIntegrationApi.md#createAzureIntegration) | **POST** /api/v1/integration/azure | Create an Azure integration
*AzureIntegrationApi* | [**deleteAzureIntegration**](AzureIntegrationApi.md#deleteAzureIntegration) | **DELETE** /api/v1/integration/azure | Delete an Azure integration
*AzureIntegrationApi* | [**listAzureIntegration**](AzureIntegrationApi.md#listAzureIntegration) | **GET** /api/v1/integration/azure | List all Azure integrations
*AzureIntegrationApi* | [**updateAzureHostFilters**](AzureIntegrationApi.md#updateAzureHostFilters) | **POST** /api/v1/integration/azure/host_filters | Update Azure integration host filters
*AzureIntegrationApi* | [**updateAzureIntegration**](AzureIntegrationApi.md#updateAzureIntegration) | **PUT** /api/v1/integration/azure | Update an Azure integration
*DashboardListsApi* | [**createDashboardList**](DashboardListsApi.md#createDashboardList) | **POST** /api/v1/dashboard/lists/manual | Create a dashboard list
*DashboardListsApi* | [**deleteDashboardList**](DashboardListsApi.md#deleteDashboardList) | **DELETE** /api/v1/dashboard/lists/manual/{list_id} | Delete a dashboard list
*DashboardListsApi* | [**getDashboardList**](DashboardListsApi.md#getDashboardList) | **GET** /api/v1/dashboard/lists/manual/{list_id} | Get a dashboard list
*DashboardListsApi* | [**listDashboardLists**](DashboardListsApi.md#listDashboardLists) | **GET** /api/v1/dashboard/lists/manual | Get all dashboard lists
*DashboardListsApi* | [**updateDashboardList**](DashboardListsApi.md#updateDashboardList) | **PUT** /api/v1/dashboard/lists/manual/{list_id} | Update a dashboard list
*DashboardsApi* | [**createDashboard**](DashboardsApi.md#createDashboard) | **POST** /api/v1/dashboard | Create a new dashboard
*DashboardsApi* | [**deleteDashboard**](DashboardsApi.md#deleteDashboard) | **DELETE** /api/v1/dashboard/{dashboard_id} | Delete a dashboard
*DashboardsApi* | [**getDashboard**](DashboardsApi.md#getDashboard) | **GET** /api/v1/dashboard/{dashboard_id} | Get a dashboard
*DashboardsApi* | [**listDashboards**](DashboardsApi.md#listDashboards) | **GET** /api/v1/dashboard | Get all dashboards
*DashboardsApi* | [**updateDashboard**](DashboardsApi.md#updateDashboard) | **PUT** /api/v1/dashboard/{dashboard_id} | Update a dashboard
*DowntimesApi* | [**cancelDowntime**](DowntimesApi.md#cancelDowntime) | **DELETE** /api/v1/downtime/{downtime_id} | Cancel a downtime
*DowntimesApi* | [**cancelDowntimesByScope**](DowntimesApi.md#cancelDowntimesByScope) | **POST** /api/v1/downtime/cancel/by_scope | Cancel downtimes by scope
*DowntimesApi* | [**createDowntime**](DowntimesApi.md#createDowntime) | **POST** /api/v1/downtime | Schedule a downtime
*DowntimesApi* | [**getDowntime**](DowntimesApi.md#getDowntime) | **GET** /api/v1/downtime/{downtime_id} | Get a downtime
*DowntimesApi* | [**listDowntimes**](DowntimesApi.md#listDowntimes) | **GET** /api/v1/downtime | Get all downtimes
*DowntimesApi* | [**listMonitorDowntimes**](DowntimesApi.md#listMonitorDowntimes) | **GET** /api/v1/monitor/{monitor_id}/downtimes | Get all downtimes for a monitor
*DowntimesApi* | [**updateDowntime**](DowntimesApi.md#updateDowntime) | **PUT** /api/v1/downtime/{downtime_id} | Update a downtime
*EventsApi* | [**createEvent**](EventsApi.md#createEvent) | **POST** /api/v1/events | Post an event
*EventsApi* | [**getEvent**](EventsApi.md#getEvent) | **GET** /api/v1/events/{event_id} | Get an event
*EventsApi* | [**listEvents**](EventsApi.md#listEvents) | **GET** /api/v1/events | Query the event stream
*GcpIntegrationApi* | [**createGCPIntegration**](GcpIntegrationApi.md#createGCPIntegration) | **POST** /api/v1/integration/gcp | Create a GCP integration
*GcpIntegrationApi* | [**deleteGCPIntegration**](GcpIntegrationApi.md#deleteGCPIntegration) | **DELETE** /api/v1/integration/gcp | Delete a GCP integration
*GcpIntegrationApi* | [**listGCPIntegration**](GcpIntegrationApi.md#listGCPIntegration) | **GET** /api/v1/integration/gcp | List all GCP integrations
*GcpIntegrationApi* | [**updateGCPIntegration**](GcpIntegrationApi.md#updateGCPIntegration) | **PUT** /api/v1/integration/gcp | Update a GCP integration
*HostsApi* | [**getHostTotals**](HostsApi.md#getHostTotals) | **GET** /api/v1/hosts/totals | Get the total number of active hosts
*HostsApi* | [**listHosts**](HostsApi.md#listHosts) | **GET** /api/v1/hosts | Get all hosts for your organization
*HostsApi* | [**muteHost**](HostsApi.md#muteHost) | **POST** /api/v1/host/{host_name}/mute | Mute a host
*HostsApi* | [**unmuteHost**](HostsApi.md#unmuteHost) | **POST** /api/v1/host/{host_name}/unmute | Unmute a host
*IpRangesApi* | [**getIPRanges**](IpRangesApi.md#getIPRanges) | **GET** / | List IP Ranges
*KeyManagementApi* | [**createAPIKey**](KeyManagementApi.md#createAPIKey) | **POST** /api/v1/api_key | Create an API key
*KeyManagementApi* | [**createApplicationKey**](KeyManagementApi.md#createApplicationKey) | **POST** /api/v1/application_key | Create an application key
*KeyManagementApi* | [**deleteAPIKey**](KeyManagementApi.md#deleteAPIKey) | **DELETE** /api/v1/api_key/{key} | Delete an API key
*KeyManagementApi* | [**deleteApplicationKey**](KeyManagementApi.md#deleteApplicationKey) | **DELETE** /api/v1/application_key/{key} | Delete an application key
*KeyManagementApi* | [**getAPIKey**](KeyManagementApi.md#getAPIKey) | **GET** /api/v1/api_key/{key} | Get API key
*KeyManagementApi* | [**getApplicationKey**](KeyManagementApi.md#getApplicationKey) | **GET** /api/v1/application_key/{key} | Get an application key
*KeyManagementApi* | [**listAPIKeys**](KeyManagementApi.md#listAPIKeys) | **GET** /api/v1/api_key | Get all API keys
*KeyManagementApi* | [**listApplicationKeys**](KeyManagementApi.md#listApplicationKeys) | **GET** /api/v1/application_key | Get all application keys
*KeyManagementApi* | [**updateAPIKey**](KeyManagementApi.md#updateAPIKey) | **PUT** /api/v1/api_key/{key} | Edit an API key
*KeyManagementApi* | [**updateApplicationKey**](KeyManagementApi.md#updateApplicationKey) | **PUT** /api/v1/application_key/{key} | Edit an application key
*LogsApi* | [**listLogs**](LogsApi.md#listLogs) | **POST** /api/v1/logs-queries/list | Search logs
*LogsApi* | [**submitLog**](LogsApi.md#submitLog) | **POST** /v1/input | Send logs
*LogsIndexesApi* | [**createLogsIndex**](LogsIndexesApi.md#createLogsIndex) | **POST** /api/v1/logs/config/indexes | Create an index
*LogsIndexesApi* | [**getLogsIndex**](LogsIndexesApi.md#getLogsIndex) | **GET** /api/v1/logs/config/indexes/{name} | Get an index
*LogsIndexesApi* | [**getLogsIndexOrder**](LogsIndexesApi.md#getLogsIndexOrder) | **GET** /api/v1/logs/config/index-order | Get indexes order
*LogsIndexesApi* | [**listLogIndexes**](LogsIndexesApi.md#listLogIndexes) | **GET** /api/v1/logs/config/indexes | Get all indexes
*LogsIndexesApi* | [**updateLogsIndex**](LogsIndexesApi.md#updateLogsIndex) | **PUT** /api/v1/logs/config/indexes/{name} | Update an index
*LogsIndexesApi* | [**updateLogsIndexOrder**](LogsIndexesApi.md#updateLogsIndexOrder) | **PUT** /api/v1/logs/config/index-order | Update indexes order
*LogsPipelinesApi* | [**createLogsPipeline**](LogsPipelinesApi.md#createLogsPipeline) | **POST** /api/v1/logs/config/pipelines | Create a pipeline
*LogsPipelinesApi* | [**deleteLogsPipeline**](LogsPipelinesApi.md#deleteLogsPipeline) | **DELETE** /api/v1/logs/config/pipelines/{pipeline_id} | Delete a pipeline
*LogsPipelinesApi* | [**getLogsPipeline**](LogsPipelinesApi.md#getLogsPipeline) | **GET** /api/v1/logs/config/pipelines/{pipeline_id} | Get a pipeline
*LogsPipelinesApi* | [**getLogsPipelineOrder**](LogsPipelinesApi.md#getLogsPipelineOrder) | **GET** /api/v1/logs/config/pipeline-order | Get pipeline order
*LogsPipelinesApi* | [**listLogsPipelines**](LogsPipelinesApi.md#listLogsPipelines) | **GET** /api/v1/logs/config/pipelines | Get all pipelines
*LogsPipelinesApi* | [**updateLogsPipeline**](LogsPipelinesApi.md#updateLogsPipeline) | **PUT** /api/v1/logs/config/pipelines/{pipeline_id} | Update a pipeline
*LogsPipelinesApi* | [**updateLogsPipelineOrder**](LogsPipelinesApi.md#updateLogsPipelineOrder) | **PUT** /api/v1/logs/config/pipeline-order | Update pipeline order
*MetricsApi* | [**getMetricMetadata**](MetricsApi.md#getMetricMetadata) | **GET** /api/v1/metrics/{metric_name} | Get metric metadata
*MetricsApi* | [**listActiveMetrics**](MetricsApi.md#listActiveMetrics) | **GET** /api/v1/metrics | Get active metrics list
*MetricsApi* | [**listMetrics**](MetricsApi.md#listMetrics) | **GET** /api/v1/search | Search metrics
*MetricsApi* | [**queryMetrics**](MetricsApi.md#queryMetrics) | **GET** /api/v1/query | Query timeseries points
*MetricsApi* | [**submitMetrics**](MetricsApi.md#submitMetrics) | **POST** /api/v1/series | Submit metrics
*MetricsApi* | [**updateMetricMetadata**](MetricsApi.md#updateMetricMetadata) | **PUT** /api/v1/metrics/{metric_name} | Edit metric metadata
*MonitorsApi* | [**checkCanDeleteMonitor**](MonitorsApi.md#checkCanDeleteMonitor) | **GET** /api/v1/monitor/can_delete | Check if a monitor can be deleted
*MonitorsApi* | [**createMonitor**](MonitorsApi.md#createMonitor) | **POST** /api/v1/monitor | Create a monitor
*MonitorsApi* | [**deleteMonitor**](MonitorsApi.md#deleteMonitor) | **DELETE** /api/v1/monitor/{monitor_id} | Delete a monitor
*MonitorsApi* | [**getMonitor**](MonitorsApi.md#getMonitor) | **GET** /api/v1/monitor/{monitor_id} | Get a monitor&#39;s details
*MonitorsApi* | [**listMonitors**](MonitorsApi.md#listMonitors) | **GET** /api/v1/monitor | Get all monitor details
*MonitorsApi* | [**updateMonitor**](MonitorsApi.md#updateMonitor) | **PUT** /api/v1/monitor/{monitor_id} | Edit a monitor
*MonitorsApi* | [**validateMonitor**](MonitorsApi.md#validateMonitor) | **POST** /api/v1/monitor/validate | Validate a monitor
*OrganizationsApi* | [**createChildOrg**](OrganizationsApi.md#createChildOrg) | **POST** /api/v1/org | Create a child organization
*OrganizationsApi* | [**getOrg**](OrganizationsApi.md#getOrg) | **GET** /api/v1/org/{public_id} | Get organization information
*OrganizationsApi* | [**listOrgs**](OrganizationsApi.md#listOrgs) | **GET** /api/v1/org | List your managed organizations
*OrganizationsApi* | [**updateOrg**](OrganizationsApi.md#updateOrg) | **PUT** /api/v1/org/{public_id} | Update your organization
*OrganizationsApi* | [**uploadIdPForOrg**](OrganizationsApi.md#uploadIdPForOrg) | **POST** /api/v1/org/{public_id}/idp_metadata | Upload IdP metadata
*PagerDutyIntegrationApi* | [**createPagerDutyIntegrationService**](PagerDutyIntegrationApi.md#createPagerDutyIntegrationService) | **POST** /api/v1/integration/pagerduty/configuration/services | Create a new service object
*PagerDutyIntegrationApi* | [**deletePagerDutyIntegrationService**](PagerDutyIntegrationApi.md#deletePagerDutyIntegrationService) | **DELETE** /api/v1/integration/pagerduty/configuration/services/{service_name} | Delete a single service object
*PagerDutyIntegrationApi* | [**getPagerDutyIntegrationService**](PagerDutyIntegrationApi.md#getPagerDutyIntegrationService) | **GET** /api/v1/integration/pagerduty/configuration/services/{service_name} | Get a single service object
*PagerDutyIntegrationApi* | [**updatePagerDutyIntegrationService**](PagerDutyIntegrationApi.md#updatePagerDutyIntegrationService) | **PUT** /api/v1/integration/pagerduty/configuration/services/{service_name} | Update a single service object
*ServiceChecksApi* | [**submitServiceCheck**](ServiceChecksApi.md#submitServiceCheck) | **POST** /api/v1/check_run | Submit a Service Check
*ServiceLevelObjectiveCorrectionsApi* | [**createSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#createSLOCorrection) | **POST** /api/v1/slo/correction | Create an SLO correction
*ServiceLevelObjectiveCorrectionsApi* | [**deleteSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#deleteSLOCorrection) | **DELETE** /api/v1/slo/correction/{slo_correction_id} | Delete an SLO correction
*ServiceLevelObjectiveCorrectionsApi* | [**getSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#getSLOCorrection) | **GET** /api/v1/slo/correction/{slo_correction_id} | Get an SLO correction for an SLO
*ServiceLevelObjectiveCorrectionsApi* | [**listSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#listSLOCorrection) | **GET** /api/v1/slo/correction | Get all SLO corrections
*ServiceLevelObjectiveCorrectionsApi* | [**updateSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#updateSLOCorrection) | **PATCH** /api/v1/slo/correction/{slo_correction_id} | Update an SLO correction
*ServiceLevelObjectivesApi* | [**checkCanDeleteSLO**](ServiceLevelObjectivesApi.md#checkCanDeleteSLO) | **GET** /api/v1/slo/can_delete | Check if SLOs can be safely deleted
*ServiceLevelObjectivesApi* | [**createSLO**](ServiceLevelObjectivesApi.md#createSLO) | **POST** /api/v1/slo | Create an SLO object
*ServiceLevelObjectivesApi* | [**deleteSLO**](ServiceLevelObjectivesApi.md#deleteSLO) | **DELETE** /api/v1/slo/{slo_id} | Delete an SLO
*ServiceLevelObjectivesApi* | [**deleteSLOTimeframeInBulk**](ServiceLevelObjectivesApi.md#deleteSLOTimeframeInBulk) | **POST** /api/v1/slo/bulk_delete | Bulk Delete SLO Timeframes
*ServiceLevelObjectivesApi* | [**getSLO**](ServiceLevelObjectivesApi.md#getSLO) | **GET** /api/v1/slo/{slo_id} | Get an SLO&#39;s details
*ServiceLevelObjectivesApi* | [**getSLOHistory**](ServiceLevelObjectivesApi.md#getSLOHistory) | **GET** /api/v1/slo/{slo_id}/history | Get an SLO&#39;s history
*ServiceLevelObjectivesApi* | [**listSLOs**](ServiceLevelObjectivesApi.md#listSLOs) | **GET** /api/v1/slo | Get all SLOs
*ServiceLevelObjectivesApi* | [**updateSLO**](ServiceLevelObjectivesApi.md#updateSLO) | **PUT** /api/v1/slo/{slo_id} | Update an SLO
*SlackIntegrationApi* | [**createSlackIntegrationChannel**](SlackIntegrationApi.md#createSlackIntegrationChannel) | **POST** /api/v1/integration/slack/configuration/accounts/{account_name}/channels | Create a Slack integration channel
*SlackIntegrationApi* | [**getSlackIntegrationChannel**](SlackIntegrationApi.md#getSlackIntegrationChannel) | **GET** /api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name} | Get a Slack integration channel
*SlackIntegrationApi* | [**getSlackIntegrationChannels**](SlackIntegrationApi.md#getSlackIntegrationChannels) | **GET** /api/v1/integration/slack/configuration/accounts/{account_name}/channels | Get all channels in a Slack integration
*SlackIntegrationApi* | [**removeSlackIntegrationChannel**](SlackIntegrationApi.md#removeSlackIntegrationChannel) | **DELETE** /api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name} | Remove a Slack integration channel
*SlackIntegrationApi* | [**updateSlackIntegrationChannel**](SlackIntegrationApi.md#updateSlackIntegrationChannel) | **PATCH** /api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name} | Update a Slack integration channel
*SnapshotsApi* | [**getGraphSnapshot**](SnapshotsApi.md#getGraphSnapshot) | **GET** /api/v1/graph/snapshot | Take graph snapshots
*SyntheticsApi* | [**createGlobalVariable**](SyntheticsApi.md#createGlobalVariable) | **POST** /api/v1/synthetics/variables | Create a global variable
*SyntheticsApi* | [**createPrivateLocation**](SyntheticsApi.md#createPrivateLocation) | **POST** /api/v1/synthetics/private-locations | Create a private location
*SyntheticsApi* | [**createSyntheticsAPITest**](SyntheticsApi.md#createSyntheticsAPITest) | **POST** /api/v1/synthetics/tests/api | Create an API test
*SyntheticsApi* | [**createSyntheticsBrowserTest**](SyntheticsApi.md#createSyntheticsBrowserTest) | **POST** /api/v1/synthetics/tests/browser | Create a browser test
*SyntheticsApi* | [**deleteGlobalVariable**](SyntheticsApi.md#deleteGlobalVariable) | **DELETE** /api/v1/synthetics/variables/{variable_id} | Delete a global variable
*SyntheticsApi* | [**deletePrivateLocation**](SyntheticsApi.md#deletePrivateLocation) | **DELETE** /api/v1/synthetics/private-locations/{location_id} | Delete a private location
*SyntheticsApi* | [**deleteTests**](SyntheticsApi.md#deleteTests) | **POST** /api/v1/synthetics/tests/delete | Delete tests
*SyntheticsApi* | [**editGlobalVariable**](SyntheticsApi.md#editGlobalVariable) | **PUT** /api/v1/synthetics/variables/{variable_id} | Edit a global variable
*SyntheticsApi* | [**getAPITest**](SyntheticsApi.md#getAPITest) | **GET** /api/v1/synthetics/tests/api/{public_id} | Get an API test
*SyntheticsApi* | [**getAPITestLatestResults**](SyntheticsApi.md#getAPITestLatestResults) | **GET** /api/v1/synthetics/tests/{public_id}/results | Get an API test&#39;s latest results summaries
*SyntheticsApi* | [**getAPITestResult**](SyntheticsApi.md#getAPITestResult) | **GET** /api/v1/synthetics/tests/{public_id}/results/{result_id} | Get an API test result
*SyntheticsApi* | [**getBrowserTest**](SyntheticsApi.md#getBrowserTest) | **GET** /api/v1/synthetics/tests/browser/{public_id} | Get a browser test
*SyntheticsApi* | [**getBrowserTestLatestResults**](SyntheticsApi.md#getBrowserTestLatestResults) | **GET** /api/v1/synthetics/tests/browser/{public_id}/results | Get a browser test&#39;s latest results summaries
*SyntheticsApi* | [**getBrowserTestResult**](SyntheticsApi.md#getBrowserTestResult) | **GET** /api/v1/synthetics/tests/browser/{public_id}/results/{result_id} | Get a browser test result
*SyntheticsApi* | [**getGlobalVariable**](SyntheticsApi.md#getGlobalVariable) | **GET** /api/v1/synthetics/variables/{variable_id} | Get a global variable
*SyntheticsApi* | [**getPrivateLocation**](SyntheticsApi.md#getPrivateLocation) | **GET** /api/v1/synthetics/private-locations/{location_id} | Get a private location
*SyntheticsApi* | [**getTest**](SyntheticsApi.md#getTest) | **GET** /api/v1/synthetics/tests/{public_id} | Get a test configuration
*SyntheticsApi* | [**listLocations**](SyntheticsApi.md#listLocations) | **GET** /api/v1/synthetics/locations | Get all locations (public and private)
*SyntheticsApi* | [**listTests**](SyntheticsApi.md#listTests) | **GET** /api/v1/synthetics/tests | Get the list of all tests
*SyntheticsApi* | [**triggerCITests**](SyntheticsApi.md#triggerCITests) | **POST** /api/v1/synthetics/tests/trigger/ci | Trigger tests from CI/CD pipelines
*SyntheticsApi* | [**updateAPITest**](SyntheticsApi.md#updateAPITest) | **PUT** /api/v1/synthetics/tests/api/{public_id} | Edit an API test
*SyntheticsApi* | [**updateBrowserTest**](SyntheticsApi.md#updateBrowserTest) | **PUT** /api/v1/synthetics/tests/browser/{public_id} | Edit a browser test
*SyntheticsApi* | [**updatePrivateLocation**](SyntheticsApi.md#updatePrivateLocation) | **PUT** /api/v1/synthetics/private-locations/{location_id} | Edit a private location
*SyntheticsApi* | [**updateTestPauseStatus**](SyntheticsApi.md#updateTestPauseStatus) | **PUT** /api/v1/synthetics/tests/{public_id}/status | Pause or start a test
*TagsApi* | [**createHostTags**](TagsApi.md#createHostTags) | **POST** /api/v1/tags/hosts/{host_name} | Add tags to a host
*TagsApi* | [**deleteHostTags**](TagsApi.md#deleteHostTags) | **DELETE** /api/v1/tags/hosts/{host_name} | Remove host tags
*TagsApi* | [**getHostTags**](TagsApi.md#getHostTags) | **GET** /api/v1/tags/hosts/{host_name} | Get host tags
*TagsApi* | [**listHostTags**](TagsApi.md#listHostTags) | **GET** /api/v1/tags/hosts | Get Tags
*TagsApi* | [**updateHostTags**](TagsApi.md#updateHostTags) | **PUT** /api/v1/tags/hosts/{host_name} | Update host tags
*UsageMeteringApi* | [**getDailyCustomReports**](UsageMeteringApi.md#getDailyCustomReports) | **GET** /api/v1/daily_custom_reports | Get the list of available daily custom reports
*UsageMeteringApi* | [**getIncidentManagement**](UsageMeteringApi.md#getIncidentManagement) | **GET** /api/v1/usage/incident-management | Get hourly usage for incident management
*UsageMeteringApi* | [**getIngestedSpans**](UsageMeteringApi.md#getIngestedSpans) | **GET** /api/v1/usage/ingested-spans | Get hourly usage for ingested spans
*UsageMeteringApi* | [**getMonthlyCustomReports**](UsageMeteringApi.md#getMonthlyCustomReports) | **GET** /api/v1/monthly_custom_reports | Get the list of available monthly custom reports
*UsageMeteringApi* | [**getSpecifiedDailyCustomReports**](UsageMeteringApi.md#getSpecifiedDailyCustomReports) | **GET** /api/v1/daily_custom_reports/{report_id} | Get specified daily custom reports
*UsageMeteringApi* | [**getSpecifiedMonthlyCustomReports**](UsageMeteringApi.md#getSpecifiedMonthlyCustomReports) | **GET** /api/v1/monthly_custom_reports/{report_id} | Get specified monthly custom reports
*UsageMeteringApi* | [**getTracingWithoutLimits**](UsageMeteringApi.md#getTracingWithoutLimits) | **GET** /api/v1/usage/tracing-without-limits | Get hourly usage for tracing without limits
*UsageMeteringApi* | [**getUsageAnalyzedLogs**](UsageMeteringApi.md#getUsageAnalyzedLogs) | **GET** /api/v1/usage/analyzed_logs | Get hourly usage for analyzed logs
*UsageMeteringApi* | [**getUsageAttribution**](UsageMeteringApi.md#getUsageAttribution) | **GET** /api/v1/usage/attribution | Get Usage Attribution
*UsageMeteringApi* | [**getUsageBillableSummary**](UsageMeteringApi.md#getUsageBillableSummary) | **GET** /api/v1/usage/billable-summary | Get billable usage across your account
*UsageMeteringApi* | [**getUsageComplianceMonitoring**](UsageMeteringApi.md#getUsageComplianceMonitoring) | **GET** /api/v1/usage/compliance-monitoring | Get hourly usage for Compliance Monitoring
*UsageMeteringApi* | [**getUsageFargate**](UsageMeteringApi.md#getUsageFargate) | **GET** /api/v1/usage/fargate | Get hourly usage for Fargate
*UsageMeteringApi* | [**getUsageHosts**](UsageMeteringApi.md#getUsageHosts) | **GET** /api/v1/usage/hosts | Get hourly usage for hosts and containers
*UsageMeteringApi* | [**getUsageIndexedSpans**](UsageMeteringApi.md#getUsageIndexedSpans) | **GET** /api/v1/usage/indexed-spans | Get hourly usage for indexed spans
*UsageMeteringApi* | [**getUsageInternetOfThings**](UsageMeteringApi.md#getUsageInternetOfThings) | **GET** /api/v1/usage/iot | Get hourly usage for IoT
*UsageMeteringApi* | [**getUsageLambda**](UsageMeteringApi.md#getUsageLambda) | **GET** /api/v1/usage/aws_lambda | Get hourly usage for Lambda
*UsageMeteringApi* | [**getUsageLogs**](UsageMeteringApi.md#getUsageLogs) | **GET** /api/v1/usage/logs | Get hourly usage for Logs
*UsageMeteringApi* | [**getUsageLogsByIndex**](UsageMeteringApi.md#getUsageLogsByIndex) | **GET** /api/v1/usage/logs_by_index | Get hourly usage for Logs by Index
*UsageMeteringApi* | [**getUsageNetworkFlows**](UsageMeteringApi.md#getUsageNetworkFlows) | **GET** /api/v1/usage/network_flows | Get hourly usage for Network Flows
*UsageMeteringApi* | [**getUsageNetworkHosts**](UsageMeteringApi.md#getUsageNetworkHosts) | **GET** /api/v1/usage/network_hosts | Get hourly usage for Network Hosts
*UsageMeteringApi* | [**getUsageProfiling**](UsageMeteringApi.md#getUsageProfiling) | **GET** /api/v1/usage/profiling | Get hourly usage for profiled hosts
*UsageMeteringApi* | [**getUsageRumSessions**](UsageMeteringApi.md#getUsageRumSessions) | **GET** /api/v1/usage/rum_sessions | Get hourly usage for RUM Sessions
*UsageMeteringApi* | [**getUsageSNMP**](UsageMeteringApi.md#getUsageSNMP) | **GET** /api/v1/usage/snmp | Get hourly usage for SNMP devices
*UsageMeteringApi* | [**getUsageSummary**](UsageMeteringApi.md#getUsageSummary) | **GET** /api/v1/usage/summary | Get usage across your multi-org account
*UsageMeteringApi* | [**getUsageSynthetics**](UsageMeteringApi.md#getUsageSynthetics) | **GET** /api/v1/usage/synthetics | Get hourly usage for Synthetics Checks
*UsageMeteringApi* | [**getUsageSyntheticsAPI**](UsageMeteringApi.md#getUsageSyntheticsAPI) | **GET** /api/v1/usage/synthetics_api | Get hourly usage for Synthetics API Checks
*UsageMeteringApi* | [**getUsageSyntheticsBrowser**](UsageMeteringApi.md#getUsageSyntheticsBrowser) | **GET** /api/v1/usage/synthetics_browser | Get hourly usage for Synthetics Browser Checks
*UsageMeteringApi* | [**getUsageTimeseries**](UsageMeteringApi.md#getUsageTimeseries) | **GET** /api/v1/usage/timeseries | Get hourly usage for custom metrics
*UsageMeteringApi* | [**getUsageTopAvgMetrics**](UsageMeteringApi.md#getUsageTopAvgMetrics) | **GET** /api/v1/usage/top_avg_metrics | Get top custom metrics by hourly average
*UsageMeteringApi* | [**getUsageTrace**](UsageMeteringApi.md#getUsageTrace) | **GET** /api/v1/usage/traces | Get hourly usage for Trace Search
*UsersApi* | [**createUser**](UsersApi.md#createUser) | **POST** /api/v1/user | Create a user
*UsersApi* | [**disableUser**](UsersApi.md#disableUser) | **DELETE** /api/v1/user/{user_handle} | Disable a user
*UsersApi* | [**getUser**](UsersApi.md#getUser) | **GET** /api/v1/user/{user_handle} | Get user details
*UsersApi* | [**listUsers**](UsersApi.md#listUsers) | **GET** /api/v1/user | List all users
*UsersApi* | [**updateUser**](UsersApi.md#updateUser) | **PUT** /api/v1/user/{user_handle} | Update a user


## Documentation for Models

 - [APIErrorResponse](APIErrorResponse.md)
 - [AWSAccount](AWSAccount.md)
 - [AWSAccountAndLambdaRequest](AWSAccountAndLambdaRequest.md)
 - [AWSAccountCreateResponse](AWSAccountCreateResponse.md)
 - [AWSAccountListResponse](AWSAccountListResponse.md)
 - [AWSLogsAsyncError](AWSLogsAsyncError.md)
 - [AWSLogsAsyncResponse](AWSLogsAsyncResponse.md)
 - [AWSLogsLambda](AWSLogsLambda.md)
 - [AWSLogsListResponse](AWSLogsListResponse.md)
 - [AWSLogsListServicesResponse](AWSLogsListServicesResponse.md)
 - [AWSLogsServicesRequest](AWSLogsServicesRequest.md)
 - [AWSNamespace](AWSNamespace.md)
 - [AWSTagFilter](AWSTagFilter.md)
 - [AWSTagFilterCreateRequest](AWSTagFilterCreateRequest.md)
 - [AWSTagFilterDeleteRequest](AWSTagFilterDeleteRequest.md)
 - [AWSTagFilterListResponse](AWSTagFilterListResponse.md)
 - [AccessRole](AccessRole.md)
 - [AlertGraphWidgetDefinition](AlertGraphWidgetDefinition.md)
 - [AlertGraphWidgetDefinitionType](AlertGraphWidgetDefinitionType.md)
 - [AlertValueWidgetDefinition](AlertValueWidgetDefinition.md)
 - [AlertValueWidgetDefinitionType](AlertValueWidgetDefinitionType.md)
 - [ApiKey](ApiKey.md)
 - [ApiKeyListResponse](ApiKeyListResponse.md)
 - [ApiKeyResponse](ApiKeyResponse.md)
 - [ApmStatsQueryColumnType](ApmStatsQueryColumnType.md)
 - [ApmStatsQueryDefinition](ApmStatsQueryDefinition.md)
 - [ApmStatsQueryRowType](ApmStatsQueryRowType.md)
 - [ApplicationKey](ApplicationKey.md)
 - [ApplicationKeyListResponse](ApplicationKeyListResponse.md)
 - [ApplicationKeyResponse](ApplicationKeyResponse.md)
 - [AuthenticationValidationResponse](AuthenticationValidationResponse.md)
 - [AzureAccount](AzureAccount.md)
 - [CancelDowntimesByScopeRequest](CancelDowntimesByScopeRequest.md)
 - [CanceledDowntimesIds](CanceledDowntimesIds.md)
 - [ChangeWidgetDefinition](ChangeWidgetDefinition.md)
 - [ChangeWidgetDefinitionType](ChangeWidgetDefinitionType.md)
 - [ChangeWidgetRequest](ChangeWidgetRequest.md)
 - [CheckCanDeleteMonitorResponse](CheckCanDeleteMonitorResponse.md)
 - [CheckCanDeleteMonitorResponseData](CheckCanDeleteMonitorResponseData.md)
 - [CheckCanDeleteSLOResponse](CheckCanDeleteSLOResponse.md)
 - [CheckCanDeleteSLOResponseData](CheckCanDeleteSLOResponseData.md)
 - [CheckStatusWidgetDefinition](CheckStatusWidgetDefinition.md)
 - [CheckStatusWidgetDefinitionType](CheckStatusWidgetDefinitionType.md)
 - [ContentEncoding](ContentEncoding.md)
 - [Creator](Creator.md)
 - [Dashboard](Dashboard.md)
 - [DashboardDeleteResponse](DashboardDeleteResponse.md)
 - [DashboardLayoutType](DashboardLayoutType.md)
 - [DashboardList](DashboardList.md)
 - [DashboardListDeleteResponse](DashboardListDeleteResponse.md)
 - [DashboardListListResponse](DashboardListListResponse.md)
 - [DashboardReflowType](DashboardReflowType.md)
 - [DashboardSummary](DashboardSummary.md)
 - [DashboardSummaryDefinition](DashboardSummaryDefinition.md)
 - [DashboardTemplateVariable](DashboardTemplateVariable.md)
 - [DashboardTemplateVariablePreset](DashboardTemplateVariablePreset.md)
 - [DashboardTemplateVariablePresetValue](DashboardTemplateVariablePresetValue.md)
 - [DeletedMonitor](DeletedMonitor.md)
 - [DistributionWidgetDefinition](DistributionWidgetDefinition.md)
 - [DistributionWidgetDefinitionType](DistributionWidgetDefinitionType.md)
 - [DistributionWidgetRequest](DistributionWidgetRequest.md)
 - [DistributionWidgetXAxis](DistributionWidgetXAxis.md)
 - [DistributionWidgetYAxis](DistributionWidgetYAxis.md)
 - [Downtime](Downtime.md)
 - [DowntimeRecurrence](DowntimeRecurrence.md)
 - [Event](Event.md)
 - [EventAlertType](EventAlertType.md)
 - [EventCreateRequest](EventCreateRequest.md)
 - [EventCreateResponse](EventCreateResponse.md)
 - [EventListResponse](EventListResponse.md)
 - [EventPriority](EventPriority.md)
 - [EventQueryDefinition](EventQueryDefinition.md)
 - [EventResponse](EventResponse.md)
 - [EventStreamWidgetDefinition](EventStreamWidgetDefinition.md)
 - [EventStreamWidgetDefinitionType](EventStreamWidgetDefinitionType.md)
 - [EventTimelineWidgetDefinition](EventTimelineWidgetDefinition.md)
 - [EventTimelineWidgetDefinitionType](EventTimelineWidgetDefinitionType.md)
 - [FormulaAndFunctionEventAggregation](FormulaAndFunctionEventAggregation.md)
 - [FormulaAndFunctionEventQueryDefinition](FormulaAndFunctionEventQueryDefinition.md)
 - [FormulaAndFunctionEventQueryDefinitionCompute](FormulaAndFunctionEventQueryDefinitionCompute.md)
 - [FormulaAndFunctionEventQueryDefinitionSearch](FormulaAndFunctionEventQueryDefinitionSearch.md)
 - [FormulaAndFunctionEventQueryGroupBy](FormulaAndFunctionEventQueryGroupBy.md)
 - [FormulaAndFunctionEventQueryGroupBySort](FormulaAndFunctionEventQueryGroupBySort.md)
 - [FormulaAndFunctionEventsDataSource](FormulaAndFunctionEventsDataSource.md)
 - [FormulaAndFunctionMetricAggregation](FormulaAndFunctionMetricAggregation.md)
 - [FormulaAndFunctionMetricDataSource](FormulaAndFunctionMetricDataSource.md)
 - [FormulaAndFunctionMetricQueryDefinition](FormulaAndFunctionMetricQueryDefinition.md)
 - [FormulaAndFunctionProcessQueryDataSource](FormulaAndFunctionProcessQueryDataSource.md)
 - [FormulaAndFunctionProcessQueryDefinition](FormulaAndFunctionProcessQueryDefinition.md)
 - [FormulaAndFunctionQueryDefinition](FormulaAndFunctionQueryDefinition.md)
 - [FormulaAndFunctionResponseFormat](FormulaAndFunctionResponseFormat.md)
 - [FreeTextWidgetDefinition](FreeTextWidgetDefinition.md)
 - [FreeTextWidgetDefinitionType](FreeTextWidgetDefinitionType.md)
 - [GCPAccount](GCPAccount.md)
 - [GeomapWidgetDefinition](GeomapWidgetDefinition.md)
 - [GeomapWidgetDefinitionStyle](GeomapWidgetDefinitionStyle.md)
 - [GeomapWidgetDefinitionType](GeomapWidgetDefinitionType.md)
 - [GeomapWidgetDefinitionView](GeomapWidgetDefinitionView.md)
 - [GeomapWidgetRequest](GeomapWidgetRequest.md)
 - [GraphSnapshot](GraphSnapshot.md)
 - [GroupWidgetDefinition](GroupWidgetDefinition.md)
 - [GroupWidgetDefinitionType](GroupWidgetDefinitionType.md)
 - [HTTPLogError](HTTPLogError.md)
 - [HTTPLogItem](HTTPLogItem.md)
 - [HTTPMethod](HTTPMethod.md)
 - [HeatMapWidgetDefinition](HeatMapWidgetDefinition.md)
 - [HeatMapWidgetDefinitionType](HeatMapWidgetDefinitionType.md)
 - [HeatMapWidgetRequest](HeatMapWidgetRequest.md)
 - [Host](Host.md)
 - [HostListResponse](HostListResponse.md)
 - [HostMapRequest](HostMapRequest.md)
 - [HostMapWidgetDefinition](HostMapWidgetDefinition.md)
 - [HostMapWidgetDefinitionRequests](HostMapWidgetDefinitionRequests.md)
 - [HostMapWidgetDefinitionStyle](HostMapWidgetDefinitionStyle.md)
 - [HostMapWidgetDefinitionType](HostMapWidgetDefinitionType.md)
 - [HostMeta](HostMeta.md)
 - [HostMetrics](HostMetrics.md)
 - [HostMuteResponse](HostMuteResponse.md)
 - [HostMuteSettings](HostMuteSettings.md)
 - [HostTags](HostTags.md)
 - [HostTotals](HostTotals.md)
 - [IFrameWidgetDefinition](IFrameWidgetDefinition.md)
 - [IFrameWidgetDefinitionType](IFrameWidgetDefinitionType.md)
 - [IPPrefixesAPI](IPPrefixesAPI.md)
 - [IPPrefixesAPM](IPPrefixesAPM.md)
 - [IPPrefixesAgents](IPPrefixesAgents.md)
 - [IPPrefixesLogs](IPPrefixesLogs.md)
 - [IPPrefixesProcess](IPPrefixesProcess.md)
 - [IPPrefixesSynthetics](IPPrefixesSynthetics.md)
 - [IPPrefixesWebhooks](IPPrefixesWebhooks.md)
 - [IPRanges](IPRanges.md)
 - [IdpFormData](IdpFormData.md)
 - [IdpResponse](IdpResponse.md)
 - [ImageWidgetDefinition](ImageWidgetDefinition.md)
 - [ImageWidgetDefinitionType](ImageWidgetDefinitionType.md)
 - [IntakePayloadAccepted](IntakePayloadAccepted.md)
 - [Log](Log.md)
 - [LogContent](LogContent.md)
 - [LogQueryDefinition](LogQueryDefinition.md)
 - [LogQueryDefinitionGroupBy](LogQueryDefinitionGroupBy.md)
 - [LogQueryDefinitionGroupBySort](LogQueryDefinitionGroupBySort.md)
 - [LogQueryDefinitionSearch](LogQueryDefinitionSearch.md)
 - [LogStreamWidgetDefinition](LogStreamWidgetDefinition.md)
 - [LogStreamWidgetDefinitionType](LogStreamWidgetDefinitionType.md)
 - [LogsAPIError](LogsAPIError.md)
 - [LogsAPIErrorResponse](LogsAPIErrorResponse.md)
 - [LogsArithmeticProcessor](LogsArithmeticProcessor.md)
 - [LogsArithmeticProcessorType](LogsArithmeticProcessorType.md)
 - [LogsAttributeRemapper](LogsAttributeRemapper.md)
 - [LogsAttributeRemapperType](LogsAttributeRemapperType.md)
 - [LogsCategoryProcessor](LogsCategoryProcessor.md)
 - [LogsCategoryProcessorCategory](LogsCategoryProcessorCategory.md)
 - [LogsCategoryProcessorType](LogsCategoryProcessorType.md)
 - [LogsDateRemapper](LogsDateRemapper.md)
 - [LogsDateRemapperType](LogsDateRemapperType.md)
 - [LogsExclusion](LogsExclusion.md)
 - [LogsExclusionFilter](LogsExclusionFilter.md)
 - [LogsFilter](LogsFilter.md)
 - [LogsGeoIPParser](LogsGeoIPParser.md)
 - [LogsGeoIPParserType](LogsGeoIPParserType.md)
 - [LogsGrokParser](LogsGrokParser.md)
 - [LogsGrokParserRules](LogsGrokParserRules.md)
 - [LogsGrokParserType](LogsGrokParserType.md)
 - [LogsIndex](LogsIndex.md)
 - [LogsIndexListResponse](LogsIndexListResponse.md)
 - [LogsIndexUpdateRequest](LogsIndexUpdateRequest.md)
 - [LogsIndexesOrder](LogsIndexesOrder.md)
 - [LogsListRequest](LogsListRequest.md)
 - [LogsListRequestTime](LogsListRequestTime.md)
 - [LogsListResponse](LogsListResponse.md)
 - [LogsLookupProcessor](LogsLookupProcessor.md)
 - [LogsLookupProcessorType](LogsLookupProcessorType.md)
 - [LogsMessageRemapper](LogsMessageRemapper.md)
 - [LogsMessageRemapperType](LogsMessageRemapperType.md)
 - [LogsPipeline](LogsPipeline.md)
 - [LogsPipelineProcessor](LogsPipelineProcessor.md)
 - [LogsPipelineProcessorType](LogsPipelineProcessorType.md)
 - [LogsPipelinesOrder](LogsPipelinesOrder.md)
 - [LogsProcessor](LogsProcessor.md)
 - [LogsQueryCompute](LogsQueryCompute.md)
 - [LogsServiceRemapper](LogsServiceRemapper.md)
 - [LogsServiceRemapperType](LogsServiceRemapperType.md)
 - [LogsSort](LogsSort.md)
 - [LogsStatusRemapper](LogsStatusRemapper.md)
 - [LogsStatusRemapperType](LogsStatusRemapperType.md)
 - [LogsStringBuilderProcessor](LogsStringBuilderProcessor.md)
 - [LogsStringBuilderProcessorType](LogsStringBuilderProcessorType.md)
 - [LogsTraceRemapper](LogsTraceRemapper.md)
 - [LogsTraceRemapperType](LogsTraceRemapperType.md)
 - [LogsURLParser](LogsURLParser.md)
 - [LogsURLParserType](LogsURLParserType.md)
 - [LogsUserAgentParser](LogsUserAgentParser.md)
 - [LogsUserAgentParserType](LogsUserAgentParserType.md)
 - [MetricMetadata](MetricMetadata.md)
 - [MetricSearchResponse](MetricSearchResponse.md)
 - [MetricSearchResponseResults](MetricSearchResponseResults.md)
 - [MetricsListResponse](MetricsListResponse.md)
 - [MetricsPayload](MetricsPayload.md)
 - [MetricsQueryMetadata](MetricsQueryMetadata.md)
 - [MetricsQueryResponse](MetricsQueryResponse.md)
 - [MetricsQueryUnit](MetricsQueryUnit.md)
 - [Monitor](Monitor.md)
 - [MonitorDeviceID](MonitorDeviceID.md)
 - [MonitorOptions](MonitorOptions.md)
 - [MonitorOptionsAggregation](MonitorOptionsAggregation.md)
 - [MonitorOverallStates](MonitorOverallStates.md)
 - [MonitorState](MonitorState.md)
 - [MonitorStateGroup](MonitorStateGroup.md)
 - [MonitorSummaryWidgetDefinition](MonitorSummaryWidgetDefinition.md)
 - [MonitorSummaryWidgetDefinitionType](MonitorSummaryWidgetDefinitionType.md)
 - [MonitorThresholdWindowOptions](MonitorThresholdWindowOptions.md)
 - [MonitorThresholds](MonitorThresholds.md)
 - [MonitorType](MonitorType.md)
 - [MonitorUpdateRequest](MonitorUpdateRequest.md)
 - [NoteWidgetDefinition](NoteWidgetDefinition.md)
 - [NoteWidgetDefinitionType](NoteWidgetDefinitionType.md)
 - [Organization](Organization.md)
 - [OrganizationBilling](OrganizationBilling.md)
 - [OrganizationCreateBody](OrganizationCreateBody.md)
 - [OrganizationCreateResponse](OrganizationCreateResponse.md)
 - [OrganizationListResponse](OrganizationListResponse.md)
 - [OrganizationResponse](OrganizationResponse.md)
 - [OrganizationSettings](OrganizationSettings.md)
 - [OrganizationSettingsSaml](OrganizationSettingsSaml.md)
 - [OrganizationSettingsSamlAutocreateUsersDomains](OrganizationSettingsSamlAutocreateUsersDomains.md)
 - [OrganizationSettingsSamlIdpInitiatedLogin](OrganizationSettingsSamlIdpInitiatedLogin.md)
 - [OrganizationSettingsSamlStrictMode](OrganizationSettingsSamlStrictMode.md)
 - [OrganizationSubscription](OrganizationSubscription.md)
 - [PagerDutyService](PagerDutyService.md)
 - [PagerDutyServiceKey](PagerDutyServiceKey.md)
 - [PagerDutyServiceName](PagerDutyServiceName.md)
 - [ProcessQueryDefinition](ProcessQueryDefinition.md)
 - [QuerySortOrder](QuerySortOrder.md)
 - [QueryValueWidgetDefinition](QueryValueWidgetDefinition.md)
 - [QueryValueWidgetDefinitionType](QueryValueWidgetDefinitionType.md)
 - [QueryValueWidgetRequest](QueryValueWidgetRequest.md)
 - [SLOBulkDeleteError](SLOBulkDeleteError.md)
 - [SLOBulkDeleteResponse](SLOBulkDeleteResponse.md)
 - [SLOBulkDeleteResponseData](SLOBulkDeleteResponseData.md)
 - [SLOCorrection](SLOCorrection.md)
 - [SLOCorrectionCategory](SLOCorrectionCategory.md)
 - [SLOCorrectionCreateData](SLOCorrectionCreateData.md)
 - [SLOCorrectionCreateRequest](SLOCorrectionCreateRequest.md)
 - [SLOCorrectionCreateRequestAttributes](SLOCorrectionCreateRequestAttributes.md)
 - [SLOCorrectionListResponse](SLOCorrectionListResponse.md)
 - [SLOCorrectionResponse](SLOCorrectionResponse.md)
 - [SLOCorrectionResponseAttributes](SLOCorrectionResponseAttributes.md)
 - [SLOCorrectionType](SLOCorrectionType.md)
 - [SLOCorrectionUpdateData](SLOCorrectionUpdateData.md)
 - [SLOCorrectionUpdateRequest](SLOCorrectionUpdateRequest.md)
 - [SLOCorrectionUpdateRequestAttributes](SLOCorrectionUpdateRequestAttributes.md)
 - [SLODeleteResponse](SLODeleteResponse.md)
 - [SLOErrorTimeframe](SLOErrorTimeframe.md)
 - [SLOHistoryMetrics](SLOHistoryMetrics.md)
 - [SLOHistoryMetricsSeries](SLOHistoryMetricsSeries.md)
 - [SLOHistoryMetricsSeriesMetadata](SLOHistoryMetricsSeriesMetadata.md)
 - [SLOHistoryMetricsSeriesMetadataUnit](SLOHistoryMetricsSeriesMetadataUnit.md)
 - [SLOHistoryResponse](SLOHistoryResponse.md)
 - [SLOHistoryResponseData](SLOHistoryResponseData.md)
 - [SLOHistoryResponseError](SLOHistoryResponseError.md)
 - [SLOHistorySLIData](SLOHistorySLIData.md)
 - [SLOListResponse](SLOListResponse.md)
 - [SLOResponse](SLOResponse.md)
 - [SLOThreshold](SLOThreshold.md)
 - [SLOTimeframe](SLOTimeframe.md)
 - [SLOType](SLOType.md)
 - [SLOTypeNumeric](SLOTypeNumeric.md)
 - [SLOWidgetDefinition](SLOWidgetDefinition.md)
 - [SLOWidgetDefinitionType](SLOWidgetDefinitionType.md)
 - [ScatterPlotRequest](ScatterPlotRequest.md)
 - [ScatterPlotWidgetDefinition](ScatterPlotWidgetDefinition.md)
 - [ScatterPlotWidgetDefinitionRequests](ScatterPlotWidgetDefinitionRequests.md)
 - [ScatterPlotWidgetDefinitionType](ScatterPlotWidgetDefinitionType.md)
 - [Series](Series.md)
 - [ServiceCheck](ServiceCheck.md)
 - [ServiceCheckStatus](ServiceCheckStatus.md)
 - [ServiceLevelObjective](ServiceLevelObjective.md)
 - [ServiceLevelObjectiveQuery](ServiceLevelObjectiveQuery.md)
 - [ServiceLevelObjectiveRequest](ServiceLevelObjectiveRequest.md)
 - [ServiceMapWidgetDefinition](ServiceMapWidgetDefinition.md)
 - [ServiceMapWidgetDefinitionType](ServiceMapWidgetDefinitionType.md)
 - [ServiceSummaryWidgetDefinition](ServiceSummaryWidgetDefinition.md)
 - [ServiceSummaryWidgetDefinitionType](ServiceSummaryWidgetDefinitionType.md)
 - [SlackIntegrationChannel](SlackIntegrationChannel.md)
 - [SlackIntegrationChannelDisplay](SlackIntegrationChannelDisplay.md)
 - [SyntheticsAPIStep](SyntheticsAPIStep.md)
 - [SyntheticsAPIStepSubtype](SyntheticsAPIStepSubtype.md)
 - [SyntheticsAPITest](SyntheticsAPITest.md)
 - [SyntheticsAPITestConfig](SyntheticsAPITestConfig.md)
 - [SyntheticsAPITestResultData](SyntheticsAPITestResultData.md)
 - [SyntheticsAPITestResultFull](SyntheticsAPITestResultFull.md)
 - [SyntheticsAPITestResultFullCheck](SyntheticsAPITestResultFullCheck.md)
 - [SyntheticsAPITestResultShort](SyntheticsAPITestResultShort.md)
 - [SyntheticsAPITestResultShortResult](SyntheticsAPITestResultShortResult.md)
 - [SyntheticsAPITestType](SyntheticsAPITestType.md)
 - [SyntheticsAssertion](SyntheticsAssertion.md)
 - [SyntheticsAssertionJSONPathOperator](SyntheticsAssertionJSONPathOperator.md)
 - [SyntheticsAssertionJSONPathTarget](SyntheticsAssertionJSONPathTarget.md)
 - [SyntheticsAssertionJSONPathTargetTarget](SyntheticsAssertionJSONPathTargetTarget.md)
 - [SyntheticsAssertionOperator](SyntheticsAssertionOperator.md)
 - [SyntheticsAssertionTarget](SyntheticsAssertionTarget.md)
 - [SyntheticsAssertionType](SyntheticsAssertionType.md)
 - [SyntheticsBasicAuth](SyntheticsBasicAuth.md)
 - [SyntheticsBrowserError](SyntheticsBrowserError.md)
 - [SyntheticsBrowserErrorType](SyntheticsBrowserErrorType.md)
 - [SyntheticsBrowserTest](SyntheticsBrowserTest.md)
 - [SyntheticsBrowserTestConfig](SyntheticsBrowserTestConfig.md)
 - [SyntheticsBrowserTestResultData](SyntheticsBrowserTestResultData.md)
 - [SyntheticsBrowserTestResultFull](SyntheticsBrowserTestResultFull.md)
 - [SyntheticsBrowserTestResultFullCheck](SyntheticsBrowserTestResultFullCheck.md)
 - [SyntheticsBrowserTestResultShort](SyntheticsBrowserTestResultShort.md)
 - [SyntheticsBrowserTestResultShortResult](SyntheticsBrowserTestResultShortResult.md)
 - [SyntheticsBrowserTestType](SyntheticsBrowserTestType.md)
 - [SyntheticsBrowserVariable](SyntheticsBrowserVariable.md)
 - [SyntheticsBrowserVariableType](SyntheticsBrowserVariableType.md)
 - [SyntheticsCITest](SyntheticsCITest.md)
 - [SyntheticsCITestBody](SyntheticsCITestBody.md)
 - [SyntheticsCITestMetadata](SyntheticsCITestMetadata.md)
 - [SyntheticsCITestMetadataCi](SyntheticsCITestMetadataCi.md)
 - [SyntheticsCITestMetadataGit](SyntheticsCITestMetadataGit.md)
 - [SyntheticsCheckType](SyntheticsCheckType.md)
 - [SyntheticsConfigVariable](SyntheticsConfigVariable.md)
 - [SyntheticsConfigVariableType](SyntheticsConfigVariableType.md)
 - [SyntheticsCoreWebVitals](SyntheticsCoreWebVitals.md)
 - [SyntheticsDeleteTestsPayload](SyntheticsDeleteTestsPayload.md)
 - [SyntheticsDeleteTestsResponse](SyntheticsDeleteTestsResponse.md)
 - [SyntheticsDeletedTest](SyntheticsDeletedTest.md)
 - [SyntheticsDevice](SyntheticsDevice.md)
 - [SyntheticsDeviceID](SyntheticsDeviceID.md)
 - [SyntheticsErrorCode](SyntheticsErrorCode.md)
 - [SyntheticsGetAPITestLatestResultsResponse](SyntheticsGetAPITestLatestResultsResponse.md)
 - [SyntheticsGetBrowserTestLatestResultsResponse](SyntheticsGetBrowserTestLatestResultsResponse.md)
 - [SyntheticsGlobalVariable](SyntheticsGlobalVariable.md)
 - [SyntheticsGlobalVariableParseTestOptions](SyntheticsGlobalVariableParseTestOptions.md)
 - [SyntheticsGlobalVariableParseTestOptionsType](SyntheticsGlobalVariableParseTestOptionsType.md)
 - [SyntheticsGlobalVariableParserType](SyntheticsGlobalVariableParserType.md)
 - [SyntheticsGlobalVariableValue](SyntheticsGlobalVariableValue.md)
 - [SyntheticsListTestsResponse](SyntheticsListTestsResponse.md)
 - [SyntheticsLocation](SyntheticsLocation.md)
 - [SyntheticsLocations](SyntheticsLocations.md)
 - [SyntheticsParsingOptions](SyntheticsParsingOptions.md)
 - [SyntheticsPlayingTab](SyntheticsPlayingTab.md)
 - [SyntheticsPrivateLocation](SyntheticsPrivateLocation.md)
 - [SyntheticsPrivateLocationCreationResponse](SyntheticsPrivateLocationCreationResponse.md)
 - [SyntheticsPrivateLocationCreationResponseResultEncryption](SyntheticsPrivateLocationCreationResponseResultEncryption.md)
 - [SyntheticsPrivateLocationSecrets](SyntheticsPrivateLocationSecrets.md)
 - [SyntheticsPrivateLocationSecretsAuthentication](SyntheticsPrivateLocationSecretsAuthentication.md)
 - [SyntheticsPrivateLocationSecretsConfigDecryption](SyntheticsPrivateLocationSecretsConfigDecryption.md)
 - [SyntheticsSSLCertificate](SyntheticsSSLCertificate.md)
 - [SyntheticsSSLCertificateIssuer](SyntheticsSSLCertificateIssuer.md)
 - [SyntheticsSSLCertificateSubject](SyntheticsSSLCertificateSubject.md)
 - [SyntheticsStep](SyntheticsStep.md)
 - [SyntheticsStepDetail](SyntheticsStepDetail.md)
 - [SyntheticsStepDetailWarning](SyntheticsStepDetailWarning.md)
 - [SyntheticsStepType](SyntheticsStepType.md)
 - [SyntheticsTestConfig](SyntheticsTestConfig.md)
 - [SyntheticsTestDetails](SyntheticsTestDetails.md)
 - [SyntheticsTestDetailsSubType](SyntheticsTestDetailsSubType.md)
 - [SyntheticsTestDetailsType](SyntheticsTestDetailsType.md)
 - [SyntheticsTestMonitorStatus](SyntheticsTestMonitorStatus.md)
 - [SyntheticsTestOptions](SyntheticsTestOptions.md)
 - [SyntheticsTestOptionsMonitorOptions](SyntheticsTestOptionsMonitorOptions.md)
 - [SyntheticsTestOptionsRetry](SyntheticsTestOptionsRetry.md)
 - [SyntheticsTestPauseStatus](SyntheticsTestPauseStatus.md)
 - [SyntheticsTestProcessStatus](SyntheticsTestProcessStatus.md)
 - [SyntheticsTestRequest](SyntheticsTestRequest.md)
 - [SyntheticsTestRequestCertificate](SyntheticsTestRequestCertificate.md)
 - [SyntheticsTestRequestCertificateItem](SyntheticsTestRequestCertificateItem.md)
 - [SyntheticsTickInterval](SyntheticsTickInterval.md)
 - [SyntheticsTiming](SyntheticsTiming.md)
 - [SyntheticsTriggerCITestLocation](SyntheticsTriggerCITestLocation.md)
 - [SyntheticsTriggerCITestRunResult](SyntheticsTriggerCITestRunResult.md)
 - [SyntheticsTriggerCITestsResponse](SyntheticsTriggerCITestsResponse.md)
 - [SyntheticsUpdateTestPauseStatusPayload](SyntheticsUpdateTestPauseStatusPayload.md)
 - [SyntheticsVariableParser](SyntheticsVariableParser.md)
 - [SyntheticsWarningType](SyntheticsWarningType.md)
 - [TableWidgetCellDisplayMode](TableWidgetCellDisplayMode.md)
 - [TableWidgetDefinition](TableWidgetDefinition.md)
 - [TableWidgetDefinitionType](TableWidgetDefinitionType.md)
 - [TableWidgetHasSearchBar](TableWidgetHasSearchBar.md)
 - [TableWidgetRequest](TableWidgetRequest.md)
 - [TagToHosts](TagToHosts.md)
 - [TargetFormatType](TargetFormatType.md)
 - [TimeseriesWidgetDefinition](TimeseriesWidgetDefinition.md)
 - [TimeseriesWidgetDefinitionType](TimeseriesWidgetDefinitionType.md)
 - [TimeseriesWidgetExpressionAlias](TimeseriesWidgetExpressionAlias.md)
 - [TimeseriesWidgetLegendColumn](TimeseriesWidgetLegendColumn.md)
 - [TimeseriesWidgetLegendLayout](TimeseriesWidgetLegendLayout.md)
 - [TimeseriesWidgetRequest](TimeseriesWidgetRequest.md)
 - [ToplistWidgetDefinition](ToplistWidgetDefinition.md)
 - [ToplistWidgetDefinitionType](ToplistWidgetDefinitionType.md)
 - [ToplistWidgetRequest](ToplistWidgetRequest.md)
 - [UsageAnalyzedLogsHour](UsageAnalyzedLogsHour.md)
 - [UsageAnalyzedLogsResponse](UsageAnalyzedLogsResponse.md)
 - [UsageAttributionAggregatesBody](UsageAttributionAggregatesBody.md)
 - [UsageAttributionBody](UsageAttributionBody.md)
 - [UsageAttributionMetadata](UsageAttributionMetadata.md)
 - [UsageAttributionPagination](UsageAttributionPagination.md)
 - [UsageAttributionResponse](UsageAttributionResponse.md)
 - [UsageAttributionSort](UsageAttributionSort.md)
 - [UsageAttributionValues](UsageAttributionValues.md)
 - [UsageBillableSummaryBody](UsageBillableSummaryBody.md)
 - [UsageBillableSummaryHour](UsageBillableSummaryHour.md)
 - [UsageBillableSummaryKeys](UsageBillableSummaryKeys.md)
 - [UsageBillableSummaryResponse](UsageBillableSummaryResponse.md)
 - [UsageComplianceHour](UsageComplianceHour.md)
 - [UsageComplianceResponse](UsageComplianceResponse.md)
 - [UsageCustomReportsAttributes](UsageCustomReportsAttributes.md)
 - [UsageCustomReportsData](UsageCustomReportsData.md)
 - [UsageCustomReportsMeta](UsageCustomReportsMeta.md)
 - [UsageCustomReportsPage](UsageCustomReportsPage.md)
 - [UsageCustomReportsResponse](UsageCustomReportsResponse.md)
 - [UsageFargateHour](UsageFargateHour.md)
 - [UsageFargateResponse](UsageFargateResponse.md)
 - [UsageHostHour](UsageHostHour.md)
 - [UsageHostsResponse](UsageHostsResponse.md)
 - [UsageIncidentManagementHour](UsageIncidentManagementHour.md)
 - [UsageIncidentManagementResponse](UsageIncidentManagementResponse.md)
 - [UsageIndexedSpansHour](UsageIndexedSpansHour.md)
 - [UsageIndexedSpansResponse](UsageIndexedSpansResponse.md)
 - [UsageIngestedSpansHour](UsageIngestedSpansHour.md)
 - [UsageIngestedSpansResponse](UsageIngestedSpansResponse.md)
 - [UsageIoTHour](UsageIoTHour.md)
 - [UsageIoTResponse](UsageIoTResponse.md)
 - [UsageLambdaHour](UsageLambdaHour.md)
 - [UsageLambdaResponse](UsageLambdaResponse.md)
 - [UsageLogsByIndexHour](UsageLogsByIndexHour.md)
 - [UsageLogsByIndexResponse](UsageLogsByIndexResponse.md)
 - [UsageLogsHour](UsageLogsHour.md)
 - [UsageLogsResponse](UsageLogsResponse.md)
 - [UsageMetricCategory](UsageMetricCategory.md)
 - [UsageNetworkFlowsHour](UsageNetworkFlowsHour.md)
 - [UsageNetworkFlowsResponse](UsageNetworkFlowsResponse.md)
 - [UsageNetworkHostsHour](UsageNetworkHostsHour.md)
 - [UsageNetworkHostsResponse](UsageNetworkHostsResponse.md)
 - [UsageProfilingHour](UsageProfilingHour.md)
 - [UsageProfilingResponse](UsageProfilingResponse.md)
 - [UsageReportsType](UsageReportsType.md)
 - [UsageRumSessionsHour](UsageRumSessionsHour.md)
 - [UsageRumSessionsResponse](UsageRumSessionsResponse.md)
 - [UsageSNMPHour](UsageSNMPHour.md)
 - [UsageSNMPResponse](UsageSNMPResponse.md)
 - [UsageSort](UsageSort.md)
 - [UsageSortDirection](UsageSortDirection.md)
 - [UsageSpecifiedCustomReportsAttributes](UsageSpecifiedCustomReportsAttributes.md)
 - [UsageSpecifiedCustomReportsData](UsageSpecifiedCustomReportsData.md)
 - [UsageSpecifiedCustomReportsMeta](UsageSpecifiedCustomReportsMeta.md)
 - [UsageSpecifiedCustomReportsPage](UsageSpecifiedCustomReportsPage.md)
 - [UsageSpecifiedCustomReportsResponse](UsageSpecifiedCustomReportsResponse.md)
 - [UsageSummaryDate](UsageSummaryDate.md)
 - [UsageSummaryDateOrg](UsageSummaryDateOrg.md)
 - [UsageSummaryResponse](UsageSummaryResponse.md)
 - [UsageSyntheticsAPIHour](UsageSyntheticsAPIHour.md)
 - [UsageSyntheticsAPIResponse](UsageSyntheticsAPIResponse.md)
 - [UsageSyntheticsBrowserHour](UsageSyntheticsBrowserHour.md)
 - [UsageSyntheticsBrowserResponse](UsageSyntheticsBrowserResponse.md)
 - [UsageSyntheticsHour](UsageSyntheticsHour.md)
 - [UsageSyntheticsResponse](UsageSyntheticsResponse.md)
 - [UsageTimeseriesHour](UsageTimeseriesHour.md)
 - [UsageTimeseriesResponse](UsageTimeseriesResponse.md)
 - [UsageTopAvgMetricsHour](UsageTopAvgMetricsHour.md)
 - [UsageTopAvgMetricsMetadata](UsageTopAvgMetricsMetadata.md)
 - [UsageTopAvgMetricsResponse](UsageTopAvgMetricsResponse.md)
 - [UsageTraceHour](UsageTraceHour.md)
 - [UsageTraceResponse](UsageTraceResponse.md)
 - [UsageTracingWithoutLimitsHour](UsageTracingWithoutLimitsHour.md)
 - [UsageTracingWithoutLimitsResponse](UsageTracingWithoutLimitsResponse.md)
 - [User](User.md)
 - [UserDisableResponse](UserDisableResponse.md)
 - [UserListResponse](UserListResponse.md)
 - [UserResponse](UserResponse.md)
 - [Widget](Widget.md)
 - [WidgetAggregator](WidgetAggregator.md)
 - [WidgetAxis](WidgetAxis.md)
 - [WidgetChangeType](WidgetChangeType.md)
 - [WidgetColorPreference](WidgetColorPreference.md)
 - [WidgetComparator](WidgetComparator.md)
 - [WidgetCompareTo](WidgetCompareTo.md)
 - [WidgetConditionalFormat](WidgetConditionalFormat.md)
 - [WidgetCustomLink](WidgetCustomLink.md)
 - [WidgetDefinition](WidgetDefinition.md)
 - [WidgetDisplayType](WidgetDisplayType.md)
 - [WidgetEvent](WidgetEvent.md)
 - [WidgetEventSize](WidgetEventSize.md)
 - [WidgetFieldSort](WidgetFieldSort.md)
 - [WidgetFormula](WidgetFormula.md)
 - [WidgetFormulaLimit](WidgetFormulaLimit.md)
 - [WidgetGrouping](WidgetGrouping.md)
 - [WidgetImageSizing](WidgetImageSizing.md)
 - [WidgetLayout](WidgetLayout.md)
 - [WidgetLayoutType](WidgetLayoutType.md)
 - [WidgetLineType](WidgetLineType.md)
 - [WidgetLineWidth](WidgetLineWidth.md)
 - [WidgetLiveSpan](WidgetLiveSpan.md)
 - [WidgetMargin](WidgetMargin.md)
 - [WidgetMarker](WidgetMarker.md)
 - [WidgetMessageDisplay](WidgetMessageDisplay.md)
 - [WidgetMonitorSummaryDisplayFormat](WidgetMonitorSummaryDisplayFormat.md)
 - [WidgetMonitorSummarySort](WidgetMonitorSummarySort.md)
 - [WidgetNodeType](WidgetNodeType.md)
 - [WidgetOrderBy](WidgetOrderBy.md)
 - [WidgetPalette](WidgetPalette.md)
 - [WidgetRequestStyle](WidgetRequestStyle.md)
 - [WidgetServiceSummaryDisplayFormat](WidgetServiceSummaryDisplayFormat.md)
 - [WidgetSizeFormat](WidgetSizeFormat.md)
 - [WidgetSort](WidgetSort.md)
 - [WidgetStyle](WidgetStyle.md)
 - [WidgetSummaryType](WidgetSummaryType.md)
 - [WidgetTextAlign](WidgetTextAlign.md)
 - [WidgetTickEdge](WidgetTickEdge.md)
 - [WidgetTime](WidgetTime.md)
 - [WidgetTimeWindows](WidgetTimeWindows.md)
 - [WidgetViewMode](WidgetViewMode.md)
 - [WidgetVizType](WidgetVizType.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKeyAuth


- **Type**: API key
- **API key parameter name**: DD-API-KEY
- **Location**: HTTP header

### apiKeyAuthQuery


- **Type**: API key
- **API key parameter name**: api_key
- **Location**: URL query string

### appKeyAuth


- **Type**: API key
- **API key parameter name**: DD-APPLICATION-KEY
- **Location**: HTTP header

### appKeyAuthQuery


- **Type**: API key
- **API key parameter name**: application_key
- **Location**: URL query string


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@datadoghq.com

