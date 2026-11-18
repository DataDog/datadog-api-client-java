// Preview a segment returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumAudienceManagementApi;
import com.datadog.api.client.v2.model.SegmentDataQuery;
import com.datadog.api.client.v2.model.SegmentEventPlatformBlock;
import com.datadog.api.client.v2.model.SegmentPreviewAttributes;
import com.datadog.api.client.v2.model.SegmentPreviewData;
import com.datadog.api.client.v2.model.SegmentPreviewRequest;
import com.datadog.api.client.v2.model.SegmentPreviewRequestType;
import com.datadog.api.client.v2.model.SegmentPreviewResponse;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.previewProductAnalyticsSegment", true);
    RumAudienceManagementApi apiInstance = new RumAudienceManagementApi(defaultClient);

    SegmentPreviewRequest body =
        new SegmentPreviewRequest()
            .data(
                new SegmentPreviewData()
                    .attributes(
                        new SegmentPreviewAttributes()
                            .dataQuery(
                                new SegmentDataQuery()
                                    .eventPlatform(
                                        Collections.singletonList(
                                            new SegmentEventPlatformBlock()
                                                .facet("@usr.id")
                                                .from("-2592000000")
                                                .query("@type:view @view.name:/logs")
                                                .to("0"))))
                            .limit(50L)
                            .userStoreColumns(Arrays.asList("user_id", "user_email", "user_name")))
                    .type(SegmentPreviewRequestType.SEGMENT_PREVIEW_REQUEST));

    try {
      SegmentPreviewResponse result = apiInstance.previewProductAnalyticsSegment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumAudienceManagementApi#previewProductAnalyticsSegment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
