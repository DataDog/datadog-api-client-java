# GCPAccount

Your Google Cloud Platform Account.

## Properties

| Name                        | Type                   | Description                                                                                                                                                                              | Notes      |
| --------------------------- | ---------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ---------- |
| **authProviderX509CertUrl** | **String**             | Should be &#x60;https://www.googleapis.com/oauth2/v1/certs&#x60;.                                                                                                                        | [optional] |
| **authUri**                 | **String**             | Should be &#x60;https://accounts.google.com/o/oauth2/auth&#x60;.                                                                                                                         | [optional] |
| **automute**                | **Boolean**            | Silence monitors for expected GCE instance shutdowns.                                                                                                                                    | [optional] |
| **clientEmail**             | **String**             | Your email found in your JSON service account key.                                                                                                                                       | [optional] |
| **clientId**                | **String**             | Your ID found in your JSON service account key.                                                                                                                                          | [optional] |
| **clientX509CertUrl**       | **String**             | Should be &#x60;https://www.googleapis.com/robot/v1/metadata/x509/&lt;CLIENT_EMAIL&gt;&#x60; where &#x60;&lt;CLIENT_EMAIL&gt;&#x60; is the email found in your JSON service account key. | [optional] |
| **errors**                  | **List&lt;String&gt;** | An array of errors.                                                                                                                                                                      | [optional] |
| **hostFilters**             | **String**             | Limit the GCE instances that are pulled into Datadog by using tags. Only hosts that match one of the defined tags are imported into Datadog.                                             | [optional] |
| **privateKey**              | **String**             | Your private key name found in your JSON service account key.                                                                                                                            | [optional] |
| **privateKeyId**            | **String**             | Your private key ID found in your JSON service account key.                                                                                                                              | [optional] |
| **projectId**               | **String**             | Your Google Cloud project ID found in your JSON service account key.                                                                                                                     | [optional] |
| **tokenUri**                | **String**             | Should be &#x60;https://accounts.google.com/o/oauth2/token&#x60;.                                                                                                                        | [optional] |
| **type**                    | **String**             | The value for service_account found in your JSON service account key.                                                                                                                    | [optional] |
