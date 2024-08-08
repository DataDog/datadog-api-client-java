// Delete an API returns "API deleted successfully" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ApiManagementApi;
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
    defaultClient.setUnstableOperationEnabled("v2.deleteOpenAPI", true);
    ApiManagementApi apiInstance = new ApiManagementApi(defaultClient);

    // there is a valid "managed_api" in the system
    UUID MANAGED_API_DATA_ID = null;
    try {
      MANAGED_API_DATA_ID = UUID.fromString(System.getenv("MANAGED_API_DATA_ID"));
    } catch (IllegalArgumentException e) {
        System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      apiInstance.deleteOpenAPI(MANAGED_API_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApiManagementApi#deleteOpenAPI");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}