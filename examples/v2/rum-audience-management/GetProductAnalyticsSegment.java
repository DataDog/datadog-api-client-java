// Get a segment returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumAudienceManagementApi;
import com.datadog.api.client.v2.model.SegmentResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.getProductAnalyticsSegment", true);
    RumAudienceManagementApi apiInstance = new RumAudienceManagementApi(defaultClient);

    try {
      SegmentResponse result =
          apiInstance.getProductAnalyticsSegment("8a1b2c3d-4e5f-6a7b-8c9d-0e1f2a3b4c5d");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumAudienceManagementApi#getProductAnalyticsSegment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
