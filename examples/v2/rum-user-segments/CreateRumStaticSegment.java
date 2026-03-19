// Create a static RUM segment returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumUserSegmentsApi;
import com.datadog.api.client.v2.model.RumSegmentResponse;
import com.datadog.api.client.v2.model.RumStaticSegmentCreateAttributes;
import com.datadog.api.client.v2.model.RumStaticSegmentCreateData;
import com.datadog.api.client.v2.model.RumStaticSegmentCreateRequest;
import com.datadog.api.client.v2.model.RumStaticSegmentJourneyFilter;
import com.datadog.api.client.v2.model.RumStaticSegmentJourneyNode;
import com.datadog.api.client.v2.model.RumStaticSegmentJourneyQueryObject;
import com.datadog.api.client.v2.model.RumStaticSegmentRequestType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createRumStaticSegment", true);
    RumUserSegmentsApi apiInstance = new RumUserSegmentsApi(defaultClient);

    RumStaticSegmentCreateRequest body =
        new RumStaticSegmentCreateRequest()
            .data(
                new RumStaticSegmentCreateData()
                    .attributes(
                        new RumStaticSegmentCreateAttributes()
                            .description("Users from a specific journey.")
                            .journeyQueryObject(
                                new RumStaticSegmentJourneyQueryObject()
                                    .nodes(
                                        Collections.singletonList(
                                            new RumStaticSegmentJourneyNode()
                                                .filters(
                                                    Collections.singletonList(
                                                        new RumStaticSegmentJourneyFilter()
                                                            .attribute("@type")
                                                            .value("view"))))))
                            .name("My Static Segment")
                            .tags(Collections.singletonList("team:frontend")))
                    .type(RumStaticSegmentRequestType.CREATE_STATIC_SEGMENT_REQUEST));

    try {
      RumSegmentResponse result = apiInstance.createRumStaticSegment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumUserSegmentsApi#createRumStaticSegment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
