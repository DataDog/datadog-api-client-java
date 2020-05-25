

# LogsLookupProcessor

Use the Lookup Processor to define a mapping between a log attribute and a human readable value saved in the processors mapping table. For example, you can use the Lookup Processor to map an internal service ID into a human readable service name. Alternatively, you could also use it to check if the MAC address that just attempted to connect to the production environment belongs to your list of stolen machines.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**defaultLookup** | **String** | Value to set the target attribute if the source value is not found in the list. |  [optional]
**isEnabled** | **Boolean** | Whether or not the processor is enabled. |  [optional]
**lookupTable** | **List&lt;String&gt;** | Mapping table of values for the source attribute and their associated target attribute values, formatted as &#x60;[\&quot;source_key1,target_value1\&quot;, \&quot;source_key2,target_value2\&quot;]&#x60; | 
**name** | **String** | Name of the processor. |  [optional]
**source** | **String** | Source attribute used to perform the lookup. | 
**target** | **String** | Name of the attribute that contains the corresponding value in the mapping list or the &#x60;default_lookup&#x60; if not found in the mapping list. | 
**type** | [**LogsLookupProcessorType**](LogsLookupProcessorType.md) |  | 



