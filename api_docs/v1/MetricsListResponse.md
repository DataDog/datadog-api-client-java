# MetricsListResponse

Object listing all metric names stored by Datadog since a given time.

## Properties

| Name        | Type                   | Description                                                      | Notes      |
| ----------- | ---------------------- | ---------------------------------------------------------------- | ---------- |
| **from**    | **String**             | Time when the metrics were active, seconds since the Unix epoch. | [optional] |
| **metrics** | **List&lt;String&gt;** | List of metric names.                                            | [optional] |
