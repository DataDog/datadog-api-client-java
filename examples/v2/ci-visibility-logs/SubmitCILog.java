// Send CI job logs returns "Request accepted for processing" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CiVisibilityLogsApi;
import com.datadog.api.client.v2.model.CILogItem;
import java.util.Collections;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CiVisibilityLogsApi apiInstance = new CiVisibilityLogsApi(defaultClient);

    List<CILogItem> body =
        Collections.singletonList(
            new CILogItem()
                .ddtags("runner:linux,architecture:amd64")
                .jobId("job-456")
                .lineNumber(812L)
                .message("Running go test ./...")
                .pipelineUniqueId("3eacb6f3-ff04-4e10-8a9c-46e6d054024a")
                .providerName("example-provider")
                .sectionName("tests")
                .status("warn"));

    try {
      apiInstance.submitCILog(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CiVisibilityLogsApi#submitCILog");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
