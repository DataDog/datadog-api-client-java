// Bulk update triage assignee of security signals returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalType;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsBulkAssigneeUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsBulkAssigneeUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsBulkAssigneeUpdateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalsBulkTriageUpdateResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringSignalsBulkAssigneeUpdateRequest body =
        new SecurityMonitoringSignalsBulkAssigneeUpdateRequest()
            .data(
                Collections.singletonList(
                    new SecurityMonitoringSignalsBulkAssigneeUpdateData()
                        .attributes(
                            new SecurityMonitoringSignalsBulkAssigneeUpdateAttributes()
                                .assignee("773b045d-ccf8-4808-bd3b-955ef6a8c940"))
                        .id("AAAAAWgN8Xwgr1vKDQAAAABBV2dOOFh3ZzZobm1mWXJFYTR0OA")
                        .type(SecurityMonitoringSignalType.SIGNAL)));

    try {
      SecurityMonitoringSignalsBulkTriageUpdateResponse result =
          apiInstance.bulkEditSecurityMonitoringSignalsAssignee(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#bulkEditSecurityMonitoringSignalsAssignee");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
