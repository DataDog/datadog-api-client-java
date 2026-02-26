// Modify the triage assignee of a security signal returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalAssigneeUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalAssigneeUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalAssigneeUpdateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalTriageUpdateResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringTriageUser;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringSignalAssigneeUpdateRequest body =
        new SecurityMonitoringSignalAssigneeUpdateRequest()
            .data(
                new SecurityMonitoringSignalAssigneeUpdateData()
                    .attributes(
                        new SecurityMonitoringSignalAssigneeUpdateAttributes()
                            .assignee(new SecurityMonitoringTriageUser().uuid(""))));

    try {
      SecurityMonitoringSignalTriageUpdateResponse result =
          apiInstance.editSecurityMonitoringSignalAssignee(
              "AQAAAYG1bl5K4HuUewAAAABBWUcxYmw1S0FBQmt2RmhRN0V4ZUVnQUE", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#editSecurityMonitoringSignalAssignee");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
