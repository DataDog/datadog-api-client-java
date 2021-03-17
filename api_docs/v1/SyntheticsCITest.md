

# SyntheticsCITest

Test configuration for Synthetics CI

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowInsecureCertificates** | **Boolean** | Disable certificate checks in API tests. |  [optional]
**basicAuth** | [**SyntheticsBasicAuth**](SyntheticsBasicAuth.md) |  |  [optional]
**body** | **String** | Body to include in the test. |  [optional]
**bodyType** | **String** | Type of the data sent in a synthetics API test. |  [optional]
**cookies** | **String** | Cookies for the request. |  [optional]
**deviceIds** | **List&lt;SyntheticsDeviceID&gt;** | For browser test, array with the different device IDs used to run the test. |  [optional]
**followRedirects** | **Boolean** | For API HTTP test, whether or not the test should follow redirects. |  [optional]
**headers** | **Map&lt;String, String&gt;** | Headers to include when performing the test. |  [optional]
**locations** | **List&lt;String&gt;** | Array of locations used to run the test. |  [optional]
**metadata** | [**SyntheticsCITestMetadata**](SyntheticsCITestMetadata.md) |  |  [optional]
**publicId** | **String** | The public ID of the Synthetics test to trigger. | 
**retry** | [**SyntheticsTestOptionsRetry**](SyntheticsTestOptionsRetry.md) |  |  [optional]
**startUrl** | **String** | Starting URL for the browser test. |  [optional]
**variables** | **Map&lt;String, String&gt;** | Variables to replace in the test. |  [optional]



