// Get a list of security signals returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.SearchSecurityMonitoringSignalsOptionalParameters;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsListResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalListRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalListRequestFilter;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalListRequestPage;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsSort;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringSignalListRequest body = new SecurityMonitoringSignalListRequest()
.filter(new SecurityMonitoringSignalListRequestFilter()
.from(OffsetDateTime.parse("2019-01-02T09:42:36.320Z"))
.query("security:attack status:high")
.to(OffsetDateTime.parse("2019-01-03T09:42:36.320Z")))
.page(new SecurityMonitoringSignalListRequestPage()
.cursor("eyJzdGFydEF0IjoiQVFBQUFYS2tMS3pPbm40NGV3QUFBQUJCV0V0clRFdDZVbG8zY3pCRmNsbHJiVmxDWlEifQ==")
.limit(25))
.sort(SecurityMonitoringSignalsSort.TIMESTAMP_ASCENDING);

    try {
      SecurityMonitoringSignalsListResponse result = apiInstance.searchSecurityMonitoringSignals(new SearchSecurityMonitoringSignalsOptionalParameters().body(body));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#searchSecurityMonitoringSignals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}