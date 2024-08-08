// Send gzip logs returns "Response from server (always 200 empty JSON)." response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.LogsApi;
import com.datadog.api.client.v1.api.LogsApi.SubmitLogOptionalParameters;
import com.datadog.api.client.v1.model.ContentEncoding;
import com.datadog.api.client.v1.model.HTTPLogItem;
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
.message("Example-Log")
.ddtags("host:ExampleLog"));

    try {
      apiInstance.submitLog(body,new SubmitLogOptionalParameters().contentEncoding(ContentEncoding.GZIP));
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsApi#submitLog");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}