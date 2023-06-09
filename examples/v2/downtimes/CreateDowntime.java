// Schedule a downtime returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DowntimesApi;
import com.datadog.api.client.v2.model.DowntimeAttributeCreateRequest;
import com.datadog.api.client.v2.model.DowntimeAttributeMonitorIdentifier;
import com.datadog.api.client.v2.model.DowntimeAttributeMonitorIdentifierTags;
import com.datadog.api.client.v2.model.DowntimeAttributeScheduleCreateRequest;
import com.datadog.api.client.v2.model.DowntimeAttributeScheduleOneTimeCreateEditRequest;
import com.datadog.api.client.v2.model.DowntimeCreateData;
import com.datadog.api.client.v2.model.DowntimeCreateRequest;
import com.datadog.api.client.v2.model.DowntimeResourceType;
import com.datadog.api.client.v2.model.DowntimeResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createDowntime", true);
    DowntimesApi apiInstance = new DowntimesApi(defaultClient);

    DowntimeCreateRequest body =
        new DowntimeCreateRequest()
            .data(
                new DowntimeCreateData()
                    .attributes(
                        new DowntimeAttributeCreateRequest()
                            .message("dark forest")
                            .monitorIdentifier(
                                new DowntimeAttributeMonitorIdentifier(
                                    new DowntimeAttributeMonitorIdentifierTags()
                                        .monitorTags(Collections.singletonList("cat:hat"))))
                            .scope("test:exampledowntime")
                            .schedule(
                                new DowntimeAttributeScheduleCreateRequest(
                                    new DowntimeAttributeScheduleOneTimeCreateEditRequest()
                                        .start(null))))
                    .type(DowntimeResourceType.DOWNTIME));

    try {
      DowntimeResponse result = apiInstance.createDowntime(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#createDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
