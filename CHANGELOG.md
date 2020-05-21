# CHANGELOG

## datadog-api-client-1.0.0-beta.3 / 2020-05-20

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
