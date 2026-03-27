// Get a quick list of security signals returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.ListSecurityMonitoringSignalsOptionalParameters;
import com.datadog.api.client.v2.model.SecurityMonitoringSignal;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    try {
      PaginationIterable<SecurityMonitoringSignal> iterable =
          apiInstance.listSecurityMonitoringSignalsWithPagination(
              new ListSecurityMonitoringSignalsOptionalParameters().pageLimit(2));

      for (SecurityMonitoringSignal item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#listSecurityMonitoringSignalsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
