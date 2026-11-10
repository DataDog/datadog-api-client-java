// Delete a user profile returns "Deletion accepted; the profile will be removed asynchronously"
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumAudienceManagementApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteUserProfile", true);
    RumAudienceManagementApi apiInstance = new RumAudienceManagementApi(defaultClient);

    try {
      apiInstance.deleteUserProfile("user-1234");
    } catch (ApiException e) {
      System.err.println("Exception when calling RumAudienceManagementApi#deleteUserProfile");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
