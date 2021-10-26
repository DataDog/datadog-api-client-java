# LogsUserAgentParser

The User-Agent parser takes a User-Agent attribute and extracts the OS, browser, device, and other user data. It recognizes major bots like the Google Bot, Yahoo Slurp, and Bing.

## Properties

| Name          | Type                        | Description                                                                                        | Notes      |
| ------------- | --------------------------- | -------------------------------------------------------------------------------------------------- | ---------- |
| **isEnabled** | **Boolean**                 | Whether or not the processor is enabled.                                                           | [optional] |
| **isEncoded** | **Boolean**                 | Define if the source attribute is URL encoded or not.                                              | [optional] |
| **name**      | **String**                  | Name of the processor.                                                                             | [optional] |
| **sources**   | **List&lt;String&gt;**      | Array of source attributes.                                                                        |
| **target**    | **String**                  | Name of the parent attribute that contains all the extracted details from the &#x60;sources&#x60;. |
| **type**      | **LogsUserAgentParserType** |                                                                                                    |
