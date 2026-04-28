// Get a Bits AI SRE investigation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.BitsAisreApi;
import com.datadog.api.client.v2.model.GetInvestigationResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getInvestigation", true);
    BitsAisreApi apiInstance = new BitsAisreApi(defaultClient);

    try {
      GetInvestigationResponse result =
          apiInstance.getInvestigation("a1b2c3d4-5e6f-7a8b-9c0d-1e2f3a4b5c6d");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling BitsAisreApi#getInvestigation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
