## Documentation for API Endpoints

All URIs are relative to *https://api.datadoghq.com*

| Class                                 | Method                                                                                                           | HTTP request                                                                                       | Description                                       |
| ------------------------------------- | ---------------------------------------------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------- | ------------------------------------------------- |
| _AuthenticationApi_                   | [**validate**](AuthenticationApi.md#validate)                                                                    | **GET** /api/v1/validate                                                                           | Validate API key                                  |
| _AwsIntegrationApi_                   | [**createAWSAccount**](AwsIntegrationApi.md#createAWSAccount)                                                    | **POST** /api/v1/integration/aws                                                                   | Create an AWS integration                         |
| _AwsIntegrationApi_                   | [**createAWSTagFilter**](AwsIntegrationApi.md#createAWSTagFilter)                                                | **POST** /api/v1/integration/aws/filtering                                                         | Set an AWS tag filter                             |
| _AwsIntegrationApi_                   | [**createNewAWSExternalID**](AwsIntegrationApi.md#createNewAWSExternalID)                                        | **PUT** /api/v1/integration/aws/generate_new_external_id                                           | Generate a new external ID                        |
| _AwsIntegrationApi_                   | [**deleteAWSAccount**](AwsIntegrationApi.md#deleteAWSAccount)                                                    | **DELETE** /api/v1/integration/aws                                                                 | Delete an AWS integration                         |
| _AwsIntegrationApi_                   | [**deleteAWSTagFilter**](AwsIntegrationApi.md#deleteAWSTagFilter)                                                | **DELETE** /api/v1/integration/aws/filtering                                                       | Delete a tag filtering entry                      |
| _AwsIntegrationApi_                   | [**listAWSAccounts**](AwsIntegrationApi.md#listAWSAccounts)                                                      | **GET** /api/v1/integration/aws                                                                    | List all AWS integrations                         |
| _AwsIntegrationApi_                   | [**listAWSTagFilters**](AwsIntegrationApi.md#listAWSTagFilters)                                                  | **GET** /api/v1/integration/aws/filtering                                                          | Get all AWS tag filters                           |
| _AwsIntegrationApi_                   | [**listAvailableAWSNamespaces**](AwsIntegrationApi.md#listAvailableAWSNamespaces)                                | **GET** /api/v1/integration/aws/available_namespace_rules                                          | List namespace rules                              |
| _AwsIntegrationApi_                   | [**updateAWSAccount**](AwsIntegrationApi.md#updateAWSAccount)                                                    | **PUT** /api/v1/integration/aws                                                                    | Update an AWS integration                         |
| _AwsLogsIntegrationApi_               | [**checkAWSLogsLambdaAsync**](AwsLogsIntegrationApi.md#checkAWSLogsLambdaAsync)                                  | **POST** /api/v1/integration/aws/logs/check_async                                                  | Check that an AWS Lambda Function exists          |
| _AwsLogsIntegrationApi_               | [**checkAWSLogsServicesAsync**](AwsLogsIntegrationApi.md#checkAWSLogsServicesAsync)                              | **POST** /api/v1/integration/aws/logs/services_async                                               | Check permissions for log services                |
| _AwsLogsIntegrationApi_               | [**createAWSLambdaARN**](AwsLogsIntegrationApi.md#createAWSLambdaARN)                                            | **POST** /api/v1/integration/aws/logs                                                              | Add AWS Log Lambda ARN                            |
| _AwsLogsIntegrationApi_               | [**deleteAWSLambdaARN**](AwsLogsIntegrationApi.md#deleteAWSLambdaARN)                                            | **DELETE** /api/v1/integration/aws/logs                                                            | Delete an AWS Logs integration                    |
| _AwsLogsIntegrationApi_               | [**enableAWSLogServices**](AwsLogsIntegrationApi.md#enableAWSLogServices)                                        | **POST** /api/v1/integration/aws/logs/services                                                     | Enable an AWS Logs integration                    |
| _AwsLogsIntegrationApi_               | [**listAWSLogsIntegrations**](AwsLogsIntegrationApi.md#listAWSLogsIntegrations)                                  | **GET** /api/v1/integration/aws/logs                                                               | List all AWS Logs integrations                    |
| _AwsLogsIntegrationApi_               | [**listAWSLogsServices**](AwsLogsIntegrationApi.md#listAWSLogsServices)                                          | **GET** /api/v1/integration/aws/logs/services                                                      | Get list of AWS log ready services                |
| _AzureIntegrationApi_                 | [**createAzureIntegration**](AzureIntegrationApi.md#createAzureIntegration)                                      | **POST** /api/v1/integration/azure                                                                 | Create an Azure integration                       |
| _AzureIntegrationApi_                 | [**deleteAzureIntegration**](AzureIntegrationApi.md#deleteAzureIntegration)                                      | **DELETE** /api/v1/integration/azure                                                               | Delete an Azure integration                       |
| _AzureIntegrationApi_                 | [**listAzureIntegration**](AzureIntegrationApi.md#listAzureIntegration)                                          | **GET** /api/v1/integration/azure                                                                  | List all Azure integrations                       |
| _AzureIntegrationApi_                 | [**updateAzureHostFilters**](AzureIntegrationApi.md#updateAzureHostFilters)                                      | **POST** /api/v1/integration/azure/host_filters                                                    | Update Azure integration host filters             |
| _AzureIntegrationApi_                 | [**updateAzureIntegration**](AzureIntegrationApi.md#updateAzureIntegration)                                      | **PUT** /api/v1/integration/azure                                                                  | Update an Azure integration                       |
| _DashboardListsApi_                   | [**createDashboardList**](DashboardListsApi.md#createDashboardList)                                              | **POST** /api/v1/dashboard/lists/manual                                                            | Create a dashboard list                           |
| _DashboardListsApi_                   | [**deleteDashboardList**](DashboardListsApi.md#deleteDashboardList)                                              | **DELETE** /api/v1/dashboard/lists/manual/{list_id}                                                | Delete a dashboard list                           |
| _DashboardListsApi_                   | [**getDashboardList**](DashboardListsApi.md#getDashboardList)                                                    | **GET** /api/v1/dashboard/lists/manual/{list_id}                                                   | Get a dashboard list                              |
| _DashboardListsApi_                   | [**listDashboardLists**](DashboardListsApi.md#listDashboardLists)                                                | **GET** /api/v1/dashboard/lists/manual                                                             | Get all dashboard lists                           |
| _DashboardListsApi_                   | [**updateDashboardList**](DashboardListsApi.md#updateDashboardList)                                              | **PUT** /api/v1/dashboard/lists/manual/{list_id}                                                   | Update a dashboard list                           |
| _DashboardsApi_                       | [**createDashboard**](DashboardsApi.md#createDashboard)                                                          | **POST** /api/v1/dashboard                                                                         | Create a new dashboard                            |
| _DashboardsApi_                       | [**deleteDashboard**](DashboardsApi.md#deleteDashboard)                                                          | **DELETE** /api/v1/dashboard/{dashboard_id}                                                        | Delete a dashboard                                |
| _DashboardsApi_                       | [**deleteDashboards**](DashboardsApi.md#deleteDashboards)                                                        | **DELETE** /api/v1/dashboard                                                                       | Delete dashboards                                 |
| _DashboardsApi_                       | [**getDashboard**](DashboardsApi.md#getDashboard)                                                                | **GET** /api/v1/dashboard/{dashboard_id}                                                           | Get a dashboard                                   |
| _DashboardsApi_                       | [**listDashboards**](DashboardsApi.md#listDashboards)                                                            | **GET** /api/v1/dashboard                                                                          | Get all dashboards                                |
| _DashboardsApi_                       | [**restoreDashboards**](DashboardsApi.md#restoreDashboards)                                                      | **PATCH** /api/v1/dashboard                                                                        | Restore deleted dashboards                        |
| _DashboardsApi_                       | [**updateDashboard**](DashboardsApi.md#updateDashboard)                                                          | **PUT** /api/v1/dashboard/{dashboard_id}                                                           | Update a dashboard                                |
| _DowntimesApi_                        | [**cancelDowntime**](DowntimesApi.md#cancelDowntime)                                                             | **DELETE** /api/v1/downtime/{downtime_id}                                                          | Cancel a downtime                                 |
| _DowntimesApi_                        | [**cancelDowntimesByScope**](DowntimesApi.md#cancelDowntimesByScope)                                             | **POST** /api/v1/downtime/cancel/by_scope                                                          | Cancel downtimes by scope                         |
| _DowntimesApi_                        | [**createDowntime**](DowntimesApi.md#createDowntime)                                                             | **POST** /api/v1/downtime                                                                          | Schedule a downtime                               |
| _DowntimesApi_                        | [**getDowntime**](DowntimesApi.md#getDowntime)                                                                   | **GET** /api/v1/downtime/{downtime_id}                                                             | Get a downtime                                    |
| _DowntimesApi_                        | [**listDowntimes**](DowntimesApi.md#listDowntimes)                                                               | **GET** /api/v1/downtime                                                                           | Get all downtimes                                 |
| _DowntimesApi_                        | [**listMonitorDowntimes**](DowntimesApi.md#listMonitorDowntimes)                                                 | **GET** /api/v1/monitor/{monitor_id}/downtimes                                                     | Get all downtimes for a monitor                   |
| _DowntimesApi_                        | [**updateDowntime**](DowntimesApi.md#updateDowntime)                                                             | **PUT** /api/v1/downtime/{downtime_id}                                                             | Update a downtime                                 |
| _EventsApi_                           | [**createEvent**](EventsApi.md#createEvent)                                                                      | **POST** /api/v1/events                                                                            | Post an event                                     |
| _EventsApi_                           | [**getEvent**](EventsApi.md#getEvent)                                                                            | **GET** /api/v1/events/{event_id}                                                                  | Get an event                                      |
| _EventsApi_                           | [**listEvents**](EventsApi.md#listEvents)                                                                        | **GET** /api/v1/events                                                                             | Query the event stream                            |
| _GcpIntegrationApi_                   | [**createGCPIntegration**](GcpIntegrationApi.md#createGCPIntegration)                                            | **POST** /api/v1/integration/gcp                                                                   | Create a GCP integration                          |
| _GcpIntegrationApi_                   | [**deleteGCPIntegration**](GcpIntegrationApi.md#deleteGCPIntegration)                                            | **DELETE** /api/v1/integration/gcp                                                                 | Delete a GCP integration                          |
| _GcpIntegrationApi_                   | [**listGCPIntegration**](GcpIntegrationApi.md#listGCPIntegration)                                                | **GET** /api/v1/integration/gcp                                                                    | List all GCP integrations                         |
| _GcpIntegrationApi_                   | [**updateGCPIntegration**](GcpIntegrationApi.md#updateGCPIntegration)                                            | **PUT** /api/v1/integration/gcp                                                                    | Update a GCP integration                          |
| _HostsApi_                            | [**getHostTotals**](HostsApi.md#getHostTotals)                                                                   | **GET** /api/v1/hosts/totals                                                                       | Get the total number of active hosts              |
| _HostsApi_                            | [**listHosts**](HostsApi.md#listHosts)                                                                           | **GET** /api/v1/hosts                                                                              | Get all hosts for your organization               |
| _HostsApi_                            | [**muteHost**](HostsApi.md#muteHost)                                                                             | **POST** /api/v1/host/{host_name}/mute                                                             | Mute a host                                       |
| _HostsApi_                            | [**unmuteHost**](HostsApi.md#unmuteHost)                                                                         | **POST** /api/v1/host/{host_name}/unmute                                                           | Unmute a host                                     |
| _IpRangesApi_                         | [**getIPRanges**](IpRangesApi.md#getIPRanges)                                                                    | **GET** /                                                                                          | List IP Ranges                                    |
| _KeyManagementApi_                    | [**createAPIKey**](KeyManagementApi.md#createAPIKey)                                                             | **POST** /api/v1/api_key                                                                           | Create an API key                                 |
| _KeyManagementApi_                    | [**createApplicationKey**](KeyManagementApi.md#createApplicationKey)                                             | **POST** /api/v1/application_key                                                                   | Create an application key                         |
| _KeyManagementApi_                    | [**deleteAPIKey**](KeyManagementApi.md#deleteAPIKey)                                                             | **DELETE** /api/v1/api_key/{key}                                                                   | Delete an API key                                 |
| _KeyManagementApi_                    | [**deleteApplicationKey**](KeyManagementApi.md#deleteApplicationKey)                                             | **DELETE** /api/v1/application_key/{key}                                                           | Delete an application key                         |
| _KeyManagementApi_                    | [**getAPIKey**](KeyManagementApi.md#getAPIKey)                                                                   | **GET** /api/v1/api_key/{key}                                                                      | Get API key                                       |
| _KeyManagementApi_                    | [**getApplicationKey**](KeyManagementApi.md#getApplicationKey)                                                   | **GET** /api/v1/application_key/{key}                                                              | Get an application key                            |
| _KeyManagementApi_                    | [**listAPIKeys**](KeyManagementApi.md#listAPIKeys)                                                               | **GET** /api/v1/api_key                                                                            | Get all API keys                                  |
| _KeyManagementApi_                    | [**listApplicationKeys**](KeyManagementApi.md#listApplicationKeys)                                               | **GET** /api/v1/application_key                                                                    | Get all application keys                          |
| _KeyManagementApi_                    | [**updateAPIKey**](KeyManagementApi.md#updateAPIKey)                                                             | **PUT** /api/v1/api_key/{key}                                                                      | Edit an API key                                   |
| _KeyManagementApi_                    | [**updateApplicationKey**](KeyManagementApi.md#updateApplicationKey)                                             | **PUT** /api/v1/application_key/{key}                                                              | Edit an application key                           |
| _LogsApi_                             | [**listLogs**](LogsApi.md#listLogs)                                                                              | **POST** /api/v1/logs-queries/list                                                                 | Search logs                                       |
| _LogsApi_                             | [**submitLog**](LogsApi.md#submitLog)                                                                            | **POST** /v1/input                                                                                 | Send logs                                         |
| _LogsIndexesApi_                      | [**createLogsIndex**](LogsIndexesApi.md#createLogsIndex)                                                         | **POST** /api/v1/logs/config/indexes                                                               | Create an index                                   |
| _LogsIndexesApi_                      | [**getLogsIndex**](LogsIndexesApi.md#getLogsIndex)                                                               | **GET** /api/v1/logs/config/indexes/{name}                                                         | Get an index                                      |
| _LogsIndexesApi_                      | [**getLogsIndexOrder**](LogsIndexesApi.md#getLogsIndexOrder)                                                     | **GET** /api/v1/logs/config/index-order                                                            | Get indexes order                                 |
| _LogsIndexesApi_                      | [**listLogIndexes**](LogsIndexesApi.md#listLogIndexes)                                                           | **GET** /api/v1/logs/config/indexes                                                                | Get all indexes                                   |
| _LogsIndexesApi_                      | [**updateLogsIndex**](LogsIndexesApi.md#updateLogsIndex)                                                         | **PUT** /api/v1/logs/config/indexes/{name}                                                         | Update an index                                   |
| _LogsIndexesApi_                      | [**updateLogsIndexOrder**](LogsIndexesApi.md#updateLogsIndexOrder)                                               | **PUT** /api/v1/logs/config/index-order                                                            | Update indexes order                              |
| _LogsPipelinesApi_                    | [**createLogsPipeline**](LogsPipelinesApi.md#createLogsPipeline)                                                 | **POST** /api/v1/logs/config/pipelines                                                             | Create a pipeline                                 |
| _LogsPipelinesApi_                    | [**deleteLogsPipeline**](LogsPipelinesApi.md#deleteLogsPipeline)                                                 | **DELETE** /api/v1/logs/config/pipelines/{pipeline_id}                                             | Delete a pipeline                                 |
| _LogsPipelinesApi_                    | [**getLogsPipeline**](LogsPipelinesApi.md#getLogsPipeline)                                                       | **GET** /api/v1/logs/config/pipelines/{pipeline_id}                                                | Get a pipeline                                    |
| _LogsPipelinesApi_                    | [**getLogsPipelineOrder**](LogsPipelinesApi.md#getLogsPipelineOrder)                                             | **GET** /api/v1/logs/config/pipeline-order                                                         | Get pipeline order                                |
| _LogsPipelinesApi_                    | [**listLogsPipelines**](LogsPipelinesApi.md#listLogsPipelines)                                                   | **GET** /api/v1/logs/config/pipelines                                                              | Get all pipelines                                 |
| _LogsPipelinesApi_                    | [**updateLogsPipeline**](LogsPipelinesApi.md#updateLogsPipeline)                                                 | **PUT** /api/v1/logs/config/pipelines/{pipeline_id}                                                | Update a pipeline                                 |
| _LogsPipelinesApi_                    | [**updateLogsPipelineOrder**](LogsPipelinesApi.md#updateLogsPipelineOrder)                                       | **PUT** /api/v1/logs/config/pipeline-order                                                         | Update pipeline order                             |
| _MetricsApi_                          | [**getMetricMetadata**](MetricsApi.md#getMetricMetadata)                                                         | **GET** /api/v1/metrics/{metric_name}                                                              | Get metric metadata                               |
| _MetricsApi_                          | [**listActiveMetrics**](MetricsApi.md#listActiveMetrics)                                                         | **GET** /api/v1/metrics                                                                            | Get active metrics list                           |
| _MetricsApi_                          | [**listMetrics**](MetricsApi.md#listMetrics)                                                                     | **GET** /api/v1/search                                                                             | Search metrics                                    |
| _MetricsApi_                          | [**queryMetrics**](MetricsApi.md#queryMetrics)                                                                   | **GET** /api/v1/query                                                                              | Query timeseries points                           |
| _MetricsApi_                          | [**submitMetrics**](MetricsApi.md#submitMetrics)                                                                 | **POST** /api/v1/series                                                                            | Submit metrics                                    |
| _MetricsApi_                          | [**updateMetricMetadata**](MetricsApi.md#updateMetricMetadata)                                                   | **PUT** /api/v1/metrics/{metric_name}                                                              | Edit metric metadata                              |
| _MonitorsApi_                         | [**checkCanDeleteMonitor**](MonitorsApi.md#checkCanDeleteMonitor)                                                | **GET** /api/v1/monitor/can_delete                                                                 | Check if a monitor can be deleted                 |
| _MonitorsApi_                         | [**createMonitor**](MonitorsApi.md#createMonitor)                                                                | **POST** /api/v1/monitor                                                                           | Create a monitor                                  |
| _MonitorsApi_                         | [**deleteMonitor**](MonitorsApi.md#deleteMonitor)                                                                | **DELETE** /api/v1/monitor/{monitor_id}                                                            | Delete a monitor                                  |
| _MonitorsApi_                         | [**getMonitor**](MonitorsApi.md#getMonitor)                                                                      | **GET** /api/v1/monitor/{monitor_id}                                                               | Get a monitor&#39;s details                       |
| _MonitorsApi_                         | [**listMonitors**](MonitorsApi.md#listMonitors)                                                                  | **GET** /api/v1/monitor                                                                            | Get all monitor details                           |
| _MonitorsApi_                         | [**searchMonitorGroups**](MonitorsApi.md#searchMonitorGroups)                                                    | **GET** /api/v1/monitor/groups/search                                                              | Monitors group search                             |
| _MonitorsApi_                         | [**searchMonitors**](MonitorsApi.md#searchMonitors)                                                              | **GET** /api/v1/monitor/search                                                                     | Monitors search                                   |
| _MonitorsApi_                         | [**updateMonitor**](MonitorsApi.md#updateMonitor)                                                                | **PUT** /api/v1/monitor/{monitor_id}                                                               | Edit a monitor                                    |
| _MonitorsApi_                         | [**validateMonitor**](MonitorsApi.md#validateMonitor)                                                            | **POST** /api/v1/monitor/validate                                                                  | Validate a monitor                                |
| _NotebooksApi_                        | [**createNotebook**](NotebooksApi.md#createNotebook)                                                             | **POST** /api/v1/notebooks                                                                         | Create a notebook                                 |
| _NotebooksApi_                        | [**deleteNotebook**](NotebooksApi.md#deleteNotebook)                                                             | **DELETE** /api/v1/notebooks/{notebook_id}                                                         | Delete a notebook                                 |
| _NotebooksApi_                        | [**getNotebook**](NotebooksApi.md#getNotebook)                                                                   | **GET** /api/v1/notebooks/{notebook_id}                                                            | Get a notebook                                    |
| _NotebooksApi_                        | [**listNotebooks**](NotebooksApi.md#listNotebooks)                                                               | **GET** /api/v1/notebooks                                                                          | Get all notebooks                                 |
| _NotebooksApi_                        | [**updateNotebook**](NotebooksApi.md#updateNotebook)                                                             | **PUT** /api/v1/notebooks/{notebook_id}                                                            | Update a notebook                                 |
| _OrganizationsApi_                    | [**createChildOrg**](OrganizationsApi.md#createChildOrg)                                                         | **POST** /api/v1/org                                                                               | Create a child organization                       |
| _OrganizationsApi_                    | [**getOrg**](OrganizationsApi.md#getOrg)                                                                         | **GET** /api/v1/org/{public_id}                                                                    | Get organization information                      |
| _OrganizationsApi_                    | [**listOrgs**](OrganizationsApi.md#listOrgs)                                                                     | **GET** /api/v1/org                                                                                | List your managed organizations                   |
| _OrganizationsApi_                    | [**updateOrg**](OrganizationsApi.md#updateOrg)                                                                   | **PUT** /api/v1/org/{public_id}                                                                    | Update your organization                          |
| _OrganizationsApi_                    | [**uploadIdPForOrg**](OrganizationsApi.md#uploadIdPForOrg)                                                       | **POST** /api/v1/org/{public_id}/idp_metadata                                                      | Upload IdP metadata                               |
| _PagerDutyIntegrationApi_             | [**createPagerDutyIntegrationService**](PagerDutyIntegrationApi.md#createPagerDutyIntegrationService)            | **POST** /api/v1/integration/pagerduty/configuration/services                                      | Create a new service object                       |
| _PagerDutyIntegrationApi_             | [**deletePagerDutyIntegrationService**](PagerDutyIntegrationApi.md#deletePagerDutyIntegrationService)            | **DELETE** /api/v1/integration/pagerduty/configuration/services/{service_name}                     | Delete a single service object                    |
| _PagerDutyIntegrationApi_             | [**getPagerDutyIntegrationService**](PagerDutyIntegrationApi.md#getPagerDutyIntegrationService)                  | **GET** /api/v1/integration/pagerduty/configuration/services/{service_name}                        | Get a single service object                       |
| _PagerDutyIntegrationApi_             | [**updatePagerDutyIntegrationService**](PagerDutyIntegrationApi.md#updatePagerDutyIntegrationService)            | **PUT** /api/v1/integration/pagerduty/configuration/services/{service_name}                        | Update a single service object                    |
| _ServiceChecksApi_                    | [**submitServiceCheck**](ServiceChecksApi.md#submitServiceCheck)                                                 | **POST** /api/v1/check_run                                                                         | Submit a Service Check                            |
| _ServiceLevelObjectiveCorrectionsApi_ | [**createSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#createSLOCorrection)                            | **POST** /api/v1/slo/correction                                                                    | Create an SLO correction                          |
| _ServiceLevelObjectiveCorrectionsApi_ | [**deleteSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#deleteSLOCorrection)                            | **DELETE** /api/v1/slo/correction/{slo_correction_id}                                              | Delete an SLO correction                          |
| _ServiceLevelObjectiveCorrectionsApi_ | [**getSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#getSLOCorrection)                                  | **GET** /api/v1/slo/correction/{slo_correction_id}                                                 | Get an SLO correction for an SLO                  |
| _ServiceLevelObjectiveCorrectionsApi_ | [**listSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#listSLOCorrection)                                | **GET** /api/v1/slo/correction                                                                     | Get all SLO corrections                           |
| _ServiceLevelObjectiveCorrectionsApi_ | [**updateSLOCorrection**](ServiceLevelObjectiveCorrectionsApi.md#updateSLOCorrection)                            | **PATCH** /api/v1/slo/correction/{slo_correction_id}                                               | Update an SLO correction                          |
| _ServiceLevelObjectivesApi_           | [**checkCanDeleteSLO**](ServiceLevelObjectivesApi.md#checkCanDeleteSLO)                                          | **GET** /api/v1/slo/can_delete                                                                     | Check if SLOs can be safely deleted               |
| _ServiceLevelObjectivesApi_           | [**createSLO**](ServiceLevelObjectivesApi.md#createSLO)                                                          | **POST** /api/v1/slo                                                                               | Create an SLO object                              |
| _ServiceLevelObjectivesApi_           | [**deleteSLO**](ServiceLevelObjectivesApi.md#deleteSLO)                                                          | **DELETE** /api/v1/slo/{slo_id}                                                                    | Delete an SLO                                     |
| _ServiceLevelObjectivesApi_           | [**deleteSLOTimeframeInBulk**](ServiceLevelObjectivesApi.md#deleteSLOTimeframeInBulk)                            | **POST** /api/v1/slo/bulk_delete                                                                   | Bulk Delete SLO Timeframes                        |
| _ServiceLevelObjectivesApi_           | [**getSLO**](ServiceLevelObjectivesApi.md#getSLO)                                                                | **GET** /api/v1/slo/{slo_id}                                                                       | Get an SLO&#39;s details                          |
| _ServiceLevelObjectivesApi_           | [**getSLOCorrections**](ServiceLevelObjectivesApi.md#getSLOCorrections)                                          | **GET** /api/v1/slo/{slo_id}/corrections                                                           | Get Corrections For an SLO                        |
| _ServiceLevelObjectivesApi_           | [**getSLOHistory**](ServiceLevelObjectivesApi.md#getSLOHistory)                                                  | **GET** /api/v1/slo/{slo_id}/history                                                               | Get an SLO&#39;s history                          |
| _ServiceLevelObjectivesApi_           | [**listSLOs**](ServiceLevelObjectivesApi.md#listSLOs)                                                            | **GET** /api/v1/slo                                                                                | Get all SLOs                                      |
| _ServiceLevelObjectivesApi_           | [**updateSLO**](ServiceLevelObjectivesApi.md#updateSLO)                                                          | **PUT** /api/v1/slo/{slo_id}                                                                       | Update an SLO                                     |
| _SlackIntegrationApi_                 | [**createSlackIntegrationChannel**](SlackIntegrationApi.md#createSlackIntegrationChannel)                        | **POST** /api/v1/integration/slack/configuration/accounts/{account_name}/channels                  | Create a Slack integration channel                |
| _SlackIntegrationApi_                 | [**getSlackIntegrationChannel**](SlackIntegrationApi.md#getSlackIntegrationChannel)                              | **GET** /api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name}    | Get a Slack integration channel                   |
| _SlackIntegrationApi_                 | [**getSlackIntegrationChannels**](SlackIntegrationApi.md#getSlackIntegrationChannels)                            | **GET** /api/v1/integration/slack/configuration/accounts/{account_name}/channels                   | Get all channels in a Slack integration           |
| _SlackIntegrationApi_                 | [**removeSlackIntegrationChannel**](SlackIntegrationApi.md#removeSlackIntegrationChannel)                        | **DELETE** /api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name} | Remove a Slack integration channel                |
| _SlackIntegrationApi_                 | [**updateSlackIntegrationChannel**](SlackIntegrationApi.md#updateSlackIntegrationChannel)                        | **PATCH** /api/v1/integration/slack/configuration/accounts/{account_name}/channels/{channel_name}  | Update a Slack integration channel                |
| _SnapshotsApi_                        | [**getGraphSnapshot**](SnapshotsApi.md#getGraphSnapshot)                                                         | **GET** /api/v1/graph/snapshot                                                                     | Take graph snapshots                              |
| _SyntheticsApi_                       | [**createGlobalVariable**](SyntheticsApi.md#createGlobalVariable)                                                | **POST** /api/v1/synthetics/variables                                                              | Create a global variable                          |
| _SyntheticsApi_                       | [**createPrivateLocation**](SyntheticsApi.md#createPrivateLocation)                                              | **POST** /api/v1/synthetics/private-locations                                                      | Create a private location                         |
| _SyntheticsApi_                       | [**createSyntheticsAPITest**](SyntheticsApi.md#createSyntheticsAPITest)                                          | **POST** /api/v1/synthetics/tests/api                                                              | Create an API test                                |
| _SyntheticsApi_                       | [**createSyntheticsBrowserTest**](SyntheticsApi.md#createSyntheticsBrowserTest)                                  | **POST** /api/v1/synthetics/tests/browser                                                          | Create a browser test                             |
| _SyntheticsApi_                       | [**deleteGlobalVariable**](SyntheticsApi.md#deleteGlobalVariable)                                                | **DELETE** /api/v1/synthetics/variables/{variable_id}                                              | Delete a global variable                          |
| _SyntheticsApi_                       | [**deletePrivateLocation**](SyntheticsApi.md#deletePrivateLocation)                                              | **DELETE** /api/v1/synthetics/private-locations/{location_id}                                      | Delete a private location                         |
| _SyntheticsApi_                       | [**deleteTests**](SyntheticsApi.md#deleteTests)                                                                  | **POST** /api/v1/synthetics/tests/delete                                                           | Delete tests                                      |
| _SyntheticsApi_                       | [**editGlobalVariable**](SyntheticsApi.md#editGlobalVariable)                                                    | **PUT** /api/v1/synthetics/variables/{variable_id}                                                 | Edit a global variable                            |
| _SyntheticsApi_                       | [**getAPITest**](SyntheticsApi.md#getAPITest)                                                                    | **GET** /api/v1/synthetics/tests/api/{public_id}                                                   | Get an API test                                   |
| _SyntheticsApi_                       | [**getAPITestLatestResults**](SyntheticsApi.md#getAPITestLatestResults)                                          | **GET** /api/v1/synthetics/tests/{public_id}/results                                               | Get an API test&#39;s latest results summaries    |
| _SyntheticsApi_                       | [**getAPITestResult**](SyntheticsApi.md#getAPITestResult)                                                        | **GET** /api/v1/synthetics/tests/{public_id}/results/{result_id}                                   | Get an API test result                            |
| _SyntheticsApi_                       | [**getBrowserTest**](SyntheticsApi.md#getBrowserTest)                                                            | **GET** /api/v1/synthetics/tests/browser/{public_id}                                               | Get a browser test                                |
| _SyntheticsApi_                       | [**getBrowserTestLatestResults**](SyntheticsApi.md#getBrowserTestLatestResults)                                  | **GET** /api/v1/synthetics/tests/browser/{public_id}/results                                       | Get a browser test&#39;s latest results summaries |
| _SyntheticsApi_                       | [**getBrowserTestResult**](SyntheticsApi.md#getBrowserTestResult)                                                | **GET** /api/v1/synthetics/tests/browser/{public_id}/results/{result_id}                           | Get a browser test result                         |
| _SyntheticsApi_                       | [**getGlobalVariable**](SyntheticsApi.md#getGlobalVariable)                                                      | **GET** /api/v1/synthetics/variables/{variable_id}                                                 | Get a global variable                             |
| _SyntheticsApi_                       | [**getPrivateLocation**](SyntheticsApi.md#getPrivateLocation)                                                    | **GET** /api/v1/synthetics/private-locations/{location_id}                                         | Get a private location                            |
| _SyntheticsApi_                       | [**getSyntheticsCIBatch**](SyntheticsApi.md#getSyntheticsCIBatch)                                                | **GET** /api/v1/synthetics/ci/batch/{batch_id}                                                     | Get details of batch                              |
| _SyntheticsApi_                       | [**getTest**](SyntheticsApi.md#getTest)                                                                          | **GET** /api/v1/synthetics/tests/{public_id}                                                       | Get a test configuration                          |
| _SyntheticsApi_                       | [**listGlobalVariables**](SyntheticsApi.md#listGlobalVariables)                                                  | **GET** /api/v1/synthetics/variables                                                               | Get all global variables                          |
| _SyntheticsApi_                       | [**listLocations**](SyntheticsApi.md#listLocations)                                                              | **GET** /api/v1/synthetics/locations                                                               | Get all locations (public and private)            |
| _SyntheticsApi_                       | [**listTests**](SyntheticsApi.md#listTests)                                                                      | **GET** /api/v1/synthetics/tests                                                                   | Get the list of all tests                         |
| _SyntheticsApi_                       | [**triggerCITests**](SyntheticsApi.md#triggerCITests)                                                            | **POST** /api/v1/synthetics/tests/trigger/ci                                                       | Trigger tests from CI/CD pipelines                |
| _SyntheticsApi_                       | [**triggerTests**](SyntheticsApi.md#triggerTests)                                                                | **POST** /api/v1/synthetics/tests/trigger                                                          | Trigger Synthetics tests                          |
| _SyntheticsApi_                       | [**updateAPITest**](SyntheticsApi.md#updateAPITest)                                                              | **PUT** /api/v1/synthetics/tests/api/{public_id}                                                   | Edit an API test                                  |
| _SyntheticsApi_                       | [**updateBrowserTest**](SyntheticsApi.md#updateBrowserTest)                                                      | **PUT** /api/v1/synthetics/tests/browser/{public_id}                                               | Edit a browser test                               |
| _SyntheticsApi_                       | [**updatePrivateLocation**](SyntheticsApi.md#updatePrivateLocation)                                              | **PUT** /api/v1/synthetics/private-locations/{location_id}                                         | Edit a private location                           |
| _SyntheticsApi_                       | [**updateTestPauseStatus**](SyntheticsApi.md#updateTestPauseStatus)                                              | **PUT** /api/v1/synthetics/tests/{public_id}/status                                                | Pause or start a test                             |
| _TagsApi_                             | [**createHostTags**](TagsApi.md#createHostTags)                                                                  | **POST** /api/v1/tags/hosts/{host_name}                                                            | Add tags to a host                                |
| _TagsApi_                             | [**deleteHostTags**](TagsApi.md#deleteHostTags)                                                                  | **DELETE** /api/v1/tags/hosts/{host_name}                                                          | Remove host tags                                  |
| _TagsApi_                             | [**getHostTags**](TagsApi.md#getHostTags)                                                                        | **GET** /api/v1/tags/hosts/{host_name}                                                             | Get host tags                                     |
| _TagsApi_                             | [**listHostTags**](TagsApi.md#listHostTags)                                                                      | **GET** /api/v1/tags/hosts                                                                         | Get Tags                                          |
| _TagsApi_                             | [**updateHostTags**](TagsApi.md#updateHostTags)                                                                  | **PUT** /api/v1/tags/hosts/{host_name}                                                             | Update host tags                                  |
| _UsageMeteringApi_                    | [**getDailyCustomReports**](UsageMeteringApi.md#getDailyCustomReports)                                           | **GET** /api/v1/daily_custom_reports                                                               | Get the list of available daily custom reports    |
| _UsageMeteringApi_                    | [**getHourlyUsageAttribution**](UsageMeteringApi.md#getHourlyUsageAttribution)                                   | **GET** /api/v1/usage/hourly-attribution                                                           | Get Hourly Usage Attribution                      |
| _UsageMeteringApi_                    | [**getIncidentManagement**](UsageMeteringApi.md#getIncidentManagement)                                           | **GET** /api/v1/usage/incident-management                                                          | Get hourly usage for incident management          |
| _UsageMeteringApi_                    | [**getIngestedSpans**](UsageMeteringApi.md#getIngestedSpans)                                                     | **GET** /api/v1/usage/ingested-spans                                                               | Get hourly usage for ingested spans               |
| _UsageMeteringApi_                    | [**getMonthlyCustomReports**](UsageMeteringApi.md#getMonthlyCustomReports)                                       | **GET** /api/v1/monthly_custom_reports                                                             | Get the list of available monthly custom reports  |
| _UsageMeteringApi_                    | [**getMonthlyUsageAttribution**](UsageMeteringApi.md#getMonthlyUsageAttribution)                                 | **GET** /api/v1/usage/monthly-attribution                                                          | Get Monthly Usage Attribution                     |
| _UsageMeteringApi_                    | [**getSpecifiedDailyCustomReports**](UsageMeteringApi.md#getSpecifiedDailyCustomReports)                         | **GET** /api/v1/daily_custom_reports/{report_id}                                                   | Get specified daily custom reports                |
| _UsageMeteringApi_                    | [**getSpecifiedMonthlyCustomReports**](UsageMeteringApi.md#getSpecifiedMonthlyCustomReports)                     | **GET** /api/v1/monthly_custom_reports/{report_id}                                                 | Get specified monthly custom reports              |
| _UsageMeteringApi_                    | [**getUsageAnalyzedLogs**](UsageMeteringApi.md#getUsageAnalyzedLogs)                                             | **GET** /api/v1/usage/analyzed_logs                                                                | Get hourly usage for analyzed logs                |
| _UsageMeteringApi_                    | [**getUsageAttribution**](UsageMeteringApi.md#getUsageAttribution)                                               | **GET** /api/v1/usage/attribution                                                                  | Get Usage Attribution                             |
| _UsageMeteringApi_                    | [**getUsageAuditLogs**](UsageMeteringApi.md#getUsageAuditLogs)                                                   | **GET** /api/v1/usage/audit_logs                                                                   | Get hourly usage for audit logs                   |
| _UsageMeteringApi_                    | [**getUsageBillableSummary**](UsageMeteringApi.md#getUsageBillableSummary)                                       | **GET** /api/v1/usage/billable-summary                                                             | Get billable usage across your account            |
| _UsageMeteringApi_                    | [**getUsageCWS**](UsageMeteringApi.md#getUsageCWS)                                                               | **GET** /api/v1/usage/cws                                                                          | Get hourly usage for Cloud Workload Security      |
| _UsageMeteringApi_                    | [**getUsageCloudSecurityPostureManagement**](UsageMeteringApi.md#getUsageCloudSecurityPostureManagement)         | **GET** /api/v1/usage/cspm                                                                         | Get hourly usage for CSPM                         |
| _UsageMeteringApi_                    | [**getUsageDBM**](UsageMeteringApi.md#getUsageDBM)                                                               | **GET** /api/v1/usage/dbm                                                                          | Get hourly usage for Database Monitoring          |
| _UsageMeteringApi_                    | [**getUsageFargate**](UsageMeteringApi.md#getUsageFargate)                                                       | **GET** /api/v1/usage/fargate                                                                      | Get hourly usage for Fargate                      |
| _UsageMeteringApi_                    | [**getUsageHosts**](UsageMeteringApi.md#getUsageHosts)                                                           | **GET** /api/v1/usage/hosts                                                                        | Get hourly usage for hosts and containers         |
| _UsageMeteringApi_                    | [**getUsageIndexedSpans**](UsageMeteringApi.md#getUsageIndexedSpans)                                             | **GET** /api/v1/usage/indexed-spans                                                                | Get hourly usage for indexed spans                |
| _UsageMeteringApi_                    | [**getUsageInternetOfThings**](UsageMeteringApi.md#getUsageInternetOfThings)                                     | **GET** /api/v1/usage/iot                                                                          | Get hourly usage for IoT                          |
| _UsageMeteringApi_                    | [**getUsageLambda**](UsageMeteringApi.md#getUsageLambda)                                                         | **GET** /api/v1/usage/aws_lambda                                                                   | Get hourly usage for Lambda                       |
| _UsageMeteringApi_                    | [**getUsageLogs**](UsageMeteringApi.md#getUsageLogs)                                                             | **GET** /api/v1/usage/logs                                                                         | Get hourly usage for Logs                         |
| _UsageMeteringApi_                    | [**getUsageLogsByIndex**](UsageMeteringApi.md#getUsageLogsByIndex)                                               | **GET** /api/v1/usage/logs_by_index                                                                | Get hourly usage for Logs by Index                |
| _UsageMeteringApi_                    | [**getUsageLogsByRetention**](UsageMeteringApi.md#getUsageLogsByRetention)                                       | **GET** /api/v1/usage/logs-by-retention                                                            | Get hourly logs usage by retention                |
| _UsageMeteringApi_                    | [**getUsageNetworkFlows**](UsageMeteringApi.md#getUsageNetworkFlows)                                             | **GET** /api/v1/usage/network_flows                                                                | Get hourly usage for Network Flows                |
| _UsageMeteringApi_                    | [**getUsageNetworkHosts**](UsageMeteringApi.md#getUsageNetworkHosts)                                             | **GET** /api/v1/usage/network_hosts                                                                | Get hourly usage for Network Hosts                |
| _UsageMeteringApi_                    | [**getUsageProfiling**](UsageMeteringApi.md#getUsageProfiling)                                                   | **GET** /api/v1/usage/profiling                                                                    | Get hourly usage for profiled hosts               |
| _UsageMeteringApi_                    | [**getUsageRumSessions**](UsageMeteringApi.md#getUsageRumSessions)                                               | **GET** /api/v1/usage/rum_sessions                                                                 | Get hourly usage for RUM Sessions                 |
| _UsageMeteringApi_                    | [**getUsageRumUnits**](UsageMeteringApi.md#getUsageRumUnits)                                                     | **GET** /api/v1/usage/rum                                                                          | Get hourly usage for RUM Units                    |
| _UsageMeteringApi_                    | [**getUsageSDS**](UsageMeteringApi.md#getUsageSDS)                                                               | **GET** /api/v1/usage/sds                                                                          | Get hourly usage for Sensitive Data Scanner       |
| _UsageMeteringApi_                    | [**getUsageSNMP**](UsageMeteringApi.md#getUsageSNMP)                                                             | **GET** /api/v1/usage/snmp                                                                         | Get hourly usage for SNMP devices                 |
| _UsageMeteringApi_                    | [**getUsageSummary**](UsageMeteringApi.md#getUsageSummary)                                                       | **GET** /api/v1/usage/summary                                                                      | Get usage across your multi-org account           |
| _UsageMeteringApi_                    | [**getUsageSynthetics**](UsageMeteringApi.md#getUsageSynthetics)                                                 | **GET** /api/v1/usage/synthetics                                                                   | Get hourly usage for Synthetics Checks            |
| _UsageMeteringApi_                    | [**getUsageSyntheticsAPI**](UsageMeteringApi.md#getUsageSyntheticsAPI)                                           | **GET** /api/v1/usage/synthetics_api                                                               | Get hourly usage for Synthetics API Checks        |
| _UsageMeteringApi_                    | [**getUsageSyntheticsBrowser**](UsageMeteringApi.md#getUsageSyntheticsBrowser)                                   | **GET** /api/v1/usage/synthetics_browser                                                           | Get hourly usage for Synthetics Browser Checks    |
| _UsageMeteringApi_                    | [**getUsageTimeseries**](UsageMeteringApi.md#getUsageTimeseries)                                                 | **GET** /api/v1/usage/timeseries                                                                   | Get hourly usage for custom metrics               |
| _UsageMeteringApi_                    | [**getUsageTopAvgMetrics**](UsageMeteringApi.md#getUsageTopAvgMetrics)                                           | **GET** /api/v1/usage/top_avg_metrics                                                              | Get all custom metrics by hourly average          |
| _UsersApi_                            | [**createUser**](UsersApi.md#createUser)                                                                         | **POST** /api/v1/user                                                                              | Create a user                                     |
| _UsersApi_                            | [**disableUser**](UsersApi.md#disableUser)                                                                       | **DELETE** /api/v1/user/{user_handle}                                                              | Disable a user                                    |
| _UsersApi_                            | [**getUser**](UsersApi.md#getUser)                                                                               | **GET** /api/v1/user/{user_handle}                                                                 | Get user details                                  |
| _UsersApi_                            | [**listUsers**](UsersApi.md#listUsers)                                                                           | **GET** /api/v1/user                                                                               | List all users                                    |
| _UsersApi_                            | [**updateUser**](UsersApi.md#updateUser)                                                                         | **PUT** /api/v1/user/{user_handle}                                                                 | Update a user                                     |
| _WebhooksIntegrationApi_              | [**createWebhooksIntegration**](WebhooksIntegrationApi.md#createWebhooksIntegration)                             | **POST** /api/v1/integration/webhooks/configuration/webhooks                                       | Create a webhooks integration                     |
| _WebhooksIntegrationApi_              | [**createWebhooksIntegrationCustomVariable**](WebhooksIntegrationApi.md#createWebhooksIntegrationCustomVariable) | **POST** /api/v1/integration/webhooks/configuration/custom-variables                               | Create a custom variable                          |
| _WebhooksIntegrationApi_              | [**deleteWebhooksIntegration**](WebhooksIntegrationApi.md#deleteWebhooksIntegration)                             | **DELETE** /api/v1/integration/webhooks/configuration/webhooks/{webhook_name}                      | Delete a webhook                                  |
| _WebhooksIntegrationApi_              | [**deleteWebhooksIntegrationCustomVariable**](WebhooksIntegrationApi.md#deleteWebhooksIntegrationCustomVariable) | **DELETE** /api/v1/integration/webhooks/configuration/custom-variables/{custom_variable_name}      | Delete a custom variable                          |
| _WebhooksIntegrationApi_              | [**getWebhooksIntegration**](WebhooksIntegrationApi.md#getWebhooksIntegration)                                   | **GET** /api/v1/integration/webhooks/configuration/webhooks/{webhook_name}                         | Get a webhook integration                         |
| _WebhooksIntegrationApi_              | [**getWebhooksIntegrationCustomVariable**](WebhooksIntegrationApi.md#getWebhooksIntegrationCustomVariable)       | **GET** /api/v1/integration/webhooks/configuration/custom-variables/{custom_variable_name}         | Get a custom variable                             |
| _WebhooksIntegrationApi_              | [**updateWebhooksIntegration**](WebhooksIntegrationApi.md#updateWebhooksIntegration)                             | **PUT** /api/v1/integration/webhooks/configuration/webhooks/{webhook_name}                         | Update a webhook                                  |
| _WebhooksIntegrationApi_              | [**updateWebhooksIntegrationCustomVariable**](WebhooksIntegrationApi.md#updateWebhooksIntegrationCustomVariable) | **PUT** /api/v1/integration/webhooks/configuration/custom-variables/{custom_variable_name}         | Update a custom variable                          |

## Documentation for Models

- [APIErrorResponse](APIErrorResponse.md)
- [AWSAccount](AWSAccount.md)
- [AWSAccountAndLambdaRequest](AWSAccountAndLambdaRequest.md)
- [AWSAccountCreateResponse](AWSAccountCreateResponse.md)
- [AWSAccountDeleteRequest](AWSAccountDeleteRequest.md)
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
- [DashboardBulkActionData](DashboardBulkActionData.md)
- [DashboardBulkDeleteRequest](DashboardBulkDeleteRequest.md)
- [DashboardDeleteResponse](DashboardDeleteResponse.md)
- [DashboardLayoutType](DashboardLayoutType.md)
- [DashboardList](DashboardList.md)
- [DashboardListDeleteResponse](DashboardListDeleteResponse.md)
- [DashboardListListResponse](DashboardListListResponse.md)
- [DashboardReflowType](DashboardReflowType.md)
- [DashboardResourceType](DashboardResourceType.md)
- [DashboardRestoreRequest](DashboardRestoreRequest.md)
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
- [DowntimeChild](DowntimeChild.md)
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
- [FormulaAndFunctionApmDependencyStatName](FormulaAndFunctionApmDependencyStatName.md)
- [FormulaAndFunctionApmDependencyStatsDataSource](FormulaAndFunctionApmDependencyStatsDataSource.md)
- [FormulaAndFunctionApmDependencyStatsQueryDefinition](FormulaAndFunctionApmDependencyStatsQueryDefinition.md)
- [FormulaAndFunctionApmResourceStatName](FormulaAndFunctionApmResourceStatName.md)
- [FormulaAndFunctionApmResourceStatsDataSource](FormulaAndFunctionApmResourceStatsDataSource.md)
- [FormulaAndFunctionApmResourceStatsQueryDefinition](FormulaAndFunctionApmResourceStatsQueryDefinition.md)
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
- [FunnelQuery](FunnelQuery.md)
- [FunnelRequestType](FunnelRequestType.md)
- [FunnelSource](FunnelSource.md)
- [FunnelStep](FunnelStep.md)
- [FunnelWidgetDefinition](FunnelWidgetDefinition.md)
- [FunnelWidgetDefinitionType](FunnelWidgetDefinitionType.md)
- [FunnelWidgetRequest](FunnelWidgetRequest.md)
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
- [HostMetaInstallMethod](HostMetaInstallMethod.md)
- [HostMetrics](HostMetrics.md)
- [HostMuteResponse](HostMuteResponse.md)
- [HostMuteSettings](HostMuteSettings.md)
- [HostTags](HostTags.md)
- [HostTotals](HostTotals.md)
- [HourlyUsageAttributionBody](HourlyUsageAttributionBody.md)
- [HourlyUsageAttributionMetadata](HourlyUsageAttributionMetadata.md)
- [HourlyUsageAttributionPagination](HourlyUsageAttributionPagination.md)
- [HourlyUsageAttributionResponse](HourlyUsageAttributionResponse.md)
- [HourlyUsageAttributionUsageType](HourlyUsageAttributionUsageType.md)
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
- [ListStreamColumn](ListStreamColumn.md)
- [ListStreamColumnWidth](ListStreamColumnWidth.md)
- [ListStreamQuery](ListStreamQuery.md)
- [ListStreamResponseFormat](ListStreamResponseFormat.md)
- [ListStreamSource](ListStreamSource.md)
- [ListStreamWidgetDefinition](ListStreamWidgetDefinition.md)
- [ListStreamWidgetDefinitionType](ListStreamWidgetDefinitionType.md)
- [ListStreamWidgetRequest](ListStreamWidgetRequest.md)
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
- [LogsByRetention](LogsByRetention.md)
- [LogsByRetentionMonthlyUsage](LogsByRetentionMonthlyUsage.md)
- [LogsByRetentionOrgUsage](LogsByRetentionOrgUsage.md)
- [LogsByRetentionOrgs](LogsByRetentionOrgs.md)
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
- [LogsRetentionAggSumUsage](LogsRetentionAggSumUsage.md)
- [LogsRetentionSumUsage](LogsRetentionSumUsage.md)
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
- [MetricContentEncoding](MetricContentEncoding.md)
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
- [MonitorFormulaAndFunctionEventAggregation](MonitorFormulaAndFunctionEventAggregation.md)
- [MonitorFormulaAndFunctionEventQueryDefinition](MonitorFormulaAndFunctionEventQueryDefinition.md)
- [MonitorFormulaAndFunctionEventQueryDefinitionCompute](MonitorFormulaAndFunctionEventQueryDefinitionCompute.md)
- [MonitorFormulaAndFunctionEventQueryDefinitionSearch](MonitorFormulaAndFunctionEventQueryDefinitionSearch.md)
- [MonitorFormulaAndFunctionEventQueryGroupBy](MonitorFormulaAndFunctionEventQueryGroupBy.md)
- [MonitorFormulaAndFunctionEventQueryGroupBySort](MonitorFormulaAndFunctionEventQueryGroupBySort.md)
- [MonitorFormulaAndFunctionEventsDataSource](MonitorFormulaAndFunctionEventsDataSource.md)
- [MonitorFormulaAndFunctionQueryDefinition](MonitorFormulaAndFunctionQueryDefinition.md)
- [MonitorGroupSearchResponse](MonitorGroupSearchResponse.md)
- [MonitorGroupSearchResponseCounts](MonitorGroupSearchResponseCounts.md)
- [MonitorGroupSearchResult](MonitorGroupSearchResult.md)
- [MonitorOptions](MonitorOptions.md)
- [MonitorOptionsAggregation](MonitorOptionsAggregation.md)
- [MonitorOverallStates](MonitorOverallStates.md)
- [MonitorRenotifyStatusType](MonitorRenotifyStatusType.md)
- [MonitorSearchResponse](MonitorSearchResponse.md)
- [MonitorSearchResponseCounts](MonitorSearchResponseCounts.md)
- [MonitorSearchResponseMetadata](MonitorSearchResponseMetadata.md)
- [MonitorSearchResult](MonitorSearchResult.md)
- [MonitorSearchResultNotification](MonitorSearchResultNotification.md)
- [MonitorState](MonitorState.md)
- [MonitorStateGroup](MonitorStateGroup.md)
- [MonitorSummaryWidgetDefinition](MonitorSummaryWidgetDefinition.md)
- [MonitorSummaryWidgetDefinitionType](MonitorSummaryWidgetDefinitionType.md)
- [MonitorThresholdWindowOptions](MonitorThresholdWindowOptions.md)
- [MonitorThresholds](MonitorThresholds.md)
- [MonitorType](MonitorType.md)
- [MonitorUpdateRequest](MonitorUpdateRequest.md)
- [MonthlyUsageAttributionBody](MonthlyUsageAttributionBody.md)
- [MonthlyUsageAttributionMetadata](MonthlyUsageAttributionMetadata.md)
- [MonthlyUsageAttributionPagination](MonthlyUsageAttributionPagination.md)
- [MonthlyUsageAttributionResponse](MonthlyUsageAttributionResponse.md)
- [MonthlyUsageAttributionSupportedMetrics](MonthlyUsageAttributionSupportedMetrics.md)
- [MonthlyUsageAttributionValues](MonthlyUsageAttributionValues.md)
- [NoteWidgetDefinition](NoteWidgetDefinition.md)
- [NoteWidgetDefinitionType](NoteWidgetDefinitionType.md)
- [NotebookAbsoluteTime](NotebookAbsoluteTime.md)
- [NotebookAuthor](NotebookAuthor.md)
- [NotebookCellCreateRequest](NotebookCellCreateRequest.md)
- [NotebookCellCreateRequestAttributes](NotebookCellCreateRequestAttributes.md)
- [NotebookCellResourceType](NotebookCellResourceType.md)
- [NotebookCellResponse](NotebookCellResponse.md)
- [NotebookCellResponseAttributes](NotebookCellResponseAttributes.md)
- [NotebookCellTime](NotebookCellTime.md)
- [NotebookCellUpdateRequest](NotebookCellUpdateRequest.md)
- [NotebookCellUpdateRequestAttributes](NotebookCellUpdateRequestAttributes.md)
- [NotebookCreateData](NotebookCreateData.md)
- [NotebookCreateDataAttributes](NotebookCreateDataAttributes.md)
- [NotebookCreateRequest](NotebookCreateRequest.md)
- [NotebookDistributionCellAttributes](NotebookDistributionCellAttributes.md)
- [NotebookGlobalTime](NotebookGlobalTime.md)
- [NotebookGraphSize](NotebookGraphSize.md)
- [NotebookHeatMapCellAttributes](NotebookHeatMapCellAttributes.md)
- [NotebookLogStreamCellAttributes](NotebookLogStreamCellAttributes.md)
- [NotebookMarkdownCellAttributes](NotebookMarkdownCellAttributes.md)
- [NotebookMarkdownCellDefinition](NotebookMarkdownCellDefinition.md)
- [NotebookMarkdownCellDefinitionType](NotebookMarkdownCellDefinitionType.md)
- [NotebookMetadata](NotebookMetadata.md)
- [NotebookMetadataType](NotebookMetadataType.md)
- [NotebookRelativeTime](NotebookRelativeTime.md)
- [NotebookResourceType](NotebookResourceType.md)
- [NotebookResponse](NotebookResponse.md)
- [NotebookResponseData](NotebookResponseData.md)
- [NotebookResponseDataAttributes](NotebookResponseDataAttributes.md)
- [NotebookSplitBy](NotebookSplitBy.md)
- [NotebookStatus](NotebookStatus.md)
- [NotebookTimeseriesCellAttributes](NotebookTimeseriesCellAttributes.md)
- [NotebookToplistCellAttributes](NotebookToplistCellAttributes.md)
- [NotebookUpdateCell](NotebookUpdateCell.md)
- [NotebookUpdateData](NotebookUpdateData.md)
- [NotebookUpdateDataAttributes](NotebookUpdateDataAttributes.md)
- [NotebookUpdateRequest](NotebookUpdateRequest.md)
- [NotebooksResponse](NotebooksResponse.md)
- [NotebooksResponseData](NotebooksResponseData.md)
- [NotebooksResponseDataAttributes](NotebooksResponseDataAttributes.md)
- [NotebooksResponseMeta](NotebooksResponseMeta.md)
- [NotebooksResponsePage](NotebooksResponsePage.md)
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
- [Pagination](Pagination.md)
- [ProcessQueryDefinition](ProcessQueryDefinition.md)
- [QuerySortOrder](QuerySortOrder.md)
- [QueryValueWidgetDefinition](QueryValueWidgetDefinition.md)
- [QueryValueWidgetDefinitionType](QueryValueWidgetDefinitionType.md)
- [QueryValueWidgetRequest](QueryValueWidgetRequest.md)
- [ResponseMetaAttributes](ResponseMetaAttributes.md)
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
- [SLOCorrectionResponseAttributesModifier](SLOCorrectionResponseAttributesModifier.md)
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
- [SLOHistoryMonitor](SLOHistoryMonitor.md)
- [SLOHistoryResponse](SLOHistoryResponse.md)
- [SLOHistoryResponseData](SLOHistoryResponseData.md)
- [SLOHistoryResponseError](SLOHistoryResponseError.md)
- [SLOHistoryResponseErrorWithType](SLOHistoryResponseErrorWithType.md)
- [SLOHistorySLIData](SLOHistorySLIData.md)
- [SLOListResponse](SLOListResponse.md)
- [SLOListResponseMetadata](SLOListResponseMetadata.md)
- [SLOListResponseMetadataPage](SLOListResponseMetadataPage.md)
- [SLOResponse](SLOResponse.md)
- [SLOResponseData](SLOResponseData.md)
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
- [ScatterplotDimension](ScatterplotDimension.md)
- [ScatterplotTableRequest](ScatterplotTableRequest.md)
- [ScatterplotWidgetAggregator](ScatterplotWidgetAggregator.md)
- [ScatterplotWidgetFormula](ScatterplotWidgetFormula.md)
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
- [SunburstWidgetDefinition](SunburstWidgetDefinition.md)
- [SunburstWidgetDefinitionType](SunburstWidgetDefinitionType.md)
- [SunburstWidgetLegend](SunburstWidgetLegend.md)
- [SunburstWidgetLegendInlineAutomatic](SunburstWidgetLegendInlineAutomatic.md)
- [SunburstWidgetLegendInlineAutomaticType](SunburstWidgetLegendInlineAutomaticType.md)
- [SunburstWidgetLegendTable](SunburstWidgetLegendTable.md)
- [SunburstWidgetLegendTableType](SunburstWidgetLegendTableType.md)
- [SunburstWidgetRequest](SunburstWidgetRequest.md)
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
- [SyntheticsApiTestFailureCode](SyntheticsApiTestFailureCode.md)
- [SyntheticsApiTestResultFailure](SyntheticsApiTestResultFailure.md)
- [SyntheticsAssertion](SyntheticsAssertion.md)
- [SyntheticsAssertionJSONPathOperator](SyntheticsAssertionJSONPathOperator.md)
- [SyntheticsAssertionJSONPathTarget](SyntheticsAssertionJSONPathTarget.md)
- [SyntheticsAssertionJSONPathTargetTarget](SyntheticsAssertionJSONPathTargetTarget.md)
- [SyntheticsAssertionOperator](SyntheticsAssertionOperator.md)
- [SyntheticsAssertionTarget](SyntheticsAssertionTarget.md)
- [SyntheticsAssertionType](SyntheticsAssertionType.md)
- [SyntheticsBasicAuth](SyntheticsBasicAuth.md)
- [SyntheticsBasicAuthNTLM](SyntheticsBasicAuthNTLM.md)
- [SyntheticsBasicAuthNTLMType](SyntheticsBasicAuthNTLMType.md)
- [SyntheticsBasicAuthSigv4](SyntheticsBasicAuthSigv4.md)
- [SyntheticsBasicAuthSigv4Type](SyntheticsBasicAuthSigv4Type.md)
- [SyntheticsBasicAuthWeb](SyntheticsBasicAuthWeb.md)
- [SyntheticsBasicAuthWebType](SyntheticsBasicAuthWebType.md)
- [SyntheticsBatchDetails](SyntheticsBatchDetails.md)
- [SyntheticsBatchDetailsData](SyntheticsBatchDetailsData.md)
- [SyntheticsBatchResult](SyntheticsBatchResult.md)
- [SyntheticsBrowserError](SyntheticsBrowserError.md)
- [SyntheticsBrowserErrorType](SyntheticsBrowserErrorType.md)
- [SyntheticsBrowserTest](SyntheticsBrowserTest.md)
- [SyntheticsBrowserTestConfig](SyntheticsBrowserTestConfig.md)
- [SyntheticsBrowserTestFailureCode](SyntheticsBrowserTestFailureCode.md)
- [SyntheticsBrowserTestResultData](SyntheticsBrowserTestResultData.md)
- [SyntheticsBrowserTestResultFailure](SyntheticsBrowserTestResultFailure.md)
- [SyntheticsBrowserTestResultFull](SyntheticsBrowserTestResultFull.md)
- [SyntheticsBrowserTestResultFullCheck](SyntheticsBrowserTestResultFullCheck.md)
- [SyntheticsBrowserTestResultShort](SyntheticsBrowserTestResultShort.md)
- [SyntheticsBrowserTestResultShortResult](SyntheticsBrowserTestResultShortResult.md)
- [SyntheticsBrowserTestType](SyntheticsBrowserTestType.md)
- [SyntheticsBrowserVariable](SyntheticsBrowserVariable.md)
- [SyntheticsBrowserVariableType](SyntheticsBrowserVariableType.md)
- [SyntheticsCIBatchMetadata](SyntheticsCIBatchMetadata.md)
- [SyntheticsCIBatchMetadataCI](SyntheticsCIBatchMetadataCI.md)
- [SyntheticsCIBatchMetadataGit](SyntheticsCIBatchMetadataGit.md)
- [SyntheticsCIBatchMetadataPipeline](SyntheticsCIBatchMetadataPipeline.md)
- [SyntheticsCIBatchMetadataProvider](SyntheticsCIBatchMetadataProvider.md)
- [SyntheticsCITest](SyntheticsCITest.md)
- [SyntheticsCITestBody](SyntheticsCITestBody.md)
- [SyntheticsCheckType](SyntheticsCheckType.md)
- [SyntheticsConfigVariable](SyntheticsConfigVariable.md)
- [SyntheticsConfigVariableType](SyntheticsConfigVariableType.md)
- [SyntheticsCoreWebVitals](SyntheticsCoreWebVitals.md)
- [SyntheticsDeleteTestsPayload](SyntheticsDeleteTestsPayload.md)
- [SyntheticsDeleteTestsResponse](SyntheticsDeleteTestsResponse.md)
- [SyntheticsDeletedTest](SyntheticsDeletedTest.md)
- [SyntheticsDevice](SyntheticsDevice.md)
- [SyntheticsDeviceID](SyntheticsDeviceID.md)
- [SyntheticsGetAPITestLatestResultsResponse](SyntheticsGetAPITestLatestResultsResponse.md)
- [SyntheticsGetBrowserTestLatestResultsResponse](SyntheticsGetBrowserTestLatestResultsResponse.md)
- [SyntheticsGlobalVariable](SyntheticsGlobalVariable.md)
- [SyntheticsGlobalVariableAttributes](SyntheticsGlobalVariableAttributes.md)
- [SyntheticsGlobalVariableParseTestOptions](SyntheticsGlobalVariableParseTestOptions.md)
- [SyntheticsGlobalVariableParseTestOptionsType](SyntheticsGlobalVariableParseTestOptionsType.md)
- [SyntheticsGlobalVariableParserType](SyntheticsGlobalVariableParserType.md)
- [SyntheticsGlobalVariableValue](SyntheticsGlobalVariableValue.md)
- [SyntheticsListGlobalVariablesResponse](SyntheticsListGlobalVariablesResponse.md)
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
- [SyntheticsStatus](SyntheticsStatus.md)
- [SyntheticsStep](SyntheticsStep.md)
- [SyntheticsStepDetail](SyntheticsStepDetail.md)
- [SyntheticsStepDetailWarning](SyntheticsStepDetailWarning.md)
- [SyntheticsStepType](SyntheticsStepType.md)
- [SyntheticsTestConfig](SyntheticsTestConfig.md)
- [SyntheticsTestDetails](SyntheticsTestDetails.md)
- [SyntheticsTestDetailsSubType](SyntheticsTestDetailsSubType.md)
- [SyntheticsTestDetailsType](SyntheticsTestDetailsType.md)
- [SyntheticsTestExecutionRule](SyntheticsTestExecutionRule.md)
- [SyntheticsTestMonitorStatus](SyntheticsTestMonitorStatus.md)
- [SyntheticsTestOptions](SyntheticsTestOptions.md)
- [SyntheticsTestOptionsMonitorOptions](SyntheticsTestOptionsMonitorOptions.md)
- [SyntheticsTestOptionsRetry](SyntheticsTestOptionsRetry.md)
- [SyntheticsTestPauseStatus](SyntheticsTestPauseStatus.md)
- [SyntheticsTestProcessStatus](SyntheticsTestProcessStatus.md)
- [SyntheticsTestRequest](SyntheticsTestRequest.md)
- [SyntheticsTestRequestCertificate](SyntheticsTestRequestCertificate.md)
- [SyntheticsTestRequestCertificateItem](SyntheticsTestRequestCertificateItem.md)
- [SyntheticsTestRequestProxy](SyntheticsTestRequestProxy.md)
- [SyntheticsTiming](SyntheticsTiming.md)
- [SyntheticsTriggerBody](SyntheticsTriggerBody.md)
- [SyntheticsTriggerCITestLocation](SyntheticsTriggerCITestLocation.md)
- [SyntheticsTriggerCITestRunResult](SyntheticsTriggerCITestRunResult.md)
- [SyntheticsTriggerCITestsResponse](SyntheticsTriggerCITestsResponse.md)
- [SyntheticsTriggerTest](SyntheticsTriggerTest.md)
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
- [TreeMapColorBy](TreeMapColorBy.md)
- [TreeMapGroupBy](TreeMapGroupBy.md)
- [TreeMapSizeBy](TreeMapSizeBy.md)
- [TreeMapWidgetDefinition](TreeMapWidgetDefinition.md)
- [TreeMapWidgetDefinitionType](TreeMapWidgetDefinitionType.md)
- [TreeMapWidgetRequest](TreeMapWidgetRequest.md)
- [UsageAnalyzedLogsHour](UsageAnalyzedLogsHour.md)
- [UsageAnalyzedLogsResponse](UsageAnalyzedLogsResponse.md)
- [UsageAttributionAggregatesBody](UsageAttributionAggregatesBody.md)
- [UsageAttributionBody](UsageAttributionBody.md)
- [UsageAttributionMetadata](UsageAttributionMetadata.md)
- [UsageAttributionPagination](UsageAttributionPagination.md)
- [UsageAttributionResponse](UsageAttributionResponse.md)
- [UsageAttributionSort](UsageAttributionSort.md)
- [UsageAttributionSupportedMetrics](UsageAttributionSupportedMetrics.md)
- [UsageAttributionValues](UsageAttributionValues.md)
- [UsageAuditLogsHour](UsageAuditLogsHour.md)
- [UsageAuditLogsResponse](UsageAuditLogsResponse.md)
- [UsageBillableSummaryBody](UsageBillableSummaryBody.md)
- [UsageBillableSummaryHour](UsageBillableSummaryHour.md)
- [UsageBillableSummaryKeys](UsageBillableSummaryKeys.md)
- [UsageBillableSummaryResponse](UsageBillableSummaryResponse.md)
- [UsageCWSHour](UsageCWSHour.md)
- [UsageCWSResponse](UsageCWSResponse.md)
- [UsageCloudSecurityPostureManagementHour](UsageCloudSecurityPostureManagementHour.md)
- [UsageCloudSecurityPostureManagementResponse](UsageCloudSecurityPostureManagementResponse.md)
- [UsageCustomReportsAttributes](UsageCustomReportsAttributes.md)
- [UsageCustomReportsData](UsageCustomReportsData.md)
- [UsageCustomReportsMeta](UsageCustomReportsMeta.md)
- [UsageCustomReportsPage](UsageCustomReportsPage.md)
- [UsageCustomReportsResponse](UsageCustomReportsResponse.md)
- [UsageDBMHour](UsageDBMHour.md)
- [UsageDBMResponse](UsageDBMResponse.md)
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
- [UsageLogsByRetentionHour](UsageLogsByRetentionHour.md)
- [UsageLogsByRetentionResponse](UsageLogsByRetentionResponse.md)
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
- [UsageRumUnitsHour](UsageRumUnitsHour.md)
- [UsageRumUnitsResponse](UsageRumUnitsResponse.md)
- [UsageSDSHour](UsageSDSHour.md)
- [UsageSDSResponse](UsageSDSResponse.md)
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
- [User](User.md)
- [UserDisableResponse](UserDisableResponse.md)
- [UserListResponse](UserListResponse.md)
- [UserResponse](UserResponse.md)
- [WebhooksIntegration](WebhooksIntegration.md)
- [WebhooksIntegrationCustomVariable](WebhooksIntegrationCustomVariable.md)
- [WebhooksIntegrationCustomVariableResponse](WebhooksIntegrationCustomVariableResponse.md)
- [WebhooksIntegrationCustomVariableUpdateRequest](WebhooksIntegrationCustomVariableUpdateRequest.md)
- [WebhooksIntegrationEncoding](WebhooksIntegrationEncoding.md)
- [WebhooksIntegrationUpdateRequest](WebhooksIntegrationUpdateRequest.md)
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
- [WidgetHorizontalAlign](WidgetHorizontalAlign.md)
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
- [WidgetVerticalAlign](WidgetVerticalAlign.md)
- [WidgetViewMode](WidgetViewMode.md)
- [WidgetVizType](WidgetVizType.md)

## Documentation for Authorization

Authentication schemes defined for the API:

### AuthZ

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: /oauth2/v1/authorize
- **Scopes**:
  - dashboards_public_share: Share dashboards externally.
  - dashboards_read: View dashboards.
  - dashboards_write: Create and change dashboards.
  - events_read: Read Events data.
  - metrics_read: View custom metrics.
  - monitors_downtime: Set downtimes to suppress alerts from any monitor in an organization. The ability to write monitors is not required to set downtimes.
  - monitors_read: View monitors.
  - monitors_write: Change, mute, and delete individual monitors.
  - synthetics_global_variable_read: View, search, and use in tests the list of global variables available for Synthetics.
  - synthetics_global_variable_write: Create, edit, and delete global variables for Synthetics.
  - synthetics_private_location_read: View, search, and use in tests the list of available private locations.
  - synthetics_private_location_write: Create and delete private locations as well as seeing the associated installation guidelines.
  - synthetics_read: List and view configured Synthetic tests.
  - synthetics_write: Create, edit, and delete Synthetic tests.
  - timeseries_query: Query Timeseries data.
  - usage_read: View your organization&#39;s usage and usage attribution.
  - user_access_invite: Invite other users to your organization.
  - user_access_manage: Disable users, manage user roles, and manage SAML-to-role mappings.

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
