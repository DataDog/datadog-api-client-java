## Documentation for API Endpoints

All URIs are relative to *https://api.datadoghq.com*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*DashboardListsApi* | [**createDashboardListItems**](DashboardListsApi.md#createDashboardListItems) | **POST** /api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards | Add Items to a Dashboard List
*DashboardListsApi* | [**deleteDashboardListItems**](DashboardListsApi.md#deleteDashboardListItems) | **DELETE** /api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards | Delete items from a dashboard list
*DashboardListsApi* | [**getDashboardListItems**](DashboardListsApi.md#getDashboardListItems) | **GET** /api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards | Get items of a Dashboard List
*DashboardListsApi* | [**updateDashboardListItems**](DashboardListsApi.md#updateDashboardListItems) | **PUT** /api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards | Update items of a dashboard list
*IncidentServicesApi* | [**createIncidentService**](IncidentServicesApi.md#createIncidentService) | **POST** /api/v2/services | Create a new incident service
*IncidentServicesApi* | [**deleteIncidentService**](IncidentServicesApi.md#deleteIncidentService) | **DELETE** /api/v2/services/{service_id} | Delete an existing incident service
*IncidentServicesApi* | [**getIncidentService**](IncidentServicesApi.md#getIncidentService) | **GET** /api/v2/services/{service_id} | Get details of an incident service
*IncidentServicesApi* | [**listIncidentServices**](IncidentServicesApi.md#listIncidentServices) | **GET** /api/v2/services | Get a list of all incident services
*IncidentServicesApi* | [**updateIncidentService**](IncidentServicesApi.md#updateIncidentService) | **PATCH** /api/v2/services/{service_id} | Update an existing incident service
*IncidentTeamsApi* | [**createIncidentTeam**](IncidentTeamsApi.md#createIncidentTeam) | **POST** /api/v2/teams | Create a new incident team
*IncidentTeamsApi* | [**deleteIncidentTeam**](IncidentTeamsApi.md#deleteIncidentTeam) | **DELETE** /api/v2/teams/{team_id} | Delete an existing incident team
*IncidentTeamsApi* | [**getIncidentTeam**](IncidentTeamsApi.md#getIncidentTeam) | **GET** /api/v2/teams/{team_id} | Get details of an incident team
*IncidentTeamsApi* | [**listIncidentTeams**](IncidentTeamsApi.md#listIncidentTeams) | **GET** /api/v2/teams | Get a list of all incident teams
*IncidentTeamsApi* | [**updateIncidentTeam**](IncidentTeamsApi.md#updateIncidentTeam) | **PATCH** /api/v2/teams/{team_id} | Update an existing incident team
*IncidentsApi* | [**createIncident**](IncidentsApi.md#createIncident) | **POST** /api/v2/incidents | Create an incident
*IncidentsApi* | [**deleteIncident**](IncidentsApi.md#deleteIncident) | **DELETE** /api/v2/incidents/{incident_id} | Delete an existing incident
*IncidentsApi* | [**getIncident**](IncidentsApi.md#getIncident) | **GET** /api/v2/incidents/{incident_id} | Get the details of an incident
*IncidentsApi* | [**listIncidents**](IncidentsApi.md#listIncidents) | **GET** /api/v2/incidents | Get a list of incidents
*IncidentsApi* | [**updateIncident**](IncidentsApi.md#updateIncident) | **PATCH** /api/v2/incidents/{incident_id} | Update an existing incident
*KeyManagementApi* | [**createAPIKey**](KeyManagementApi.md#createAPIKey) | **POST** /api/v2/api_keys | Create an API key
*KeyManagementApi* | [**createCurrentUserApplicationKey**](KeyManagementApi.md#createCurrentUserApplicationKey) | **POST** /api/v2/current_user/application_keys | Create an application key for current user
*KeyManagementApi* | [**deleteAPIKey**](KeyManagementApi.md#deleteAPIKey) | **DELETE** /api/v2/api_keys/{api_key_id} | Delete an API key
*KeyManagementApi* | [**deleteApplicationKey**](KeyManagementApi.md#deleteApplicationKey) | **DELETE** /api/v2/application_keys/{app_key_id} | Delete an application key
*KeyManagementApi* | [**deleteCurrentUserApplicationKey**](KeyManagementApi.md#deleteCurrentUserApplicationKey) | **DELETE** /api/v2/current_user/application_keys/{app_key_id} | Delete an application key owned by current user
*KeyManagementApi* | [**getAPIKey**](KeyManagementApi.md#getAPIKey) | **GET** /api/v2/api_keys/{api_key_id} | Get API key
*KeyManagementApi* | [**getCurrentUserApplicationKey**](KeyManagementApi.md#getCurrentUserApplicationKey) | **GET** /api/v2/current_user/application_keys/{app_key_id} | Get one application key owned by current user
*KeyManagementApi* | [**listAPIKeys**](KeyManagementApi.md#listAPIKeys) | **GET** /api/v2/api_keys | Get all API keys
*KeyManagementApi* | [**listApplicationKeys**](KeyManagementApi.md#listApplicationKeys) | **GET** /api/v2/application_keys | Get all application keys
*KeyManagementApi* | [**listCurrentUserApplicationKeys**](KeyManagementApi.md#listCurrentUserApplicationKeys) | **GET** /api/v2/current_user/application_keys | Get all application keys owned by current user
*KeyManagementApi* | [**updateAPIKey**](KeyManagementApi.md#updateAPIKey) | **PATCH** /api/v2/api_keys/{api_key_id} | Edit an API key
*KeyManagementApi* | [**updateApplicationKey**](KeyManagementApi.md#updateApplicationKey) | **PATCH** /api/v2/application_keys/{app_key_id} | Edit an application key
*KeyManagementApi* | [**updateCurrentUserApplicationKey**](KeyManagementApi.md#updateCurrentUserApplicationKey) | **PATCH** /api/v2/current_user/application_keys/{app_key_id} | Edit an application key owned by current user
*LogsApi* | [**aggregateLogs**](LogsApi.md#aggregateLogs) | **POST** /api/v2/logs/analytics/aggregate | Aggregate events
*LogsApi* | [**listLogs**](LogsApi.md#listLogs) | **POST** /api/v2/logs/events/search | Search logs
*LogsApi* | [**listLogsGet**](LogsApi.md#listLogsGet) | **GET** /api/v2/logs/events | Get a list of logs
*LogsArchivesApi* | [**addReadRoleToArchive**](LogsArchivesApi.md#addReadRoleToArchive) | **POST** /api/v2/logs/config/archives/{archive_id}/readers | Grant role to an archive
*LogsArchivesApi* | [**createLogsArchive**](LogsArchivesApi.md#createLogsArchive) | **POST** /api/v2/logs/config/archives | Create an archive
*LogsArchivesApi* | [**deleteLogsArchive**](LogsArchivesApi.md#deleteLogsArchive) | **DELETE** /api/v2/logs/config/archives/{archive_id} | Delete an archive
*LogsArchivesApi* | [**getLogsArchive**](LogsArchivesApi.md#getLogsArchive) | **GET** /api/v2/logs/config/archives/{archive_id} | Get an archive
*LogsArchivesApi* | [**getLogsArchiveOrder**](LogsArchivesApi.md#getLogsArchiveOrder) | **GET** /api/v2/logs/config/archive-order | Get archive order
*LogsArchivesApi* | [**listArchiveReadRoles**](LogsArchivesApi.md#listArchiveReadRoles) | **GET** /api/v2/logs/config/archives/{archive_id}/readers | List read roles for an archive
*LogsArchivesApi* | [**listLogsArchives**](LogsArchivesApi.md#listLogsArchives) | **GET** /api/v2/logs/config/archives | Get all archives
*LogsArchivesApi* | [**removeRoleFromArchive**](LogsArchivesApi.md#removeRoleFromArchive) | **DELETE** /api/v2/logs/config/archives/{archive_id}/readers | Revoke role from an archive
*LogsArchivesApi* | [**updateLogsArchive**](LogsArchivesApi.md#updateLogsArchive) | **PUT** /api/v2/logs/config/archives/{archive_id} | Update an archive
*LogsArchivesApi* | [**updateLogsArchiveOrder**](LogsArchivesApi.md#updateLogsArchiveOrder) | **PUT** /api/v2/logs/config/archive-order | Update archive order
*LogsMetricsApi* | [**createLogsMetric**](LogsMetricsApi.md#createLogsMetric) | **POST** /api/v2/logs/config/metrics | Create a log-based metric
*LogsMetricsApi* | [**deleteLogsMetric**](LogsMetricsApi.md#deleteLogsMetric) | **DELETE** /api/v2/logs/config/metrics/{metric_id} | Delete a log-based metric
*LogsMetricsApi* | [**getLogsMetric**](LogsMetricsApi.md#getLogsMetric) | **GET** /api/v2/logs/config/metrics/{metric_id} | Get a log-based metric
*LogsMetricsApi* | [**listLogsMetrics**](LogsMetricsApi.md#listLogsMetrics) | **GET** /api/v2/logs/config/metrics | Get all log-based metrics
*LogsMetricsApi* | [**updateLogsMetric**](LogsMetricsApi.md#updateLogsMetric) | **PATCH** /api/v2/logs/config/metrics/{metric_id} | Update a log-based metric
*MetricsApi* | [**createTagConfiguration**](MetricsApi.md#createTagConfiguration) | **POST** /api/v2/metrics/{metric_name}/tags | Create a tag configuration
*MetricsApi* | [**deleteTagConfiguration**](MetricsApi.md#deleteTagConfiguration) | **DELETE** /api/v2/metrics/{metric_name}/tags | Delete a tag configuration
*MetricsApi* | [**listTagConfigurationByName**](MetricsApi.md#listTagConfigurationByName) | **GET** /api/v2/metrics/{metric_name}/tags | List tag configuration by name
*MetricsApi* | [**listTagConfigurations**](MetricsApi.md#listTagConfigurations) | **GET** /api/v2/metrics | List tag configurations
*MetricsApi* | [**listTagsByMetricName**](MetricsApi.md#listTagsByMetricName) | **GET** /api/v2/metrics/{metric_name}/all-tags | List tags by metric name
*MetricsApi* | [**listVolumesByMetricName**](MetricsApi.md#listVolumesByMetricName) | **GET** /api/v2/metrics/{metric_name}/volumes | List distinct metric volumes by metric name
*MetricsApi* | [**updateTagConfiguration**](MetricsApi.md#updateTagConfiguration) | **PATCH** /api/v2/metrics/{metric_name}/tags | Update a tag configuration
*ProcessesApi* | [**listProcesses**](ProcessesApi.md#listProcesses) | **GET** /api/v2/processes | Get all processes
*RolesApi* | [**addPermissionToRole**](RolesApi.md#addPermissionToRole) | **POST** /api/v2/roles/{role_id}/permissions | Grant permission to a role
*RolesApi* | [**addUserToRole**](RolesApi.md#addUserToRole) | **POST** /api/v2/roles/{role_id}/users | Add a user to a role
*RolesApi* | [**createRole**](RolesApi.md#createRole) | **POST** /api/v2/roles | Create role
*RolesApi* | [**deleteRole**](RolesApi.md#deleteRole) | **DELETE** /api/v2/roles/{role_id} | Delete role
*RolesApi* | [**getRole**](RolesApi.md#getRole) | **GET** /api/v2/roles/{role_id} | Get a role
*RolesApi* | [**listPermissions**](RolesApi.md#listPermissions) | **GET** /api/v2/permissions | List permissions
*RolesApi* | [**listRolePermissions**](RolesApi.md#listRolePermissions) | **GET** /api/v2/roles/{role_id}/permissions | List permissions for a role
*RolesApi* | [**listRoleUsers**](RolesApi.md#listRoleUsers) | **GET** /api/v2/roles/{role_id}/users | Get all users of a role
*RolesApi* | [**listRoles**](RolesApi.md#listRoles) | **GET** /api/v2/roles | List roles
*RolesApi* | [**removePermissionFromRole**](RolesApi.md#removePermissionFromRole) | **DELETE** /api/v2/roles/{role_id}/permissions | Revoke permission
*RolesApi* | [**removeUserFromRole**](RolesApi.md#removeUserFromRole) | **DELETE** /api/v2/roles/{role_id}/users | Remove a user from a role
*RolesApi* | [**updateRole**](RolesApi.md#updateRole) | **PATCH** /api/v2/roles/{role_id} | Update a role
*SecurityMonitoringApi* | [**createSecurityFilter**](SecurityMonitoringApi.md#createSecurityFilter) | **POST** /api/v2/security_monitoring/configuration/security_filters | Create a security filter
*SecurityMonitoringApi* | [**createSecurityMonitoringRule**](SecurityMonitoringApi.md#createSecurityMonitoringRule) | **POST** /api/v2/security_monitoring/rules | Create a detection rule
*SecurityMonitoringApi* | [**deleteSecurityFilter**](SecurityMonitoringApi.md#deleteSecurityFilter) | **DELETE** /api/v2/security_monitoring/configuration/security_filters/{security_filter_id} | Delete a security filter
*SecurityMonitoringApi* | [**deleteSecurityMonitoringRule**](SecurityMonitoringApi.md#deleteSecurityMonitoringRule) | **DELETE** /api/v2/security_monitoring/rules/{rule_id} | Delete an existing rule
*SecurityMonitoringApi* | [**getSecurityFilter**](SecurityMonitoringApi.md#getSecurityFilter) | **GET** /api/v2/security_monitoring/configuration/security_filters/{security_filter_id} | Get a security filter
*SecurityMonitoringApi* | [**getSecurityMonitoringRule**](SecurityMonitoringApi.md#getSecurityMonitoringRule) | **GET** /api/v2/security_monitoring/rules/{rule_id} | Get a rule&#39;s details
*SecurityMonitoringApi* | [**listSecurityFilters**](SecurityMonitoringApi.md#listSecurityFilters) | **GET** /api/v2/security_monitoring/configuration/security_filters | Get all security filters
*SecurityMonitoringApi* | [**listSecurityMonitoringRules**](SecurityMonitoringApi.md#listSecurityMonitoringRules) | **GET** /api/v2/security_monitoring/rules | List rules
*SecurityMonitoringApi* | [**listSecurityMonitoringSignals**](SecurityMonitoringApi.md#listSecurityMonitoringSignals) | **GET** /api/v2/security_monitoring/signals | Get a quick list of security signals
*SecurityMonitoringApi* | [**searchSecurityMonitoringSignals**](SecurityMonitoringApi.md#searchSecurityMonitoringSignals) | **POST** /api/v2/security_monitoring/signals/search | Get a list of security signals
*SecurityMonitoringApi* | [**updateSecurityFilter**](SecurityMonitoringApi.md#updateSecurityFilter) | **PATCH** /api/v2/security_monitoring/configuration/security_filters/{security_filter_id} | Update a security filter
*SecurityMonitoringApi* | [**updateSecurityMonitoringRule**](SecurityMonitoringApi.md#updateSecurityMonitoringRule) | **PUT** /api/v2/security_monitoring/rules/{rule_id} | Update an existing rule
*UsersApi* | [**createUser**](UsersApi.md#createUser) | **POST** /api/v2/users | Create a user
*UsersApi* | [**disableUser**](UsersApi.md#disableUser) | **DELETE** /api/v2/users/{user_id} | Disable a user
*UsersApi* | [**getInvitation**](UsersApi.md#getInvitation) | **GET** /api/v2/user_invitations/{user_invitation_uuid} | Get a user invitation
*UsersApi* | [**getUser**](UsersApi.md#getUser) | **GET** /api/v2/users/{user_id} | Get user details
*UsersApi* | [**listUserOrganizations**](UsersApi.md#listUserOrganizations) | **GET** /api/v2/users/{user_id}/orgs | Get a user organization
*UsersApi* | [**listUserPermissions**](UsersApi.md#listUserPermissions) | **GET** /api/v2/users/{user_id}/permissions | Get a user permissions
*UsersApi* | [**listUsers**](UsersApi.md#listUsers) | **GET** /api/v2/users | List all users
*UsersApi* | [**sendInvitations**](UsersApi.md#sendInvitations) | **POST** /api/v2/user_invitations | Send invitation emails
*UsersApi* | [**updateUser**](UsersApi.md#updateUser) | **PATCH** /api/v2/users/{user_id} | Update a user


## Documentation for Models

 - [APIErrorResponse](APIErrorResponse.md)
 - [APIKeyCreateAttributes](APIKeyCreateAttributes.md)
 - [APIKeyCreateData](APIKeyCreateData.md)
 - [APIKeyCreateRequest](APIKeyCreateRequest.md)
 - [APIKeyRelationships](APIKeyRelationships.md)
 - [APIKeyResponse](APIKeyResponse.md)
 - [APIKeyResponseIncludedItem](APIKeyResponseIncludedItem.md)
 - [APIKeyUpdateAttributes](APIKeyUpdateAttributes.md)
 - [APIKeyUpdateData](APIKeyUpdateData.md)
 - [APIKeyUpdateRequest](APIKeyUpdateRequest.md)
 - [APIKeysResponse](APIKeysResponse.md)
 - [APIKeysSort](APIKeysSort.md)
 - [APIKeysType](APIKeysType.md)
 - [ApplicationKeyCreateAttributes](ApplicationKeyCreateAttributes.md)
 - [ApplicationKeyCreateData](ApplicationKeyCreateData.md)
 - [ApplicationKeyCreateRequest](ApplicationKeyCreateRequest.md)
 - [ApplicationKeyRelationships](ApplicationKeyRelationships.md)
 - [ApplicationKeyResponse](ApplicationKeyResponse.md)
 - [ApplicationKeyResponseIncludedItem](ApplicationKeyResponseIncludedItem.md)
 - [ApplicationKeyUpdateAttributes](ApplicationKeyUpdateAttributes.md)
 - [ApplicationKeyUpdateData](ApplicationKeyUpdateData.md)
 - [ApplicationKeyUpdateRequest](ApplicationKeyUpdateRequest.md)
 - [ApplicationKeysSort](ApplicationKeysSort.md)
 - [ApplicationKeysType](ApplicationKeysType.md)
 - [Creator](Creator.md)
 - [DashboardListAddItemsRequest](DashboardListAddItemsRequest.md)
 - [DashboardListAddItemsResponse](DashboardListAddItemsResponse.md)
 - [DashboardListDeleteItemsRequest](DashboardListDeleteItemsRequest.md)
 - [DashboardListDeleteItemsResponse](DashboardListDeleteItemsResponse.md)
 - [DashboardListItem](DashboardListItem.md)
 - [DashboardListItemRequest](DashboardListItemRequest.md)
 - [DashboardListItemResponse](DashboardListItemResponse.md)
 - [DashboardListItems](DashboardListItems.md)
 - [DashboardListUpdateItemsRequest](DashboardListUpdateItemsRequest.md)
 - [DashboardListUpdateItemsResponse](DashboardListUpdateItemsResponse.md)
 - [DashboardType](DashboardType.md)
 - [FullAPIKey](FullAPIKey.md)
 - [FullAPIKeyAttributes](FullAPIKeyAttributes.md)
 - [FullApplicationKey](FullApplicationKey.md)
 - [FullApplicationKeyAttributes](FullApplicationKeyAttributes.md)
 - [IncidentCreateAttributes](IncidentCreateAttributes.md)
 - [IncidentCreateData](IncidentCreateData.md)
 - [IncidentCreateRelationships](IncidentCreateRelationships.md)
 - [IncidentCreateRequest](IncidentCreateRequest.md)
 - [IncidentFieldAttributes](IncidentFieldAttributes.md)
 - [IncidentFieldAttributesMultipleValue](IncidentFieldAttributesMultipleValue.md)
 - [IncidentFieldAttributesSingleValue](IncidentFieldAttributesSingleValue.md)
 - [IncidentFieldAttributesSingleValueType](IncidentFieldAttributesSingleValueType.md)
 - [IncidentFieldAttributesValueType](IncidentFieldAttributesValueType.md)
 - [IncidentIntegrationMetadataType](IncidentIntegrationMetadataType.md)
 - [IncidentPostmortemType](IncidentPostmortemType.md)
 - [IncidentRelatedObject](IncidentRelatedObject.md)
 - [IncidentResponse](IncidentResponse.md)
 - [IncidentResponseAttributes](IncidentResponseAttributes.md)
 - [IncidentResponseData](IncidentResponseData.md)
 - [IncidentResponseIncludedItem](IncidentResponseIncludedItem.md)
 - [IncidentResponseRelationships](IncidentResponseRelationships.md)
 - [IncidentServiceCreateAttributes](IncidentServiceCreateAttributes.md)
 - [IncidentServiceCreateData](IncidentServiceCreateData.md)
 - [IncidentServiceCreateRequest](IncidentServiceCreateRequest.md)
 - [IncidentServiceIncludedItems](IncidentServiceIncludedItems.md)
 - [IncidentServiceRelationships](IncidentServiceRelationships.md)
 - [IncidentServiceResponse](IncidentServiceResponse.md)
 - [IncidentServiceResponseAttributes](IncidentServiceResponseAttributes.md)
 - [IncidentServiceResponseData](IncidentServiceResponseData.md)
 - [IncidentServiceType](IncidentServiceType.md)
 - [IncidentServiceUpdateAttributes](IncidentServiceUpdateAttributes.md)
 - [IncidentServiceUpdateData](IncidentServiceUpdateData.md)
 - [IncidentServiceUpdateRequest](IncidentServiceUpdateRequest.md)
 - [IncidentServicesResponse](IncidentServicesResponse.md)
 - [IncidentServicesResponseMeta](IncidentServicesResponseMeta.md)
 - [IncidentServicesResponseMetaPagination](IncidentServicesResponseMetaPagination.md)
 - [IncidentTeamCreateAttributes](IncidentTeamCreateAttributes.md)
 - [IncidentTeamCreateData](IncidentTeamCreateData.md)
 - [IncidentTeamCreateRequest](IncidentTeamCreateRequest.md)
 - [IncidentTeamIncludedItems](IncidentTeamIncludedItems.md)
 - [IncidentTeamRelationships](IncidentTeamRelationships.md)
 - [IncidentTeamResponse](IncidentTeamResponse.md)
 - [IncidentTeamResponseAttributes](IncidentTeamResponseAttributes.md)
 - [IncidentTeamResponseData](IncidentTeamResponseData.md)
 - [IncidentTeamType](IncidentTeamType.md)
 - [IncidentTeamUpdateAttributes](IncidentTeamUpdateAttributes.md)
 - [IncidentTeamUpdateData](IncidentTeamUpdateData.md)
 - [IncidentTeamUpdateRequest](IncidentTeamUpdateRequest.md)
 - [IncidentTeamsResponse](IncidentTeamsResponse.md)
 - [IncidentTimelineCellCreateAttributes](IncidentTimelineCellCreateAttributes.md)
 - [IncidentTimelineCellMarkdownContentType](IncidentTimelineCellMarkdownContentType.md)
 - [IncidentTimelineCellMarkdownCreateAttributes](IncidentTimelineCellMarkdownCreateAttributes.md)
 - [IncidentTimelineCellMarkdownCreateAttributesContent](IncidentTimelineCellMarkdownCreateAttributesContent.md)
 - [IncidentType](IncidentType.md)
 - [IncidentUpdateAttributes](IncidentUpdateAttributes.md)
 - [IncidentUpdateData](IncidentUpdateData.md)
 - [IncidentUpdateRelationships](IncidentUpdateRelationships.md)
 - [IncidentUpdateRequest](IncidentUpdateRequest.md)
 - [IncidentsResponse](IncidentsResponse.md)
 - [ListApplicationKeysResponse](ListApplicationKeysResponse.md)
 - [Log](Log.md)
 - [LogAttributes](LogAttributes.md)
 - [LogType](LogType.md)
 - [LogsAggregateBucket](LogsAggregateBucket.md)
 - [LogsAggregateBucketValue](LogsAggregateBucketValue.md)
 - [LogsAggregateBucketValueTimeseries](LogsAggregateBucketValueTimeseries.md)
 - [LogsAggregateBucketValueTimeseriesPoint](LogsAggregateBucketValueTimeseriesPoint.md)
 - [LogsAggregateRequest](LogsAggregateRequest.md)
 - [LogsAggregateRequestPage](LogsAggregateRequestPage.md)
 - [LogsAggregateResponse](LogsAggregateResponse.md)
 - [LogsAggregateResponseData](LogsAggregateResponseData.md)
 - [LogsAggregateResponseStatus](LogsAggregateResponseStatus.md)
 - [LogsAggregateSort](LogsAggregateSort.md)
 - [LogsAggregateSortType](LogsAggregateSortType.md)
 - [LogsAggregationFunction](LogsAggregationFunction.md)
 - [LogsArchive](LogsArchive.md)
 - [LogsArchiveAttributes](LogsArchiveAttributes.md)
 - [LogsArchiveCreateRequest](LogsArchiveCreateRequest.md)
 - [LogsArchiveCreateRequestAttributes](LogsArchiveCreateRequestAttributes.md)
 - [LogsArchiveCreateRequestDefinition](LogsArchiveCreateRequestDefinition.md)
 - [LogsArchiveCreateRequestDestination](LogsArchiveCreateRequestDestination.md)
 - [LogsArchiveDefinition](LogsArchiveDefinition.md)
 - [LogsArchiveDestination](LogsArchiveDestination.md)
 - [LogsArchiveDestinationAzure](LogsArchiveDestinationAzure.md)
 - [LogsArchiveDestinationAzureType](LogsArchiveDestinationAzureType.md)
 - [LogsArchiveDestinationGCS](LogsArchiveDestinationGCS.md)
 - [LogsArchiveDestinationGCSType](LogsArchiveDestinationGCSType.md)
 - [LogsArchiveDestinationS3](LogsArchiveDestinationS3.md)
 - [LogsArchiveDestinationS3Type](LogsArchiveDestinationS3Type.md)
 - [LogsArchiveIntegrationAzure](LogsArchiveIntegrationAzure.md)
 - [LogsArchiveIntegrationGCS](LogsArchiveIntegrationGCS.md)
 - [LogsArchiveIntegrationS3](LogsArchiveIntegrationS3.md)
 - [LogsArchiveOrder](LogsArchiveOrder.md)
 - [LogsArchiveOrderAttributes](LogsArchiveOrderAttributes.md)
 - [LogsArchiveOrderDefinition](LogsArchiveOrderDefinition.md)
 - [LogsArchiveOrderDefinitionType](LogsArchiveOrderDefinitionType.md)
 - [LogsArchiveState](LogsArchiveState.md)
 - [LogsArchives](LogsArchives.md)
 - [LogsCompute](LogsCompute.md)
 - [LogsComputeType](LogsComputeType.md)
 - [LogsGroupBy](LogsGroupBy.md)
 - [LogsGroupByHistogram](LogsGroupByHistogram.md)
 - [LogsGroupByMissing](LogsGroupByMissing.md)
 - [LogsGroupByTotal](LogsGroupByTotal.md)
 - [LogsListRequest](LogsListRequest.md)
 - [LogsListRequestPage](LogsListRequestPage.md)
 - [LogsListResponse](LogsListResponse.md)
 - [LogsListResponseLinks](LogsListResponseLinks.md)
 - [LogsMetricCompute](LogsMetricCompute.md)
 - [LogsMetricComputeAggregationType](LogsMetricComputeAggregationType.md)
 - [LogsMetricCreateAttributes](LogsMetricCreateAttributes.md)
 - [LogsMetricCreateData](LogsMetricCreateData.md)
 - [LogsMetricCreateRequest](LogsMetricCreateRequest.md)
 - [LogsMetricFilter](LogsMetricFilter.md)
 - [LogsMetricGroupBy](LogsMetricGroupBy.md)
 - [LogsMetricResponse](LogsMetricResponse.md)
 - [LogsMetricResponseAttributes](LogsMetricResponseAttributes.md)
 - [LogsMetricResponseCompute](LogsMetricResponseCompute.md)
 - [LogsMetricResponseComputeAggregationType](LogsMetricResponseComputeAggregationType.md)
 - [LogsMetricResponseData](LogsMetricResponseData.md)
 - [LogsMetricResponseFilter](LogsMetricResponseFilter.md)
 - [LogsMetricResponseGroupBy](LogsMetricResponseGroupBy.md)
 - [LogsMetricType](LogsMetricType.md)
 - [LogsMetricUpdateAttributes](LogsMetricUpdateAttributes.md)
 - [LogsMetricUpdateData](LogsMetricUpdateData.md)
 - [LogsMetricUpdateRequest](LogsMetricUpdateRequest.md)
 - [LogsMetricsResponse](LogsMetricsResponse.md)
 - [LogsQueryFilter](LogsQueryFilter.md)
 - [LogsQueryOptions](LogsQueryOptions.md)
 - [LogsResponseMetadata](LogsResponseMetadata.md)
 - [LogsResponseMetadataPage](LogsResponseMetadataPage.md)
 - [LogsSort](LogsSort.md)
 - [LogsSortOrder](LogsSortOrder.md)
 - [LogsWarning](LogsWarning.md)
 - [Metric](Metric.md)
 - [MetricAllTags](MetricAllTags.md)
 - [MetricAllTagsAttributes](MetricAllTagsAttributes.md)
 - [MetricAllTagsResponse](MetricAllTagsResponse.md)
 - [MetricDistinctVolume](MetricDistinctVolume.md)
 - [MetricDistinctVolumeAttributes](MetricDistinctVolumeAttributes.md)
 - [MetricDistinctVolumeType](MetricDistinctVolumeType.md)
 - [MetricIngestedIndexedVolume](MetricIngestedIndexedVolume.md)
 - [MetricIngestedIndexedVolumeAttributes](MetricIngestedIndexedVolumeAttributes.md)
 - [MetricIngestedIndexedVolumeType](MetricIngestedIndexedVolumeType.md)
 - [MetricTagConfiguration](MetricTagConfiguration.md)
 - [MetricTagConfigurationAttributes](MetricTagConfigurationAttributes.md)
 - [MetricTagConfigurationCreateAttributes](MetricTagConfigurationCreateAttributes.md)
 - [MetricTagConfigurationCreateData](MetricTagConfigurationCreateData.md)
 - [MetricTagConfigurationCreateRequest](MetricTagConfigurationCreateRequest.md)
 - [MetricTagConfigurationMetricTypes](MetricTagConfigurationMetricTypes.md)
 - [MetricTagConfigurationResponse](MetricTagConfigurationResponse.md)
 - [MetricTagConfigurationType](MetricTagConfigurationType.md)
 - [MetricTagConfigurationUpdateAttributes](MetricTagConfigurationUpdateAttributes.md)
 - [MetricTagConfigurationUpdateData](MetricTagConfigurationUpdateData.md)
 - [MetricTagConfigurationUpdateRequest](MetricTagConfigurationUpdateRequest.md)
 - [MetricType](MetricType.md)
 - [MetricVolumes](MetricVolumes.md)
 - [MetricVolumesResponse](MetricVolumesResponse.md)
 - [MetricsAndMetricTagConfigurations](MetricsAndMetricTagConfigurations.md)
 - [MetricsAndMetricTagConfigurationsResponse](MetricsAndMetricTagConfigurationsResponse.md)
 - [Organization](Organization.md)
 - [OrganizationAttributes](OrganizationAttributes.md)
 - [OrganizationsType](OrganizationsType.md)
 - [Pagination](Pagination.md)
 - [PartialAPIKey](PartialAPIKey.md)
 - [PartialAPIKeyAttributes](PartialAPIKeyAttributes.md)
 - [PartialApplicationKey](PartialApplicationKey.md)
 - [PartialApplicationKeyAttributes](PartialApplicationKeyAttributes.md)
 - [Permission](Permission.md)
 - [PermissionAttributes](PermissionAttributes.md)
 - [PermissionsResponse](PermissionsResponse.md)
 - [PermissionsType](PermissionsType.md)
 - [ProcessSummariesMeta](ProcessSummariesMeta.md)
 - [ProcessSummariesMetaPage](ProcessSummariesMetaPage.md)
 - [ProcessSummariesResponse](ProcessSummariesResponse.md)
 - [ProcessSummary](ProcessSummary.md)
 - [ProcessSummaryAttributes](ProcessSummaryAttributes.md)
 - [ProcessSummaryType](ProcessSummaryType.md)
 - [QuerySortOrder](QuerySortOrder.md)
 - [RelationshipToIncidentIntegrationMetadataData](RelationshipToIncidentIntegrationMetadataData.md)
 - [RelationshipToIncidentIntegrationMetadatas](RelationshipToIncidentIntegrationMetadatas.md)
 - [RelationshipToIncidentPostmortem](RelationshipToIncidentPostmortem.md)
 - [RelationshipToIncidentPostmortemData](RelationshipToIncidentPostmortemData.md)
 - [RelationshipToOrganization](RelationshipToOrganization.md)
 - [RelationshipToOrganizationData](RelationshipToOrganizationData.md)
 - [RelationshipToOrganizations](RelationshipToOrganizations.md)
 - [RelationshipToPermission](RelationshipToPermission.md)
 - [RelationshipToPermissionData](RelationshipToPermissionData.md)
 - [RelationshipToPermissions](RelationshipToPermissions.md)
 - [RelationshipToRole](RelationshipToRole.md)
 - [RelationshipToRoleData](RelationshipToRoleData.md)
 - [RelationshipToRoles](RelationshipToRoles.md)
 - [RelationshipToUser](RelationshipToUser.md)
 - [RelationshipToUserData](RelationshipToUserData.md)
 - [RelationshipToUsers](RelationshipToUsers.md)
 - [ResponseMetaAttributes](ResponseMetaAttributes.md)
 - [Role](Role.md)
 - [RoleAttributes](RoleAttributes.md)
 - [RoleCreateAttributes](RoleCreateAttributes.md)
 - [RoleCreateData](RoleCreateData.md)
 - [RoleCreateRequest](RoleCreateRequest.md)
 - [RoleCreateResponse](RoleCreateResponse.md)
 - [RoleCreateResponseData](RoleCreateResponseData.md)
 - [RoleRelationships](RoleRelationships.md)
 - [RoleResponse](RoleResponse.md)
 - [RoleResponseRelationships](RoleResponseRelationships.md)
 - [RoleUpdateAttributes](RoleUpdateAttributes.md)
 - [RoleUpdateData](RoleUpdateData.md)
 - [RoleUpdateRequest](RoleUpdateRequest.md)
 - [RoleUpdateResponse](RoleUpdateResponse.md)
 - [RoleUpdateResponseData](RoleUpdateResponseData.md)
 - [RolesResponse](RolesResponse.md)
 - [RolesSort](RolesSort.md)
 - [RolesType](RolesType.md)
 - [SecurityFilter](SecurityFilter.md)
 - [SecurityFilterAttributes](SecurityFilterAttributes.md)
 - [SecurityFilterCreateAttributes](SecurityFilterCreateAttributes.md)
 - [SecurityFilterCreateData](SecurityFilterCreateData.md)
 - [SecurityFilterCreateRequest](SecurityFilterCreateRequest.md)
 - [SecurityFilterDeleteResponse](SecurityFilterDeleteResponse.md)
 - [SecurityFilterExclusionFilter](SecurityFilterExclusionFilter.md)
 - [SecurityFilterExclusionFilterResponse](SecurityFilterExclusionFilterResponse.md)
 - [SecurityFilterFilteredDataType](SecurityFilterFilteredDataType.md)
 - [SecurityFilterMeta](SecurityFilterMeta.md)
 - [SecurityFilterResponse](SecurityFilterResponse.md)
 - [SecurityFilterType](SecurityFilterType.md)
 - [SecurityFilterUpdateAttributes](SecurityFilterUpdateAttributes.md)
 - [SecurityFilterUpdateData](SecurityFilterUpdateData.md)
 - [SecurityFilterUpdateRequest](SecurityFilterUpdateRequest.md)
 - [SecurityFiltersResponse](SecurityFiltersResponse.md)
 - [SecurityMonitoringFilter](SecurityMonitoringFilter.md)
 - [SecurityMonitoringFilterAction](SecurityMonitoringFilterAction.md)
 - [SecurityMonitoringListRulesResponse](SecurityMonitoringListRulesResponse.md)
 - [SecurityMonitoringRuleCase](SecurityMonitoringRuleCase.md)
 - [SecurityMonitoringRuleCaseCreate](SecurityMonitoringRuleCaseCreate.md)
 - [SecurityMonitoringRuleCreatePayload](SecurityMonitoringRuleCreatePayload.md)
 - [SecurityMonitoringRuleDetectionMethod](SecurityMonitoringRuleDetectionMethod.md)
 - [SecurityMonitoringRuleEvaluationWindow](SecurityMonitoringRuleEvaluationWindow.md)
 - [SecurityMonitoringRuleKeepAlive](SecurityMonitoringRuleKeepAlive.md)
 - [SecurityMonitoringRuleMaxSignalDuration](SecurityMonitoringRuleMaxSignalDuration.md)
 - [SecurityMonitoringRuleNewValueOptions](SecurityMonitoringRuleNewValueOptions.md)
 - [SecurityMonitoringRuleNewValueOptionsForgetAfter](SecurityMonitoringRuleNewValueOptionsForgetAfter.md)
 - [SecurityMonitoringRuleNewValueOptionsLearningDuration](SecurityMonitoringRuleNewValueOptionsLearningDuration.md)
 - [SecurityMonitoringRuleOptions](SecurityMonitoringRuleOptions.md)
 - [SecurityMonitoringRuleQuery](SecurityMonitoringRuleQuery.md)
 - [SecurityMonitoringRuleQueryAggregation](SecurityMonitoringRuleQueryAggregation.md)
 - [SecurityMonitoringRuleQueryCreate](SecurityMonitoringRuleQueryCreate.md)
 - [SecurityMonitoringRuleResponse](SecurityMonitoringRuleResponse.md)
 - [SecurityMonitoringRuleSeverity](SecurityMonitoringRuleSeverity.md)
 - [SecurityMonitoringRuleUpdatePayload](SecurityMonitoringRuleUpdatePayload.md)
 - [SecurityMonitoringRuntimeAgentRule](SecurityMonitoringRuntimeAgentRule.md)
 - [SecurityMonitoringSignal](SecurityMonitoringSignal.md)
 - [SecurityMonitoringSignalAttributes](SecurityMonitoringSignalAttributes.md)
 - [SecurityMonitoringSignalListRequest](SecurityMonitoringSignalListRequest.md)
 - [SecurityMonitoringSignalListRequestFilter](SecurityMonitoringSignalListRequestFilter.md)
 - [SecurityMonitoringSignalListRequestPage](SecurityMonitoringSignalListRequestPage.md)
 - [SecurityMonitoringSignalType](SecurityMonitoringSignalType.md)
 - [SecurityMonitoringSignalsListResponse](SecurityMonitoringSignalsListResponse.md)
 - [SecurityMonitoringSignalsListResponseLinks](SecurityMonitoringSignalsListResponseLinks.md)
 - [SecurityMonitoringSignalsListResponseMeta](SecurityMonitoringSignalsListResponseMeta.md)
 - [SecurityMonitoringSignalsListResponseMetaPage](SecurityMonitoringSignalsListResponseMetaPage.md)
 - [SecurityMonitoringSignalsSort](SecurityMonitoringSignalsSort.md)
 - [User](User.md)
 - [UserAttributes](UserAttributes.md)
 - [UserCreateAttributes](UserCreateAttributes.md)
 - [UserCreateData](UserCreateData.md)
 - [UserCreateRequest](UserCreateRequest.md)
 - [UserInvitationData](UserInvitationData.md)
 - [UserInvitationDataAttributes](UserInvitationDataAttributes.md)
 - [UserInvitationRelationships](UserInvitationRelationships.md)
 - [UserInvitationResponse](UserInvitationResponse.md)
 - [UserInvitationResponseData](UserInvitationResponseData.md)
 - [UserInvitationsRequest](UserInvitationsRequest.md)
 - [UserInvitationsResponse](UserInvitationsResponse.md)
 - [UserInvitationsType](UserInvitationsType.md)
 - [UserRelationships](UserRelationships.md)
 - [UserResponse](UserResponse.md)
 - [UserResponseIncludedItem](UserResponseIncludedItem.md)
 - [UserResponseRelationships](UserResponseRelationships.md)
 - [UserUpdateAttributes](UserUpdateAttributes.md)
 - [UserUpdateData](UserUpdateData.md)
 - [UserUpdateRequest](UserUpdateRequest.md)
 - [UsersResponse](UsersResponse.md)
 - [UsersType](UsersType.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKeyAuth


- **Type**: API key
- **API key parameter name**: DD-API-KEY
- **Location**: HTTP header

### appKeyAuth


- **Type**: API key
- **API key parameter name**: DD-APPLICATION-KEY
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

support@datadoghq.com

