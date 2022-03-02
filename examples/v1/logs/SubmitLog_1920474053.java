// Send gzip logs returns "Response from server (always 200 empty JSON)." response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.LogsApi;
import com.datadog.api.v1.client.api.LogsApi.SubmitLogOptionalParameters;
import com.datadog.api.v1.client.model.ContentEncoding;
import com.datadog.api.v1.client.model.HTTPLogItem;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsApi apiInstance = new LogsApi(defaultClient);

    List<HTTPLogItem> body =
        Collections.singletonList(
            new HTTPLogItem()
                .message(
                    "Example-Send_gzip_logs_returns_Response_from_server_always_200_empty_JSON_response")
                .ddtags(
                    "host:ExampleSendgziplogsreturnsResponsefromserveralways200emptyJSONresponse"));

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
