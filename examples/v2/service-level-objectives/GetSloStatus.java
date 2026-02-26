// Get SLO status returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ServiceLevelObjectivesApi;
import com.datadog.api.client.v2.model.SloStatusResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getSloStatus", true);
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    try {
      SloStatusResponse result =
          apiInstance.getSloStatus(
              "00000000-0000-0000-0000-000000000000", 1690901870L, 1706803070L);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectivesApi#getSloStatus");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
