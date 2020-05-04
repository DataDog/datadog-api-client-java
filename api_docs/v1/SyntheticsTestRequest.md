

# SyntheticsTestRequest

Object describing the Synthetic test request.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**basicAuth** | [**SyntheticsTestRequestBasicAuth**](SyntheticsTestRequestBasicAuth.md) |  |  [optional]
**body** | **String** | Body to include in the test. |  [optional]
**headers** | **Map&lt;String, String&gt;** | Headers to include when performing the test. |  [optional]
**host** | **String** | Host name to perform the test with. |  [optional]
**method** | [**HTTPMethod**](HTTPMethod.md) |  |  [optional]
**port** | **Long** | Port to use when performing the test. |  [optional]
**query** | [**Object**](.md) | Query to use for the test. |  [optional]
**timeout** | **Double** | Timeout in millisecond for the test. |  [optional]
**url** | **String** | URL to perform the test with. |  [optional]



