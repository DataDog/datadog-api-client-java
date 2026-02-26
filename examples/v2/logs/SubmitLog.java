// Send logs returns "Request accepted for processing (always 202 empty JSON)." response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.LogsApi;
import com.datadog.api.client.v2.model.HTTPLogItem;
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
    LogsApi apiInstance = new LogsApi(defaultClient);

    List<HTTPLogItem> body = Collections.singletonList(new HTTPLogItem()
.ddsource("nginx")
.ddtags("env:staging,version:5.1")
.hostname("i-012345678")
.message("2019-11-19T14:37:58,995 INFO [process.name][20081] Hello World")
.service("payment")
.putAdditionalProperty("status", "info"));

    try {
      apiInstance.submitLog(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#submitLog");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}