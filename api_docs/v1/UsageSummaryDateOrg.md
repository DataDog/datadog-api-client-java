

# UsageSummaryDateOrg

Global hourly report of all data billed by Datadog for a given organization.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agentHostTop99p** | **Long** | Shows the 99th percentile of all agent hosts over all hours in the current date for the given org. |  [optional]
**apmHostTop99p** | **Long** | Shows the 99th percentile of all distinct APM hosts over all hours in the current date for the given org. |  [optional]
**awsHostTop99p** | **Long** | Shows the 99th percentile of all AWS hosts over all hours in the current date for the given org. |  [optional]
**awsLambdaFuncCount** | **Long** | Shows the sum of all AWS Labmda invocations over all hours in the current date for the given org. |  [optional]
**awsLambdaInvocationsSum** | **Long** | Shows the sum of all AWS Labmda invocations over all hours in the current date for the given org. |  [optional]
**billableIngestedBytesSum** | **Long** | Shows the sum of all log bytes ingested over all hours in the current date for the given org. |  [optional]
**containerAvg** | **Long** | Shows the average of all distinct containers over all hours in the current date for the given org. |  [optional]
**containerHwm** | **Long** | Shows the high watermark of all distinct containers over all hours in the current date for the given org. |  [optional]
**customTsAvg** | **Long** | Shows the average number of distinct custom metrics over all hours in the current date for the given org. |  [optional]
**fargateTasksCountAvg** | **Long** |  |  [optional]
**fargateTasksCountHwm** | **Long** | Shows the high watermark of all Fargate tasks over all hours in the current date for the given org. |  [optional]
**gcpHostTop99p** | **Long** | Shows the 99th percentile of all GCP hosts over all hours in the current date for the given org. |  [optional]
**id** | **String** | The organization id. |  [optional]
**indexedEventsCountSum** | **Long** | Shows the sum of all log events indexed over all hours in the current date for the given org. |  [optional]
**infraHostTop99p** | **Long** | Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current date for the given org. |  [optional]
**ingestedEventsBytesSum** | **Long** | Shows the sum of all log bytes ingested over all hours in the current date for the given org. |  [optional]
**name** | **String** | The organization name. |  [optional]
**netflowIndexedEventsCountSum** | **Long** | Shows the sum of all Network flows indexed over all hours in the current date for the given org. |  [optional]
**npmHostTop99p** | **Long** | Shows the 99th percentile of all distinct Networks hosts over all hours in the current date for the given org. |  [optional]
**publicId** | **String** | The organization public id. |  [optional]
**rumSessionCountSum** | **Long** | Shows the sum of all RUM Sessions over all hours in the current date for the given org. |  [optional]
**syntheticsBrowserCheckCallsCountSum** | **Long** | Shows the sum of all Synthetic browser tests over all hours in the current date for the given org. |  [optional]
**syntheticsCheckCallsCountSum** | **Long** | Shows the sum of all Synthetic API tests over all hours in the current date for the given org. |  [optional]
**traceSearchIndexedEventsCountSum** | **Long** | Shows the sum of all analyzed spans indexed over all hours in the current date for the given org. |  [optional]



