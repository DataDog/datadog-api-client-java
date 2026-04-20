// Bulk update security signals returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalArchiveReason;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalState;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalType;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsBulkTriageUpdateResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsBulkUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsBulkUpdateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringTriageUser;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringSignalsBulkUpdateRequest body =
        new SecurityMonitoringSignalsBulkUpdateRequest()
            .data(
                Collections.singletonList(
                    new SecurityMonitoringSignalsBulkUpdateData()
                        .attributes(
                            new SecurityMonitoringSignalUpdateAttributes()
                                .archiveReason(SecurityMonitoringSignalArchiveReason.NONE)
                                .assignee(
                                    new SecurityMonitoringTriageUser()
                                        .uuid("773b045d-ccf8-4808-bd3b-955ef6a8c940"))
                                .state(SecurityMonitoringSignalState.OPEN))
                        .id("AAAAAWgN8Xwgr1vKDQAAAABBV2dOOFh3ZzZobm1mWXJFYTR0OA")
                        .type(SecurityMonitoringSignalType.SIGNAL)));

    try {
      SecurityMonitoringSignalsBulkTriageUpdateResponse result =
          apiInstance.bulkEditSecurityMonitoringSignals(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#bulkEditSecurityMonitoringSignals");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
