// Update security signal triage state or assignee returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalArchiveReason;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalMetadataType;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalState;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalTriageUpdateResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalUpdateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringTriageUser;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringSignalUpdateRequest body =
        new SecurityMonitoringSignalUpdateRequest()
            .data(
                new SecurityMonitoringSignalUpdateData()
                    .attributes(
                        new SecurityMonitoringSignalUpdateAttributes()
                            .archiveReason(SecurityMonitoringSignalArchiveReason.NONE)
                            .assignee(
                                new SecurityMonitoringTriageUser()
                                    .uuid("773b045d-ccf8-4808-bd3b-955ef6a8c940"))
                            .state(SecurityMonitoringSignalState.OPEN))
                    .type(SecurityMonitoringSignalMetadataType.SIGNAL_METADATA));

    try {
      SecurityMonitoringSignalTriageUpdateResponse result =
          apiInstance.editSecurityMonitoringSignal("signal_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#editSecurityMonitoringSignal");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
