// Bulk update triage state of security signals returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalArchiveReason;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalState;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalStateUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalType;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsBulkStateUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsBulkStateUpdateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsBulkTriageUpdateResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringSignalsBulkStateUpdateRequest body =
        new SecurityMonitoringSignalsBulkStateUpdateRequest()
            .data(
                Collections.singletonList(
                    new SecurityMonitoringSignalsBulkStateUpdateData()
                        .attributes(
                            new SecurityMonitoringSignalStateUpdateAttributes()
                                .archiveReason(SecurityMonitoringSignalArchiveReason.NONE)
                                .state(SecurityMonitoringSignalState.OPEN))
                        .id("AAAAAWgN8Xwgr1vKDQAAAABBV2dOOFh3ZzZobm1mWXJFYTR0OA")
                        .type(SecurityMonitoringSignalType.SIGNAL)));

    try {
      SecurityMonitoringSignalsBulkTriageUpdateResponse result =
          apiInstance.bulkEditSecurityMonitoringSignalsState(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#bulkEditSecurityMonitoringSignalsState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
