// Change the triage state of a security signal returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.SecurityMonitoringApi;
import com.datadog.api.client.v1.model.SignalArchiveReason;
import com.datadog.api.client.v1.model.SignalStateUpdateRequest;
import com.datadog.api.client.v1.model.SignalTriageState;
import com.datadog.api.client.v1.model.SuccessfulSignalUpdateResponse;

public class EditSecurityMonitoringSignalState {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SignalStateUpdateRequest body =
        new SignalStateUpdateRequest()
            .archiveReason(SignalArchiveReason.NONE)
            .state(SignalTriageState.OPEN);

    try {
      SuccessfulSignalUpdateResponse result =
          apiInstance.editSecurityMonitoringSignalState(
              "AQAAAYDiB_Ol8PbzFAAAAABBWURpQl9PbEFBQU0yeXhGTG9ZV2JnQUE", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#editSecurityMonitoringSignalState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
