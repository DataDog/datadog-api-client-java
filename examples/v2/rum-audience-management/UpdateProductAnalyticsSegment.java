// Update a segment returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumAudienceManagementApi;
import com.datadog.api.client.v2.model.SegmentResourceType;
import com.datadog.api.client.v2.model.SegmentUpdateAttributes;
import com.datadog.api.client.v2.model.SegmentUpdateData;
import com.datadog.api.client.v2.model.SegmentUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateProductAnalyticsSegment", true);
    RumAudienceManagementApi apiInstance = new RumAudienceManagementApi(defaultClient);

    SegmentUpdateRequest body =
        new SegmentUpdateRequest()
            .data(
                new SegmentUpdateData()
                    .attributes(
                        new SegmentUpdateAttributes()
                            .description("Users who viewed the logs page in the last 7 days.")
                            .name("High-value users"))
                    .id("8a1b2c3d-4e5f-6a7b-8c9d-0e1f2a3b4c5d")
                    .type(SegmentResourceType.SEGMENT));

    try {
      apiInstance.updateProductAnalyticsSegment("8a1b2c3d-4e5f-6a7b-8c9d-0e1f2a3b4c5d", body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumAudienceManagementApi#updateProductAnalyticsSegment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
