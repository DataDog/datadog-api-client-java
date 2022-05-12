// Delete a tag configuration returns "No Content" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.MetricsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("deleteTagConfiguration", true);
    MetricsApi apiInstance = new MetricsApi(defaultClient);

    try {
      apiInstance.deleteTagConfiguration("ExampleDeleteatagconfigurationreturnsNoContentresponse");
    } catch (ApiException e) {
      System.err.println("Exception when calling MetricsApi#deleteTagConfiguration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
