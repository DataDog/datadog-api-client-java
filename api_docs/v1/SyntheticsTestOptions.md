

# SyntheticsTestOptions

Object describing the extra options for a Synthetic test.

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**acceptSelfSigned** | **Boolean** | For SSL test, whether or not the test should allow self signed certificates. |  [optional]
**allowInsecure** | **Boolean** | Allows loading insecure content for an HTTP request. |  [optional]
**deviceIds** | **List&lt;SyntheticsDeviceID&gt;** | For browser test, array with the different device IDs used to run the test. |  [optional]
**disableCors** | **Boolean** | Whether or not to disable CORS mechanism. |  [optional]
**followRedirects** | **Boolean** | For API HTTP test, whether or not the test should follow redirects. |  [optional]
**minFailureDuration** | **Long** | Minimum amount of time in failure required to trigger an alert. |  [optional]
**minLocationFailed** | **Long** | Minimum number of locations in failure required to trigger an alert. |  [optional]
**monitorName** | **String** | The monitor name is used for the alert title as well as for all monitor dashboard widgets and SLOs. |  [optional]
**monitorOptions** | [**SyntheticsTestOptionsMonitorOptions**](SyntheticsTestOptionsMonitorOptions.md) |  |  [optional]
**monitorPriority** | **Integer** | Integer from 1 (high) to 5 (low) indicating alert severity. |  [optional]
**noScreenshot** | **Boolean** | Prevents saving screenshots of the steps. |  [optional]
**retry** | [**SyntheticsTestOptionsRetry**](SyntheticsTestOptionsRetry.md) |  |  [optional]
**tickEvery** | **SyntheticsTickInterval** |  |  [optional]



