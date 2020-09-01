

# UsageSummaryDate

Response with hourly report of all data billed by Datadog all organizations.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agentHostTop99p** | **Long** | Shows the 99th percentile of all agent hosts over all hours in the current date for all organizations. |  [optional]
**apmHostTop99p** | **Long** | Shows the 99th percentile of all distinct APM hosts over all hours in the current date for all organizations. |  [optional]
**awsHostTop99p** | **Long** | Shows the 99th percentile of all AWS hosts over all hours in the current date for all organizations. |  [optional]
**awsLambdaFuncCount** | **Long** | Shows the average of the number of functions that executed 1 or more times each hour in the current date for all organizations. |  [optional]
**awsLambdaInvocationsSum** | **Long** | Shows the sum of all AWS Lambda invocations over all hours in the current date for all organizations. |  [optional]
**azureAppServiceTop99p** | **Long** | Shows the 99th percentile of all Azure app services over all hours in the current date for all organizations. |  [optional]
**billableIngestedBytesSum** | **Long** | Shows the sum of all log bytes ingested over all hours in the current date for all organizations. |  [optional]
**containerAvg** | **Long** | Shows the average of all distinct containers over all hours in the current date for all organizations. |  [optional]
**containerHwm** | **Long** | Shows the high watermark of all distinct containers over all hours in the current date for all organizations. |  [optional]
**customTsAvg** | **Long** | Shows the average number of distinct custom metrics over all hours in the current date for all organizations. |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date for the usage. |  [optional]
**fargateTasksCountAvg** | **Long** | Shows the high watermark of all Fargate tasks over all hours in the current date for all organizations. |  [optional]
**fargateTasksCountHwm** | **Long** | Shows the average of all Fargate tasks over all hours in the current date for all organizations. |  [optional]
**gcpHostTop99p** | **Long** | Shows the 99th percentile of all GCP hosts over all hours in the current date for all organizations. |  [optional]
**indexedEventsCountSum** | **Long** | Shows the sum of all log events indexed over all hours in the current date for all organizations. |  [optional]
**infraHostTop99p** | **Long** | Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current date for all organizations. |  [optional]
**ingestedEventsBytesSum** | **Long** | Shows the sum of all log bytes ingested over all hours in the current date for all organizations. |  [optional]
**netflowIndexedEventsCountSum** | **Long** | Shows the sum of all Network flows indexed over all hours in the current date for all organizations. |  [optional]
**npmHostTop99p** | **Long** | Shows the 99th percentile of all distinct Networks hosts over all hours in the current date for all organizations. |  [optional]
**orgs** | [**List&lt;UsageSummaryDateOrg&gt;**](UsageSummaryDateOrg.md) | Organizations associated with a user. |  [optional]
**profilingHostTop99p** | **Long** | Shows the 99th percentile of all profiled hosts over all hours in the current date for all organizations. |  [optional]
**rumSessionCountSum** | **Long** | Shows the sum of all RUM Sessions over all hours in the current date for all organizations |  [optional]
**syntheticsBrowserCheckCallsCountSum** | **Long** | Shows the sum of all Synthetic browser tests over all hours in the current date for all organizations. |  [optional]
**syntheticsCheckCallsCountSum** | **Long** | Shows the sum of all Synthetic API tests over all hours in the current date for all organizations. |  [optional]
**traceSearchIndexedEventsCountSum** | **Long** | Shows the sum of all analyzed spans indexed over all hours in the current date for all organizations. |  [optional]
**twolIngestedEventsBytesSum** | **Long** | Shows the sum of all tracing without limits bytes ingested over all hours in the current date for all organizations. |  [optional]



