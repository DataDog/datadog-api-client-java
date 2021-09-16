

# FormulaAndFunctionApmDependencyStatsQueryDefinition

A formula and functions APM dependency stats query.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dataSource** | **FormulaAndFunctionApmDependencyStatsDataSource** |  | 
**env** | **String** | APM environment. | 
**isUpstream** | **Boolean** | Determines whether stats for upstream or downstream dependencies should be queried. |  [optional]
**name** | **String** | Name of query to use in formulas. | 
**operationName** | **String** | Name of operation on service. | 
**primaryTagName** | **String** | The name of the second primary tag used within APM; required when &#x60;primary_tag_value&#x60; is specified. See https://docs.datadoghq.com/tracing/guide/setting_primary_tags_to_scope/#add-a-second-primary-tag-in-datadog. |  [optional]
**primaryTagValue** | **String** | Filter APM data by the second primary tag. &#x60;primary_tag_name&#x60; must also be specified. |  [optional]
**resourceName** | **String** | APM resource. | 
**service** | **String** | APM service. | 
**stat** | **FormulaAndFunctionApmDependencyStatName** |  | 



