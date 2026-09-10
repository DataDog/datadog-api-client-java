// Get a list of security signals returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.SearchSecurityMonitoringSignalsOptionalParameters;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalListRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalListRequestFilter;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalListRequestPage;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsListResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsSort;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringSignalListRequest body =
        new SecurityMonitoringSignalListRequest()
            .filter(
                new SecurityMonitoringSignalListRequestFilter()
                    .from(OffsetDateTime.now().plusMinutes(-15))
                    .query("security:attack status:high")
                    .to(OffsetDateTime.now()))
            .page(new SecurityMonitoringSignalListRequestPage().limit(25))
            .sort(SecurityMonitoringSignalsSort.TIMESTAMP_ASCENDING);

    try {
      SecurityMonitoringSignalsListResponse result =
          apiInstance.searchSecurityMonitoringSignals(
              new SearchSecurityMonitoringSignalsOptionalParameters().body(body));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#searchSecurityMonitoringSignals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
