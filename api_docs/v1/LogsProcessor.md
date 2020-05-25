

# LogsProcessor

Definition of a logs processor.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**grok** | [**LogsGrokParserRules**](LogsGrokParserRules.md) |  | 
**isEnabled** | **Boolean** | Whether or not the processor is enabled. |  [optional]
**name** | **String** | Name of the processor. |  [optional]
**samples** | **List&lt;String&gt;** | List of sample logs to test this grok parser. |  [optional]
**source** | **String** | Source attribute used to perform the lookup. | 
**type** | [**LogsTraceRemapperType**](LogsTraceRemapperType.md) |  | 
**sources** | **List&lt;String&gt;** | Array of source attributes. | 
**overrideOnConflict** | **Boolean** | Override or not the target element if already set, |  [optional]
**preserveSource** | **Boolean** | Remove or preserve the remapped source element. |  [optional]
**sourceType** | **String** | Defines if the sources are from log &#x60;attribute&#x60; or &#x60;tag&#x60;. |  [optional]
**target** | **String** | Name of the attribute that contains the corresponding value in the mapping list or the &#x60;default_lookup&#x60; if not found in the mapping list. | 
**targetType** | **String** | Defines if the sources are from log &#x60;attribute&#x60; or &#x60;tag&#x60;. |  [optional]
**normalizeEndingSlashes** | **Boolean** | Normalize the ending slashes or not. |  [optional]
**isEncoded** | **Boolean** | Define if the source attribute is URL encoded or not. |  [optional]
**categories** | [**List&lt;LogsCategoryProcessorCategories&gt;**](LogsCategoryProcessorCategories.md) | Array of filters to match or not a log and their corresponding &#x60;name&#x60;to assign a custom value to the log. | 
**expression** | **String** | Arithmetic operation between one or more log attributes. | 
**isReplaceMissing** | **Boolean** | If true, it replaces all missing attributes of &#x60;template&#x60; by an empty string. If &#x60;false&#x60; (default), skips the operation for missing attributes. |  [optional]
**template** | **String** | A formula with one or more attributes and raw text. | 
**filter** | [**LogsFilter**](LogsFilter.md) |  |  [optional]
**processors** | [**List&lt;LogsProcessor&gt;**](LogsProcessor.md) | Ordered list of processors in this pipeline. |  [optional]
**defaultLookup** | **String** | Value to set the target attribute if the source value is not found in the list. |  [optional]
**lookupTable** | **List&lt;String&gt;** | Mapping table of values for the source attribute and their associated target attribute values, formatted as &#x60;[\&quot;source_key1,target_value1\&quot;, \&quot;source_key2,target_value2\&quot;]&#x60; | 



