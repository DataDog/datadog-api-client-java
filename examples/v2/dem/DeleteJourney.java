// Delete a DEM journey returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DemApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DemApi apiInstance = new DemApi(defaultClient);

    try {
      apiInstance.deleteJourney("journey-abc123");
    } catch (ApiException e) {
      System.err.println("Exception when calling DemApi#deleteJourney");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
