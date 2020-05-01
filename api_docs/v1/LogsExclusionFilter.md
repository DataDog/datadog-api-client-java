

# LogsExclusionFilter

Exclusion filter is defined by a query, a sampling rule, and a active/inactive toggle.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**query** | **String** | Default query is &#x60;*&#x60;, meaning all logs flowing in the index would be excluded. Scope down exclusion filter to only a subset of logs with a log query. |  [optional]
**sampleRate** | **Double** | Sample rate to apply to logs going through this exclusion filter, a value of 1 will exclude all logs matching the query. | 



