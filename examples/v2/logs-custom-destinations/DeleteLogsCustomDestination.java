// Delete a custom destination returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsCustomDestinationsApi;
import com.datadog.api.client.v2.model.CustomDestinationDeleteResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteLogsCustomDestination", true);
    LogsCustomDestinationsApi apiInstance = new LogsCustomDestinationsApi(defaultClient);

    // there is a valid "logs_custom_destination" in the system
    String LOGS_CUSTOM_DESTINATION_DATA_ID = System.getenv("LOGS_CUSTOM_DESTINATION_DATA_ID");

    try {
      CustomDestinationDeleteResponse result =
          apiInstance.deleteLogsCustomDestination(LOGS_CUSTOM_DESTINATION_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LogsCustomDestinationsApi#deleteLogsCustomDestination");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
