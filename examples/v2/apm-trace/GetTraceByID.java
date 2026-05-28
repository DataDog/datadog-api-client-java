// Get a trace by ID returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApmTraceApi;
import com.datadog.api.client.v2.model.TraceResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getTraceByID", true);
    ApmTraceApi apiInstance = new ApmTraceApi(defaultClient);

    try {
      TraceResponse result = apiInstance.getTraceByID("0000000000000000abc1230000000000");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApmTraceApi#getTraceByID");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
