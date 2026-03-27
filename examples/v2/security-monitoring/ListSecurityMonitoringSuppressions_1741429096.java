// Get all suppression rules returns "OK" response with sort descending

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.ListSecurityMonitoringSuppressionsOptionalParameters;
import com.datadog.api.client.v2.model.SecurityMonitoringPaginatedSuppressionsResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSuppressionSort;
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

    // there is a valid "suppression" in the system
    String SUPPRESSION_DATA_ID = System.getenv("SUPPRESSION_DATA_ID");

    // there is a valid "suppression2" in the system
    String SUPPRESSION2_DATA_ID = System.getenv("SUPPRESSION2_DATA_ID");

    try {
      SecurityMonitoringPaginatedSuppressionsResponse result = apiInstance.listSecurityMonitoringSuppressions(new ListSecurityMonitoringSuppressionsOptionalParameters().sort(SecurityMonitoringSuppressionSort.NAME_DESCENDING).query("id:3dd-0uc-h1s OR id:886e6c3e-e543-049c-ee1b-56a1110295c0"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#listSecurityMonitoringSuppressions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}