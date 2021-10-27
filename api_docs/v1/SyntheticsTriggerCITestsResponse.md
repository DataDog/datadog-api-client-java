# SyntheticsTriggerCITestsResponse

Object containing information about the tests triggered.

## Properties

| Name                  | Type                                                                                    | Description                                      | Notes      |
| --------------------- | --------------------------------------------------------------------------------------- | ------------------------------------------------ | ---------- |
| **batchId**           | **String**                                                                              | The public ID of the batch triggered.            | [optional] |
| **locations**         | [**List&lt;SyntheticsTriggerCITestLocation&gt;**](SyntheticsTriggerCITestLocation.md)   | List of Synthetics locations.                    | [optional] |
| **results**           | [**List&lt;SyntheticsTriggerCITestRunResult&gt;**](SyntheticsTriggerCITestRunResult.md) | Information about the tests runs.                | [optional] |
| **triggeredCheckIds** | **List&lt;String&gt;**                                                                  | The public IDs of the Synthetics test triggered. | [optional] |
