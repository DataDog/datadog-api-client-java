// Get all processes returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ProcessesApi;
import com.datadog.api.client.v2.api.ProcessesApi.ListProcessesOptionalParameters;
import com.datadog.api.client.v2.model.ProcessSummariesResponse;
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
    ProcessesApi apiInstance = new ProcessesApi(defaultClient);

    try {
      ProcessSummariesResponse result = apiInstance.listProcesses(new ListProcessesOptionalParameters().search("process-agent").tags("testing:true").pageLimit(2));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProcessesApi#listProcesses");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}