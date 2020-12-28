

# UsageSummaryDateOrg

Global hourly report of all data billed by Datadog for a given organization.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agentHostTop99p** | **Long** | Shows the 99th percentile of all agent hosts over all hours in the current date for the given org. |  [optional]
**apmHostTop99p** | **Long** | Shows the 99th percentile of all distinct APM hosts over all hours in the current date for the given org. |  [optional]
**awsHostTop99p** | **Long** | Shows the 99th percentile of all AWS hosts over all hours in the current date for the given org. |  [optional]
**awsLambdaFuncCount** | **Long** | Shows the sum of all AWS Lambda invocations over all hours in the current date for the given org. |  [optional]
**awsLambdaInvocationsSum** | **Long** | Shows the sum of all AWS Lambda invocations over all hours in the current date for the given org. |  [optional]
**billableIngestedBytesSum** | **Long** | Shows the sum of all log bytes ingested over all hours in the current date for the given org. |  [optional]
**containerAvg** | **Long** | Shows the average of all distinct containers over all hours in the current date for the given org. |  [optional]
**containerHwm** | **Long** | Shows the high-water mark of all distinct containers over all hours in the current date for the given org. |  [optional]
**customTsAvg** | **Long** | Shows the average number of distinct custom metrics over all hours in the current date for the given org. |  [optional]
**fargateTasksCountAvg** | **Long** | The average task count for Fargate. |  [optional]
**fargateTasksCountHwm** | **Long** | Shows the high-water mark of all Fargate tasks over all hours in the current date for the given org. |  [optional]
**gcpHostTop99p** | **Long** | Shows the 99th percentile of all GCP hosts over all hours in the current date for the given org. |  [optional]
**id** | **String** | The organization id. |  [optional]
**incidentManagementMonthlyActiveUsersHwm** | **Long** | Shows the high-water mark of incident management monthly active users over all hours in the current date for the given org. |  [optional]
**indexedEventsCountSum** | **Long** | Shows the sum of all log events indexed over all hours in the current date for the given org. |  [optional]
**infraHostTop99p** | **Long** | Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current date for the given org. |  [optional]
**ingestedEventsBytesSum** | **Long** | Shows the sum of all log bytes ingested over all hours in the current date for the given org. |  [optional]
**mobileRumSessionCountAndroidSum** | **Long** | Shows the sum of all mobile RUM Sessions on Android over all hours in the current date for the given org. |  [optional]
**mobileRumSessionCountIosSum** | **Long** | Shows the sum of all mobile RUM Sessions on iOS over all hours in the current date for the given org. |  [optional]
**mobileRumSessionCountSum** | **Long** | Shows the sum of all mobile RUM Sessions over all hours in the current date for the given org. |  [optional]
**name** | **String** | The organization name. |  [optional]
**netflowIndexedEventsCountSum** | **Long** | Shows the sum of all Network flows indexed over all hours in the current date for the given org. |  [optional]
**npmHostTop99p** | **Long** | Shows the 99th percentile of all distinct Networks hosts over all hours in the current date for the given org. |  [optional]
**profilingHostTop99p** | **Long** | Shows the 99th percentile of all profiled hosts over all hours in the current date for the given org. |  [optional]
**publicId** | **String** | The organization public id. |  [optional]
**rumSessionCountSum** | **Long** | Shows the sum of all browser RUM Sessions over all hours in the current date for the given org. |  [optional]
**rumTotalSessionCountSum** | **Long** | Shows the sum of RUM Sessions (browser and mobile) over all hours in the current date for the given org. |  [optional]
**syntheticsBrowserCheckCallsCountSum** | **Long** | Shows the sum of all Synthetic browser tests over all hours in the current date for the given org. |  [optional]
**syntheticsCheckCallsCountSum** | **Long** | Shows the sum of all Synthetic API tests over all hours in the current date for the given org. |  [optional]
**traceSearchIndexedEventsCountSum** | **Long** | Shows the sum of all Indexed Spans indexed over all hours in the current date for the given org. |  [optional]
**twolIngestedEventsBytesSum** | **Long** | Shows the sum of all tracing without limits bytes ingested over all hours in the current date for the given org. |  [optional]



