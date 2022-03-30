# RUMCompute

A compute rule to compute metrics or timeseries.

## Properties

| Name            | Type                       | Description                                                                                             | Notes      |
| --------------- | -------------------------- | ------------------------------------------------------------------------------------------------------- | ---------- |
| **aggregation** | **RUMAggregationFunction** |                                                                                                         |
| **interval**    | **String**                 | The time buckets&#39; size (only used for type&#x3D;timeseries) Defaults to a resolution of 150 points. | [optional] |
| **metric**      | **String**                 | The metric to use.                                                                                      | [optional] |
| **type**        | **RUMComputeType**         |                                                                                                         | [optional] |
