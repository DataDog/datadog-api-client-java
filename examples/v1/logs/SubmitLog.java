// Send logs returns "Response from server (always 200 empty JSON)." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.LogsApi;
import com.datadog.api.client.v1.model.HTTPLogItem;
import java.util.Collections;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsApi apiInstance = new LogsApi(defaultClient);

    List<HTTPLogItem> body =
        Collections.singletonList(
            new HTTPLogItem()
                .message(
                    "Example-Send_logs_returns_Response_from_server_always_200_empty_JSON_response")
                .ddtags("host:ExampleSendlogsreturnsResponsefromserveralways200emptyJSONresponse"));

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
