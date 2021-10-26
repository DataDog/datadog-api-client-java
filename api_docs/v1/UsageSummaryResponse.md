

# UsageSummaryResponse

Response summarizing all usage aggregated across the months in the request for all organizations, and broken down by month and by organization.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agentHostTop99pSum** | **Long** | Shows the 99th percentile of all agent hosts over all hours in the current months for all organizations. |  [optional]
**apmAzureAppServiceHostTop99pSum** | **Long** | Shows the 99th percentile of all Azure app services using APM over all hours in the current months all organizations. |  [optional]
**apmHostTop99pSum** | **Long** | Shows the 99th percentile of all distinct APM hosts over all hours in the current months for all organizations. |  [optional]
**auditLogsLinesIndexedAggSum** | **Long** | Shows the sum of all audit logs lines indexed over all hours in the current months for all organizations. |  [optional]
**awsHostTop99pSum** | **Long** | Shows the 99th percentile of all AWS hosts over all hours in the current months for all organizations. |  [optional]
**awsLambdaFuncCount** | **Long** | Shows the average of the number of functions that executed 1 or more times each hour in the current months for all organizations. |  [optional]
**awsLambdaInvocationsSum** | **Long** | Shows the sum of all AWS Lambda invocations over all hours in the current months for all organizations. |  [optional]
**azureAppServiceTop99pSum** | **Long** | Shows the 99th percentile of all Azure app services over all hours in the current months for all organizations. |  [optional]
**azureHostTop99pSum** | **Long** | Shows the 99th percentile of all Azure hosts over all hours in the current months for all organizations. |  [optional]
**billableIngestedBytesAggSum** | **Long** | Shows the sum of all log bytes ingested over all hours in the current months for all organizations. |  [optional]
**containerAvgSum** | **Long** | Shows the average of all distinct containers over all hours in the current months for all organizations. |  [optional]
**containerHwmSum** | **Long** | Shows the sum of the high-water marks of all distinct containers over all hours in the current months for all organizations. |  [optional]
**cspmContainerAvgSum** | **Long** | Shows the average number of Cloud Security Posture Management containers over all hours in the current months for all organizations. |  [optional]
**cspmContainerHwmSum** | **Long** | Shows the sum of the the high-water marks of Cloud Security Posture Management containers over all hours in the current months for all organizations. |  [optional]
**cspmHostTop99pSum** | **Long** | Shows the 99th percentile of all Cloud Security Posture Management hosts over all hours in the current months for all organizations. |  [optional]
**customTsSum** | **Long** | Shows the average number of distinct custom metrics over all hours in the current months for all organizations. |  [optional]
**cwsContainersAvgSum** | **Long** | Shows the average of all distinct Cloud Workload Security containers over all hours in the current months for all organizations. |  [optional]
**cwsHostTop99pSum** | **Long** | Shows the 99th percentile of all Cloud Workload Security hosts over all hours in the current months for all organizations. |  [optional]
**dbmHostTop99pSum** | **Long** | Shows the 99th percentile of all Database Monitoring hosts over all hours in the current month for all organizations. |  [optional]
**dbmQueriesAvgSum** | **Long** | Shows the average of all distinct Database Monitoring Normalized Queries over all hours in the current month for all organizations. |  [optional]
**endDate** | **OffsetDateTime** | Shows the last date of usage in the current months for all organizations. |  [optional]
**fargateTasksCountAvgSum** | **Long** | Shows the average of all Fargate tasks over all hours in the current months for all organizations. |  [optional]
**fargateTasksCountHwmSum** | **Long** | Shows the sum of the high-water marks of all Fargate tasks over all hours in the current months for all organizations. |  [optional]
**gcpHostTop99pSum** | **Long** | Shows the 99th percentile of all GCP hosts over all hours in the current months for all organizations. |  [optional]
**herokuHostTop99pSum** | **Long** | Shows the 99th percentile of all Heroku dynos over all hours in the current months for all organizations. |  [optional]
**incidentManagementMonthlyActiveUsersHwmSum** | **Long** | Shows sum of the the high-water marks of incident management monthly active users in the current months for all organizations. |  [optional]
**indexedEventsCountAggSum** | **Long** | Shows the sum of all log events indexed over all hours in the current months for all organizations. |  [optional]
**infraHostTop99pSum** | **Long** | Shows the 99th percentile of all distinct infrastructure hosts over all hours in the current months for all organizations. |  [optional]
**ingestedEventsBytesAggSum** | **Long** | Shows the sum of all log bytes ingested over all hours in the current months for all organizations. |  [optional]
**iotDeviceAggSum** | **Long** | Shows the sum of all IoT devices over all hours in the current months for all organizations. |  [optional]
**iotDeviceTop99pSum** | **Long** | Shows the 99th percentile of all IoT devices over all hours in the current months of all organizations. |  [optional]
**lastUpdated** | **OffsetDateTime** | Shows the the most recent hour in the current months for all organizations for which all usages were calculated. |  [optional]
**liveIndexedEventsAggSum** | **Long** | Shows the sum of all live logs indexed over all hours in the current months for all organizations (data available as of December 1, 2020). |  [optional]
**liveIngestedBytesAggSum** | **Long** | Shows the sum of all live logs bytes ingested over all hours in the current months for all organizations (data available as of December 1, 2020). |  [optional]
**logsByRetention** | [**LogsByRetention**](LogsByRetention.md) |  |  [optional]
**mobileRumSessionCountAggSum** | **Long** | Shows the sum of all mobile RUM Sessions over all hours in the current months for all organizations. |  [optional]
**mobileRumSessionCountAndroidAggSum** | **Long** | Shows the sum of all mobile RUM Sessions on Android over all hours in the current months for all organizations. |  [optional]
**mobileRumSessionCountIosAggSum** | **Long** | Shows the sum of all mobile RUM Sessions on iOS over all hours in the current months for all organizations. |  [optional]
**netflowIndexedEventsCountAggSum** | **Long** | Shows the sum of all Network flows indexed over all hours in the current months for all organizations. |  [optional]
**npmHostTop99pSum** | **Long** | Shows the 99th percentile of all distinct Networks hosts over all hours in the current months for all organizations. |  [optional]
**opentelemetryHostTop99pSum** | **Long** | Shows the 99th percentile of all hosts reported by the Datadog exporter for the OpenTelemetry Collector over all hours in the current months for all organizations. |  [optional]
**profilingContainerAgentCountAvg** | **Long** | Shows the average number of profiled containers over all hours in the current months for all organizations. |  [optional]
**profilingHostCountTop99pSum** | **Long** | Shows the 99th percentile of all profiled hosts over all hours in the current months for all organizations. |  [optional]
**rehydratedIndexedEventsAggSum** | **Long** | Shows the sum of all rehydrated logs indexed over all hours in the current months for all organizations (data available as of December 1, 2020). |  [optional]
**rehydratedIngestedBytesAggSum** | **Long** | Shows the sum of all rehydrated logs bytes ingested over all hours in the current months for all organizations (data available as of December 1, 2020). |  [optional]
**rumSessionCountAggSum** | **Long** | Shows the sum of all browser RUM Sessions over all hours in the current months for all organizations. |  [optional]
**rumTotalSessionCountAggSum** | **Long** | Shows the sum of RUM Sessions (browser and mobile) over all hours in the current months for all organizations. |  [optional]
**sdsLogsScannedBytesSum** | **Long** | Shows the sum of all bytes scanned of logs usage by the Sensitive Data Scanner over all hours in the current month for all organizations. |  [optional]
**sdsTotalScannedBytesSum** | **Long** | Shows the sum of all bytes scanned across all usage types by the Sensitive Data Scanner over all hours in the current month for all organizations. |  [optional]
**startDate** | **OffsetDateTime** | Shows the first date of usage in the current months for all organizations. |  [optional]
**syntheticsBrowserCheckCallsCountAggSum** | **Long** | Shows the sum of all Synthetic browser tests over all hours in the current months for all organizations. |  [optional]
**syntheticsCheckCallsCountAggSum** | **Long** | Shows the sum of all Synthetic API tests over all hours in the current months for all organizations. |  [optional]
**traceSearchIndexedEventsCountAggSum** | **Long** | Shows the sum of all Indexed Spans indexed over all hours in the current months for all organizations. |  [optional]
**twolIngestedEventsBytesAggSum** | **Long** | Shows the sum of all tracing without limits bytes ingested over all hours in the current months for all organizations. |  [optional]
**usage** | [**List&lt;UsageSummaryDate&gt;**](UsageSummaryDate.md) | An array of objects regarding hourly usage. |  [optional]
**vsphereHostTop99pSum** | **Long** | Shows the 99th percentile of all vSphere hosts over all hours in the current months for all organizations. |  [optional]



