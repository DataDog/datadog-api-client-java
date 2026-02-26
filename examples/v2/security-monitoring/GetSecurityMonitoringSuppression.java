// Get a suppression rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "suppression" in the system
    String SUPPRESSION_DATA_ID = System.getenv("SUPPRESSION_DATA_ID");

    try {
      SecurityMonitoringSuppressionResponse result =
          apiInstance.getSecurityMonitoringSuppression(SUPPRESSION_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#getSecurityMonitoringSuppression");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
