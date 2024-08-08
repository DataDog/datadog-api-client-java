// Get a list of security signals returns "OK" response with pagination
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.SearchSecurityMonitoringSignalsOptionalParameters;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsListResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSignal;
import com.datadog.api.client.PaginationIterable;
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
.from(OffsetDateTime.now().plusMinutes(-15))
.query("security:attack status:high")
.to(OffsetDateTime.now()))
.page(new SecurityMonitoringSignalListRequestPage()
.limit(2))
.sort(SecurityMonitoringSignalsSort.TIMESTAMP_ASCENDING);

    try {
      PaginationIterable<SecurityMonitoringSignal> iterable = apiInstance.searchSecurityMonitoringSignalsWithPagination(new SearchSecurityMonitoringSignalsOptionalParameters().body(body));

      for (SecurityMonitoringSignal item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#searchSecurityMonitoringSignalsWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}