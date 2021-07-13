

# SyntheticsTestRequest

Object describing the Synthetic test request.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowInsecure** | **Boolean** | Allows loading insecure content for an HTTP request in a multistep test step. |  [optional]
**basicAuth** | [**SyntheticsBasicAuth**](SyntheticsBasicAuth.md) |  |  [optional]
**body** | **String** | Body to include in the test. |  [optional]
**certificate** | [**SyntheticsTestRequestCertificate**](SyntheticsTestRequestCertificate.md) |  |  [optional]
**dnsServer** | **String** | DNS server to use for DNS tests. |  [optional]
**dnsServerPort** | **Integer** | DNS server port to use for DNS tests. |  [optional]
**headers** | **Map&lt;String, String&gt;** | Headers to include when performing the test. |  [optional]
**host** | **String** | Host name to perform the test with. |  [optional]
**method** | **HTTPMethod** |  |  [optional]
**noSavingResponseBody** | **Boolean** | Determines whether or not to save the response body. |  [optional]
**numberOfPackets** | **Integer** | Number of pings to use per test. |  [optional]
**port** | **Long** | Port to use when performing the test. |  [optional]
**query** | **Object** | Query to use for the test. |  [optional]
**shouldTrackHops** | **Boolean** | Turns on a traceroute probe to discover all gateways along the path to the host destination. |  [optional]
**timeout** | **Double** | Timeout in seconds for the test. |  [optional]
**url** | **String** | URL to perform the test with. |  [optional]



