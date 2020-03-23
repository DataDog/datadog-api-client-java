

# AWSAccount

Returns the AWS account associated with this integration.
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**accessKeyId** | **String** | Your AWS access key ID. Only required if your AWS account is a GovCloud or China account. |  [optional]
**accountId** | **String** | Your AWS Account ID without dashes. |  [optional]
**accountSpecificNamespaceRules** | **Map&lt;String, Boolean&gt;** | An object (in the form {\&quot;namespace1\&quot;:true/false, \&quot;namespace2\&quot;:true/false}) that enables or disables metric collection for specific AWS namespaces for this AWS account only. A list of namespaces can be found at the /v1/integration/aws/available_namespace_rules endpoint. |  [optional]
**excludedRegions** | **List&lt;String&gt;** | An array of AWS regions to exclude from metrics collection. |  [optional]
**filterTags** | **List&lt;String&gt;** | The array of EC2 tags (in the form key:value) defines a filter that Datadog uses when collecting metrics from EC2. Wildcards, such as ? (for single characters) and * (for multiple characters) can also be used. Only hosts that match one of the defined tags will be imported into Datadog. The rest will be ignored. Host matching a given tag can also be excluded by adding ! before the tag. For example, &#x60;env:production,instance-type:c1.*,!region:us-east-1&#x60; |  [optional]
**hostTags** | **List&lt;String&gt;** | Array of tags (in the form key:value) to add to all hosts and metrics reporting through this integration. |  [optional]
**roleName** | **String** | Your Datadog role delegation name. |  [optional]
**secretAccessKey** | **String** | Your AWS secret access key. Only required if your AWS account is a GovCloud or China account. |  [optional]



