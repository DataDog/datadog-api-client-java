// Update a RUM segment returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumUserSegmentsApi;
import com.datadog.api.client.v2.model.RumSegmentDataQuery;
import com.datadog.api.client.v2.model.RumSegmentEventPlatform;
import com.datadog.api.client.v2.model.RumSegmentJourney;
import com.datadog.api.client.v2.model.RumSegmentReferenceTable;
import com.datadog.api.client.v2.model.RumSegmentReferenceTableColumn;
import com.datadog.api.client.v2.model.RumSegmentReferenceTableJoinCondition;
import com.datadog.api.client.v2.model.RumSegmentResourceType;
import com.datadog.api.client.v2.model.RumSegmentStaticEntry;
import com.datadog.api.client.v2.model.RumSegmentTemplateInstance;
import com.datadog.api.client.v2.model.RumSegmentUpdateAttributes;
import com.datadog.api.client.v2.model.RumSegmentUpdateData;
import com.datadog.api.client.v2.model.RumSegmentUpdateRequest;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateRumSegment", true);
    RumUserSegmentsApi apiInstance = new RumUserSegmentsApi(defaultClient);

    RumSegmentUpdateRequest body =
        new RumSegmentUpdateRequest()
            .data(
                new RumSegmentUpdateData()
                    .attributes(
                        new RumSegmentUpdateAttributes()
                            .dataQuery(
                                new RumSegmentDataQuery()
                                    .combination("(logs && apm_home) && NOT(apm_trace)")
                                    .eventPlatforms(
                                        Collections.singletonList(
                                            new RumSegmentEventPlatform()
                                                .facet("@usr.id")
                                                .from(1709888355000L)
                                                .name("logs")
                                                .query("@type:view @view.url_path:/logs")
                                                .to(1710493155000L)))
                                    .journeys(
                                        Collections.singletonList(
                                            new RumSegmentJourney()
                                                .conversionType("any")
                                                .groupBy("@usr.id")
                                                .name("my_journey")
                                                .search("@type:view")))
                                    .referenceTables(
                                        Collections.singletonList(
                                            new RumSegmentReferenceTable()
                                                .columns(
                                                    Collections.singletonList(
                                                        new RumSegmentReferenceTableColumn()
                                                            .name("user_id")))
                                                .filterQuery("")
                                                .joinCondition(
                                                    new RumSegmentReferenceTableJoinCondition()
                                                        .columnName("user_id")
                                                        .facet("@usr.id"))
                                                .name("my_ref_table")
                                                .tableName("my_table")))
                                    ._static(
                                        Collections.singletonList(
                                            new RumSegmentStaticEntry()
                                                .id("static-list-1")
                                                .name("My Static List")
                                                .userCount(500L)))
                                    .templates(
                                        Collections.singletonList(
                                            new RumSegmentTemplateInstance()
                                                .from(1709888355000L)
                                                .parameters(
                                                    Map.ofEntries(Map.entry("threshold", "5")))
                                                .templateId("stickiness-v1")
                                                .to(1710493155000L))))
                            .description("Updated description.")
                            .name("Updated Segment Name")
                            .tags(Collections.singletonList("team:backend")))
                    .id("a1b2c3d4-1234-5678-9abc-123456789abc")
                    .type(RumSegmentResourceType.SEGMENT));

    try {
      apiInstance.updateRumSegment("a1b2c3d4-1234-5678-9abc-123456789abc", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumUserSegmentsApi#updateRumSegment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
