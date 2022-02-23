## Documentation for API Endpoints

All URIs are relative to *https://api.datadoghq.com*

| Class                      | Method                                                                                                       | HTTP request                                                                               | Description                                        |
| -------------------------- | ------------------------------------------------------------------------------------------------------------ | ------------------------------------------------------------------------------------------ | -------------------------------------------------- |
| _AuthNMappingsApi_         | [**createAuthNMapping**](AuthNMappingsApi.md#createAuthNMapping)                                             | **POST** /api/v2/authn_mappings                                                            | Create an AuthN Mapping                            |
| _AuthNMappingsApi_         | [**deleteAuthNMapping**](AuthNMappingsApi.md#deleteAuthNMapping)                                             | **DELETE** /api/v2/authn_mappings/{authn_mapping_id}                                       | Delete an AuthN Mapping                            |
| _AuthNMappingsApi_         | [**getAuthNMapping**](AuthNMappingsApi.md#getAuthNMapping)                                                   | **GET** /api/v2/authn_mappings/{authn_mapping_id}                                          | Get an AuthN Mapping by UUID                       |
| _AuthNMappingsApi_         | [**listAuthNMappings**](AuthNMappingsApi.md#listAuthNMappings)                                               | **GET** /api/v2/authn_mappings                                                             | List all AuthN Mappings                            |
| _AuthNMappingsApi_         | [**updateAuthNMapping**](AuthNMappingsApi.md#updateAuthNMapping)                                             | **PATCH** /api/v2/authn_mappings/{authn_mapping_id}                                        | Edit an AuthN Mapping                              |
| _CloudWorkloadSecurityApi_ | [**createCloudWorkloadSecurityAgentRule**](CloudWorkloadSecurityApi.md#createCloudWorkloadSecurityAgentRule) | **POST** /api/v2/security_monitoring/cloud_workload_security/agent_rules                   | Create a Cloud Workload Security Agent rule        |
| _CloudWorkloadSecurityApi_ | [**deleteCloudWorkloadSecurityAgentRule**](CloudWorkloadSecurityApi.md#deleteCloudWorkloadSecurityAgentRule) | **DELETE** /api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id} | Delete a Cloud Workload Security Agent rule        |
| _CloudWorkloadSecurityApi_ | [**downloadCloudWorkloadPolicyFile**](CloudWorkloadSecurityApi.md#downloadCloudWorkloadPolicyFile)           | **GET** /api/v2/security/cloud_workload/policy/download                                    | Get the latest Cloud Workload Security policy      |
| _CloudWorkloadSecurityApi_ | [**getCloudWorkloadSecurityAgentRule**](CloudWorkloadSecurityApi.md#getCloudWorkloadSecurityAgentRule)       | **GET** /api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}    | Get a Cloud Workload Security Agent rule           |
| _CloudWorkloadSecurityApi_ | [**listCloudWorkloadSecurityAgentRules**](CloudWorkloadSecurityApi.md#listCloudWorkloadSecurityAgentRules)   | **GET** /api/v2/security_monitoring/cloud_workload_security/agent_rules                    | Get all Cloud Workload Security Agent rules        |
| _CloudWorkloadSecurityApi_ | [**updateCloudWorkloadSecurityAgentRule**](CloudWorkloadSecurityApi.md#updateCloudWorkloadSecurityAgentRule) | **PATCH** /api/v2/security_monitoring/cloud_workload_security/agent_rules/{agent_rule_id}  | Update a Cloud Workload Security Agent rule        |
| _DashboardListsApi_        | [**createDashboardListItems**](DashboardListsApi.md#createDashboardListItems)                                | **POST** /api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards                     | Add Items to a Dashboard List                      |
| _DashboardListsApi_        | [**deleteDashboardListItems**](DashboardListsApi.md#deleteDashboardListItems)                                | **DELETE** /api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards                   | Delete items from a dashboard list                 |
| _DashboardListsApi_        | [**getDashboardListItems**](DashboardListsApi.md#getDashboardListItems)                                      | **GET** /api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards                      | Get items of a Dashboard List                      |
| _DashboardListsApi_        | [**updateDashboardListItems**](DashboardListsApi.md#updateDashboardListItems)                                | **PUT** /api/v2/dashboard/lists/manual/{dashboard_list_id}/dashboards                      | Update items of a dashboard list                   |
| _IncidentServicesApi_      | [**createIncidentService**](IncidentServicesApi.md#createIncidentService)                                    | **POST** /api/v2/services                                                                  | Create a new incident service                      |
| _IncidentServicesApi_      | [**deleteIncidentService**](IncidentServicesApi.md#deleteIncidentService)                                    | **DELETE** /api/v2/services/{service_id}                                                   | Delete an existing incident service                |
| _IncidentServicesApi_      | [**getIncidentService**](IncidentServicesApi.md#getIncidentService)                                          | **GET** /api/v2/services/{service_id}                                                      | Get details of an incident service                 |
| _IncidentServicesApi_      | [**listIncidentServices**](IncidentServicesApi.md#listIncidentServices)                                      | **GET** /api/v2/services                                                                   | Get a list of all incident services                |
| _IncidentServicesApi_      | [**updateIncidentService**](IncidentServicesApi.md#updateIncidentService)                                    | **PATCH** /api/v2/services/{service_id}                                                    | Update an existing incident service                |
| _IncidentTeamsApi_         | [**createIncidentTeam**](IncidentTeamsApi.md#createIncidentTeam)                                             | **POST** /api/v2/teams                                                                     | Create a new incident team                         |
| _IncidentTeamsApi_         | [**deleteIncidentTeam**](IncidentTeamsApi.md#deleteIncidentTeam)                                             | **DELETE** /api/v2/teams/{team_id}                                                         | Delete an existing incident team                   |
| _IncidentTeamsApi_         | [**getIncidentTeam**](IncidentTeamsApi.md#getIncidentTeam)                                                   | **GET** /api/v2/teams/{team_id}                                                            | Get details of an incident team                    |
| _IncidentTeamsApi_         | [**listIncidentTeams**](IncidentTeamsApi.md#listIncidentTeams)                                               | **GET** /api/v2/teams                                                                      | Get a list of all incident teams                   |
| _IncidentTeamsApi_         | [**updateIncidentTeam**](IncidentTeamsApi.md#updateIncidentTeam)                                             | **PATCH** /api/v2/teams/{team_id}                                                          | Update an existing incident team                   |
| _IncidentsApi_             | [**createIncident**](IncidentsApi.md#createIncident)                                                         | **POST** /api/v2/incidents                                                                 | Create an incident                                 |
| _IncidentsApi_             | [**deleteIncident**](IncidentsApi.md#deleteIncident)                                                         | **DELETE** /api/v2/incidents/{incident_id}                                                 | Delete an existing incident                        |
| _IncidentsApi_             | [**getIncident**](IncidentsApi.md#getIncident)                                                               | **GET** /api/v2/incidents/{incident_id}                                                    | Get the details of an incident                     |
| _IncidentsApi_             | [**listIncidents**](IncidentsApi.md#listIncidents)                                                           | **GET** /api/v2/incidents                                                                  | Get a list of incidents                            |
| _IncidentsApi_             | [**updateIncident**](IncidentsApi.md#updateIncident)                                                         | **PATCH** /api/v2/incidents/{incident_id}                                                  | Update an existing incident                        |
| _KeyManagementApi_         | [**createAPIKey**](KeyManagementApi.md#createAPIKey)                                                         | **POST** /api/v2/api_keys                                                                  | Create an API key                                  |
| _KeyManagementApi_         | [**createCurrentUserApplicationKey**](KeyManagementApi.md#createCurrentUserApplicationKey)                   | **POST** /api/v2/current_user/application_keys                                             | Create an application key for current user         |
| _KeyManagementApi_         | [**deleteAPIKey**](KeyManagementApi.md#deleteAPIKey)                                                         | **DELETE** /api/v2/api_keys/{api_key_id}                                                   | Delete an API key                                  |
| _KeyManagementApi_         | [**deleteApplicationKey**](KeyManagementApi.md#deleteApplicationKey)                                         | **DELETE** /api/v2/application_keys/{app_key_id}                                           | Delete an application key                          |
| _KeyManagementApi_         | [**deleteCurrentUserApplicationKey**](KeyManagementApi.md#deleteCurrentUserApplicationKey)                   | **DELETE** /api/v2/current_user/application_keys/{app_key_id}                              | Delete an application key owned by current user    |
| _KeyManagementApi_         | [**getAPIKey**](KeyManagementApi.md#getAPIKey)                                                               | **GET** /api/v2/api_keys/{api_key_id}                                                      | Get API key                                        |
| _KeyManagementApi_         | [**getApplicationKey**](KeyManagementApi.md#getApplicationKey)                                               | **GET** /api/v2/application_keys/{app_key_id}                                              | Get an application key                             |
| _KeyManagementApi_         | [**getCurrentUserApplicationKey**](KeyManagementApi.md#getCurrentUserApplicationKey)                         | **GET** /api/v2/current_user/application_keys/{app_key_id}                                 | Get one application key owned by current user      |
| _KeyManagementApi_         | [**listAPIKeys**](KeyManagementApi.md#listAPIKeys)                                                           | **GET** /api/v2/api_keys                                                                   | Get all API keys                                   |
| _KeyManagementApi_         | [**listApplicationKeys**](KeyManagementApi.md#listApplicationKeys)                                           | **GET** /api/v2/application_keys                                                           | Get all application keys                           |
| _KeyManagementApi_         | [**listCurrentUserApplicationKeys**](KeyManagementApi.md#listCurrentUserApplicationKeys)                     | **GET** /api/v2/current_user/application_keys                                              | Get all application keys owned by current user     |
| _KeyManagementApi_         | [**updateAPIKey**](KeyManagementApi.md#updateAPIKey)                                                         | **PATCH** /api/v2/api_keys/{api_key_id}                                                    | Edit an API key                                    |
| _KeyManagementApi_         | [**updateApplicationKey**](KeyManagementApi.md#updateApplicationKey)                                         | **PATCH** /api/v2/application_keys/{app_key_id}                                            | Edit an application key                            |
| _KeyManagementApi_         | [**updateCurrentUserApplicationKey**](KeyManagementApi.md#updateCurrentUserApplicationKey)                   | **PATCH** /api/v2/current_user/application_keys/{app_key_id}                               | Edit an application key owned by current user      |
| _LogsApi_                  | [**aggregateLogs**](LogsApi.md#aggregateLogs)                                                                | **POST** /api/v2/logs/analytics/aggregate                                                  | Aggregate events                                   |
| _LogsApi_                  | [**listLogs**](LogsApi.md#listLogs)                                                                          | **POST** /api/v2/logs/events/search                                                        | Search logs                                        |
| _LogsApi_                  | [**listLogsGet**](LogsApi.md#listLogsGet)                                                                    | **GET** /api/v2/logs/events                                                                | Get a list of logs                                 |
| _LogsApi_                  | [**submitLog**](LogsApi.md#submitLog)                                                                        | **POST** /api/v2/logs                                                                      | Send logs                                          |
| _LogsArchivesApi_          | [**addReadRoleToArchive**](LogsArchivesApi.md#addReadRoleToArchive)                                          | **POST** /api/v2/logs/config/archives/{archive_id}/readers                                 | Grant role to an archive                           |
| _LogsArchivesApi_          | [**createLogsArchive**](LogsArchivesApi.md#createLogsArchive)                                                | **POST** /api/v2/logs/config/archives                                                      | Create an archive                                  |
| _LogsArchivesApi_          | [**deleteLogsArchive**](LogsArchivesApi.md#deleteLogsArchive)                                                | **DELETE** /api/v2/logs/config/archives/{archive_id}                                       | Delete an archive                                  |
| _LogsArchivesApi_          | [**getLogsArchive**](LogsArchivesApi.md#getLogsArchive)                                                      | **GET** /api/v2/logs/config/archives/{archive_id}                                          | Get an archive                                     |
| _LogsArchivesApi_          | [**getLogsArchiveOrder**](LogsArchivesApi.md#getLogsArchiveOrder)                                            | **GET** /api/v2/logs/config/archive-order                                                  | Get archive order                                  |
| _LogsArchivesApi_          | [**listArchiveReadRoles**](LogsArchivesApi.md#listArchiveReadRoles)                                          | **GET** /api/v2/logs/config/archives/{archive_id}/readers                                  | List read roles for an archive                     |
| _LogsArchivesApi_          | [**listLogsArchives**](LogsArchivesApi.md#listLogsArchives)                                                  | **GET** /api/v2/logs/config/archives                                                       | Get all archives                                   |
| _LogsArchivesApi_          | [**removeRoleFromArchive**](LogsArchivesApi.md#removeRoleFromArchive)                                        | **DELETE** /api/v2/logs/config/archives/{archive_id}/readers                               | Revoke role from an archive                        |
| _LogsArchivesApi_          | [**updateLogsArchive**](LogsArchivesApi.md#updateLogsArchive)                                                | **PUT** /api/v2/logs/config/archives/{archive_id}                                          | Update an archive                                  |
| _LogsArchivesApi_          | [**updateLogsArchiveOrder**](LogsArchivesApi.md#updateLogsArchiveOrder)                                      | **PUT** /api/v2/logs/config/archive-order                                                  | Update archive order                               |
| _LogsMetricsApi_           | [**createLogsMetric**](LogsMetricsApi.md#createLogsMetric)                                                   | **POST** /api/v2/logs/config/metrics                                                       | Create a log-based metric                          |
| _LogsMetricsApi_           | [**deleteLogsMetric**](LogsMetricsApi.md#deleteLogsMetric)                                                   | **DELETE** /api/v2/logs/config/metrics/{metric_id}                                         | Delete a log-based metric                          |
| _LogsMetricsApi_           | [**getLogsMetric**](LogsMetricsApi.md#getLogsMetric)                                                         | **GET** /api/v2/logs/config/metrics/{metric_id}                                            | Get a log-based metric                             |
| _LogsMetricsApi_           | [**listLogsMetrics**](LogsMetricsApi.md#listLogsMetrics)                                                     | **GET** /api/v2/logs/config/metrics                                                        | Get all log-based metrics                          |
| _LogsMetricsApi_           | [**updateLogsMetric**](LogsMetricsApi.md#updateLogsMetric)                                                   | **PATCH** /api/v2/logs/config/metrics/{metric_id}                                          | Update a log-based metric                          |
| _MetricsApi_               | [**createBulkTagsMetricsConfiguration**](MetricsApi.md#createBulkTagsMetricsConfiguration)                   | **POST** /api/v2/metrics/config/bulk-tags                                                  | Configure tags for multiple metrics                |
| _MetricsApi_               | [**createTagConfiguration**](MetricsApi.md#createTagConfiguration)                                           | **POST** /api/v2/metrics/{metric_name}/tags                                                | Create a tag configuration                         |
| _MetricsApi_               | [**deleteBulkTagsMetricsConfiguration**](MetricsApi.md#deleteBulkTagsMetricsConfiguration)                   | **DELETE** /api/v2/metrics/config/bulk-tags                                                | Configure tags for multiple metrics                |
| _MetricsApi_               | [**deleteTagConfiguration**](MetricsApi.md#deleteTagConfiguration)                                           | **DELETE** /api/v2/metrics/{metric_name}/tags                                              | Delete a tag configuration                         |
| _MetricsApi_               | [**listTagConfigurationByName**](MetricsApi.md#listTagConfigurationByName)                                   | **GET** /api/v2/metrics/{metric_name}/tags                                                 | List tag configuration by name                     |
| _MetricsApi_               | [**listTagConfigurations**](MetricsApi.md#listTagConfigurations)                                             | **GET** /api/v2/metrics                                                                    | List tag configurations                            |
| _MetricsApi_               | [**listTagsByMetricName**](MetricsApi.md#listTagsByMetricName)                                               | **GET** /api/v2/metrics/{metric_name}/all-tags                                             | List tags by metric name                           |
| _MetricsApi_               | [**listVolumesByMetricName**](MetricsApi.md#listVolumesByMetricName)                                         | **GET** /api/v2/metrics/{metric_name}/volumes                                              | List distinct metric volumes by metric name        |
| _MetricsApi_               | [**updateTagConfiguration**](MetricsApi.md#updateTagConfiguration)                                           | **PATCH** /api/v2/metrics/{metric_name}/tags                                               | Update a tag configuration                         |
| _ProcessesApi_             | [**listProcesses**](ProcessesApi.md#listProcesses)                                                           | **GET** /api/v2/processes                                                                  | Get all processes                                  |
| _RolesApi_                 | [**addPermissionToRole**](RolesApi.md#addPermissionToRole)                                                   | **POST** /api/v2/roles/{role_id}/permissions                                               | Grant permission to a role                         |
| _RolesApi_                 | [**addUserToRole**](RolesApi.md#addUserToRole)                                                               | **POST** /api/v2/roles/{role_id}/users                                                     | Add a user to a role                               |
| _RolesApi_                 | [**cloneRole**](RolesApi.md#cloneRole)                                                                       | **POST** /api/v2/roles/{role_id}/clone                                                     | Create a new role by cloning an existing role      |
| _RolesApi_                 | [**createRole**](RolesApi.md#createRole)                                                                     | **POST** /api/v2/roles                                                                     | Create role                                        |
| _RolesApi_                 | [**deleteRole**](RolesApi.md#deleteRole)                                                                     | **DELETE** /api/v2/roles/{role_id}                                                         | Delete role                                        |
| _RolesApi_                 | [**getRole**](RolesApi.md#getRole)                                                                           | **GET** /api/v2/roles/{role_id}                                                            | Get a role                                         |
| _RolesApi_                 | [**listPermissions**](RolesApi.md#listPermissions)                                                           | **GET** /api/v2/permissions                                                                | List permissions                                   |
| _RolesApi_                 | [**listRolePermissions**](RolesApi.md#listRolePermissions)                                                   | **GET** /api/v2/roles/{role_id}/permissions                                                | List permissions for a role                        |
| _RolesApi_                 | [**listRoleUsers**](RolesApi.md#listRoleUsers)                                                               | **GET** /api/v2/roles/{role_id}/users                                                      | Get all users of a role                            |
| _RolesApi_                 | [**listRoles**](RolesApi.md#listRoles)                                                                       | **GET** /api/v2/roles                                                                      | List roles                                         |
| _RolesApi_                 | [**removePermissionFromRole**](RolesApi.md#removePermissionFromRole)                                         | **DELETE** /api/v2/roles/{role_id}/permissions                                             | Revoke permission                                  |
| _RolesApi_                 | [**removeUserFromRole**](RolesApi.md#removeUserFromRole)                                                     | **DELETE** /api/v2/roles/{role_id}/users                                                   | Remove a user from a role                          |
| _RolesApi_                 | [**updateRole**](RolesApi.md#updateRole)                                                                     | **PATCH** /api/v2/roles/{role_id}                                                          | Update a role                                      |
| _SecurityMonitoringApi_    | [**createSecurityFilter**](SecurityMonitoringApi.md#createSecurityFilter)                                    | **POST** /api/v2/security_monitoring/configuration/security_filters                        | Create a security filter                           |
| _SecurityMonitoringApi_    | [**createSecurityMonitoringRule**](SecurityMonitoringApi.md#createSecurityMonitoringRule)                    | **POST** /api/v2/security_monitoring/rules                                                 | Create a detection rule                            |
| _SecurityMonitoringApi_    | [**deleteSecurityFilter**](SecurityMonitoringApi.md#deleteSecurityFilter)                                    | **DELETE** /api/v2/security_monitoring/configuration/security_filters/{security_filter_id} | Delete a security filter                           |
| _SecurityMonitoringApi_    | [**deleteSecurityMonitoringRule**](SecurityMonitoringApi.md#deleteSecurityMonitoringRule)                    | **DELETE** /api/v2/security_monitoring/rules/{rule_id}                                     | Delete an existing rule                            |
| _SecurityMonitoringApi_    | [**getSecurityFilter**](SecurityMonitoringApi.md#getSecurityFilter)                                          | **GET** /api/v2/security_monitoring/configuration/security_filters/{security_filter_id}    | Get a security filter                              |
| _SecurityMonitoringApi_    | [**getSecurityMonitoringRule**](SecurityMonitoringApi.md#getSecurityMonitoringRule)                          | **GET** /api/v2/security_monitoring/rules/{rule_id}                                        | Get a rule&#39;s details                           |
| _SecurityMonitoringApi_    | [**listSecurityFilters**](SecurityMonitoringApi.md#listSecurityFilters)                                      | **GET** /api/v2/security_monitoring/configuration/security_filters                         | Get all security filters                           |
| _SecurityMonitoringApi_    | [**listSecurityMonitoringRules**](SecurityMonitoringApi.md#listSecurityMonitoringRules)                      | **GET** /api/v2/security_monitoring/rules                                                  | List rules                                         |
| _SecurityMonitoringApi_    | [**listSecurityMonitoringSignals**](SecurityMonitoringApi.md#listSecurityMonitoringSignals)                  | **GET** /api/v2/security_monitoring/signals                                                | Get a quick list of security signals               |
| _SecurityMonitoringApi_    | [**searchSecurityMonitoringSignals**](SecurityMonitoringApi.md#searchSecurityMonitoringSignals)              | **POST** /api/v2/security_monitoring/signals/search                                        | Get a list of security signals                     |
| _SecurityMonitoringApi_    | [**updateSecurityFilter**](SecurityMonitoringApi.md#updateSecurityFilter)                                    | **PATCH** /api/v2/security_monitoring/configuration/security_filters/{security_filter_id}  | Update a security filter                           |
| _SecurityMonitoringApi_    | [**updateSecurityMonitoringRule**](SecurityMonitoringApi.md#updateSecurityMonitoringRule)                    | **PUT** /api/v2/security_monitoring/rules/{rule_id}                                        | Update an existing rule                            |
| _ServiceAccountsApi_       | [**createServiceAccountApplicationKey**](ServiceAccountsApi.md#createServiceAccountApplicationKey)           | **POST** /api/v2/service_accounts/{service_account_id}/application_keys                    | Create an application key for this service account |
| _ServiceAccountsApi_       | [**deleteServiceAccountApplicationKey**](ServiceAccountsApi.md#deleteServiceAccountApplicationKey)           | **DELETE** /api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}     | Delete an application key for this service account |
| _ServiceAccountsApi_       | [**getServiceAccountApplicationKey**](ServiceAccountsApi.md#getServiceAccountApplicationKey)                 | **GET** /api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}        | Get one application key for this service account   |
| _ServiceAccountsApi_       | [**listServiceAccountApplicationKeys**](ServiceAccountsApi.md#listServiceAccountApplicationKeys)             | **GET** /api/v2/service_accounts/{service_account_id}/application_keys                     | List application keys for this service account     |
| _ServiceAccountsApi_       | [**updateServiceAccountApplicationKey**](ServiceAccountsApi.md#updateServiceAccountApplicationKey)           | **PATCH** /api/v2/service_accounts/{service_account_id}/application_keys/{app_key_id}      | Edit an application key for this service account   |
| _UsersApi_                 | [**createServiceAccount**](UsersApi.md#createServiceAccount)                                                 | **POST** /api/v2/service_accounts                                                          | Create a service account                           |
| _UsersApi_                 | [**createUser**](UsersApi.md#createUser)                                                                     | **POST** /api/v2/users                                                                     | Create a user                                      |
| _UsersApi_                 | [**disableUser**](UsersApi.md#disableUser)                                                                   | **DELETE** /api/v2/users/{user_id}                                                         | Disable a user                                     |
| _UsersApi_                 | [**getInvitation**](UsersApi.md#getInvitation)                                                               | **GET** /api/v2/user_invitations/{user_invitation_uuid}                                    | Get a user invitation                              |
| _UsersApi_                 | [**getUser**](UsersApi.md#getUser)                                                                           | **GET** /api/v2/users/{user_id}                                                            | Get user details                                   |
| _UsersApi_                 | [**listUserOrganizations**](UsersApi.md#listUserOrganizations)                                               | **GET** /api/v2/users/{user_id}/orgs                                                       | Get a user organization                            |
| _UsersApi_                 | [**listUserPermissions**](UsersApi.md#listUserPermissions)                                                   | **GET** /api/v2/users/{user_id}/permissions                                                | Get a user permissions                             |
| _UsersApi_                 | [**listUsers**](UsersApi.md#listUsers)                                                                       | **GET** /api/v2/users                                                                      | List all users                                     |
| _UsersApi_                 | [**sendInvitations**](UsersApi.md#sendInvitations)                                                           | **POST** /api/v2/user_invitations                                                          | Send invitation emails                             |
| _UsersApi_                 | [**updateUser**](UsersApi.md#updateUser)                                                                     | **PATCH** /api/v2/users/{user_id}                                                          | Update a user                                      |

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
- [AuthNMapping](AuthNMapping.md)
- [AuthNMappingAttributes](AuthNMappingAttributes.md)
- [AuthNMappingCreateAttributes](AuthNMappingCreateAttributes.md)
- [AuthNMappingCreateData](AuthNMappingCreateData.md)
- [AuthNMappingCreateRelationships](AuthNMappingCreateRelationships.md)
- [AuthNMappingCreateRequest](AuthNMappingCreateRequest.md)
- [AuthNMappingIncluded](AuthNMappingIncluded.md)
- [AuthNMappingRelationships](AuthNMappingRelationships.md)
- [AuthNMappingResponse](AuthNMappingResponse.md)
- [AuthNMappingUpdateAttributes](AuthNMappingUpdateAttributes.md)
- [AuthNMappingUpdateData](AuthNMappingUpdateData.md)
- [AuthNMappingUpdateRelationships](AuthNMappingUpdateRelationships.md)
- [AuthNMappingUpdateRequest](AuthNMappingUpdateRequest.md)
- [AuthNMappingsResponse](AuthNMappingsResponse.md)
- [AuthNMappingsSort](AuthNMappingsSort.md)
- [AuthNMappingsType](AuthNMappingsType.md)
- [CloudWorkloadSecurityAgentRuleAttributes](CloudWorkloadSecurityAgentRuleAttributes.md)
- [CloudWorkloadSecurityAgentRuleCreateAttributes](CloudWorkloadSecurityAgentRuleCreateAttributes.md)
- [CloudWorkloadSecurityAgentRuleCreateData](CloudWorkloadSecurityAgentRuleCreateData.md)
- [CloudWorkloadSecurityAgentRuleCreateRequest](CloudWorkloadSecurityAgentRuleCreateRequest.md)
- [CloudWorkloadSecurityAgentRuleCreatorAttributes](CloudWorkloadSecurityAgentRuleCreatorAttributes.md)
- [CloudWorkloadSecurityAgentRuleData](CloudWorkloadSecurityAgentRuleData.md)
- [CloudWorkloadSecurityAgentRuleResponse](CloudWorkloadSecurityAgentRuleResponse.md)
- [CloudWorkloadSecurityAgentRuleType](CloudWorkloadSecurityAgentRuleType.md)
- [CloudWorkloadSecurityAgentRuleUpdateAttributes](CloudWorkloadSecurityAgentRuleUpdateAttributes.md)
- [CloudWorkloadSecurityAgentRuleUpdateData](CloudWorkloadSecurityAgentRuleUpdateData.md)
- [CloudWorkloadSecurityAgentRuleUpdateRequest](CloudWorkloadSecurityAgentRuleUpdateRequest.md)
- [CloudWorkloadSecurityAgentRuleUpdaterAttributes](CloudWorkloadSecurityAgentRuleUpdaterAttributes.md)
- [CloudWorkloadSecurityAgentRulesListResponse](CloudWorkloadSecurityAgentRulesListResponse.md)
- [ContentEncoding](ContentEncoding.md)
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
- [HTTPLogError](HTTPLogError.md)
- [HTTPLogErrors](HTTPLogErrors.md)
- [HTTPLogItem](HTTPLogItem.md)
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
- [IncidentNotificationHandle](IncidentNotificationHandle.md)
- [IncidentPostmortemType](IncidentPostmortemType.md)
- [IncidentRelatedObject](IncidentRelatedObject.md)
- [IncidentResponse](IncidentResponse.md)
- [IncidentResponseAttributes](IncidentResponseAttributes.md)
- [IncidentResponseData](IncidentResponseData.md)
- [IncidentResponseIncludedItem](IncidentResponseIncludedItem.md)
- [IncidentResponseMeta](IncidentResponseMeta.md)
- [IncidentResponseMetaPagination](IncidentResponseMetaPagination.md)
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
- [MetricBulkConfigureTagsType](MetricBulkConfigureTagsType.md)
- [MetricBulkTagConfigCreate](MetricBulkTagConfigCreate.md)
- [MetricBulkTagConfigCreateAttributes](MetricBulkTagConfigCreateAttributes.md)
- [MetricBulkTagConfigCreateRequest](MetricBulkTagConfigCreateRequest.md)
- [MetricBulkTagConfigDelete](MetricBulkTagConfigDelete.md)
- [MetricBulkTagConfigDeleteAttributes](MetricBulkTagConfigDeleteAttributes.md)
- [MetricBulkTagConfigDeleteRequest](MetricBulkTagConfigDeleteRequest.md)
- [MetricBulkTagConfigResponse](MetricBulkTagConfigResponse.md)
- [MetricBulkTagConfigStatus](MetricBulkTagConfigStatus.md)
- [MetricBulkTagConfigStatusAttributes](MetricBulkTagConfigStatusAttributes.md)
- [MetricCustomAggregation](MetricCustomAggregation.md)
- [MetricCustomSpaceAggregation](MetricCustomSpaceAggregation.md)
- [MetricCustomTimeAggregation](MetricCustomTimeAggregation.md)
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
- [NullableRelationshipToUser](NullableRelationshipToUser.md)
- [NullableRelationshipToUserData](NullableRelationshipToUserData.md)
- [Organization](Organization.md)
- [OrganizationAttributes](OrganizationAttributes.md)
- [OrganizationsType](OrganizationsType.md)
- [Pagination](Pagination.md)
- [PartialAPIKey](PartialAPIKey.md)
- [PartialAPIKeyAttributes](PartialAPIKeyAttributes.md)
- [PartialApplicationKey](PartialApplicationKey.md)
- [PartialApplicationKeyAttributes](PartialApplicationKeyAttributes.md)
- [PartialApplicationKeyResponse](PartialApplicationKeyResponse.md)
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
- [RelationshipToSAMLAssertionAttribute](RelationshipToSAMLAssertionAttribute.md)
- [RelationshipToSAMLAssertionAttributeData](RelationshipToSAMLAssertionAttributeData.md)
- [RelationshipToUser](RelationshipToUser.md)
- [RelationshipToUserData](RelationshipToUserData.md)
- [RelationshipToUsers](RelationshipToUsers.md)
- [ResponseMetaAttributes](ResponseMetaAttributes.md)
- [Role](Role.md)
- [RoleAttributes](RoleAttributes.md)
- [RoleClone](RoleClone.md)
- [RoleCloneAttributes](RoleCloneAttributes.md)
- [RoleCloneRequest](RoleCloneRequest.md)
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
- [SAMLAssertionAttribute](SAMLAssertionAttribute.md)
- [SAMLAssertionAttributeAttributes](SAMLAssertionAttributeAttributes.md)
- [SAMLAssertionAttributesType](SAMLAssertionAttributesType.md)
- [SecurityFilter](SecurityFilter.md)
- [SecurityFilterAttributes](SecurityFilterAttributes.md)
- [SecurityFilterCreateAttributes](SecurityFilterCreateAttributes.md)
- [SecurityFilterCreateData](SecurityFilterCreateData.md)
- [SecurityFilterCreateRequest](SecurityFilterCreateRequest.md)
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
- [SecurityMonitoringRuleTypeCreate](SecurityMonitoringRuleTypeCreate.md)
- [SecurityMonitoringRuleTypeRead](SecurityMonitoringRuleTypeRead.md)
- [SecurityMonitoringRuleUpdatePayload](SecurityMonitoringRuleUpdatePayload.md)
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
- [ServiceAccountCreateAttributes](ServiceAccountCreateAttributes.md)
- [ServiceAccountCreateData](ServiceAccountCreateData.md)
- [ServiceAccountCreateRequest](ServiceAccountCreateRequest.md)
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

### AuthZ

- **Type**: OAuth
- **Flow**: accessCode
- **Authorization URL**: /oauth2/v1/authorize
- **Scopes**:
  - dashboards_public_share: Share dashboards externally.
  - dashboards_read: View dashboards.
  - dashboards_write: Create and change dashboards.
  - events_read: Read Events data.
  - incident_read: View incidents in Datadog.
  - incident_settings_write: Configure Incidents settings.
  - incident_write: Create, view, and manage incidents in Datadog.
  - metrics_read: View custom metrics.
  - security_monitoring_filters_read: Read Security Filters.
  - security_monitoring_filters_write: Create, edit, and delete Security Filters.
  - security_monitoring_rules_read: Read Detection Rules.
  - security_monitoring_rules_write: Create and edit Detection Rules.
  - security_monitoring_signals_read: View Security Signals.
  - usage_read: View your organization&#39;s usage and usage attribution.
  - user_access_invite: Invite other users to your organization.
  - user_access_manage: Disable users, manage user roles, and manage SAML-to-role mappings.

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
