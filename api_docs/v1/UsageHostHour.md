

# UsageHostHour

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**agentHostCount** | **Long** | Contains the total number of infrastructure hosts reporting during a given hour that were running the Datadog Agent. |  [optional]
**apmHostCount** | **Long** | Shows the total number of hosts using APM during the hour, these are counted as billable (except during trial periods). |  [optional]
**awsHostCount** | **Long** | Contains the total number of hosts that reported via the AWS integration (and were NOT running the Datadog Agent). When AWS or GCP hosts are also running the Datadog Agent, they are counted as Agent hosts, NOT as AWS or GCP. |  [optional]
**containerCount** | **Long** | Contains the total number of billable infrastructure hosts reporting during a given hour. This is the sum of &#x60;agent_host_count&#x60;, &#x60;aws_host_count&#x60;, and &#x60;gcp_host_count&#x60;. |  [optional]
**gcpHostCount** | **Long** | Contains the total number of hosts that reported via the Google Cloud integration (and were NOT running the Datadog Agent). |  [optional]
**hostCount** | **Long** | Shows the total number of containers reporting via the Docker integration during the hour. |  [optional]
**hour** | [**OffsetDateTime**](OffsetDateTime.md) | The hour for the usage. |  [optional]



