// Delete a RUM retention quota configuration returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionQuotasApi;
import com.datadog.api.client.v2.model.RumRetentionQuotaScopeType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumRetentionQuotasApi apiInstance = new RumRetentionQuotasApi(defaultClient);

    // there is a valid "rum_application" in the system
    String RUM_APPLICATION_DATA_ID = System.getenv("RUM_APPLICATION_DATA_ID");

    try {
      apiInstance.deleteRumQuotaConfig(
          RumRetentionQuotaScopeType.APPLICATION, RUM_APPLICATION_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionQuotasApi#deleteRumQuotaConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
