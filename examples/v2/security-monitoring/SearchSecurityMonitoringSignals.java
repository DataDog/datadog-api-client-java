// Get a list of security signals returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.SecurityMonitoringApi;
import com.datadog.api.v2.client.api.SecurityMonitoringApi.SearchSecurityMonitoringSignalsOptionalParameters;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalListRequest;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalListRequestFilter;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalListRequestPage;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalsListResponse;
import com.datadog.api.v2.client.model.SecurityMonitoringSignalsSort;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("searchSecurityMonitoringSignals", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringSignalListRequest body =
        new SecurityMonitoringSignalListRequest()
            .filter(
                new SecurityMonitoringSignalListRequestFilter()
                    .from(OffsetDateTime.parse("2019-01-02T09:42:36.320Z"))
                    .query("security:attack status:high")
                    .to(OffsetDateTime.parse("2019-01-03T09:42:36.320Z")))
            .page(
                new SecurityMonitoringSignalListRequestPage()
                    .cursor(
                        "eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ==")
                    .limit(25))
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
