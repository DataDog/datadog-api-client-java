// Get a custom destination returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.LogsCustomDestinationsApi;
import com.datadog.api.client.v2.model.CustomDestinationResponse;
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
    LogsCustomDestinationsApi apiInstance = new LogsCustomDestinationsApi(defaultClient);

    // there is a valid "custom_destination" in the system
    String CUSTOM_DESTINATION_DATA_ID = System.getenv("CUSTOM_DESTINATION_DATA_ID");

    try {
      CustomDestinationResponse result = apiInstance.getLogsCustomDestination(CUSTOM_DESTINATION_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsCustomDestinationsApi#getLogsCustomDestination");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}