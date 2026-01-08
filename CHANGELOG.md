# CHANGELOG

## 2.49.0/2026-01-08

### Added
* Add new bits_ai usage attribution type to Usage Attribution Public API Documentation [#3357](https://github.com/DataDog/datadog-api-client-java/pull/3357)
* Add Product Analytics Server-Side Events API endpoint [#3352](https://github.com/DataDog/datadog-api-client-java/pull/3352)
* Update /api/v2/cases endpoint to add custom attributes support [#3350](https://github.com/DataDog/datadog-api-client-java/pull/3350)
* Documentation for team notifications API [#3346](https://github.com/DataDog/datadog-api-client-java/pull/3346)
* [RQ-7160] Add llm_spans and deprecate llm_observability [#3332](https://github.com/DataDog/datadog-api-client-java/pull/3332)
* Add display_name to Observability Pipeline processors [#3330](https://github.com/DataDog/datadog-api-client-java/pull/3330)
* Add a new includeDiscovered query parameter to Software Catalog APIs [#3327](https://github.com/DataDog/datadog-api-client-java/pull/3327)
* Add routes for managing On-Call user notification rules [#3325](https://github.com/DataDog/datadog-api-client-java/pull/3325)
* Add anomaly detection options to security monitoring rules [#3322](https://github.com/DataDog/datadog-api-client-java/pull/3322)
* Remove preview/unstable tags from GitHub team sync and connections endpoints [#3320](https://github.com/DataDog/datadog-api-client-java/pull/3320)
* Added spec for flex_stored_logs [#3314](https://github.com/DataDog/datadog-api-client-java/pull/3314)
* Add documentation for synthetics global variable jsonpatch endpoint [#3267](https://github.com/DataDog/datadog-api-client-java/pull/3267)

### Changed
* Remove steps from certain expected synthetics api response [#3356](https://github.com/DataDog/datadog-api-client-java/pull/3356)
* Add documentation for GET, POST, PATCH, and DELETE api/v2/incidents/incident_id/attachments endpoints [#3296](https://github.com/DataDog/datadog-api-client-java/pull/3296)

## 2.48.0/2025-12-17

### Changed
* Mark Incident Impact Endpoints stable [#3321](https://github.com/DataDog/datadog-api-client-java/pull/3321)
* Vulnerability Management - Update ListVulnerabilities endpoint query params and response schema [#3313](https://github.com/DataDog/datadog-api-client-java/pull/3313)
* Update specs for AWS account updates and creation for CCM configs [#3306](https://github.com/DataDog/datadog-api-client-java/pull/3306)
* add suppression version history [#3277](https://github.com/DataDog/datadog-api-client-java/pull/3277)
* Add processors groups to Observability Pipelines [#3231](https://github.com/DataDog/datadog-api-client-java/pull/3231)

### Added
* Update security finding triage specs [#3315](https://github.com/DataDog/datadog-api-client-java/pull/3315)
* Add routes for managing On-Call user notification channels [#3309](https://github.com/DataDog/datadog-api-client-java/pull/3309)
* Add host field to Post an event V2 API [#3307](https://github.com/DataDog/datadog-api-client-java/pull/3307)
* Add `GET /api/v2/apm/services` endpoint to public documentation [#3303](https://github.com/DataDog/datadog-api-client-java/pull/3303)
* Dashboards - Add semantic_mode support to FormulaAndFunctionMetricQueryDefinition [#3294](https://github.com/DataDog/datadog-api-client-java/pull/3294)
* Cloud SIEM - Add instantaneousBaseline feature parameter. [#3291](https://github.com/DataDog/datadog-api-client-java/pull/3291)
* Add new fields to usage metering api spec [#3289](https://github.com/DataDog/datadog-api-client-java/pull/3289)
* update geomap widget definition about `conditional_format` and `text_formats` and view focus [#3283](https://github.com/DataDog/datadog-api-client-java/pull/3283)
* Add new endpoint for listing rules for a gate [#3265](https://github.com/DataDog/datadog-api-client-java/pull/3265)

### Fixed
* Fix Java example template to properly wrap long scenario names in comments [#3305](https://github.com/DataDog/datadog-api-client-java/pull/3305)
* Add field attribute to the Workload Protection hash action [#3271](https://github.com/DataDog/datadog-api-client-java/pull/3271)

### Removed
* Tag security findings Jira endpoints as unstable [#3299](https://github.com/DataDog/datadog-api-client-java/pull/3299)

## 2.47.2/2025-12-11

### Fixed
* Fix Java example template to properly wrap long scenario names in comments [#3305](https://github.com/DataDog/datadog-api-client-java/pull/3305)

## 2.47.1/2025-12-09

### Fixed
* Don't create dep reduced pom [#3300](https://github.com/DataDog/datadog-api-client-java/pull/3300)

## 2.47.0/2025-12-08

### Fixed
* Bump the shade plugin to support Java 17 optimizations [#3281](https://github.com/DataDog/datadog-api-client-java/pull/3281)
* obs_pipelines: make google auth optional [#3260](https://github.com/DataDog/datadog-api-client-java/pull/3260)

### Added
* On-Call Add positioned schedule policy target [#3278](https://github.com/DataDog/datadog-api-client-java/pull/3278)
* Introduced new APIs to manage team hierarchy links [#3266](https://github.com/DataDog/datadog-api-client-java/pull/3266)
* Add Row Update Endpoints to Reference Tables API spec [#3256](https://github.com/DataDog/datadog-api-client-java/pull/3256)
* Add incident management seats  to spec [#3253](https://github.com/DataDog/datadog-api-client-java/pull/3253)
* Support provisioning teams from external sources [#3252](https://github.com/DataDog/datadog-api-client-java/pull/3252)
* security_monitoring - Add signalOutput field to ThreatHuntingJobResponseAttributes schema [#3250](https://github.com/DataDog/datadog-api-client-java/pull/3250)
* Add filter.scope to Monitor Notification Rules [#3246](https://github.com/DataDog/datadog-api-client-java/pull/3246)
* Add Support for Monitor Assets [#3236](https://github.com/DataDog/datadog-api-client-java/pull/3236)
* Add api specs for deployment gates [#3198](https://github.com/DataDog/datadog-api-client-java/pull/3198)

### Security
* Bump jackson library versions [#3274](https://github.com/DataDog/datadog-api-client-java/pull/3274)

### Changed
* Add Security Finding Ticketing endpoints [#3269](https://github.com/DataDog/datadog-api-client-java/pull/3269)
* Flatten file_metadata response schema to avoid OneOf unmarshaling issues [#3255](https://github.com/DataDog/datadog-api-client-java/pull/3255)

## 2.46.0/2025-11-14

### Added
* Add suppression tags [#3240](https://github.com/DataDog/datadog-api-client-java/pull/3240)
* Add Team Connection API Documentation [#3238](https://github.com/DataDog/datadog-api-client-java/pull/3238)
* Add new summary keys for new standalone billing dimensions [#3235](https://github.com/DataDog/datadog-api-client-java/pull/3235)
* Add Bits AI Investigations and On-Call to  API specs [#3232](https://github.com/DataDog/datadog-api-client-java/pull/3232)
* Add `PreviewCatalogEntities` [#3228](https://github.com/DataDog/datadog-api-client-java/pull/3228)
* Sync 'audience_management.yaml' files with backend [#3226](https://github.com/DataDog/datadog-api-client-java/pull/3226)
* 📝 [LOGSAC-1298] Add logs-pipeline type to restriction policy OpenAPI spec [#3219](https://github.com/DataDog/datadog-api-client-java/pull/3219)
* Security Monitoring - Update Signal Archive Reasons [#3217](https://github.com/DataDog/datadog-api-client-java/pull/3217)
* Add New Serverless Summary Entries to Api Spec [#3203](https://github.com/DataDog/datadog-api-client-java/pull/3203)
* Add metric namespace config filters to V2 GCP API [#3202](https://github.com/DataDog/datadog-api-client-java/pull/3202)
* Add specs for v2 eventbridge API [#3199](https://github.com/DataDog/datadog-api-client-java/pull/3199)
* Add last_login_time to Users v2 API [#3181](https://github.com/DataDog/datadog-api-client-java/pull/3181)
* Add Static Analysis Rules Endpoints [#3175](https://github.com/DataDog/datadog-api-client-java/pull/3175)

### Deprecated
* [api-spec] Mark PATCH /api/v2/incidents/incident_id/attachments endpoint as deprecated [#3237](https://github.com/DataDog/datadog-api-client-java/pull/3237)
* [METEXP-2068] Deprecate api/v1/search Endpoint [#3233](https://github.com/DataDog/datadog-api-client-java/pull/3233)

### Changed
* Rename historical job API endpoints to threat hunting [#3215](https://github.com/DataDog/datadog-api-client-java/pull/3215)

## 2.45.0/2025-10-27

### Added
* Add endpoints for Software Composition Analysis [#3214](https://github.com/DataDog/datadog-api-client-java/pull/3214)
* Add support for `Schema Processor` in `Logs Pipelines` [#3192](https://github.com/DataDog/datadog-api-client-java/pull/3192)
* Add new DeleteAssignee endpoint to Error Tracking APIs [#3187](https://github.com/DataDog/datadog-api-client-java/pull/3187)
* document agentless GCP scan options CRUD endpoints [#3183](https://github.com/DataDog/datadog-api-client-java/pull/3183)
* Document `/api/v2/roles/templates`  [#3170](https://github.com/DataDog/datadog-api-client-java/pull/3170)
* Add Reference Tables API spec [#3169](https://github.com/DataDog/datadog-api-client-java/pull/3169)
* Add blockedRequestPatterns to synthetics browser test options [#3163](https://github.com/DataDog/datadog-api-client-java/pull/3163)
* Add `BulkDeleteDatastoreItems` to Datastore API spec [#3162](https://github.com/DataDog/datadog-api-client-java/pull/3162)
* Add some missing Workload Protection agent rule fields [#3161](https://github.com/DataDog/datadog-api-client-java/pull/3161)
* Add AzureScanOptions to agentless scanning API [#3159](https://github.com/DataDog/datadog-api-client-java/pull/3159)

### Changed
* Include mention to new scanned-assets-metadata endpoint on container images v2 endpoint [#3191](https://github.com/DataDog/datadog-api-client-java/pull/3191)
* Include mention to new scanned-assets-metadata endpoint on hosts v1 endpoint [#3190](https://github.com/DataDog/datadog-api-client-java/pull/3190)
* security_monitoring - Add indexes to deprecate index in ruleQuery [#3184](https://github.com/DataDog/datadog-api-client-java/pull/3184)
* Add support for vulnerability management - Add ListScannedAssetsMetadata new endpoint and update existing ones [#3182](https://github.com/DataDog/datadog-api-client-java/pull/3182)
* Update description, operationId and examples for tag pipeline and custom allocation rules [#3178](https://github.com/DataDog/datadog-api-client-java/pull/3178)

### Fixed
* Update the summary name for get a tag pipeline ruleset. [#3188](https://github.com/DataDog/datadog-api-client-java/pull/3188)

## 2.44.0/2025-09-30

### Added
* Add API Key ID to rum application response [#3157](https://github.com/DataDog/datadog-api-client-java/pull/3157)
* Add suppression list query string parameter [#3156](https://github.com/DataDog/datadog-api-client-java/pull/3156)
* Add datastore trigger to workflows public API  [#3153](https://github.com/DataDog/datadog-api-client-java/pull/3153)
* Add Google PubSub destination to the Observability Pipelines API [#3144](https://github.com/DataDog/datadog-api-client-java/pull/3144)
* Add API spec for AWS Integrations standard and resource collection IAM permissions [#3142](https://github.com/DataDog/datadog-api-client-java/pull/3142)
* Publish new incident impact APIs [#3138](https://github.com/DataDog/datadog-api-client-java/pull/3138)
* Add product analytics to FormulaAndFunctionEventsDataSource [#3137](https://github.com/DataDog/datadog-api-client-java/pull/3137)
* Add sequence detection to security monitoring rules [#3132](https://github.com/DataDog/datadog-api-client-java/pull/3132)
* Add Public Delete Dora Events Endpoints [#3114](https://github.com/DataDog/datadog-api-client-java/pull/3114)

### Fixed
* Remove any references to synthetics test suites [#3148](https://github.com/DataDog/datadog-api-client-java/pull/3148)

### Changed
* Add tag pipeline, custom allocation rule and get cloud account by id for AWS/Azure/GCP configs APIs [#3131](https://github.com/DataDog/datadog-api-client-java/pull/3131)

## 2.43.0/2025-09-15

### Added
* Add Query Parameters to ListOrgConnections Endpoint [#3130](https://github.com/DataDog/datadog-api-client-java/pull/3130)
* Add Incident Notification Rules Public Spec [#3123](https://github.com/DataDog/datadog-api-client-java/pull/3123)
* Update v1 and v2 GCP API specs to support `monitored_resource_configs` [#3121](https://github.com/DataDog/datadog-api-client-java/pull/3121)
* Add action datastore API [#3101](https://github.com/DataDog/datadog-api-client-java/pull/3101)
* Security Monitoring - Make hasOptionalGroupByFields updatable [#3058](https://github.com/DataDog/datadog-api-client-java/pull/3058)

### Deprecated
* Promote unstable aws v2 APIs and deprecate v1 [#3120](https://github.com/DataDog/datadog-api-client-java/pull/3120)

### Changed
* Allow to send batches of events in pipelines API [#3104](https://github.com/DataDog/datadog-api-client-java/pull/3104)

## 2.42.0/2025-09-09

### Added
* Add Incident Notification Template Public Docs [#3116](https://github.com/DataDog/datadog-api-client-java/pull/3116)
* Add Cross Org API to Open API specs [#3115](https://github.com/DataDog/datadog-api-client-java/pull/3115)
* Add readonly ID of synthetics test steps [#3111](https://github.com/DataDog/datadog-api-client-java/pull/3111)
* Create Cloud SIEM histsignals endpoints [#3110](https://github.com/DataDog/datadog-api-client-java/pull/3110)
* Security Monitoring - Validation Endpoint for Suppressions [#3107](https://github.com/DataDog/datadog-api-client-java/pull/3107)
* Update Get All Notification Rules API docs to include pagination, sorting, and filtering params [#3105](https://github.com/DataDog/datadog-api-client-java/pull/3105)
* Security Monitoring - Related Suppressions for a Rule [#3103](https://github.com/DataDog/datadog-api-client-java/pull/3103)
* Extend Widget time schema with support for hide_incomplete_cost_data [#3091](https://github.com/DataDog/datadog-api-client-java/pull/3091)
* Add SDS rule `should_save_match` field [#3089](https://github.com/DataDog/datadog-api-client-java/pull/3089)
* Add spec for Agentless GetAwsScanOptions [#3086](https://github.com/DataDog/datadog-api-client-java/pull/3086)
* Add Cross Org API to Open API specs [#3084](https://github.com/DataDog/datadog-api-client-java/pull/3084)
* Add DNAP Spark Pod Autosizing service to API client [#3080](https://github.com/DataDog/datadog-api-client-java/pull/3080)
* Add version parameter to synthetic test trigger ci endpoint [#3079](https://github.com/DataDog/datadog-api-client-java/pull/3079)
* Document Error Tracking public APIs [#3076](https://github.com/DataDog/datadog-api-client-java/pull/3076)
* Add docs for 404 not found error in cost-onboarding-api [#3071](https://github.com/DataDog/datadog-api-client-java/pull/3071)
* Adds async Scorecard outcomes batch update endpoint [#3061](https://github.com/DataDog/datadog-api-client-java/pull/3061)

### Fixed
* Security Monitoring - Fix payload of Validation Endpoint for Suppressions [#3112](https://github.com/DataDog/datadog-api-client-java/pull/3112)
* [CCA-938][CCC-883] Audit existing CCM endpoints in OpenAPI spec [#3067](https://github.com/DataDog/datadog-api-client-java/pull/3067)
* Add enum Dataset type to Dataset API spec [#3065](https://github.com/DataDog/datadog-api-client-java/pull/3065)

### Changed
* Update public cost permissions [#3088](https://github.com/DataDog/datadog-api-client-java/pull/3088)
* Add Product Scales support to RUM v2 Applications API [#3069](https://github.com/DataDog/datadog-api-client-java/pull/3069)

## 2.41.0/2025-08-12

### Added
* Add Flex_Logs_Compute_XL to API Spec [#3049](https://github.com/DataDog/datadog-api-client-java/pull/3049)
* Support Host and IaC finding types in security notifications  [#3048](https://github.com/DataDog/datadog-api-client-java/pull/3048)
* New keys for summary public endpoint for Event Management Correlation product [#3044](https://github.com/DataDog/datadog-api-client-java/pull/3044)
* Add log autosubscription tag filters config to aws v2 API [#3040](https://github.com/DataDog/datadog-api-client-java/pull/3040)
* Extended List Findings API to expose resource related Private IP Addresses to details [#3033](https://github.com/DataDog/datadog-api-client-java/pull/3033)
* update metrics.yaml for ListMetricAssets and include Dashboard info [#3028](https://github.com/DataDog/datadog-api-client-java/pull/3028)
* Support Cloud SIEM scheduled rules in API client [#3025](https://github.com/DataDog/datadog-api-client-java/pull/3025)
* Uncomment edit dataset block, add dataset limitations into endpoint descriptions  [#3023](https://github.com/DataDog/datadog-api-client-java/pull/3023)
* Add `text` field in synthetics search endpoint [#3022](https://github.com/DataDog/datadog-api-client-java/pull/3022)
* Adding all action connection types to public API [#3021](https://github.com/DataDog/datadog-api-client-java/pull/3021)
* Document case management attributes endpoints [#3019](https://github.com/DataDog/datadog-api-client-java/pull/3019)
* add AP2 endpoint for On-Call Paging [#3016](https://github.com/DataDog/datadog-api-client-java/pull/3016)
* Flag IP case action [#3014](https://github.com/DataDog/datadog-api-client-java/pull/3014)
* Add DNS specs for Cloud Network Monitoring API [#3012](https://github.com/DataDog/datadog-api-client-java/pull/3012)
* Adding Datadog Connection to Connection API [#3006](https://github.com/DataDog/datadog-api-client-java/pull/3006)

### Fixed
* Split Dataset into separate request and response objects, mark unstable [#3032](https://github.com/DataDog/datadog-api-client-java/pull/3032)
* Disables some tests to avoid fails as the service is disabled [#3027](https://github.com/DataDog/datadog-api-client-java/pull/3027)
* OP make 'support_rules' field in parse_grok processor optional [#3017](https://github.com/DataDog/datadog-api-client-java/pull/3017)

### Deprecated
* Deprecate signals triage v1 endpoints [#3029](https://github.com/DataDog/datadog-api-client-java/pull/3029)

## 2.40.0/2025-07-14

### Added
* Add Datasets API to Open API Spec  [#2992](https://github.com/DataDog/datadog-api-client-java/pull/2992)
* Add support for vulnerability management - GetSBOMsList new endpoint and update existing ones [#2991](https://github.com/DataDog/datadog-api-client-java/pull/2991)
* Add spreadsheet to restriction_policy specs [#2985](https://github.com/DataDog/datadog-api-client-java/pull/2985)
* Add API spec for AWS Integrations IAM permissions [#2961](https://github.com/DataDog/datadog-api-client-java/pull/2961)
* New keys added for multiple products [#2959](https://github.com/DataDog/datadog-api-client-java/pull/2959)
* Add support for `Array Processor` in `Logs Pipelines` [#2952](https://github.com/DataDog/datadog-api-client-java/pull/2952)

### Changed
* Add support for vulnerability management - GetSBOMsList new endpoint and update existing ones [#2991](https://github.com/DataDog/datadog-api-client-java/pull/2991)

## 2.39.0/2025-07-02

### Added
* Adds missing /api/v1/synthetics/tests/search spec [#2973](https://github.com/DataDog/datadog-api-client-java/pull/2973)
* Add extractFromEmailBody step for synthetics browser test [#2956](https://github.com/DataDog/datadog-api-client-java/pull/2956)
* Update Incident API specs to include `is_test` in `POST /incidents` and incidents response [#2945](https://github.com/DataDog/datadog-api-client-java/pull/2945)
* Add App Key Registration API  [#2939](https://github.com/DataDog/datadog-api-client-java/pull/2939)
* Document Cloud Cost Management GCP endpoints publicly [#2896](https://github.com/DataDog/datadog-api-client-java/pull/2896)
* Add Monitor Template API [#2876](https://github.com/DataDog/datadog-api-client-java/pull/2876)

### Changed
* Update template variable schemas with type field in dashboards and shared dashboards endpoints for group by template variables [#2955](https://github.com/DataDog/datadog-api-client-java/pull/2955)
* Update events intake specs for v2 Events post endpoint [#2946](https://github.com/DataDog/datadog-api-client-java/pull/2946)

### Fixed
* Synthetics mobile test `message` field is now required [#2951](https://github.com/DataDog/datadog-api-client-java/pull/2951)
* Make dns port be string and number [#2935](https://github.com/DataDog/datadog-api-client-java/pull/2935)

### Security
* Remove caseIndex from historical jobs api spec [#2950](https://github.com/DataDog/datadog-api-client-java/pull/2950)

### Deprecated
* Deprecate SLO metadata fields in api spec [#2900](https://github.com/DataDog/datadog-api-client-java/pull/2900)

## 2.38.0/2025-06-24

### Fixed
* Fix basic auth requirements [#2932](https://github.com/DataDog/datadog-api-client-java/pull/2932)

### Added
* Microsoft Sentinel Public API support [#2930](https://github.com/DataDog/datadog-api-client-java/pull/2930)
* Add the AP2 datacenter. [#2928](https://github.com/DataDog/datadog-api-client-java/pull/2928)

## 2.37.0/2025-06-23

### Fixed
* Fix basic auth requirements [#2932](https://github.com/DataDog/datadog-api-client-java/pull/2932)
* Add support for the api_security detection rule type [#2927](https://github.com/DataDog/datadog-api-client-java/pull/2927)

### Added
* Microsoft Sentinel Public API support [#2930](https://github.com/DataDog/datadog-api-client-java/pull/2930)
* Add hash field to actions in CWS agent rules [#2921](https://github.com/DataDog/datadog-api-client-java/pull/2921)
* Add custom fields to Rule update/validate API public documentation. [#2917](https://github.com/DataDog/datadog-api-client-java/pull/2917)
* SDCD-1142: adding `custom_tags` optional attribute to DORA API spec [#2897](https://github.com/DataDog/datadog-api-client-java/pull/2897)
* Add sampling fields to SDS spec [#2893](https://github.com/DataDog/datadog-api-client-java/pull/2893)
* Add API spec for team hierarchy APIs [#2871](https://github.com/DataDog/datadog-api-client-java/pull/2871)

### Changed
* Update events intake specs for v2 Events post endpoint [#2907](https://github.com/DataDog/datadog-api-client-java/pull/2907)

## 2.36.0/2025-06-16

### Changed
* Add billing read permission [#2902](https://github.com/DataDog/datadog-api-client-java/pull/2902)
* Update DORA endpoints [#2885](https://github.com/DataDog/datadog-api-client-java/pull/2885)

### Added
* Add `form` field for `multipart/form-data` HTTP API tests [#2898](https://github.com/DataDog/datadog-api-client-java/pull/2898)
* Add new endpoint to upsert/list/delete custom kinds [#2892](https://github.com/DataDog/datadog-api-client-java/pull/2892)
* Add spec for team on-call endpoint [#2890](https://github.com/DataDog/datadog-api-client-java/pull/2890)
* Add support for all subtypes in multistep steps [#2865](https://github.com/DataDog/datadog-api-client-java/pull/2865)
* Added new optional field definition to include more detail in findings for '/api/v2/posture_management/findings'  [#2863](https://github.com/DataDog/datadog-api-client-java/pull/2863)
* Exposing set action on Terraform V2 [#2862](https://github.com/DataDog/datadog-api-client-java/pull/2862)
* Add monitor draft status field [#2861](https://github.com/DataDog/datadog-api-client-java/pull/2861)
* Add rum application to restriction policy [#2762](https://github.com/DataDog/datadog-api-client-java/pull/2762)

## 2.35.0/2025-05-28

### Fixed
* add `include` parameter to On-Call team rules test [#2877](https://github.com/DataDog/datadog-api-client-java/pull/2877)
* fix On-Call spec [#2867](https://github.com/DataDog/datadog-api-client-java/pull/2867)
* Make assertion target be int or string [#2859](https://github.com/DataDog/datadog-api-client-java/pull/2859)
* Fix incorrect pattern for url [#2851](https://github.com/DataDog/datadog-api-client-java/pull/2851)
* Make metadata optional for GCS destination [#2840](https://github.com/DataDog/datadog-api-client-java/pull/2840)
* Remove isReadOnly default when creating dashboards [#2839](https://github.com/DataDog/datadog-api-client-java/pull/2839)

### Added
* Add support for Datadog Events as a data source for rules [#2870](https://github.com/DataDog/datadog-api-client-java/pull/2870)
* Add public APIs to search DORA events [#2868](https://github.com/DataDog/datadog-api-client-java/pull/2868)
* Adding endpoints to manage Resource Evaluation Filters [#2857](https://github.com/DataDog/datadog-api-client-java/pull/2857)
* Add Sev0 as a supported incident severity [#2854](https://github.com/DataDog/datadog-api-client-java/pull/2854)
* Share timerestriction object [#2850](https://github.com/DataDog/datadog-api-client-java/pull/2850)
* add On-Call Paging spec [#2843](https://github.com/DataDog/datadog-api-client-java/pull/2843)
* Add pagination method for NDM ListDevices. [#2837](https://github.com/DataDog/datadog-api-client-java/pull/2837)
* Add On-Call Team Rules [#2835](https://github.com/DataDog/datadog-api-client-java/pull/2835)

## 2.34.1 / 2025-04-14

### Fixed
* Change `type` to enum to discriminate included items in the response of `ListCatalogEntity` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2768
* Deprecate options from logs aggregate API public spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2776
* change a category in enum for datadog_appsec_waf_custom_rule by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2770
### Added
* Add datasource to job definition for security monitoring  by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2763
* Include new rum types in Usage_metering Yaml by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2766
* Adding new UT apm_error_events keys in summary endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2760
* Add more triggers for workflow automation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2771
* Add specs for Cloud Network Monitoring API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2780
* Add more Security Monitoring Data Source enum values by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2775
* Add componentOf field to Service, Queue, and Datastore V3 Software Catalog definitions by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2778
* Add 'mute_buttons' argument to slack channel definition by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2782
* Add Observability Pipelines API  by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2781
* add rum slo bugfix by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2789
* Add trace_rate support to APM retention filter APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2793
* Update NDM GetInterfaces documentation to add ip_addresses attribute by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2792
* Add assertRequests browser step type by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2797
* Add user behavior case actions in API spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2796
### Changed
* Remove OpenAPI enum enforcement of Service Definition v2dot2 type field from service definition endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2764
* Add on-call schedules endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2783


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.33.1...datadog-api-client-2.34.1

## 2.33.1 / 2025-03-11

### Changed
* Remove meta from RUM retention filters APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2756


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.33.0...datadog-api-client-2.33.1

## 2.33.0 / 2025-03-11

### Fixed
* Remove `javascript` browser variable type by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2702
* Additional rules to inject openapi type by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2723
* Fix `ListCatalogEntity` pagination endpoint to use correct offset value by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2740
### Added
* add new related_assets filter query parameter to the get a list of metrics V2 API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2664
* Add actions and groupSignalsBy field in detection rules API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2704
* Add Workflows CRUD Public API Endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2693
* Add endpoint to retrieve Security Monitoring rule version history by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2670
* Adds override_existing_configurations and include_actively_queried_configurations to bulk tag config endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2714
* Add `number_format` to each formula in widget by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2716
* Add `trend` support for `cell_display_mode` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2713
* Add support for span id remapper in logs pipelines processors by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2724
* Add evaluation_window and keep_alive for Security monitoring rule by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2725
* Add `extractedValuesFromScript` to multistep API tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2730
* Update timezone for cumulative window by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2729
* Document Agentless AWS scan options routes by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2737
* Create types for app builder queries explicitly, remove experimental flag by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2707
* Document Agentless AWS on demand routes by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2741
* Add quality_issues to monitor schema on monitor search API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2743
* Introduce public v2 endpoints for Application Security by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2731
* Add delete log index to public API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2742
* Add v2 endpoints for RUM retention filters. by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2739
* Added storage class information to the S3 archive destination by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2749
### Changed
* Revert GetSBOM to `x-unstable` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2708
* Update documentation with account filtering info for aws_cur_config endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2719
* Update sharing APIs to match server by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2728
* Update Vulnerabilities endpoints documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2732
### Deprecated
* Deprecate API management endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2718

## New Contributors
* @amaanq made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/2706

**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.32.0...datadog-api-client-2.33.0

## 2.32.0 / 2025-02-05

### Fixed
* Modify owner properties to be a string by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2694
### Added
* Add UT breakdown for fargate_container_profiler billing dimension by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2622
* Add synthetics browser step public_id field by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2500
* Add support for vulnerability management  by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2623
* add start_date to suppression APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2590
* Add CSM Coverage Analysis API specs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2628
* Add allow_self_lockout to documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2636
* Ephemeral Infra_host new keys in summary endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2638
* Update app builder API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2632
* Add meta and source fields to JSONAPIErrorItem by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2631
* Add CSM Agentless Read Endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2629
* Update rum doc to include new usage types by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2641
* add cost monitor type to API Spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2652
* Add Action Connection API for Workflow Automation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2639
* Add `type` in Data Deletion API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2656
* Add `provider_name` attribute to pipelines API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2643
* Add support for vulnerability management - GetSBOM new endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2657
* Remove preview status for GetBillingDimensionMapping endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2669
* Add encryption field to logs archive destination by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2667
* Add tags and description to logs pipelines by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2672
* Publish security notification rules API endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2665
* Publish app builder API documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2645
* update public document with configuration event type by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2682
* Add support for Entity kind API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2689
* Rename `embeddedQueries` attribute to `queries` in app builder api by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2690
### Changed
* Fix specification for Azure metric filtering by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2626
* Change allow_self_lockout from string to bool by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2640
* remove flag Beta for cost-by-tag endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2679
* Added Support for Workflow Webhooks Public API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2683
* Vulnerabilities endpoints GA - Remove `x-unstable` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2691

## New Contributors
* @nikita-tkachenko-datadog made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/2674

**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.31.0...datadog-api-client-2.32.0

## 2.31.0 / 2024-12-17

### Added
* Adds accepted reasons for archiving signal by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2479
* Add usage type breakdown for error tracking billing dimension by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2559
* Add Historical Job endpoints to Datadog API spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2558
* Add new keys for CWS Fargate Task in summary usage and usage attribution endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2563
* Add missing measures for SLOs data source by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2564
* Create AWS Integrations v2 API spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2309
* Add step_functions as valid enum for v1 AWS tag filter spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2570
* Fix authz scope descriptions by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2580
* Updated OpenAPI logs_pattern_query to support Patterns for any attribute by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2579
* Add API specification for events intake v2 by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2521
* Data Deletion Endpoints Documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2566
* Add `exitIfSucceed` to multistep API tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2606
* Security Monitoring Rule - Add the updatedAt field in the SecurityMonitoringStandardRuleResponse by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2582
* add docs for pagination in /api/v2/metrics endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2492
* Add daily as a valid enum for SLOReportInterval by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2615
* Add new product Code Security host for summary endpoint and UA endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2584
* Add CSM Agents Read Endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2613
* Add app builder API spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2608
### Changed
* Fix spelling error for bindings by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2560
* Revert the earlier spelling change by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2565
* Remove mobile device ids and make all device ids simple string by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2576
* Remove support for `namespace_filters.include/exclude_all` in v2 AWS Integrations API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2578
* Add running pipelines on custom pipelines API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2573
### Removed
* Remove unnecessary field in list stream column config by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2616
### Deprecated
* Remove `/api/v2/cost/enabled` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2603

## New Contributors
* @bthuilot made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/2611

**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.30.0...datadog-api-client-2.31.0

## 2.30.0 / 2024-11-07

### Fixed
* Fix Toplist widget's stacked display style - remove legend as required field by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2501
* Remove user fields that are unsupported by the Incidents API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2512
* Fix Synthetics batch status by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2553
### Added
* Add MSTeams integration metadata info by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2514
* Add `code_analysis_sa_committers_hwm` and `code_analysis_sca_committers_hwm` to UsageMetering by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2515
* Update GCP API Spec to support `is_resource_change_collection_enabled` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2518
* Add vulnerability type to Findings API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2517
* Update Documentation for Data Stream Monitoring by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2523
* Add LLM Observability to ListStreamSource by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2522
* Add synthetics stepDetail.allowFailure and stepDetail.failure by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2531
* Integrate incident types into Incidents API documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2516
* Add `use_recommended_keywords` attribute to sensitive data scanner rule spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2542
* Add domain allowlist endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2539
* Add v2 endpoints for RUM custom metrics. by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2538
* Documentation for beta /v2/usage/billing_dimension_mapping by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2470
* Add `alwaysExecute` and `exitIfSucceed` to Synthetics steps by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2554
* Add metric_namespace_configs to GCP v2 API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2556
### Changed
* Edit Naming for v2 Microsoft Teams Integration Endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2513
* Change the mobile device ids from enum to string by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2511
* Mark Cost Attribution end_month parameter as not required by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2498
* Allow for any type for additionalProperties in HTTPLogItem by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2530
* Make some amendments to the new mobiles schema by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2529
* Make value be oneOf number or string by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2543
* Add examples for resources for Cloudflare by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2537
### Removed
* Remove deprecated estimated usage types for usage attribution by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2535
### Deprecated
* Deprecate two sds metadata fields by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2528
* Delete `api/v2/cost/aws_related_accounts` from spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2544
* Deprecate `api/v2/cost/enabled` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2549


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.29.0...datadog-api-client-2.30.0

## 2.29.0 / 2024-10-02

### Fixed
* change schema used in FastlyServicesResponse by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2491
### Added
* Add new synthetics HTTP javascript assertion by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2416
* Dashboards - Toplist widget style - Add palette by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2466
* Allow Table Widget requests to specify text replace formatting in dashboards by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2467
* Add documentation for Data Jobs Monitoring summary keys by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2471
* Update estimate docs with realtime changes by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2495
* Ensure clients can handle empty oneOf objects by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2493
* Add referenceTables field to security monitoring endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2488
* Add UA documentation for new DJM usage_type by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2489
* Add v2 endpoints for MS Teams Integration by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2497
* Add documention for OCI Integration by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2504
* Add schema for mobile test by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2480
* Add Synthetics endpoint to fetch uptimes in API spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2459
### Changed
* Split the synthetics request port field into a oneOf by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2474
* Remove unused field `color` in `TeamUpdateAttributes` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2472
* Powerpack add support for prefix and available values by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2481
* Update v2 metrics list endpoint filter by metric type to use metric type category by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2496


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.28.0...datadog-api-client-2.29.0

## 2.28.0 / 2024-09-04

### Fixed
* Add `is_totp` and `is_fido` to Synthetic global variables by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2384
### Added
* Add `api_key` and `name` to `CloudflareAccountResponseAttributes`. by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2430
* Add `api_key` and `name` to `FastlyAccountUpdateRequestAttributes`. by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2431
* Add `opsgenie_api_key` to `OpsgenieServiceResponseAttributes`. by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2432
* Add `category` and `remote_config_read_enabled` to `APIKeyCreateAttributes`, and add `LeakedKey`. by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2433
* Allow 4 group-bys for pattern viz by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2441
* add url attribute to metrics assets v2 api by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2443
* Add editable field to suppression rule by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2340
* Add `num_flex_logs_retention_days` field to logs_indexes api spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2444
* Software catalog openapi spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2440
### Changed
* allow variables in port by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2424
* Fix VFTs and extracted local variables enum types by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2405
* Changed Widget time schema to add support for new fixed_span and live_span object by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2428
### Deprecated
* mark groupby_simple_monitor as deprecated by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2456


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.27.0...datadog-api-client-2.28.0

## 2.27.0 / 2024-08-12

### Fixed
* fix monitor enum by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2371
* dashboards add support for time-slice SLOs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2372
* Make modified by field nullable for get all API keys by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2377
* Add `409 Conflict` to `CreateGlobalVariable` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2388
### Added
* Add network performance monitor type to API spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2341
* Document `force_delete_dependencies` for synthetics test deletion by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2334
* Support metric filtering in integration azure GET, PUT APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2351
* add enableProfiling and enableSecurityTesting options by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2363
* Add convert rule JSON to terraform to Datadog API Spec. by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2332
* add changes for datadog partner program to estimated cost and billable usage APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2336
* Add type as a required field for the different basic auth types by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2355
* Adding Network Device Monitoring API Documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2343
* Security Monitoring - Support anomaly threshold detection method by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2369
* update hourly usage API docs for partner program by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2379
* Add resource_type query param to authn mapping spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2308
* Add rum stream to API definition by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2383
* Support `incident_analytics` enum in dashboard widget `FormulaAndFunctionEventsDataSource` data sources by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2394
* update usage summary API docs for partner program by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2391
* update historical_cost and projected_cost for partner program by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2381
* Add custom cost endpoints to public API documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2395
* Update documentation for Cloud SIEM Analyzed Logs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2398
* Update documentation for App Sec SCA by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2386
* Add trigger API documentation for workflow automation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2360
* Add PUT endpoint to scorecards APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2406
* Documentation for new device tags endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2400
* Update documentation for Flex Logs Starter by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2414
### Changed
* add mfa_enabled field and change created_at type to datetime by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2415
### Removed
* Fall back to the schema type if the format type is unrecognized. by @jack-edmonds-dd in https://github.com/DataDog/datadog-api-client-java/pull/2392
### Deprecated
* Deprecate `ListAWSRelatedAccounts` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2387

## New Contributors
* @amaskara-dd made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/2376

**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.26.0...datadog-api-client-2.27.0

## 2.26.0 / 2024-07-02

### Fixed
* Security Monitoring - Define specific payload for rule validation/testing by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2306
* Remove the maximum limitation for the synthetics renotify_interval monitor option by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2310
* Add bodyHash as a synthetics assertion type. by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2311
* Add org.aopalliance to the list of packages to shade. by @jack-edmonds-dd in https://github.com/DataDog/datadog-api-client-java/pull/2315
* Add missing attributes envelope in ListAPIs response by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2321
### Added
* Allow the usage of the filters field when creating an agent rule by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2286
* Add tileDef sort attribute by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2288
* Add Security Monitoring rule test endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2302
* Add originalFileName field to the SyntheticsTestRequestBodyFile definition by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2307
* Add support for API management ListAPIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2314
* Add elementsOperator to json path assertion for synthetic HTTP tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2327
* Add /api/v2/org_configs specs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2326
* Update docs for RU Rollout New and Deprecated Keys planned for Oct 1st by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2339
* Add option for wait step in multistep api tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2338
* add cross org uuids to timeseries query by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2331
### Changed
* Monitor priority can have custom ranges and be null by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2335

## New Contributors
* @jack-edmonds-dd made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/2315
* @tim-chaplin-dd made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/2248

**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.25.0...datadog-api-client-2.26.0

## 2.25.0 / 2024-05-22

### Fixed
* fix case search documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2266
### Added
* Add support variablesFromScript in Synthetics API test by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2268
* Add JSONSchema assertion support to API and multistep tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2246
* add 1 day logs to usage api docs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2272
* Update UserTeamIncluded to include teams by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2277
* Security Monitoring - Make Default Tags available in the response by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2285
* Add flex logs storage tier by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2287
### [**Breaking**] Changed
* Rename the Cloud Workload Security tag to CSM Threats by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2276


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.24.0...datadog-api-client-2.25.0

## 2.24.0 / 2024-04-11

### Fixed
* Update Cleanup script to use GCP STS endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2226
* Add include data to get team memberships response by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2212
### Added
* Add `ci-pipeline-fingerprints` field in v2.2 by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2232
* Add validation endpoint for Security Monitoring Rules by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2251
* Add UA documentation for online_archive and incident_management by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2254
* Mark `unit` as nullable by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2256
* Add query_interval_seconds to time-slice SLO condition parameters by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2258
* Support providing files for the file upload feature when creating a Synthetic API test by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2257
* Adding SLO Reporting API Documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2228
* Security Monitoring Suppression - Add data_exclusion_query field by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2262
* aws api adding extended and deprecating old resource collection field by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2260
### Changed
* Add Team relationship to AuthNMappings by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2183
### Deprecated
* Remove deprecated /api/v1/usage/attribution by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2242
* Deprecate legacy hourly usage metering endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2238


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.23.0...datadog-api-client-2.24.0

## 2.23.0 / 2024-03-13

### Fixed
* Include user data with team membership resource by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2181
* Apply static analysis fixes by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/2147
* Disable additionalProperties for Downtime Schedule UpdateRequest oneOfs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2193
* Fix ListServiceDefinitions pagination information by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2220
### Added
* add ASM serverless to usage metering API docs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2197
* Add new products to usage API docs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2204
* Adds support for `ListMetricAssets` endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2199
* Add support for new CRUD agent rules endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2215
* Add documentation for workflow usage attribution by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2221
* Add Custom Destinations Public API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2225
### Deprecated
* Deprecate the pattern property for SDS Standard Pattern Attributes by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2216
* Deprecate Incident Services endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2227

## New Contributors
* @antonio-ramadas-dd made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/2224

**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.22.0...datadog-api-client-2.23.0

## 2.22.0 / 2024-02-21

### Fixed
* Relocate additional packages and remove duplicate patterns by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/2186
* Move under common tag Case Management by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2188
### Added
* Case Management Public API documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2159
* Make grpc steps available for synthetics api multisteps tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2185
* Add cloud run filter to GCP v1 and v2 spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2156
* Exclude additional files from shaded jar by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/2195
### Changed
* Update spec for DORA Metrics Incident endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2182


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.21.0...datadog-api-client-2.22.0

## 2.21.0 / 2024-02-07

### Fixed
* Add test support for file parameters by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2150
* Fix multipart handling by @therve in https://github.com/DataDog/datadog-api-client-java/pull/2155
* Security Monitoring Suppressions - Make expiration date nullable in update payload by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2160
### Added
* Security Monitoring - Add API support for suppression rules by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2143
* Document support for BYDAY in SLO corrections by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2151
* Add missing optional field env in DORA API endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2152
* Add compressedProtoFile field to SyntheticsTestRequest by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2149
* Add daily limit reset options to logs indexes api by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2153
* Add support for API management API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2148
* Add pagination helper for team memberships by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2163
* Increase limit on allowed number of graphs in split graph widget by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2168
### Deprecated
* Mark dashboard 'is_read_only' and 'restricted_roles' properties as deprecated by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2135


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.20.0...datadog-api-client-2.21.0

## 2.20.0 / 2024-01-10

### Added
* Add priority field to SDS rule and standard-pattern by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2110
* Document new `resource_collection` and `is_security_command_center_enabled` fields in GCP APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2111
* Add SAML attributes by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2104
* Security Monitoring - Support custom third party rules by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2128
* Add public API support for time-slice SLOs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2120
* Add included_keyword_configuration field to SDS rule by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2132
* Update Documentation for APM DevSecOps by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2133
### Changed
* Mark v1 downtime endpoints as deprecated by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2125
* Adding Cloud Cost Management API Documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2118
* Add support for Cloudflare API `zone` and `resource` fields by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2130

## New Contributors
* @enderdincer made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/2131

**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.19.0...datadog-api-client-2.20.0

## 2.19.0 / 2023-12-12

### Added
* Document `included_keywords` in `ListStandardPatterns` response by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2086
* Document fields `remote_config_read_enabled` and `category` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2082
* Update Azure Spec to include Resource Collection by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2091
* Allow creation of Application Security detection rules from the v2 API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2093
* Add Okta Integration APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2069
* Remove unstable flag for Events v2 api by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2098


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.18.0...datadog-api-client-2.19.0

## 2.18.0 / 2023-11-20

### Fixed
* Fix typo in service definition field by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2057
* Fix Powerpack schema by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2055
* Close the response before retry by @therve in https://github.com/DataDog/datadog-api-client-java/pull/2081
### Added
* Add scorecards endpoints  by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2050
* Document top list widget style by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2035
* Add optional group-bys support to security signals by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2053
* Add support for projected-cost endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2037
* Document missing incident fields by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2059
* Add active billing dimensions to usage metering by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2076
* Add Cost Attribution To Usage Metering Public Beta Documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2062
* Update spec to include new DORA API endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2075
* Add support to patch Synthetics test with partial data using JSON Patch by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2070
* Document new api/app key schemas by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2058
* Document new field `filters` for `CloudWorkloadSecurityAgentRule` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2080
* Live and historical custom timeseries docs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2068
* Add week_to_date and month_to_date to widget livespan by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2071


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.17.0...datadog-api-client-2.18.0

## 2.17.0 / 2023-11-02

### Fixed
* Fix schema for query scalar API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1979
* Remove the application key from CreateCIAppPipelineEvent endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1991
* Document 403 on team endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1998
* Powerpack improve group_widget object by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2011
* Remove escalation message default by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2024
* Remove notify_no_data default by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2034
* Fix SecurityMonitoringSignalAttribute field name by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2042
### Added
* Add split graph widget to dashboard schema  by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1956
* Update public docs for CSM Enterprise and CSPM by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1975
* Add serverless apps to usage and usage attribution by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1996
* Add Network Device Monitoring Netflow to usage by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2005
* Add Powerpacks endpoints to public api spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1976
* Add account-tags to GCP Service Account Attributes by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1990
* Add powerpack widget to dashboard schema by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2006
* Add custom schedule to monitor scheduling options by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1993
* Service Catalog support service definition schema v2.2 by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2015
* Powerpack pagination and test fixes by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2019
* Add support for container images endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2017
* Add global IP ranges to spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1680
* Update documentation for Cloud SIEM by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2026
* Add containers API spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2027
* Add serverless apm to usage attribution api by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2032
* Document missing parameters by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1992
* Powerpack Live Span Support by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2040
* Add Amazon EventBridge endpoints to AWS Integration API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2029
* Add Container App filters to Azure API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2010
* Add UUID format support by @HantingZhang2 in https://github.com/DataDog/datadog-api-client-java/pull/2046
* Add new UA products to usage metering docs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2044
### Changed
* Add APM retention filter api documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1965
* Update request requirements of CI Visibility public pipelines write API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2000
* Add get APM retention filter endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2003
* Remove beta label notice on create pipeline API endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2018
* Add Beta Banner to Send Pipeline Events Endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2041
* Remove endpoint for mute or unmute a finding and add support for bulk mute findings endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/2036

## New Contributors
* @lx4r made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/1988

**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.16.0...datadog-api-client-2.17.0

## 2.16.0 / 2023-09-14

### Fixed
* Fix downtimes monitor relationship id schema type by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1961
### Added
* Add trace_stream to dashboard ListStreamSource by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1933
* Add pagination extension to SLO corrections by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1945
* Adding aas count to the documentation for summary and hourly usage endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1948
* Add pagination extension to SLOs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1946
* Add pagination extension to monitors by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1949
* Add pagination extension to synthetics tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1953
* Add 'style' to sunburst requests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1952
* Add pagination extension to notebook by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1954
* Add support for dashboard listing pagination parameters by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1958
* Add pagination parameters to downtimes listing by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1960
* Add pagination extension to user list by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1959
* Add pagination extension to team listing by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1962
* Remove private beta for Downtimes v2 by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1957
* Update v1 monitor api docs to exclude downtimes v2 by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1971
* Add timing scope for response time assertions by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1963
* Add Formula and Function query support to heatmap widgets by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1972
* Add synthetics mobile application testing to usage metering API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1967


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.15.0...datadog-api-client-2.16.0

## 2.15.0 / 2023-08-23

### Fixed
* Handle {} and bool value for `additionalProperties` by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/1901
* Update team schemas by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1900
* Fix handling of `additionalProperties` only containers by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/1910
* Mark downtime v2 start response as required by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1916
* Document new properties and fix security monitoring schemas by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1899
* Add missing CI App fields `page` and `test_level` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1878
### Added
* Update stated limit for api/v2/metrics from 14 days to 30 days by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1907
* Add missing sensitive data scanner fields by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1896
* Add Workflow Executions to usage metering API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1911
* Add missing `type` field for OnDemandConcurrencyCap response by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1898
* Add CI Visibility Intelligent Test Runner to usage metering API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1908
* Add custom_links to distribution widget schema by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1918
* Add usage field `region` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1919
* Add `message` field to audit logs response by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1921
* Add `tags` field to dashboard list response by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1920
* API specs for user team memberships by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1929
* Document `EQUAL` comparator by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1932
* Add persistCookies option synthetics test request by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1931
* Expose sds_scanned_bytes_usage in usage attribution API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1935
* Add support in azure integration endpoint for app service plan filters/cspm/custom metrics by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1930
* Add retry support by @HantingZhang2 in https://github.com/DataDog/datadog-api-client-java/pull/1925
* Add APM and USM usage attribution type by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1928
* Document new attributes for team models by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1926

## New Contributors
* @HantingZhang2 made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/1925

**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.14.0...datadog-api-client-2.15.0

## 2.14.0 / 2023-07-20

### Fixed
* Spans API docs update by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1872
* Fix filter indexes parameter in logs search by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1877
* Fix Spans endpoint schemas by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1892
### Added
* Add support for geomap widget using response_type `event_list` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1856
* Add support for the spans API endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1860
* Add a new field additional_query_filters to formula and function slo query by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1873
* Add support for `enable_custom_metrics` in Confluent Account by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1870
* Add missing `id` attribute for Confluent Account Response by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1876
* Fix downtimes v2 schema and add missing field `canceled` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1881
* Add cloud_cost data source and query definition to dashboards by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1882
* Add missing cloud workload security fields by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1887
* Add `integration_id` field for dashboard list item by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1891
* Add events response fields `message` and `status` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1888
* Add missing `GetRUMApplications` response field `id` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1889
* Add missing service definition fields by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1890
* Add overlay type to Dashboards WidgetDisplayType by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1893
* Update IP ranges with remote configuration section by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1895
* Add missing `relationships` to UsersInvitations response by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1897
* Added optional field filters when creating a cloud configuration rule by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1902
### Changed
* Add downtime v2 API in private beta by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1824
* Mark `access_role` as nullable by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1879


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.13.0...datadog-api-client-2.14.0

## 2.13.0 / 2023-06-27

### Fixed
* Fix null date-time serialization by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/1829
* Mark `restricted_roles` as nullable in monitor update request by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1827
* Mark additional usage fields as `nullable` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1836
* Updated findings api error responses by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1813
* Mark usage metering field `lines_indexed` as `nullable` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1841
* Update dashboard widget axis field descriptions by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1826
* Fix `CreateGCPSTSAccount` return code and update tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1848
* Fix `CreateGCPSTSAccount` response status code by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1851
* Add missing descriptions for authorization scopes in public docs  by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1849
* Update CI Visibility pipelines write API endpoint fields by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1857
### Added
* Add support for mute findings endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1797
* Expose `database-monitoring` monitor type by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1686
* Add endpoint to get Synthetics default locations by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1835
* Add usage metering RUM Roku fields by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1842
* Add usage metering fields for AWS and Azure cloud cost management by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1845
* Add support for CI Visibility create pipeline events endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1843
* Add isUndefined synthetics assertion operator by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1847
* Add missing Synthetics and Metrics Scope descriptions by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1850
* Enable `additionalProperties` by default by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/1858
### Changed
* Team name and handle length updates by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1822
### Deprecated
* mark v1 GCP APIs as deprecated by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1838


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.12.0...datadog-api-client-2.13.0

## 2.12.0 / 2023-05-31

### Fixed
* Mark usage fields as nullable by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1764
* Properly mark usage fields as nullable by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1780
* Remove read only attributes from team create and update by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1784
### Added
* Expose `include_breakdown` param for v2 hourly_usage by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1757
* Add support for deserializing `additionalProperties` in GO client by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1748
* Add new grpc assertions for Synthetics tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1762
* add additional_query_filters to slo widget  by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1773
* Add `customer_impact_scope` to fields by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1771
* Add notify_end_states and notify_end_types options to downtime by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1775
* Add snapshot timestamp to GetFinding by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1786
* Support schema version parameter in Get and List Service Definition endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1788
* Add Application Vulnerability Management to usage metering API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1789
* Add formula and function slo query to dash widgets by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1794
* Add secure field to Synthetics Browser Test variables and update docs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1793
* Add MatchingDowntime to monitor schema and with_downtimes parameter to GetMonitor by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1801
* Add auth scopes for the `service_definition` endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1805
* Update documentation for observability pipeline bytes usage attribution by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1798
* Add option to obfuscate extracted values from Synthetics multistep tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1799
* Add support for GCP STS endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1792
* Add `sort` field to List Stream Widget's request query by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1818
### Changed
* Update spec to change findings limit and security monitoring menu order by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1759
* Require teams_manage scope for creating and deleting teams by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1774
* Update team name and handle length restrictions by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1819
### Deprecated
* Deprecate note for Incident Teams endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1779


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.11.0...datadog-api-client-2.12.0

## 2.11.0 / 2023-04-18

### Fixed
* Fix application_security_host_top99p usage field by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1714
* Mark `resource_type` attribute as required for Confluent Account by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1729
* Fix spec errors caught with prism validation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1743
* Fix spans/logs custom metrics delete operation responses by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1751
### Added
* Add support for Incident Todo APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1704
* Add supported relations in restriction policy  by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1709
* Add parameter to downtime API for returning creator info by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1713
* Publish the new ingested timeseries metrics for usage attribution by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1698
* Add tags field to dashboard API spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1706
* Add pagination support to SearchIncidents by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1720
* Add service catalog v2.1 schema by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1718
* Add team API specs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1715
* Add spans metrics API endpoints specification by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1721
* Add universal service monitoring to usage metering API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1724
* Add a new contact type in service catalog api for schema v2 and v2.1 by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1727
* Add pagination support for the GET service_definitions endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1732
* Publish logs forwarding fields in summary usage API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1731
* Add compressedJsonDescriptor to Synthetics gRPC tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1730
* Add region field and note about multiregion start by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1716
* Add AP1 support by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1739
* Add support for shared dashboards endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1725
### Deprecated
* Deprecate audit logs usage by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1741


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.10.0...datadog-api-client-2.11.0

## 2.10.0 / 2023-03-14

### Added
* Add restriction policy APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1668
* Support RUM data source in Query API and fix aggregators by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1676
* Add endpoint to get and set on demand concurrency cap for Synthetics by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1672
* Publish IP allowlist APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1660
* Expose Flutter fields to rum product in the meter usage API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1681
* Add profiled fargate tasks to usage attribution by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1687
* Add cipipeline stream to ListStreamSource by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1648
* Add application_security to security monitoring rule type enum by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1685
* Add `ci_pipelines` enum to `FormulaAndFunctionEventsDataSource` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1696
* Add citest stream to ListStreamSource by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1690
* Add `logs_issue_stream` enum to `ListStreamSource` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1697
* Add support for Incident Integration Metadata APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1688
* Add SLO to GRACE API spec by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1703
* Add audit trail to usage metering API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1702


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.9.0...datadog-api-client-2.10.0

## 2.9.0 / 2023-02-15

### Fixed
* Set hosts versions as `type any` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1670
### Added
* Add orchestrator section in IP ranges by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1661
* Add Cloud Cost Management fields to Usage Metering endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1666
* Add cloud-cost as a supported query data source by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1656
* Add Cloud Cost And Container Excl Agent Usage Fields by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1671
* Add SLO status and error budget remaining to search API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1675
* Add `sort` field to SLOListWidgetQuery by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1673


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.8.0...datadog-api-client-2.9.0

## 2.8.0 / 2023-02-08

### Fixed
* Mark timeseries values as nullable by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1622
* Add namespaces attribute and rename excluded_attributes in SDS Public API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1636
* Set macV as `type any` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1658
### Added
* Add httpVersion option to Synthetics API tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1627
* Add deprecationDate to security monitoring rule response by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1629
* Add new group by configuration to list stream widget by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1624
* Add synthetics advanced scheduling by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1613
* Add notification preset enum field to monitor options by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1633
* Add support for Cloudflare integration API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1632
* Add support for Fastly account API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1558
* Add monitor configuration policies by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1635
* Support is_cspm_enabled field in GCP integrations by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1644
* Add run workflow widget to dashboard schema by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1638
* Add new missing enum values for `aggregation` and `detectionMethod` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1654
* Add region to estimated cost and historical cost response by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1655
* Add Usage Metering container_excl_agent_usage fields by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1657
* Add event_stream fields to dashboard list stream widget by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1659
### Changed
* Move Service account create from users to service accounts by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1642


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.7.0...datadog-api-client-2.8.0

## 2.7.0 / 2023-01-11

### Fixed
* Remove incorrect required fields from CloudConfigurationComplianceRuleOptions by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1607
* Update CI Visibility types of BucketResponse schema by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1609
* Fix logs aggregate integer facets by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1615
### Added
* Add support for query scalar and timeseries endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1604
* Add estimated rum sessions usage types to UA enums by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1598
* Update API spec to allow primary timeframe, target, and warning by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1611
* Add Usage Metering Cont Usage fields by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1612
* Add secure field to synthetics config variables by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1614
* Add Support for Incident Management Search API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1579
* Add TOTP parameters to Synthetics test options by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1618
### Changed
* Remove indexed logs from Usage Attribution by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1617
* Remove pagination parameter from CI visibility aggregate endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1621


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.6.0...datadog-api-client-2.7.0

## 2.6.0 / 2022-12-20

### Fixed
* Fix async API requests methods by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/1570
* Add missing response fields to MTD usage attribution endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1586
* Fix missing field in Synthetics tests authentication configuration by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1591
* Mark `hosts` response version fields as nullable by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1588
### Added
* Add fields for CSPM GCP usage by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1562
* Add offset and limit parameter to SLO correction API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1567
* Add documentation for Logs Pipelines ReferenceTableLogsLookupProcessor  by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1566
* Adding new field for the usage metering infra hosts by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1571
* Add `include_percentiles` field in Logs Custom Metrics by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1551
* Add OAuth support for Synthetics tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1574
* Add new billable summary fields by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1584
* RUM Applications Management API add client_token by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1575
* Support GRPC unary calls in Synthetics by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1581
* Add style object to dashboard widget formulas by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1595
* Add enable_samples monitor option by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1596
* Update security_monitoring endpoints for cloud_configuration rules by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1597
* Add support for sensitive data scanner APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1592
* Add synthetics_parallel_testing to Usage Metering API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1600
* Synthetics add pagination params to get all tests endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1601
### Changed
* Bump jersey version to `3.0.8` by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/1580


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.5.0...datadog-api-client-2.6.0

## 2.5.0 / 2022-11-16

### Fixed
* Fix service catalog schema change by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1557
### Added
* Add support for CI Visibility API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1536
* Add support for querying logs in Online Archives by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1526
* Add new SDS fields to usage API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1537
* Remove Beta status for SLO history endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1539
* Update formula and function monitor enum datasource by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1545
* Add scheduling_options to monitor definition by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1546
* Appsec Fargate Public Documentation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1548
* Adds noScreenshot to SyntheticsStep by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1550
* Add support for xpath assertions in synthetics tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1530
* Add bodyType to Synthetics request by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1554


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.4.0...datadog-api-client-2.5.0

## 2.4.0 / 2022-10-24

### Fixed
* Add Default Rule ID in SignalRuleResponseQuery by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1523
* Remove incident's resolved attribute from update requests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1524
* Fix event monitor created_at by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1525
* Fix spectral rules by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1528
* Bump jackson databind by @therve in https://github.com/DataDog/datadog-api-client-java/pull/1533
### Added
* Add notify_by monitor option by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1515
* Add support for service definitions APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1529
* Add support for confluent cloud integration by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1475
### Deprecated
* Deprecate metric field of Security Monitoring Rules by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1534


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.3.0...datadog-api-client-2.4.0

## 2.3.0 / 2022-10-03

### Fixed
* Refactor RuleQuery models by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1507
* Fix SearchSLO response structure by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1509
### Added
* Add `logs_pattern_stream` to `list_stream` widget source by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1457
* Add group_retention_duration and on_missing_data monitor options by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1451
* Expose CSPM aws host count in Usage Metering API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1471
* Add estimated ingested logs attribution by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1440
* Add org region to usage summary and billable usage summary by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1465
* add compression methods to metric payloads by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1435
* Add role relationships to RoleUpdateData by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1468
* Add `ci_tests` enum to FormulaAndFunctionEventsDataSource by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1467
* Add missing options and request option to synthetics test by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1455
* Add support for global variable from multistep synthetics tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1427
* Add ListActiveConfigurations endpoint and add new filter[queried] param to list tag configurations endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1447
* Add doesNotExist to synthetics operator enum by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1484
* Add TopologyMapWidget to dashboard schema by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1487
* Add Overall Status support to SLO Search API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1489
* Add APM Fargate to Usage Metering API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1482
* Add support for template variable multiselect in dashboards by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1492
* Add storage option to widget query definitions by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1496
* Add support for retrieving a security signal by ID by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1502
* Add support for signal correlation API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1497
* Add support for SLO List widget by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1501
* Add new historical_cost endpoint, and update estimate_cost by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1495
* Add support for incident attachment APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1508
### Changed
* Update deprecated usage attribution API docs to direct users to migration by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1458
* Remove started form eventType enum in synthetics by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1462

## New Contributors
* @nkzou made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/1481

**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.2.0...datadog-api-client-2.3.0

## 2.2.0 / 2022-08-17

### Fixed
* Update Pagerduty operation `DeletePagerDutyIntegrationService` response status code by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1438
* Add missing package relocations in the shaded jar by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/1456
### Added
* Cleanup exceptions for pagination helper methods by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/1446
* Add support for digest auth in synthetics tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1448
* Add support for RUM application endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1449
* add priority parameters for dashboard monitor summary widget by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1454
* Add missing dependencies into the shaded jar by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/1453


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.1.0...datadog-api-client-2.2.0

## 2.1.0 / 2022-08-01

### Fixed
* Add synthetics results api replay only tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1425
* Remove `zstd` compression support by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/1439
### Added
* docs(dataviz): update Treemap widget definition with deprecated properties + updated description [VIZZ-2305] by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1426
* Add hourly usage v2 endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1410
* Add metrics field in the RuleQuery by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1411
* Add support for Events V2 endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1387
* [RQ-2492]: Add custom_events to list of product families in hourly-usage api. by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1434
* Re-introduce Estimated Cost API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1441
### Changed
* Bump jersey to major version 3 by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/1424

## New Contributors
* @ganeshkumarsv made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/1421

**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-2.0.0...datadog-api-client-2.1.0

## 2.0.0 / 2022-07-19

### Fixed
* Fix additionalProperties on SyntheticsAPITestResultData by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1366
* Fix synthetics vitals type by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1367
* Remove include_percentiles default by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1396
* Mark message as required for Synthetics tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1389
### Added
* Add pagination helper method by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/1337
* Add include descendants to monthly and hourly usage attribution APIs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1362
* Add v2 endpoints for Opsgenie Integration by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1350
* Add distribution points intake endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1347
* Add height and width params to graph snapshot by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1374
* Add support for defining histogram requests in Distribution widgets by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1360
* Add DowngradeOrg endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1376
* Add new options for new value detection type on security monitoring rules by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1370
* Add ci execution rule in Synthetics options by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1371
* Add SLO Search API endpoint  by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1287
* New usage metering endpoint for estimated cost by org by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1399
* Add estimated indexed spans usage attribution by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1398
* Handle raw  json for additionalProperties in typescript  by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1368
* Add Application Security Monitoring Hosts Attribution by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1400
* Add support for security monitoring rule dynamic criticality by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1384
* Update IP ranges with synthetics private locations section by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1403
* Add new products to billable summary by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1406
* Update usage attribution enums by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1401
* Validate if unstable operations are enabled by @skarimo in https://github.com/DataDog/datadog-api-client-java/pull/1349
* Add estimated ingested spans to usage attribution by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1414
* Add support for zstd by @therve in https://github.com/DataDog/datadog-api-client-java/pull/1418
* Add v2 Security monitoring signals triage operations. by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1407
### Changed
* Remove unstable/beta note since Metrics Without Limits is GA by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1359
* Remove unstable marker on security list signal endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1373
* Update metric intake v2 accept response by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1404
* Move common classes out of version specific by @therve in https://github.com/DataDog/datadog-api-client-java/pull/1312
* Add description of metric type enums by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1415
* remove x-unstable property for usage attribution endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1423

## New Contributors
* @jybp made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/1394

**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-1.7.1...datadog-api-client-2.0.0

## 1.7.1 / 2022-06-01

### Fixed
* Fix javadoc by @therve in https://github.com/DataDog/datadog-api-client-java/pull/1355


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-1.7.0...datadog-api-client-1.7.1

## 1.7.0 / 2022-06-01

### Fixed
* Remove unused pararameter from authn mapping by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1320
* AuthN Mapping spec cleanup to match implementation by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1339
### Added
* Add Historical Chargeback Summary endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1300
* Expose v2 usage endpoint for application security monitoring by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1311
* Add `rehydration_max_scan_size_in_gb` field to Logs Archives by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1307
* Add `mute_first_recovery_notification` option to downtime by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1279
* Add lambda traced invocations usage endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1318
* Expose new usage field for react sessions by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1321
* Add missing option and enum value for SecurityMonitoringRule by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1326
* Adds docs for metric estimate endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1308
* Allow additional log attributes by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1328
* Add v2 endpoint for submitting series by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1254
* Add `ci-tests` monitor type by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1325
* Add RUM settings schema to synthetics tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1336
* Add v1 signal triage endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1331
* Add connection to synthetics assertion type enum by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1342
* Add grpc subtype to synthetics tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1319
### Changed
* Remove unstable marker from SLO corrections API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1348
### Deprecated
* Deprecate old usage apis by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1323


**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-1.6.0...datadog-api-client-1.7.0

## 1.6.0 / 2022-04-26

### Fixed
* Fix event intake response by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1199
* Fix type for `date` field in `LogsByRetentionMonthlyUsage` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1216
* Parse URI manually by @therve in https://github.com/DataDog/datadog-api-client-java/pull/1207
* Fix org name maximum by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1239
* Fix pagination for top avg metrics endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1245
* Make type optional for synthetics basic auth model by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1269
* Set correct type for `tags` property by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1288
### Added
* [Synthetics] Add missing option for SSL tests by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1206
* Add impossible travel detection method by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1211
* Add CI App usage endpoint and usage summary columns by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1215
* [RUM] Add search endpoints by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1213
* Add support for getting online archive usage by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1220
* Add endpoint for retrieving audit logs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1219
* Add support for Error Tracking monitors by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1241
* Add support for `ci-pipelines` monitor using Formulas and Functions by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1250
* Add aggregate endpoint for RUM by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1259
* Add  `median` aggregation functions to RUM and logs by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1267
* Add endpoint for validation of existing monitors by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1268
* Create new ListStreamSource types in order to deprecate ISSUE_STREAM by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1276
* [Query Value Widget] Add the timeseries background by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1266
* Add `restricted_roles` to Synthetics tests and private locations by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1278
* Add v2 SAML config IdP Metadata upload endpoint by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1286
* Support pagination in Python by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1292
* Add Usage API endpoint for observability-pipelines and add properties to v1 GetUsageSummary by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1264
### Changed
* Update dependencies by @therve in https://github.com/DataDog/datadog-api-client-java/pull/1262
### Removed
* Remove `lambda_usage` and `lambda_percentage` from usage API by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1256
* [dashboards] Removed `issue_stream` type from `ListStreamSource` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1282
### Deprecated
* [monitors] Deprecate `locked` property and clarify documentation for `restricted_roles` by @api-clients-generation-pipeline in https://github.com/DataDog/datadog-api-client-java/pull/1233

## New Contributors
* @juan-fernandez made their first contribution in https://github.com/DataDog/datadog-api-client-java/pull/1226

**Full Changelog**: https://github.com/DataDog/datadog-api-client-java/compare/datadog-api-client-1.5.0...datadog-api-client-1.6.0

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
