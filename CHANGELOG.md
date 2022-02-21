# CHANGELOG

## 1.5.0 / 2022-02-21

### Fixed
* Add missing type to `CloudWorkloadSecurityAgentRuleAttributes` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1192
* Add missing type to enum by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1194
* Add nullable user relationships to incidents and use this relationship schema for `commander_user` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1162
### Added
* Add organization metadata to additional Usage API responses by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1169
* Add support for formula and function in monitors by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1175
* Add async support by @therve in https://github.com/DataDog/datadog-api-client-java/pull/1171
* Add endpoint for managing SAML AuthN mappings by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1173
* [Synthetics] Add `isCritical` to browser test steps by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1181
* Add metrics bulk-config endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1177
* Add support for "estimated usage attribution" by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1188
* Add org metadata for all hourly usage endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1193
### Changed
* Add synthetics test result failure field by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1170
* Fix funnel steps definition by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1184
* Extract incident meta object by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1187


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-1.4.0...datadog-api-client-1.5.0

## 1.4.0 / 2022-01-25

* [Added] Add `filter[deleted]` parameter for searching recently deleted dashboards. See [#1152](https://github.com/DataDog/datadog-api-client-java/pull/1152).
* [Added] Add support for authentication and proxy options in Synthetics. See [#1118](https://github.com/DataDog/datadog-api-client-java/pull/1118).
* [Added] Support formulas and functions in Treemap Widget. See [#1147](https://github.com/DataDog/datadog-api-client-java/pull/1147).
* [Added] Add Cloud Workload Security Agent Rules API. See [#1137](https://github.com/DataDog/datadog-api-client-java/pull/1137).
* [Added] Add `offset` and `limit` parameters to usage listing endpoint. See [#1140](https://github.com/DataDog/datadog-api-client-java/pull/1140).
* [Added] Add monthly usage attribution API spec. See [#1129](https://github.com/DataDog/datadog-api-client-java/pull/1129).
* [Added] Add missing hosts metadata fields. See [#1123](https://github.com/DataDog/datadog-api-client-java/pull/1123).
* [Added] Add `replay_session_count ` and update documentation for `rum_session_count`. See [#1139](https://github.com/DataDog/datadog-api-client-java/pull/1139).
* [Added] Add retry options for a step in Synthetics multistep test. See [#1132](https://github.com/DataDog/datadog-api-client-java/pull/1132).
* [Added] Document `author_name` in dashboard response. See [#1130](https://github.com/DataDog/datadog-api-client-java/pull/1130).
* [Added] Add organization metadata for RUM sessions usage and expose `rum_browser_and_mobile_session_count`. See [#1124](https://github.com/DataDog/datadog-api-client-java/pull/1124).
* [Added] Add endpoint to retrieve hourly usage attribution. See [#1098](https://github.com/DataDog/datadog-api-client-java/pull/1098).
* [Added] Add support for scoped application keys. See [#1081](https://github.com/DataDog/datadog-api-client-java/pull/1081).
* [Added] Add endpoint for cloning roles. See [#1107](https://github.com/DataDog/datadog-api-client-java/pull/1107).
* [Added] Add organization metadata for audit logs, CWS, CSPM, DBM. See [#1116](https://github.com/DataDog/datadog-api-client-java/pull/1116).
* [Added] Add `ci-pipelines alert` to monitors enum. See [#1104](https://github.com/DataDog/datadog-api-client-java/pull/1104).
* [Added] Add support for sunburst widget in dashboard. See [#1110](https://github.com/DataDog/datadog-api-client-java/pull/1110).
* [Fixed] Clarify required fields for `SyntheticsAPIStep`, `SyntheticsAPITest`, and `SyntheticsBrowserTest`. See [#1045](https://github.com/DataDog/datadog-api-client-java/pull/1045).
* [Fixed] Fixes to Cloud Workload Security API. See [#1150](https://github.com/DataDog/datadog-api-client-java/pull/1150).
* [Fixed] Make downtime weekdays nullable. See [#1134](https://github.com/DataDog/datadog-api-client-java/pull/1134).
* [Changed] Add CSPM usage fields and change properties to nullable doubles. See [#1159](https://github.com/DataDog/datadog-api-client-java/pull/1159).
* [Changed] Remove read only fields in `EventCreateRequest`. See [#1148](https://github.com/DataDog/datadog-api-client-java/pull/1148).
* [Changed] Change pagination arguments for querying usage attribution. See [#1128](https://github.com/DataDog/datadog-api-client-java/pull/1128).
* [Removed] Remove deprecated AgentRule field in Security Rules API for CWS. See [#1122](https://github.com/DataDog/datadog-api-client-java/pull/1122).

## 1.3.0 / 2021-12-21

* [Added] Provide an all-in-one jar. See [#1088](https://github.com/DataDog/datadog-api-client-java/pull/1088).
* [Added] Add Limit Note for Hourly Requests. See [#1076](https://github.com/DataDog/datadog-api-client-java/pull/1076).
* [Added] Expose estimated logs usage in Usage Attribution API. See [#1077](https://github.com/DataDog/datadog-api-client-java/pull/1077).
* [Added] Add endpoint to get corrections applied to an SLO. See [#1066](https://github.com/DataDog/datadog-api-client-java/pull/1066).
* [Added] Expose `public_id` and `org_name` in Usage API response. See [#1069](https://github.com/DataDog/datadog-api-client-java/pull/1069).
* [Added] Document query in `MonitorSearchResult`. See [#1067](https://github.com/DataDog/datadog-api-client-java/pull/1067).
* [Added] Add 429 error responses. See [#1053](https://github.com/DataDog/datadog-api-client-java/pull/1053).
* [Added] Add support for profiled Fargate tasks in Usage API. See [#1048](https://github.com/DataDog/datadog-api-client-java/pull/1048).
* [Added] Add support for `websocket` synthetics tests. See [#1051](https://github.com/DataDog/datadog-api-client-java/pull/1051).
* [Added] Add support for UDP Synthetics API tests. See [#1040](https://github.com/DataDog/datadog-api-client-java/pull/1040).
* [Added] Add trigger synthetics tests endpoint. See [#1020](https://github.com/DataDog/datadog-api-client-java/pull/1020).
* [Added] Add RUM Units to usage metering API. See [#1036](https://github.com/DataDog/datadog-api-client-java/pull/1036).
* [Added] Add formulas and functions support to change widget. See [#952](https://github.com/DataDog/datadog-api-client-java/pull/952).
* [Added] Add support for Azure `automute` option. See [#1028](https://github.com/DataDog/datadog-api-client-java/pull/1028).
* [Added] Add v2 intake endpoint. See [#1019](https://github.com/DataDog/datadog-api-client-java/pull/1019).
* [Added] Add support for RRULE fields in SLO corrections. See [#979](https://github.com/DataDog/datadog-api-client-java/pull/979).
* [Added] Add aggregations attribute to v2 metric tag configuration. See [#959](https://github.com/DataDog/datadog-api-client-java/pull/959).
* [Added] Add `apm_stats_query` property to `DistributionWidgetRequest`. See [#1009](https://github.com/DataDog/datadog-api-client-java/pull/1009).
* [Added] Add `metrics_collection_enabled`, `cspm_resource_collection_enabled ` and `resource_collection_enabled` to AWS integration request. See [#1000](https://github.com/DataDog/datadog-api-client-java/pull/1000).
* [Added] Add SDS to usage metering endpoint. See [#1003](https://github.com/DataDog/datadog-api-client-java/pull/1003).
* [Added] Add endpoint to get details of a Synthetics batch. See [#951](https://github.com/DataDog/datadog-api-client-java/pull/951).
* [Fixed] Fix a typo in an incident field attribute description. See [#1087](https://github.com/DataDog/datadog-api-client-java/pull/1087).
* [Fixed] Fix `SecurityMonitoringSignal.attributes.tags` type. See [#1089](https://github.com/DataDog/datadog-api-client-java/pull/1089).
* [Fixed] Be more resilient to plain text errors. See [#1074](https://github.com/DataDog/datadog-api-client-java/pull/1074).
* [Fixed] Fix monitor `timeout_h` example and limits. See [#1064](https://github.com/DataDog/datadog-api-client-java/pull/1064).
* [Fixed] Remove event title length constraint. See [#1060](https://github.com/DataDog/datadog-api-client-java/pull/1060).
* [Fixed] Mark `batch_id` in Synthetics Trigger CI response as nullable. See [#1055](https://github.com/DataDog/datadog-api-client-java/pull/1055).
* [Fixed] SLO Correction attributes `rrule` and `duration` can be nullable. See [#1043](https://github.com/DataDog/datadog-api-client-java/pull/1043).
* [Fixed] Change `UsageNetworkFlowsHour.indexed_event_count` to match actual API. See [#1039](https://github.com/DataDog/datadog-api-client-java/pull/1039).
* [Fixed] Fix type for `ratio_in_month` in usage metering. See [#1032](https://github.com/DataDog/datadog-api-client-java/pull/1032).
* [Fixed] Use plural form for dbm hosts usage properties. See [#991](https://github.com/DataDog/datadog-api-client-java/pull/991).
* [Fixed] Make monitor properties `priority` and `restricted_roles` nullable. See [#1008](https://github.com/DataDog/datadog-api-client-java/pull/1008).
* [Changed] Fix required target in assertions and type in Synthetics step results. See [#1044](https://github.com/DataDog/datadog-api-client-java/pull/1044).
* [Changed] Update Synthetics CI test metadata. See [#990](https://github.com/DataDog/datadog-api-client-java/pull/990).
* [Deprecated] Remove session counts from RUM units response. See [#1101](https://github.com/DataDog/datadog-api-client-java/pull/1101).
* [Deprecated] Update property descriptions for Dashboard RBAC release. See [#1018](https://github.com/DataDog/datadog-api-client-java/pull/1018).

## 1.2.0 / 2021-10-13

* [Added] Add support for list widget in dashboards. See [#888](https://github.com/DataDog/datadog-api-client-java/pull/888).
* [Added] Add `include_descendants` param to usage attribution API. See [#926](https://github.com/DataDog/datadog-api-client-java/pull/926).
* [Added] Add `new_group_delay` and deprecate `new_host_delay` monitor properties. See [#921](https://github.com/DataDog/datadog-api-client-java/pull/921).
* [Added] Add endpoints to manage Service Accounts v2. See [#906](https://github.com/DataDog/datadog-api-client-java/pull/906).
* [Added] Add edge to Synthetics devices. See [#928](https://github.com/DataDog/datadog-api-client-java/pull/928).
* [Added] Add `id_str` property to Event response. See [#924](https://github.com/DataDog/datadog-api-client-java/pull/924).
* [Added] Add percentile to dashboard `WidgetAggregator` schema. See [#918](https://github.com/DataDog/datadog-api-client-java/pull/918).
* [Added] Add `audit_stream` to `ListStreamSource`. See [#922](https://github.com/DataDog/datadog-api-client-java/pull/922).
* [Added] Add missing synthetics variable parser type `x_path`. See [#935](https://github.com/DataDog/datadog-api-client-java/pull/935).
* [Added] Webhooks integration SDK. See [#936](https://github.com/DataDog/datadog-api-client-java/pull/936).
* [Added] Add restricted roles for Synthetics global variables. See [#937](https://github.com/DataDog/datadog-api-client-java/pull/937).
* [Added] Add events data source to Dashboard widgets. See [#932](https://github.com/DataDog/datadog-api-client-java/pull/932).
* [Added] Adding support for security monitoring rule `type` property. See [#931](https://github.com/DataDog/datadog-api-client-java/pull/931).
* [Added] Add `batch_id` to the synthetics trigger endpoint response. See [#943](https://github.com/DataDog/datadog-api-client-java/pull/943).
* [Added] Add `audit alert` monitor type. See [#945](https://github.com/DataDog/datadog-api-client-java/pull/945).
* [Added] Add DBM usage endpoint. See [#933](https://github.com/DataDog/datadog-api-client-java/pull/933).
* [Added] Add config variables to Synthetics browser test config. See [#949](https://github.com/DataDog/datadog-api-client-java/pull/949).
* [Added] Added `available_values` property to template variables schema. See [#950](https://github.com/DataDog/datadog-api-client-java/pull/950).
* [Added] Add `follow_redirects` options to test request in Synthetics. See [#955](https://github.com/DataDog/datadog-api-client-java/pull/955).
* [Added] ApmDependencyStatsQuery for formulas and functions dashboard widgets. See [#962](https://github.com/DataDog/datadog-api-client-java/pull/962).
* [Added] Add formula and function APM resource stats query definition for dashboards. See [#963](https://github.com/DataDog/datadog-api-client-java/pull/963).
* [Added] Add support for funnel widget in dashboards. See [#969](https://github.com/DataDog/datadog-api-client-java/pull/969).
* [Added] Add information about creator to Synthetics tests details. See [#975](https://github.com/DataDog/datadog-api-client-java/pull/975).
* [Added] Add support for gzip and deflate encoding. See [#972](https://github.com/DataDog/datadog-api-client-java/pull/972).
* [Added] Add support for formulas and functions in the Scatterplot Widget for dashboards. See [#967](https://github.com/DataDog/datadog-api-client-java/pull/967).
* [Added] Document encoding in metrics intake. See [#984](https://github.com/DataDog/datadog-api-client-java/pull/984).
* [Added] Add `servername` property to SSL Synthetics tests request. See [#983](https://github.com/DataDog/datadog-api-client-java/pull/983).
* [Added] Add `renotify_occurrences` and `renotify_statuses` monitor options. See [#993](https://github.com/DataDog/datadog-api-client-java/pull/993).
* [Added] Add `type` and `is_template` properties to notebooks. See [#995](https://github.com/DataDog/datadog-api-client-java/pull/995).
* [Fixed] Minor fixes of the incident schema. See [#939](https://github.com/DataDog/datadog-api-client-java/pull/939).
* [Fixed] Make SLO history metadata unit nullable. See [#942](https://github.com/DataDog/datadog-api-client-java/pull/942).
* [Fixed] Fix SLO history error response type for overall errors. See [#954](https://github.com/DataDog/datadog-api-client-java/pull/954).
* [Fixed] Mark SLO Correction Type as required. See [#953](https://github.com/DataDog/datadog-api-client-java/pull/953).
* [Fixed] Make the name property required for APM Dependency Stat Query widget. See [#966](https://github.com/DataDog/datadog-api-client-java/pull/966).
* [Fixed] Fix typo in usage attribution field names for profiled containers. See [#976](https://github.com/DataDog/datadog-api-client-java/pull/976).
* [Fixed] Make sure that OpenAPI definition are valid with real server responses. See [#974](https://github.com/DataDog/datadog-api-client-java/pull/974).
* [Fixed] Fix incidents schemas. See [#980](https://github.com/DataDog/datadog-api-client-java/pull/980).
* [Fixed] `IncidentFieldAttributesMultipleValue` can be nullable. See [#982](https://github.com/DataDog/datadog-api-client-java/pull/982).
* [Fixed] Allow nullable date in notebook cells. See [#987](https://github.com/DataDog/datadog-api-client-java/pull/987).
* [Fixed] Remove event title length constraint. See [#977](https://github.com/DataDog/datadog-api-client-java/pull/977).
* [Changed] Fix SLO history schema for groups and monitors fields. See [#958](https://github.com/DataDog/datadog-api-client-java/pull/958).
* [Changed] Remove metadata from required list for metric SLO history endpoint. See [#961](https://github.com/DataDog/datadog-api-client-java/pull/961).
* [Changed] Use AVG aggregation function for DBM queries. See [#971](https://github.com/DataDog/datadog-api-client-java/pull/971).
* [Changed] Enable compression in responses. See [#992](https://github.com/DataDog/datadog-api-client-java/pull/992).

## 1.1.0 / 2021-07-21

* [Added] Extend table widget requests to support formulas and functions. See [#909](https://github.com/DataDog/datadog-api-client-java/pull/909).
* [Added] Add CSPM to usage attribution. See [#901](https://github.com/DataDog/datadog-api-client-java/pull/901).
* [Added] Add support for dashboard bulk delete, restore endpoints. See [#885](https://github.com/DataDog/datadog-api-client-java/pull/885).
* [Added] Add support for audit logs data source in dashboards. See [#904](https://github.com/DataDog/datadog-api-client-java/pull/904).
* [Added] Add `allow_insecure` option for multistep steps in Synthetics. See [#898](https://github.com/DataDog/datadog-api-client-java/pull/898).
* [Added] Add support for ` GET /api/v2/application_keys/{app_key_id}`. See [#886](https://github.com/DataDog/datadog-api-client-java/pull/886).
* [Added] Add `meta` property with pagination info to SLOCorrectionList endpoint response. See [#884](https://github.com/DataDog/datadog-api-client-java/pull/884).
* [Added] Add support for treemap widget. See [#878](https://github.com/DataDog/datadog-api-client-java/pull/878).
* [Added] Add missing properties `query_index` and `tag_set` to `MetricsQueryMetadata`. See [#854](https://github.com/DataDog/datadog-api-client-java/pull/854).
* [Added] Add missing fields `hasExtendedTitle`, `type`, `version` and `updateAuthorId` for Security Monitoring Rule endpoints. See [#867](https://github.com/DataDog/datadog-api-client-java/pull/867).
* [Added] Dashboard RBAC role support. See [#863](https://github.com/DataDog/datadog-api-client-java/pull/863).
* [Fixed] Fix serialization of query metrics response containing nullable points. See [#899](https://github.com/DataDog/datadog-api-client-java/pull/899).
* [Fixed] Fix `status` property name for browser error status in Synthetics. See [#900](https://github.com/DataDog/datadog-api-client-java/pull/900).
* [Fixed] Remove US only constraint for AWS tag filtering. See [#874](https://github.com/DataDog/datadog-api-client-java/pull/874).
* [Fixed] Add BDD tests to synthetics. See [#873](https://github.com/DataDog/datadog-api-client-java/pull/873).
* [Fixed] Fix security filter delete response. See [#871](https://github.com/DataDog/datadog-api-client-java/pull/871).
* [Fixed] Handle null in query metrics unit. See [#870](https://github.com/DataDog/datadog-api-client-java/pull/870).
* [Changed] Add separate schema for deleting AWS account. See [#897](https://github.com/DataDog/datadog-api-client-java/pull/897).
* [Changed] Remove Synthetics tick interval enum. See [#872](https://github.com/DataDog/datadog-api-client-java/pull/872).
* [Removed] Remove deprecated endpoints `/api/v1/usage/traces` and `/api/v1/usage/tracing-without-limits`. See [#902](https://github.com/DataDog/datadog-api-client-java/pull/902).

## 1.0.0 / 2021-06-10

* [Added] Add missing fields in usage billable summary keys. See [#861](https://github.com/DataDog/datadog-api-client-java/pull/861).
* [Added] Add monitor name and priority options. See [#858](https://github.com/DataDog/datadog-api-client-java/pull/858).
* [Added] Add endpoint to list Synthetics global variables. See [#846](https://github.com/DataDog/datadog-api-client-java/pull/846).
* [Added] Add monitors search endpoints. See [#842](https://github.com/DataDog/datadog-api-client-java/pull/842).
* [Added] Add `tag_config_source` to usage attribution response. See [#837](https://github.com/DataDog/datadog-api-client-java/pull/837).
* [Added] Add endpoints to configure Security Filters. See [#826](https://github.com/DataDog/datadog-api-client-java/pull/826).
* [Added] Add `active_child` nested downtime object to `Downtime` component for downtime APIs.. See [#820](https://github.com/DataDog/datadog-api-client-java/pull/820).
* [Added] Add Notebooks API. See [#819](https://github.com/DataDog/datadog-api-client-java/pull/819).
* [Added] Add `override_label` and `is_hidden` attribute for `WidgetCustomLink`. See [#825](https://github.com/DataDog/datadog-api-client-java/pull/825).
* [Added] Add CWS to usage metering endpoint. See [#845](https://github.com/DataDog/datadog-api-client-java/pull/845).
* [Added] Add audit logs to usage endpoints. See [#853](https://github.com/DataDog/datadog-api-client-java/pull/853).
* [Fixed] Fix type of day/month response attribute in custom metrics usage. See [#856](https://github.com/DataDog/datadog-api-client-java/pull/856).
* [Fixed] Fix paging attributes of usage attribution endpoints. See [#821](https://github.com/DataDog/datadog-api-client-java/pull/821).
* [Fixed] Properly mark several synthetics attributes as read only. See [#824](https://github.com/DataDog/datadog-api-client-java/pull/824).
* [Fixed] Properly mark monitor required fields. See [#836](https://github.com/DataDog/datadog-api-client-java/pull/836).
* [Fixed] Make `assertions` field optional for multistep synthetics tests, and add `global` config variable type. See [#844](https://github.com/DataDog/datadog-api-client-java/pull/844).
* [Changed] Rename `compliance` to `CSPM` in usage endpoint. See [#853](https://github.com/DataDog/datadog-api-client-java/pull/853).
* [Changed] Rename `incident_integration_metadata` to `incident_integrations` to match API. See [#831](https://github.com/DataDog/datadog-api-client-java/pull/831).

## 1.0.0-beta11 / 2021-05-12

* [Added] Add `logs_by_retention` usage property and `GetUsageLogsByRetention` endpoint. See [#809](https://github.com/DataDog/datadog-api-client-java/pull/809).
* [Added] Add anomaly detection method to `SecurityMonitoringRuleDetectionMethod` enum. See [#808](https://github.com/DataDog/datadog-api-client-java/pull/808).
* [Added] Add `with_configured_alert_ids` parameter to get a SLO details endpoint. See [#805](https://github.com/DataDog/datadog-api-client-java/pull/805).
* [Added] Add `setCookie`, `dnsServerPort`,  `allowFailure ` and `isCritical` fields for Synthetics tests. See [#800](https://github.com/DataDog/datadog-api-client-java/pull/800).
* [Added] Add `metadata` property with pagination info to `SLOList` endpoint response. See [#796](https://github.com/DataDog/datadog-api-client-java/pull/796).
* [Added] Add new properties to group widget, note widget and image widget. See [#793](https://github.com/DataDog/datadog-api-client-java/pull/793).
* [Added] Add support for a `rate` metric type in manage metric tags v2 endpoint. See [#791](https://github.com/DataDog/datadog-api-client-java/pull/791).
* [Added] Add support for ICMP Synthetics tests. See [#788](https://github.com/DataDog/datadog-api-client-java/pull/788).
* [Added] Add vSphere usage information. See [#783](https://github.com/DataDog/datadog-api-client-java/pull/783).
* [Added] Mark metric volumes and ingested tags endpoints as stable. See [#779](https://github.com/DataDog/datadog-api-client-java/pull/779).
* [Added] Add `filter[shared]` query parameter for searching dashboards. See [#772](https://github.com/DataDog/datadog-api-client-java/pull/772).
* [Added] Add profiling product fields in usage metering endpoint. See [#771](https://github.com/DataDog/datadog-api-client-java/pull/771).
* [Added] Add `title` and `background_color` properties to dashboard group widget. See [#770](https://github.com/DataDog/datadog-api-client-java/pull/770).
* [Added] Add `marker`, `xaxis` and `yaxis` properties on distribution widgets. See [#782](https://github.com/DataDog/datadog-api-client-java/pull/782).
* [Fixed] Remove default value of `is_column_break` layout property of dashboard. See [#816](https://github.com/DataDog/datadog-api-client-java/pull/816).
* [Changed] Enumerate accepted values for fields parameter in usage attribution requests. See [#813](https://github.com/DataDog/datadog-api-client-java/pull/813).
* [Changed] Add new value tick interval and remove `request` as required field from synthetics test. See [#810](https://github.com/DataDog/datadog-api-client-java/pull/810).
* [Deprecated] Deprecate `legend_size` and `show_legend` properties on distribution widgets. See [#782](https://github.com/DataDog/datadog-api-client-java/pull/782).
* [Removed] Remove deprecated Synthetics methods `CreateTest` and `UpdateTest`. See [#785](https://github.com/DataDog/datadog-api-client-java/pull/785).

## 1.0.0-beta10 / 2021-04-15

* [Added] Add `reflow_type` property to dashboard object. See [#742](https://github.com/DataDog/datadog-api-client-java/pull/742).
* [Added] Add security track and formulas and functions support for geomap dashboard widget. See [#739](https://github.com/DataDog/datadog-api-client-java/pull/739).
* [Added] Add intake endpoints. See [#737](https://github.com/DataDog/datadog-api-client-java/pull/737).
* [Added] Add endpoint for listing all downtimes for the specified monitor. See [#730](https://github.com/DataDog/datadog-api-client-java/pull/730).
* [Added] Add `modified_at` attribute to user response v2 schema. See [#722](https://github.com/DataDog/datadog-api-client-java/pull/722).
* [Added] Add default environment loading in clients. See [#721](https://github.com/DataDog/datadog-api-client-java/pull/721).
* [Added] Add `passed`, `noSavingResponseBody`, `noScreenshot`, and `disableCors` fields to Synthetics. See [#720](https://github.com/DataDog/datadog-api-client-java/pull/720).
* [Added] Add compliance usage endpoint and compliance host statistics. See [#719](https://github.com/DataDog/datadog-api-client-java/pull/719).
* [Added] Add tag filter options for `/api/v{1,2}/metrics`. See [#718](https://github.com/DataDog/datadog-api-client-java/pull/718).
* [Added] Add usage fields for Heroku and OpenTelemetry. See [#715](https://github.com/DataDog/datadog-api-client-java/pull/715).
* [Added] Add `global_time_target` field to SLO widget. See [#713](https://github.com/DataDog/datadog-api-client-java/pull/713).
* [Added] Add method to export an API test in Synthetics. See [#712](https://github.com/DataDog/datadog-api-client-java/pull/712).
* [Added] Add metadata to usage top average metrics response. See [#711](https://github.com/DataDog/datadog-api-client-java/pull/711).
* [Added] Add median as valid aggregator for formulas and functions. See [#704](https://github.com/DataDog/datadog-api-client-java/pull/704).
* [Added] Add legend_layout and legend_columns to timeseries widget definition [VIZZ-1211]. See [#698](https://github.com/DataDog/datadog-api-client-java/pull/698).
* [Added] Update the spec for GetSLOHistory. See [#693](https://github.com/DataDog/datadog-api-client-java/pull/693).
* [Added] Add support for multistep tests in Synthetics. See [#686](https://github.com/DataDog/datadog-api-client-java/pull/686).
* [Added] Add core web vitals to browser results in Synthetics. See [#681](https://github.com/DataDog/datadog-api-client-java/pull/681).
* [Added] Add v2 metric tags and metric volumes endpoints. See [#680](https://github.com/DataDog/datadog-api-client-java/pull/680).
* [Added] Add new endpoints for browser API tests in Synthetics. See [#677](https://github.com/DataDog/datadog-api-client-java/pull/677).
* [Added] add groupby_simple_monitor option to monitor spec. See [#675](https://github.com/DataDog/datadog-api-client-java/pull/675).
* [Added] Allow formula and functions in query value requests. See [#674](https://github.com/DataDog/datadog-api-client-java/pull/674).
* [Added] Allow formula and functions in toplist requests. See [#673](https://github.com/DataDog/datadog-api-client-java/pull/673).
* [Added] Generate slack resource for clients. See [#669](https://github.com/DataDog/datadog-api-client-java/pull/669).
* [Added] Add detectionMethod and newValueOptions fields to security monitoring rules. See [#667](https://github.com/DataDog/datadog-api-client-java/pull/667).
* [Added] Expose "event-v2 alert" monitor type. See [#666](https://github.com/DataDog/datadog-api-client-java/pull/666).
* [Added] Add new US3 region. See [#665](https://github.com/DataDog/datadog-api-client-java/pull/665).
* [Added] Add org_name field to usage attribution response. See [#663](https://github.com/DataDog/datadog-api-client-java/pull/663).
* [Added] Add profile_metrics_query properties to dashboard widget requests. See [#660](https://github.com/DataDog/datadog-api-client-java/pull/660).
* [Added] Add geomap widget to dashboards v1. See [#654](https://github.com/DataDog/datadog-api-client-java/pull/654).
* [Added] Add v2 API for metric tag configuration. See [#653](https://github.com/DataDog/datadog-api-client-java/pull/653).
* [Added] Add Lambda invocations usage to response. See [#652](https://github.com/DataDog/datadog-api-client-java/pull/652).
* [Added] Remove unstable flag for logs apis. See [#647](https://github.com/DataDog/datadog-api-client-java/pull/647).
* [Fixed] Start adding a CI process for releases and switch to Sonatype from Bintray. See [#676](https://github.com/DataDog/datadog-api-client-java/pull/676).
* [Fixed] Browser Test message required. See [#707](https://github.com/DataDog/datadog-api-client-java/pull/707).
* [Fixed] Update pom to use proper versioning and remove prefix from SCM tag. See [#668](https://github.com/DataDog/datadog-api-client-java/pull/668).
* [Fixed] Add missing tlsVersion and minTlsVersion to Synthetics assertion types. See [#661](https://github.com/DataDog/datadog-api-client-java/pull/661).
* [Fixed] rule: all nested objects in arrays must be defined on top-level. See [#656](https://github.com/DataDog/datadog-api-client-java/pull/656).
* [Fixed] Change analyzed_spans -> spans in Dashboard. See [#649](https://github.com/DataDog/datadog-api-client-java/pull/649).
* [Fixed] Fix AWS tag filter delete request. See [#644](https://github.com/DataDog/datadog-api-client-java/pull/644).
* [Fixed] Remove unnecessary field from TimeSeriesFormulaAndFunctionEventQuery. See [#643](https://github.com/DataDog/datadog-api-client-java/pull/643).
* [Security] Bump jackson-databind from 2.10.4 to 2.10.5.1. See [#664](https://github.com/DataDog/datadog-api-client-java/pull/664).
* [Changed] Use a new model for Java APIs. See [#745](https://github.com/DataDog/datadog-api-client-java/pull/745).
* [Changed] Return correct object in `GetBrowserTest` endpoint. See [#729](https://github.com/DataDog/datadog-api-client-java/pull/729).
* [Changed] Add agent rules in security monitoring rules queries. See [#714](https://github.com/DataDog/datadog-api-client-java/pull/714).
* [Changed] Make query name required in Formulas and Functions. See [#685](https://github.com/DataDog/datadog-api-client-java/pull/685).
* [Changed] Rename objects for formula and functions to be more generic. See [#670](https://github.com/DataDog/datadog-api-client-java/pull/670).

## 1.0.0-beta.9 / 2021-02-04

* [Added] Add restricted roles to monitor update. See [#634](https://github.com/DataDog/datadog-api-client-java/pull/634).
* [Added] Add endpoint for IoT billing usage. See [#631](https://github.com/DataDog/datadog-api-client-java/pull/631).
* [Added] Add query parameters for SLO search endpoint. See [#629](https://github.com/DataDog/datadog-api-client-java/pull/629).
* [Added] Add fields for formula and function query definition and widget formulas. See [#626](https://github.com/DataDog/datadog-api-client-java/pull/626).
* [Added] Add global_time to time_window slo widget. See [#624](https://github.com/DataDog/datadog-api-client-java/pull/624).
* [Added] Update required fields in SLO Correction create and update requests . See [#618](https://github.com/DataDog/datadog-api-client-java/pull/618).
* [Added] Add log index creation (POST). See [#614](https://github.com/DataDog/datadog-api-client-java/pull/614).
* [Fixed] Fix unit format in SLO history response. See [#639](https://github.com/DataDog/datadog-api-client-java/pull/639).
* [Fixed] Remove unused downloadFile helpers. See [#637](https://github.com/DataDog/datadog-api-client-java/pull/637).
* [Fixed] Fix location of restricted roles for Monitors. See [#632](https://github.com/DataDog/datadog-api-client-java/pull/632).
* [Fixed] Fix paging parameter names for logs aggregate queries. See [#628](https://github.com/DataDog/datadog-api-client-java/pull/628).
* [Fixed] Add `additionalProperties: false` to synthetics target field. See [#610](https://github.com/DataDog/datadog-api-client-java/pull/610).
* [Changed] Fix some integer/number formats in Logs and Synthetics endpoints. See [#611](https://github.com/DataDog/datadog-api-client-java/pull/611).

## 1.0.0-beta.8 / 2021-01-14

* [Added] Add SLO Corrections endpoint. See [#607](https://github.com/DataDog/datadog-api-client-java/pull/607).
* [Added] Add new live and rehydrated logs breakdowns for Usage API. See [#605](https://github.com/DataDog/datadog-api-client-java/pull/605).
* [Added] Add support for Synthetics variables from test. See [#598](https://github.com/DataDog/datadog-api-client-java/pull/598).
* [Added] Add filters to rule endpoints in security monitoring API. See [#592](https://github.com/DataDog/datadog-api-client-java/pull/592).
* [Added] Add Azure app services fields to usage v1 endpoints. See [#591](https://github.com/DataDog/datadog-api-client-java/pull/591).
* [Added] Add mobile RUM OS types usage fields. See [#589](https://github.com/DataDog/datadog-api-client-java/pull/589).
* [Added] Add config variables for synthetics API tests. See [#588](https://github.com/DataDog/datadog-api-client-java/pull/588).
* [Added] Add endpoints for the public API of Logs2Metrics. See [#586](https://github.com/DataDog/datadog-api-client-java/pull/586).
* [Added] Add endpoints for API Keys v2. See [#582](https://github.com/DataDog/datadog-api-client-java/pull/582).
* [Added] Add javascript value to synthetics browser variable types. See [#579](https://github.com/DataDog/datadog-api-client-java/pull/579).
* [Added] Add synthetics assertion operator. See [#570](https://github.com/DataDog/datadog-api-client-java/pull/570).
* [Added] Add Application keys v2 API. See [#565](https://github.com/DataDog/datadog-api-client-java/pull/565).
* [Added] Mark Usage Attribution endpoint as public beta. See [#553](https://github.com/DataDog/datadog-api-client-java/pull/553).
* [Added] Add AWS filtering endpoints. See [#550](https://github.com/DataDog/datadog-api-client-java/pull/550).
* [Added] Add limit parameter for get usage top average metrics. See [#546](https://github.com/DataDog/datadog-api-client-java/pull/546).
* [Added] Add endpoint to fetch process summaries. See [#545](https://github.com/DataDog/datadog-api-client-java/pull/545).
* [Added] Add synthetics private location endpoints. See [#544](https://github.com/DataDog/datadog-api-client-java/pull/544).
* [Added] Add user_update, recommendation and snapshot as event alert types. See [#542](https://github.com/DataDog/datadog-api-client-java/pull/542).
* [Added] Add Usage Attribution endpoint. See [#539](https://github.com/DataDog/datadog-api-client-java/pull/539).
* [Added] Add new API for incident management usage. See [#535](https://github.com/DataDog/datadog-api-client-java/pull/535).
* [Added] Add the incident schema. See [#528](https://github.com/DataDog/datadog-api-client-java/pull/528).
* [Added] Add IP prefixes by location for synthetics endpoints. See [#522](https://github.com/DataDog/datadog-api-client-java/pull/522).
* [Added] Add filter parameter for listing teams and services. See [#521](https://github.com/DataDog/datadog-api-client-java/pull/521).
* [Added] Add restricted roles to monitor create and edit requests. See [#520](https://github.com/DataDog/datadog-api-client-java/pull/520).
* [Added] Add 3 new palettes to the conditional formatting options. See [#515](https://github.com/DataDog/datadog-api-client-java/pull/515).
* [Added] Add missing synthetics step types. See [#504](https://github.com/DataDog/datadog-api-client-java/pull/504).
* [Added] Add include_tags in logs archives. See [#501](https://github.com/DataDog/datadog-api-client-java/pull/501).
* [Added] Add dns server and client certificate support. See [#491](https://github.com/DataDog/datadog-api-client-java/pull/491).
* [Added] Add rehydration_tags property to the logs archives. See [#479](https://github.com/DataDog/datadog-api-client-java/pull/479).
* [Added] Add endpoint to reorder Logs Archives. See [#473](https://github.com/DataDog/datadog-api-client-java/pull/473).
* [Added] Add has_search_bar and cell_display_mode properties to table widget definition. See [#470](https://github.com/DataDog/datadog-api-client-java/pull/470).
* [Added] Add target_format property to the Logs attribute remapper . See [#469](https://github.com/DataDog/datadog-api-client-java/pull/469).
* [Added] Add dual y-axis configuration to time-series widget in Dashboard. See [#467](https://github.com/DataDog/datadog-api-client-java/pull/467).
* [Added] Mark logs aggregate endpoint as stable. See [#464](https://github.com/DataDog/datadog-api-client-java/pull/464).
* [Added] Add endpoint to get a Synthetics global variable. See [#457](https://github.com/DataDog/datadog-api-client-java/pull/457).
* [Added] Add assertion types for DNS Synthetics tests. See [#453](https://github.com/DataDog/datadog-api-client-java/pull/453).
* [Added] Add DNS test type to Synthetics. See [#450](https://github.com/DataDog/datadog-api-client-java/pull/450).
* [Added] Add API endpoints for teams and services. See [#446](https://github.com/DataDog/datadog-api-client-java/pull/446).
* [Added] Add mobile_rum_session_count_sum property to usage responses. See [#445](https://github.com/DataDog/datadog-api-client-java/pull/445).
* [Added] Add aggregation and metric fields to the RuleQuery for security monitoring. See [#438](https://github.com/DataDog/datadog-api-client-java/pull/438).
* [Added] Add tracing without limits to usage services. See [#433](https://github.com/DataDog/datadog-api-client-java/pull/433).
* [Added] Add response codes for AWS Integration API. See [#428](https://github.com/DataDog/datadog-api-client-java/pull/428).
* [Added] Add custom_links support for Dashboard widgets. See [#427](https://github.com/DataDog/datadog-api-client-java/pull/427).
* [Added] Add profiling to usage endpoint. See [#421](https://github.com/DataDog/datadog-api-client-java/pull/421).
* [Added] Add synthetics ci endpoint. See [#414](https://github.com/DataDog/datadog-api-client-java/pull/414).
* [Added] Add ApmResourcesQueryDefinition to TableWidgetRequest. See [#413](https://github.com/DataDog/datadog-api-client-java/pull/413).
* [Added] Add list API for SecMon signals. See [#412](https://github.com/DataDog/datadog-api-client-java/pull/412).
* [Added] Add create, edit and delete endpoints for synthetics global variables. See [#408](https://github.com/DataDog/datadog-api-client-java/pull/408).
* [Added] Add renotify option. See [#407](https://github.com/DataDog/datadog-api-client-java/pull/407).
* [Added] Add Logs aggregate API v2. See [#406](https://github.com/DataDog/datadog-api-client-java/pull/406).
* [Added] Add Profiling Host to usage API. See [#403](https://github.com/DataDog/datadog-api-client-java/pull/403).
* [Added] Add distinct fields to RuleQuery for security monitoring. See [#399](https://github.com/DataDog/datadog-api-client-java/pull/399).
* [Added] Add security source for dashboards. See [#392](https://github.com/DataDog/datadog-api-client-java/pull/392).
* [Added] Add SLO alerts to monitor enum. See [#390](https://github.com/DataDog/datadog-api-client-java/pull/390).
* [Added] Add four usage attribution endpoints. See [#384](https://github.com/DataDog/datadog-api-client-java/pull/384).
* [Added] Add query parameters to get musted hosts and hosts metadata in host endpoint. See [#376](https://github.com/DataDog/datadog-api-client-java/pull/376).
* [Added] Add Billable Summary to usage enpoint. See [#367](https://github.com/DataDog/datadog-api-client-java/pull/367).
* [Fixed] Use map instead of hashmap for configureApiKeys. See [#540](https://github.com/DataDog/datadog-api-client-java/pull/540).
* [Fixed] Quota & retention are now editable fields in log indexes. See [#524](https://github.com/DataDog/datadog-api-client-java/pull/524).
* [Fixed] Fix synthetics_check_id type in MonitorOptions. See [#497](https://github.com/DataDog/datadog-api-client-java/pull/497).
* [Fixed] Remove default for cell_display_mode in table widget. See [#488](https://github.com/DataDog/datadog-api-client-java/pull/488).
* [Fixed] Fix tags attribute type in event aggregation API. See [#440](https://github.com/DataDog/datadog-api-client-java/pull/440).
* [Fixed] Return user in update call for users endpoint. See [#424](https://github.com/DataDog/datadog-api-client-java/pull/424).
* [Fixed] Fix content-type spelling errors. See [#410](https://github.com/DataDog/datadog-api-client-java/pull/410).
* [Fixed] Mark query and status as required for security monitoring. See [#409](https://github.com/DataDog/datadog-api-client-java/pull/409).
* [Fixed] Fix Security Monitoring `isEnabled` parameter. See [#396](https://github.com/DataDog/datadog-api-client-java/pull/396).
* [Fixed] Mark query field as optional when searching logs. See [#534](https://github.com/DataDog/datadog-api-client-java/pull/534).
* [Changed] Remove enum from legend_size. See [#418](https://github.com/DataDog/datadog-api-client-java/pull/418).
* [Changed] Extract enum to specific schema in incidents endpoint. See [#604](https://github.com/DataDog/datadog-api-client-java/pull/604).
* [Changed] Extract key sorting enum to a specific schema in key management endpoint. See [#601](https://github.com/DataDog/datadog-api-client-java/pull/601).
* [Changed] Mark request bodies as required or explicitly optional. See [#561](https://github.com/DataDog/datadog-api-client-java/pull/561).
* [Changed] Change event_query property to use log query definition in dashboard widgets. See [#529](https://github.com/DataDog/datadog-api-client-java/pull/529).
* [Changed] Rename tracing without limits and traces usage endpoints. See [#519](https://github.com/DataDog/datadog-api-client-java/pull/519).
* [Changed] Change teams and services objects names to be incident specific. See [#505](https://github.com/DataDog/datadog-api-client-java/pull/505).
* [Changed] Change `columns` attribute type from string array to object array in APM stats query widget. See [#475](https://github.com/DataDog/datadog-api-client-java/pull/475).
* [Changed] Rename to ApmStats and add required properties. See [#458](https://github.com/DataDog/datadog-api-client-java/pull/458).
* [Changed] Remove unused `aggregation_key` and `related_event_id` properties from events responses. See [#449](https://github.com/DataDog/datadog-api-client-java/pull/449).
* [Changed] Define required fields for v2 requests. See [#448](https://github.com/DataDog/datadog-api-client-java/pull/448).
* [Changed] Mark required type fields in User and Roles API v2. See [#443](https://github.com/DataDog/datadog-api-client-java/pull/443).
* [Changed] Update synthetics test to contain latest features. See [#371](https://github.com/DataDog/datadog-api-client-java/pull/371).
* [Deprecated] Deprecate subscription and billing fields in create organization endpoint. See [#549](https://github.com/DataDog/datadog-api-client-java/pull/549).
* [Removed] Remove Synthetic resources property. See [#583](https://github.com/DataDog/datadog-api-client-java/pull/583).
* [Removed] Remove org_id parameter from Usage Attribution endpoint. See [#555](https://github.com/DataDog/datadog-api-client-java/pull/555).
* [Removed] Remove `require_full_window` client default value for monitors. See [#509](https://github.com/DataDog/datadog-api-client-java/pull/509).
* [Removed] Remove check_type parameter from ListTests endpoint. See [#442](https://github.com/DataDog/datadog-api-client-java/pull/442).
* [Removed] Remove 204 response from PATCH v2 users. See [#431](https://github.com/DataDog/datadog-api-client-java/pull/431).

## 1.0.0-beta.7 / 2020-07-02

* [Added] Add getter for User-Agent header value. See [#364](https://github.com/DataDog/datadog-api-client-java/pull/364).
* [Added] Add Logs Search API v2. See [#362](https://github.com/DataDog/datadog-api-client-java/pull/362).
* [Fixed] RRULE property for Downtimes API. See [#361](https://github.com/DataDog/datadog-api-client-java/pull/361).
* [Deprecated] Dashboards List v1 has been deprecated. See [#360](https://github.com/DataDog/datadog-api-client-java/pull/360).

## datadog-api-client-1.0.0-beta.6 / 2020-06-22

* [Fixed] Update enum of synthetics devices IDs to match API. See [#353](https://github.com/DataDog/datadog-api-client-java/pull/353).

## datadog-api-client-1.0.0-beta.5 / 2020-06-19

* [Added] Update to the latest openapi-generator 5 snapshot. See [#344](https://github.com/DataDog/datadog-api-client-java/pull/344).
* [Added] Add synthetics location endpoint. See [#338](https://github.com/DataDog/datadog-api-client-java/pull/338).
* [Fixed] Widget legend size can also be "0". See [#341](https://github.com/DataDog/datadog-api-client-java/pull/341).
* [Fixed] Log Index as an optional parameter (default to "*") for List Queries. See [#340](https://github.com/DataDog/datadog-api-client-java/pull/340).
* [Security] Bump jackson and jackson-databind from 2.9.10.4 to 2.10.4. See [#349](https://github.com/DataDog/datadog-api-client-java/pull/349).
* [Changed] Rename payload objects to request for `users` v2 API. See [#350](https://github.com/DataDog/datadog-api-client-java/pull/350).
  * This change includes backwards incompatible changes when using the `users` v2 endpoint.
* [Changed] Split schema for roles API. See [#342](https://github.com/DataDog/datadog-api-client-java/pull/342).
  * This change includes backwards incompatible changes when using the `role` endpoint.

## datadog-api-client-1.0.0-beta.4 / 2020-06-09

* [BREAKING] Add missing values to enums. See [#327](https://github.com/DataDog/datadog-api-client-java/pull/327).
    * This change includes backwards incompatible changes when using the `MonitorSummary` widget.
* [BREAKING] Split schemas from DashboardList v2. See [#323](https://github.com/DataDog/datadog-api-client-java/pull/323).
    * This change includes backwards incompatible changes when using corresponding endpoints methods.
* [BREAKING] Clean synthetics test CRUD endpoints. See [#322](https://github.com/DataDog/datadog-api-client-java/pull/322).
    * This change includes backwards incompatible changes when using corresponding endpoints methods.
* [Added] Add Logs Archives endpoints. See [#333](https://github.com/DataDog/datadog-api-client-java/pull/333).    
    
## datadog-api-client-1.0.0-beta.3 / 2020-05-21

* [BREAKING] Update to openapi-generator 5.0.0. See [#305](https://github.com/DataDog/datadog-api-client-java/pull/305).
    * This change includes backwards incompatible changes when using classes generated from `oneOf` schemas.
* [Added] Add SIEM and SNMP usage API. See [#309](https://github.com/DataDog/datadog-api-client-java/pull/309).
* [Added] Add security monitoring to clients. See [#306](https://github.com/DataDog/datadog-api-client-java/pull/306).
* [Added] Add /v1/validate endpoint. See [#297](https://github.com/DataDog/datadog-api-client-java/pull/297).
* [Added] Add a .generated_files. See [#274](https://github.com/DataDog/datadog-api-client-java/pull/274).
* [Fixed] Add 422 error codes to users and roles v2 endpoints. See [#300](https://github.com/DataDog/datadog-api-client-java/pull/300).
* [Fixed] Check duplicate object definitions. See [#296](https://github.com/DataDog/datadog-api-client-java/pull/296).
* [Fixed] Mark unstable endpoints with beta note. See [#289](https://github.com/DataDog/datadog-api-client-java/pull/289).
* [Changed] Update ServiceLevelObjective schema names. See [#286](https://github.com/DataDog/datadog-api-client-java/pull/286).
* [Deprecated] Add deprecated fields `logset`, `count` and `start` to appropriate dashboard widgets. See [#292](https://github.com/DataDog/datadog-api-client-java/pull/292).

## datadog-api-client-1.0.0-beta.2 / 2020-05-04

* [Added] Add some missing attributes to synthetics schemas. See [#265](https://github.com/DataDog/datadog-api-client-java/pull/265).
* [Fixed] Monitor Query Descriptions. See [#278](https://github.com/DataDog/datadog-api-client-java/pull/278).
* [Fixed] Synthetics Test Mark method and url as optional. See [#268](https://github.com/DataDog/datadog-api-client-java/pull/268).
* [Fixed] Clean up generated client documentation. See [#260](https://github.com/DataDog/datadog-api-client-java/pull/260).
* [Fixed] Add missing page query parameters. See [#253](https://github.com/DataDog/datadog-api-client-java/pull/253).
* [Fixed] Update error responses for roles v2 endpoints. See [#252](https://github.com/DataDog/datadog-api-client-java/pull/252).
* [Fixed] Bump jackson-databind from 2.9.10.3 to 2.9.10.4. See [#250](https://github.com/DataDog/datadog-api-client-java/pull/250).
* [Fixed] Bump jackson-databind from 2.9.10 to 2.9.10.3. See [#246](https://github.com/DataDog/datadog-api-client-java/pull/246).
* [Fixed] Add missing get ListSLO's 404 response. See [#247](https://github.com/DataDog/datadog-api-client-java/pull/247).
* [Removed] Remove Pagerduty endpoint. See [#267](https://github.com/DataDog/datadog-api-client-java/pull/267).

## 1.0.0-beta.1 / 2020-04-22

* [Added] Initial beta release of the Datadog API Client
