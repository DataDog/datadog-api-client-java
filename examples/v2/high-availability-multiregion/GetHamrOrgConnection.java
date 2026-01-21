// Get HAMR organization connection returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.HighAvailabilityMultiRegionApi;
import com.datadog.api.client.v2.model.HamrOrgConnectionResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getHamrOrgConnection", true);
    HighAvailabilityMultiRegionApi apiInstance = new HighAvailabilityMultiRegionApi(defaultClient);

    try {
      HamrOrgConnectionResponse result = apiInstance.getHamrOrgConnection();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling HighAvailabilityMultiRegionApi#getHamrOrgConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
