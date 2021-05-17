

# SecurityFilterAttributes

The object describing a security filter.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**exclusionFilters** | [**List&lt;SecurityFilterExclusionFilterResponse&gt;**](SecurityFilterExclusionFilterResponse.md) | The list of exclusion filters applied in this security filter. |  [optional]
**filteredDataType** | **SecurityFilterFilteredDataType** |  |  [optional]
**isBuiltin** | **Boolean** | Whether the security filter is the built-in filter. |  [optional]
**isEnabled** | **Boolean** | Whether the security filter is enabled. |  [optional]
**name** | **String** | The security filter name. |  [optional]
**query** | **String** | The security filter query. Logs accepted by this query will be accepted by this filter. |  [optional]
**version** | **Integer** | The version of the security filter. |  [optional]



