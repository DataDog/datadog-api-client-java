# RUMGroupBy

A group-by rule.

## Properties

| Name          | Type                                              | Description                                      | Notes      |
| ------------- | ------------------------------------------------- | ------------------------------------------------ | ---------- |
| **facet**     | **String**                                        | The name of the facet to use (required).         |
| **histogram** | [**RUMGroupByHistogram**](RUMGroupByHistogram.md) |                                                  | [optional] |
| **limit**     | **Long**                                          | The maximum buckets to return for this group-by. | [optional] |
| **missing**   | [**RUMGroupByMissing**](RUMGroupByMissing.md)     |                                                  | [optional] |
| **sort**      | [**RUMAggregateSort**](RUMAggregateSort.md)       |                                                  | [optional] |
| **total**     | [**RUMGroupByTotal**](RUMGroupByTotal.md)         |                                                  | [optional] |
