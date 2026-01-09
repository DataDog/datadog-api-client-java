// Get degradation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.Degradation;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "status_page" in the system
    String STATUS_PAGE_DATA_ID = System.getenv("STATUS_PAGE_DATA_ID");

    // there is a valid "degradation" in the system
    String DEGRADATION_DATA_ID = System.getenv("DEGRADATION_DATA_ID");

    try {
      Degradation result = apiInstance.getDegradation(STATUS_PAGE_DATA_ID, DEGRADATION_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#getDegradation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
