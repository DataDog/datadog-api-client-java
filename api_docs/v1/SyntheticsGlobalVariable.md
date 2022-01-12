# SyntheticsGlobalVariable

Synthetics global variable.

## Properties

| Name                  | Type                                                                                        | Description                                                             | Notes                 |
| --------------------- | ------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------- | --------------------- |
| **attributes**        | [**SyntheticsGlobalVariableAttributes**](SyntheticsGlobalVariableAttributes.md)             |                                                                         | [optional]            |
| **description**       | **String**                                                                                  | Description of the global variable.                                     |
| **id**                | **String**                                                                                  | Unique identifier of the global variable.                               | [optional] [readonly] |
| **name**              | **String**                                                                                  | Name of the global variable. Unique across Synthetics global variables. |
| **parseTestOptions**  | [**SyntheticsGlobalVariableParseTestOptions**](SyntheticsGlobalVariableParseTestOptions.md) |                                                                         | [optional]            |
| **parseTestPublicId** | **String**                                                                                  | A Synthetic test ID to use as a test to generate the variable value.    | [optional]            |
| **tags**              | **List&lt;String&gt;**                                                                      | Tags of the global variable.                                            |
| **value**             | [**SyntheticsGlobalVariableValue**](SyntheticsGlobalVariableValue.md)                       |                                                                         |
