

# SyntheticsTestOptions

Object describing the extra options for a Synthetic test.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptSelfSigned** | **Boolean** | For SSL test, whether or not the test should allow self signed certificates. |  [optional]
**allowInsecure** | **Boolean** | Allows loading insecure content for an HTTP request. |  [optional]
**deviceIds** | [**List&lt;SyntheticsDeviceID&gt;**](SyntheticsDeviceID.md) | For browser test, array with the different device IDs used to run the test. |  [optional]
**followRedirects** | **Boolean** | For API HTTP test, whether or not the test should follow redirects. |  [optional]
**minFailureDuration** | **Long** | Minimum amount of time in failure required to trigger an alert. |  [optional]
**minLocationFailed** | **Long** | Minimum number of locations in failure required to trigger an alert. |  [optional]
**retry** | [**SyntheticsTestOptionsRetry**](SyntheticsTestOptionsRetry.md) |  |  [optional]
**tickEvery** | [**SyntheticsTickInterval**](SyntheticsTickInterval.md) |  |  [optional]



