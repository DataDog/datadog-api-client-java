// Create a segment returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumAudienceManagementApi;
import com.datadog.api.client.v2.model.SegmentCreateAttributes;
import com.datadog.api.client.v2.model.SegmentCreateData;
import com.datadog.api.client.v2.model.SegmentCreateRequest;
import com.datadog.api.client.v2.model.SegmentDataQuery;
import com.datadog.api.client.v2.model.SegmentEventPlatformBlock;
import com.datadog.api.client.v2.model.SegmentResourceType;
import com.datadog.api.client.v2.model.SegmentResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createProductAnalyticsSegment", true);
    RumAudienceManagementApi apiInstance = new RumAudienceManagementApi(defaultClient);

    SegmentCreateRequest body =
        new SegmentCreateRequest()
            .data(
                new SegmentCreateData()
                    .attributes(
                        new SegmentCreateAttributes()
                            .dataQuery(
                                new SegmentDataQuery()
                                    .eventPlatform(
                                        Collections.singletonList(
                                            new SegmentEventPlatformBlock()
                                                .facet("@usr.id")
                                                .from("-2592000000")
                                                .name("viewed_logs")
                                                .query("@type:view @view.name:/logs")
                                                .to("0"))))
                            .description("Users who viewed the logs page in the last 30 days.")
                            .name("High-value users")
                            .tags(Collections.singletonList("team:growth")))
                    .type(SegmentResourceType.SEGMENT));

    try {
      SegmentResponse result = apiInstance.createProductAnalyticsSegment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling RumAudienceManagementApi#createProductAnalyticsSegment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
