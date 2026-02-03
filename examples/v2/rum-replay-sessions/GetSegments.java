// Get segments returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumReplaySessionsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumReplaySessionsApi apiInstance = new RumReplaySessionsApi(defaultClient);

    try {
      apiInstance.getSegments(
          "00000000-0000-0000-0000-000000000002", "00000000-0000-0000-0000-000000000001");
    } catch (ApiException e) {
      System.err.println("Exception when calling RumReplaySessionsApi#getSegments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
