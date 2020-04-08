

# UsageSummaryDate

TODO.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agentHostTop99p** | **Long** | Shows the 99th percentile of all agent hosts over all hours in the current date for all orgs. |  [optional]
**apmHostTop99p** | **Long** | Shows the 99th percentile of all distinct APM hosts over all hours in the current date for all orgs. |  [optional]
**awsHostTop99p** | **Long** | Shows the 99th percentile of all AWS hosts over all hours in the current date for all orgs. |  [optional]
**awsLambdaFuncCount** | **Long** | Shows the average of the number of functions that executed 1 or more times each hour in the current date for all orgs. |  [optional]
**awsLambdaInvocationsSum** | **Long** | Shows the sum of all AWS Labmda invocations over all hours in the current date for all orgs. |  [optional]
**billableIngestedBytesSum** | **Long** | Shows the sum of all log bytes ingested over all hours in the current date for all orgs. |  [optional]
**containerAvg** | **Long** | Shows the average of all distinct containers over all hours in the current date for all orgs. |  [optional]
**containerHwm** | **Long** | Shows the high watermark of all distinct containers over all hours in the current date for all orgs. |  [optional]
**customTsAvg** | **Long** | Shows the average number of distinct custom metrics over all hours in the current date for all orgs. |  [optional]
**date** | [**OffsetDateTime**](OffsetDateTime.md) | The date for the usage. |  [optional]
**fargateTasksCountAvg** | **Long** | Shows the high watermark of all Fargate tasks over all hours in the current date for all orgs. |  [optional]
**fargateTasksCountHwm** | **Long** | Shows the average of all Fargate tasks over all hours in the current date for all orgs. |  [optional]
**gcpHostTop99p** | **Long** | Shows the 99th percentile of all GCP hosts over all hours in the current date for all orgs. |  [optional]
**indexedEventsCountSum** | **Long** | Shows the sum of all log events indexed over all hours in the current date for all orgs. |  [optional]
**infraHostTop99p** | **Long** | Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current date for all orgs. |  [optional]
**ingestedEventsBytesSum** | **Long** | Shows the sum of all log bytes ingested over all hours in the current date for all orgs. |  [optional]
**netflowIndexedEventsCountSum** | **Long** | Shows the sum of all Network flows indexed over all hours in the current date for all orgs. |  [optional]
**npmHostTop99p** | **Long** | Shows the 99th percentile of all distinct Networks hosts over all hours in the current date for all orgs. |  [optional]
**orgs** | [**List&lt;UsageSummaryDateOrg&gt;**](UsageSummaryDateOrg.md) | TODO. |  [optional]
**rumSessionCountSum** | **Long** | Shows the sum of all RUM Sessions over all hours in the current date for all orgs |  [optional]
**syntheticsBrowserCheckCallsCountSum** | **Long** | Shows the sum of all Synthetic browser tests over all hours in the current date for all orgs. |  [optional]
**syntheticsCheckCallsCountSum** | **Long** | Shows the sum of all Synthetic API tests over all hours in the current date for all orgs. |  [optional]
**traceSearchIndexedEventsCountSum** | **Long** | Shows the sum of all analyzed spans indexed over all hours in the current date for all orgs. |  [optional]



