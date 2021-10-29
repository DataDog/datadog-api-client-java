

# SyntheticsAPITestResultData

Object containing results for your Synthetic API test.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cert** | [**SyntheticsSSLCertificate**](SyntheticsSSLCertificate.md) |  |  [optional]
**errorCode** | **SyntheticsErrorCode** |  |  [optional]
**errorMessage** | **String** | The API test error message. |  [optional]
**eventType** | **SyntheticsTestProcessStatus** |  |  [optional]
**httpStatusCode** | **Long** | The API test HTTP status code. |  [optional]
**requestHeaders** | **Map&lt;String, Object&gt;** | Request header object used for the API test. |  [optional]
**responseBody** | **String** | Response body returned for the API test. |  [optional]
**responseHeaders** | **Map&lt;String, Object&gt;** | Response headers returned for the API test. |  [optional]
**responseSize** | **Long** | Global size in byte of the API test response. |  [optional]
**timings** | [**SyntheticsTiming**](SyntheticsTiming.md) |  |  [optional]



