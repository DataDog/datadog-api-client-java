// Revoke client token returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.KeyManagementApi;
import com.datadog.api.client.v1.model.ClientTokenRevokeRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v1.revokeClientToken", true);
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    ClientTokenRevokeRequest body =
        new ClientTokenRevokeRequest().hash("1234567890abcdef1234567890abcdef123");

    try {
      apiInstance.revokeClientToken(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#revokeClientToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
