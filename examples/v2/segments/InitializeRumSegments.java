// Initialize rum segments returns "Default segments created successfully" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SegmentsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.initializeRumSegments", true);
    SegmentsApi apiInstance = new SegmentsApi(defaultClient);

    try {
      apiInstance.initializeRumSegments();
    } catch (ApiException e) {
      System.err.println("Exception when calling SegmentsApi#initializeRumSegments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
