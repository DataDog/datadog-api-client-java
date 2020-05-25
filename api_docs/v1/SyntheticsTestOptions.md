

# SyntheticsTestOptions

Object describing the extra options for a Synthetic test.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptSelfSigned** | **Boolean** | For browser test, whether or not the test should allow self signed certificate. |  [optional]
**allowInsecure** | **Boolean** | Allows loading insecure content for an HTTP request. |  [optional]
**deviceIds** | [**List&lt;SyntheticsDeviceID&gt;**](SyntheticsDeviceID.md) | Array with the different device IDs used to run the test. |  [optional]
**followRedirects** | **Boolean** | For API SSL test, whether or not the test should follow redirects. |  [optional]
**minFailureDuration** | **Long** | Minimum amount of time before declaring the test has failed. |  [optional]
**minLocationFailed** | **Long** | Minimum amount of locations that are allowed to fail for the test. |  [optional]
**retry** | [**SyntheticsTestOptionsRetry**](SyntheticsTestOptionsRetry.md) |  |  [optional]
**tickEvery** | [**SyntheticsTickInterval**](SyntheticsTickInterval.md) |  |  [optional]



