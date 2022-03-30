# RUMGroupByHistogram

Used to perform a histogram computation (only for measure facets). Note: At most 100 buckets are allowed, the number of buckets is (max - min)/interval.

## Properties

| Name         | Type       | Description                                                                                              | Notes |
| ------------ | ---------- | -------------------------------------------------------------------------------------------------------- | ----- |
| **interval** | **Double** | The bin size of the histogram buckets.                                                                   |
| **max**      | **Double** | The maximum value for the measure used in the histogram (values greater than this one are filtered out). |
| **min**      | **Double** | The minimum value for the measure used in the histogram (values smaller than this one are filtered out). |
