

# LogsGeoIPParser

The GeoIP parser takes an IP address attribute and extracts if available the Continent, Country, Subdivision, and City information in the target attribute path.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**isEnabled** | **Boolean** | Whether or not the processor is enabled. |  [optional]
**name** | **String** | Name of the processor. |  [optional]
**sources** | **List&lt;String&gt;** | Array of source attributes. | 
**target** | **String** | Name of the parent attribute that contains all the extracted details from the &#x60;sources&#x60;. | 
**type** | **LogsGeoIPParserType** |  | 



