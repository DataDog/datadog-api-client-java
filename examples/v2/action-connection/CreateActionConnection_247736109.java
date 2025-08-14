// Create a new Action Connection with HTTPMtlsAuth returns "Successfully created Action Connection"
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.ActionConnectionAttributes;
import com.datadog.api.client.v2.model.ActionConnectionData;
import com.datadog.api.client.v2.model.ActionConnectionDataType;
import com.datadog.api.client.v2.model.ActionConnectionIntegration;
import com.datadog.api.client.v2.model.CreateActionConnectionRequest;
import com.datadog.api.client.v2.model.CreateActionConnectionResponse;
import com.datadog.api.client.v2.model.HTTPCredentials;
import com.datadog.api.client.v2.model.HTTPIntegration;
import com.datadog.api.client.v2.model.HTTPIntegrationType;
import com.datadog.api.client.v2.model.HTTPMtlsAuth;
import com.datadog.api.client.v2.model.HTTPMtlsAuthType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    CreateActionConnectionRequest body =
        new CreateActionConnectionRequest()
            .data(
                new ActionConnectionData()
                    .type(ActionConnectionDataType.ACTION_CONNECTION)
                    .attributes(
                        new ActionConnectionAttributes()
                            .name("HTTP mTLS Connection exampleactionconnection")
                            .integration(
                                new ActionConnectionIntegration(
                                    new HTTPIntegration()
                                        .type(HTTPIntegrationType.HTTP)
                                        .baseUrl("https://api.example.com")
                                        .credentials(
                                            new HTTPCredentials(
                                                new HTTPMtlsAuth()
                                                    .type(HTTPMtlsAuthType.HTTPMTLSAUTH)
                                                    .certificate(
                                                        """
-----BEGIN CERTIFICATE-----
MIICXjCCAUYCCQDOGcCfCHfhPzANBgkqhkiG9w0BAQsFADAzMQswCQYDVQQGEwJV
UzELMAkGA1UECAwCQ0ExFTATBgNVBAoMDERhdGFkb2cgSW5jLjAeFw0yNDA1MTQw
MDA1NThaFw0yNTA1MTQwMDA1NThaMDMxCzAJBgNVBAYTAlVTMQswCQYDVQQIDAJD
QTEVMBMGA1UECgwMRGF0YWRvZyBJbmMuMIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8A
MIIBCgKCAQEAwQDTmLqWv2L6YhzBcjKgPEzd3kE+9dZ4hBXBCjK6HgF/3aOKOSYq
M9KPFHgJj6SjUJ+8TqX4sV6yW5xGX8dKjOpTYQfExEjGYcVrqKoOGg2k6dGkHyGm
2VzL4zKyK1C3zJ4KpJnMYK8dPPcgzJvO7jGxGKMgLVU3VNdxKGTrqKmC6RbZLQOz
M3fLp7bF2VcJ6VkGKW+yBK6vVMbQKMvjTbGqr3vIRd8SZzKRTsyIzXQDKgOv2vPn
SqYJjKFJ8vJ7JeH6zGyLjQ1cGVy9jJ3+TjJoJhCGOyGzJpBGIcXfYjFDLcSRh7KE
QIDAQABo1MwUTAdBgNVHQ4EFgQU/V8vJkPJ8b9yQnC/9bJ2kJGJ5MjoyEwHwYDVR0j
BBgwFoAU/V8vJkPJ8b9yQnC/9bJ2kJGJ5Mjo
-----END CERTIFICATE-----
""")
                                                    .privateKey(
                                                        """
-----BEGIN PRIVATE KEY-----
MIIEvwIBADANBgkqhkiG9w0BAQEFAASCBKkwggSlAgEAAoIBAQDBaNOMV7V8T7gR
OmNcNfqGHxPrLLo1w2J7J8h6S8bVD9yCH2JKV8J5G2J8J0V8J3Jg8b3Jg8LxJgV
V8J6JgV8J9JgJg8LJg8VJgV5JgLLJgVVJg8V4Jg8VLJg8V6JgV8JqJgVV8J3JgV
V8J7JgVV8J5JgVV8J8JgVVJg8LJgJVLJgLVJgVVJgLJgVVJgVVJgVVJgLVJgVV
JgVVJgVVJgLJgVVJgLVJgLLJgVVJgVLJgVVJgVLJgVVJgVVJgVVJgVVJgVVJg
VVJgVVJgVVJgVVJgVVJgVVJgVVJgVVJgVVJgVVJgVVJgVVJgVVJgVVJgVVJgVVJ
AgMBAAECggEBAKoJkJJJJkJJkJ
-----END PRIVATE KEY-----
""")))))));

    try {
      CreateActionConnectionResponse result = apiInstance.createActionConnection(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#createActionConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
