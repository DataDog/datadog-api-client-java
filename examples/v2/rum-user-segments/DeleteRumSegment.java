// Delete a RUM segment returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumUserSegmentsApi;
import com.datadog.api.client.v2.model.RumSegmentDeleteResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteRumSegment", true);
    RumUserSegmentsApi apiInstance = new RumUserSegmentsApi(defaultClient);

    try {
      RumSegmentDeleteResponse result =
          apiInstance.deleteRumSegment("a1b2c3d4-1234-5678-9abc-123456789abc");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumUserSegmentsApi#deleteRumSegment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
