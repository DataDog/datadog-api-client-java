

# LogsArithmeticProcessor

Use the Arithmetic Processor to add a new attribute (without spaces or special characters in the new attribute name) to a log with the result of the provided formula. This enables you to remap different time attributes with different units into a single attribute, or to compute operations on attributes within the same log.  The formula can use parentheses and the basic arithmetic operators `-`, `+`, `*`, `/`.  By default, the calculation is skipped if an attribute is missing. Select “Replace missing attribute by 0” to automatically populate missing attribute values with 0 to ensure that the calculation is done. An attribute is missing if it is not found in the log attributes, or if it cannot be converted to a number.  *Notes*:  - The operator `-` needs to be space split in the formula as it can also be contained in attribute names. - If the target attribute already exists, it is overwritten by the result of the formula. - Results are rounded up to the 9th decimal. For example, if the result of the formula is `0.1234567891`,   the actual value stored for the attribute is `0.123456789`. - If you need to scale a unit of measure,   see [Scale Filter](https://docs.datadoghq.com/logs/processing/parsing/?tab=filter#matcher-and-filter).

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**expression** | **String** | Arithmetic operation between one or more log attributes. | 
**isEnabled** | **Boolean** | Whether or not the processor is enabled. |  [optional]
**isReplaceMissing** | **Boolean** | If &#x60;true&#x60;, it replaces all missing attributes of expression by &#x60;0&#x60;, &#x60;false&#x60; skip the operation if an attribute is missing. |  [optional]
**name** | **String** | Name of the processor. |  [optional]
**target** | **String** | Name of the attribute that contains the result of the arithmetic operation. | 
**type** | **LogsArithmeticProcessorType** |  | 



