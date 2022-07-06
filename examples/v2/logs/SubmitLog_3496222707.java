// Send gzip logs returns "Request accepted for processing (always 202 empty JSON)." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v2.api.LogsApi;
import com.datadog.api.client.v2.api.LogsApi.SubmitLogOptionalParameters;
import com.datadog.api.client.v2.model.ContentEncoding;
import com.datadog.api.client.v2.model.HTTPLogItem;
import java.util.Collections;
import java.util.List;

public class SubmitLog_3496222707 {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsApi apiInstance = new LogsApi(defaultClient);

    List<HTTPLogItem> body =
        Collections.singletonList(
            new HTTPLogItem()
                .ddsource("nginx")
                .ddtags("env:staging,version:5.1")
                .hostname("i-012345678")
                .message("2019-11-19T14:37:58,995 INFO [process.name][20081] Hello World")
                .service("payment"));

    try {
      apiInstance.submitLog(
          body, new SubmitLogOptionalParameters().contentEncoding(ContentEncoding.GZIP));
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#submitLog");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
