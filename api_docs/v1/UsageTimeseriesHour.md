# UsageTimeseriesHour

The hourly usage of timeseries.

## Properties

| Name                          | Type               | Description                                                                                            | Notes      |
| ----------------------------- | ------------------ | ------------------------------------------------------------------------------------------------------ | ---------- |
| **hour**                      | **OffsetDateTime** | The hour for the usage.                                                                                | [optional] |
| **numCustomInputTimeseries**  | **Long**           | Contains the number of custom metrics that are inputs for aggregations (metric configured is custom).  | [optional] |
| **numCustomOutputTimeseries** | **Long**           | Contains the number of custom metrics that are outputs for aggregations (metric configured is custom). | [optional] |
| **numCustomTimeseries**       | **Long**           | Contains sum of non-aggregation custom metrics and custom metrics that are outputs for aggregations.   | [optional] |
| **orgName**                   | **String**         | The organization name.                                                                                 | [optional] |
| **publicId**                  | **String**         | The organization public ID.                                                                            | [optional] |
