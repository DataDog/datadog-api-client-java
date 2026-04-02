// Publish status page returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "unpublished_status_page" in the system
    UUID UNPUBLISHED_STATUS_PAGE_DATA_ID = null;
    try {
      UNPUBLISHED_STATUS_PAGE_DATA_ID =
          UUID.fromString(System.getenv("UNPUBLISHED_STATUS_PAGE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      apiInstance.publishStatusPage(UNPUBLISHED_STATUS_PAGE_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#publishStatusPage");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
