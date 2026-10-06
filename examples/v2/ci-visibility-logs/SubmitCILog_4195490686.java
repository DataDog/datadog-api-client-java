// Send batched CI job logs returns "Request accepted for processing" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CiVisibilityLogsApi;
import com.datadog.api.client.v2.model.CILogItem;
import java.util.Arrays;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CiVisibilityLogsApi apiInstance = new CiVisibilityLogsApi(defaultClient);

    List<CILogItem> body =
        Arrays.asList(
            new CILogItem()
                .message("Starting tests")
                .pipelineUniqueId("3eacb6f3-ff04-4e10-8a9c-46e6d054024a")
                .jobId("job-456")
                .lineNumber(1L)
                .status("notice")
                .sectionName("tests"),
            new CILogItem()
                .message("Tests passed")
                .pipelineUniqueId("3eacb6f3-ff04-4e10-8a9c-46e6d054024a")
                .jobId("job-456")
                .lineNumber(2L));

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
