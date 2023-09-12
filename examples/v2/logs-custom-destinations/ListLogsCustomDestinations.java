// List custom destinations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsCustomDestinationsApi;
import com.datadog.api.client.v2.model.CustomDestinationListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listLogsCustomDestinations", true);
    LogsCustomDestinationsApi apiInstance = new LogsCustomDestinationsApi(defaultClient);

    try {
      CustomDestinationListResponse result = apiInstance.listLogsCustomDestinations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LogsCustomDestinationsApi#listLogsCustomDestinations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
