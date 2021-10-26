# Host

Object representing a host.

## Properties

| Name                 | Type                                      | Description                                                                                                 | Notes      |
| -------------------- | ----------------------------------------- | ----------------------------------------------------------------------------------------------------------- | ---------- |
| **aliases**          | **List&lt;String&gt;**                    | Host aliases collected by Datadog.                                                                          | [optional] |
| **apps**             | **List&lt;String&gt;**                    | The Datadog integrations reporting metrics for the host.                                                    | [optional] |
| **awsName**          | **String**                                | AWS name of your host.                                                                                      | [optional] |
| **hostName**         | **String**                                | The host name.                                                                                              | [optional] |
| **id**               | **Long**                                  | The host ID.                                                                                                | [optional] |
| **isMuted**          | **Boolean**                               | If a host is muted or unmuted.                                                                              | [optional] |
| **lastReportedTime** | **Long**                                  | Last time the host reported a metric data point.                                                            | [optional] |
| **meta**             | [**HostMeta**](HostMeta.md)               |                                                                                                             | [optional] |
| **metrics**          | [**HostMetrics**](HostMetrics.md)         |                                                                                                             | [optional] |
| **muteTimeout**      | **Long**                                  | Timeout of the mute applied to your host.                                                                   | [optional] |
| **name**             | **String**                                | The host name.                                                                                              | [optional] |
| **sources**          | **List&lt;String&gt;**                    | Source or cloud provider associated with your host.                                                         | [optional] |
| **tagsBySource**     | **Map&lt;String, List&lt;String&gt;&gt;** | List of tags for each source (AWS, Datadog Agent, Chef..).                                                  | [optional] |
| **up**               | **Boolean**                               | Displays UP when the expected metrics are received and displays &#x60;???&#x60; if no metrics are received. | [optional] |
