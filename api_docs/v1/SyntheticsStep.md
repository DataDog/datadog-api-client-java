# SyntheticsStep

The steps used in a Synthetics browser test.

## Properties

| Name             | Type                   | Description                                                                                                                       | Notes      |
| ---------------- | ---------------------- | --------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **allowFailure** | **Boolean**            | A boolean set to allow this step to fail.                                                                                         | [optional] |
| **isCritical**   | **Boolean**            | A boolean to use in addition to &#x60;allowFailure&#x60; to determine if the test should be marked as failed when the step fails. | [optional] |
| **name**         | **String**             | The name of the step.                                                                                                             | [optional] |
| **params**       | **Object**             | The parameters of the step.                                                                                                       | [optional] |
| **timeout**      | **Long**               | The time before declaring a step failed.                                                                                          | [optional] |
| **type**         | **SyntheticsStepType** |                                                                                                                                   | [optional] |
