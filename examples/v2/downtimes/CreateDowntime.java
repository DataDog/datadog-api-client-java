// Schedule a downtime returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.DowntimesApi;
import com.datadog.api.client.v2.model.DowntimeResponse;
import com.datadog.api.client.v2.model.DowntimeCreateRequest;
import com.datadog.api.client.v2.model.DowntimeCreateRequestAttributes;
import com.datadog.api.client.v2.model.DowntimeCreateRequestData;
import com.datadog.api.client.v2.model.DowntimeMonitorIdentifier;
import com.datadog.api.client.v2.model.DowntimeMonitorIdentifierTags;
import com.datadog.api.client.v2.model.DowntimeResourceType;
import com.datadog.api.client.v2.model.DowntimeScheduleCreateRequest;
import com.datadog.api.client.v2.model.DowntimeScheduleOneTimeCreateUpdateRequest;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DowntimesApi apiInstance = new DowntimesApi(defaultClient);

    DowntimeCreateRequest body = new DowntimeCreateRequest()
.data(new DowntimeCreateRequestData()
.attributes(new DowntimeCreateRequestAttributes()
.message("dark forest")
.monitorIdentifier(new DowntimeMonitorIdentifier(
new DowntimeMonitorIdentifierTags()
.monitorTags(Collections.singletonList("cat:hat"))))
.scope("test:exampledowntime")
.schedule(new DowntimeScheduleCreateRequest(
new DowntimeScheduleOneTimeCreateUpdateRequest()
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