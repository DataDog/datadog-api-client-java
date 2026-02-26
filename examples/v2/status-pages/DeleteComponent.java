// Delete component returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "status_page" in the system
    UUID STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_ID = null;
    try {
      STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_ID =
          UUID.fromString(System.getenv("STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }
    UUID STATUS_PAGE_DATA_ID = null;
    try {
      STATUS_PAGE_DATA_ID = UUID.fromString(System.getenv("STATUS_PAGE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      apiInstance.deleteComponent(STATUS_PAGE_DATA_ID, STATUS_PAGE_DATA_ATTRIBUTES_COMPONENTS_0_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#deleteComponent");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
