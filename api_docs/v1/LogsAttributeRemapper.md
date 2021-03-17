

# LogsAttributeRemapper

The remapper processor remaps any source attribute(s) or tag to another target attribute or tag. Constraints on the tag/attribute name are explained in the [Tag Best Practice documentation](https://docs.datadoghq.com/logs/guide/log-parsing-best-practice). Some additional constraints are applied as `:` or `,` are not allowed in the target tag/attribute name.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isEnabled** | **Boolean** | Whether or not the processor is enabled. |  [optional]
**name** | **String** | Name of the processor. |  [optional]
**overrideOnConflict** | **Boolean** | Override or not the target element if already set, |  [optional]
**preserveSource** | **Boolean** | Remove or preserve the remapped source element. |  [optional]
**sourceType** | **String** | Defines if the sources are from log &#x60;attribute&#x60; or &#x60;tag&#x60;. |  [optional]
**sources** | **List&lt;String&gt;** | Array of source attributes. | 
**target** | **String** | Final attribute or tag name to remap the sources to. | 
**targetFormat** | **TargetFormatType** |  |  [optional]
**targetType** | **String** | Defines if the final attribute or tag name is from log &#x60;attribute&#x60; or &#x60;tag&#x60;. |  [optional]
**type** | **LogsAttributeRemapperType** |  | 



