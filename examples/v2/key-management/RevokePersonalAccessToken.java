// Revoke a personal access token returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.KeyManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    KeyManagementApi apiInstance = new KeyManagementApi(defaultClient);

    // there is a valid "personal_access_token" in the system
    String PERSONAL_ACCESS_TOKEN_DATA_ID = System.getenv("PERSONAL_ACCESS_TOKEN_DATA_ID");

    try {
      apiInstance.revokePersonalAccessToken(PERSONAL_ACCESS_TOKEN_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyManagementApi#revokePersonalAccessToken");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
