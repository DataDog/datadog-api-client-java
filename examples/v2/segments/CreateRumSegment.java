// Create rum segment returns "Segment created successfully" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SegmentsApi;
import com.datadog.api.client.v2.model.Segment;
import com.datadog.api.client.v2.model.SegmentData;
import com.datadog.api.client.v2.model.SegmentDataAttributes;
import com.datadog.api.client.v2.model.SegmentDataAttributesDataQuery;
import com.datadog.api.client.v2.model.SegmentDataAttributesDataQueryEventPlatformItems;
import com.datadog.api.client.v2.model.SegmentDataSource;
import com.datadog.api.client.v2.model.SegmentDataType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createRumSegment", true);
    SegmentsApi apiInstance = new SegmentsApi(defaultClient);

    Segment body =
        new Segment()
            .data(
                new SegmentData()
                    .attributes(
                        new SegmentDataAttributes()
                            .createdAt(OffsetDateTime.parse("0001-01-01T00:00:00Z"))
                            .createdBy(new SegmentDataSource().handle("").id("").uuid(""))
                            .dataQuery(
                                new SegmentDataAttributesDataQuery()
                                    .eventPlatform(
                                        Collections.singletonList(
                                            new SegmentDataAttributesDataQueryEventPlatformItems()
                                                .facet("@usr.id")
                                                .from("2025-08-01")
                                                .name("high_value_users")
                                                .query(
                                                    "@type:view @view.name:/logs"
                                                        + " @usr.session_duration:>300000")
                                                .to("2025-09-01"))))
                            .description(
                                "Users who frequently visit logs and have high session duration")
                            .modifiedAt(OffsetDateTime.parse("0001-01-01T00:00:00Z"))
                            .modifiedBy(new SegmentDataSource().handle("").id("").uuid(""))
                            .name("High-Value Users")
                            .orgId(123456L)
                            .source(0L)
                            .tags(Arrays.asList("high-value", "logs", "active"))
                            .version(1L))
                    .id("segment-12345")
                    .type(SegmentDataType.SEGMENT));

    try {
      Segment result = apiInstance.createRumSegment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#createRumSegment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
