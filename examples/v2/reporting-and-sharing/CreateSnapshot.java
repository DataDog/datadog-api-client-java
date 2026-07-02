// Create a graph snapshot returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ReportingAndSharingApi;
import com.datadog.api.client.v2.model.CreateSnapshotAdditionalConfig;
import com.datadog.api.client.v2.model.CreateSnapshotDataAttributesRequest;
import com.datadog.api.client.v2.model.CreateSnapshotDataRequest;
import com.datadog.api.client.v2.model.CreateSnapshotRequest;
import com.datadog.api.client.v2.model.CreateSnapshotResponse;
import com.datadog.api.client.v2.model.CreateSnapshotTTL;
import com.datadog.api.client.v2.model.CreateSnapshotTemplateVariable;
import com.datadog.api.client.v2.model.CreateSnapshotTimeseriesLegendType;
import com.datadog.api.client.v2.model.CreateSnapshotType;
import java.util.Arrays;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createSnapshot", true);
    ReportingAndSharingApi apiInstance = new ReportingAndSharingApi(defaultClient);

    CreateSnapshotRequest body =
        new CreateSnapshotRequest()
            .data(
                new CreateSnapshotDataRequest()
                    .attributes(
                        new CreateSnapshotDataAttributesRequest()
                            .additionalConfig(
                                new CreateSnapshotAdditionalConfig()
                                    .templateVariables(
                                        Collections.singletonList(
                                            new CreateSnapshotTemplateVariable()
                                                .name("host")
                                                .prefix("host")
                                                .values(
                                                    Arrays.asList("web-server-1", "web-server-2"))))
                                    .timeseriesLegendType(
                                        CreateSnapshotTimeseriesLegendType.EXPANDED)
                                    .timezoneOffsetMinutes(300L))
                            .end(1692464800000L)
                            .height(185L)
                            .isAuthenticated(false)
                            .start(1692464000000L)
                            .ttl(CreateSnapshotTTL.SIXTY_DAYS)
                            .widgetDefinition(
                                Map.ofEntries(
                                    Map.entry("requests", "[{'q': 'avg:system.cpu.user{*}'}]"),
                                    Map.entry("type", "timeseries")))
                            .width(300L))
                    .type(CreateSnapshotType.CREATE_SNAPSHOT));

    try {
      CreateSnapshotResponse result = apiInstance.createSnapshot(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReportingAndSharingApi#createSnapshot");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
