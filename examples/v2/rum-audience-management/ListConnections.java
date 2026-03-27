// List connections returns "Successful response with list of connections" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumAudienceManagementApi;
import com.datadog.api.client.v2.model.ListConnectionsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listConnections", true);
    RumAudienceManagementApi apiInstance = new RumAudienceManagementApi(defaultClient);

    try {
      ListConnectionsResponse result = apiInstance.listConnections("users");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumAudienceManagementApi#listConnections");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
