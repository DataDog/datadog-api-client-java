

# SyntheticsTiming

Object containing all metrics and their values collected for a Synthetic API test. Learn more about those metrics in [Synthetics documentation](https://docs.datadoghq.com/synthetics/#metrics).
## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**dns** | **Double** | The duration in millisecond of the DNS lookup. |  [optional]
**download** | **Double** | The time in millisecond to download the response. |  [optional]
**firstByte** | **Double** | The time in millisecond to first byte. |  [optional]
**handshake** | **Double** | The duration in millisecond of the TLS handshake. |  [optional]
**redirect** | **Double** | The time in millisecond spent during redirections. |  [optional]
**ssl** | **Double** | The duration in millisecond of the TLS handshake. |  [optional]
**tcp** | **Double** | Time in millisecond to establish the TCP connection. |  [optional]
**total** | **Double** | The overall time in millisecond the request took to be processed. |  [optional]
**wait** | **Double** | Time spent in millisecond waiting for a response. |  [optional]



