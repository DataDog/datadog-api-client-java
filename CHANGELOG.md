# CHANGELOG

## 1.0.0-beta.9 / 2021-02-03

* [Added] Add restricted roles to monitor update. See [#634](https://github.com/DataDog/datadog-api-client-java/pull/634).
* [Added] Add endpoint for IoT billing usage. See [#631](https://github.com/DataDog/datadog-api-client-java/pull/631).
* [Added] Add query parameters for SLO search endpoint. See [#629](https://github.com/DataDog/datadog-api-client-java/pull/629).
* [Added] Add fields for formula and function query definition and widget formulas. See [#626](https://github.com/DataDog/datadog-api-client-java/pull/626).
* [Added] Add global_time to time_window slo widget. See [#624](https://github.com/DataDog/datadog-api-client-java/pull/624).
* [Added] Update required fields in SLO Correction create and update requests . See [#618](https://github.com/DataDog/datadog-api-client-java/pull/618).
* [Added] Add log index creation (POST). See [#614](https://github.com/DataDog/datadog-api-client-java/pull/614).
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
