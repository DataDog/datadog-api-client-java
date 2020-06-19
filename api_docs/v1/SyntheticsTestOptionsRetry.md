

# SyntheticsTestOptionsRetry

Object describing the retry strategy to apply to a Synthetic test. By default, there is a 300ms wait before retrying a test that has failed.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**count** | **Long** | The amount of location that needs to fail for the test to be retried. |  [optional]
**interval** | **Double** | The interval over which the amount of location needed to fail for the test to be retried. |  [optional]



