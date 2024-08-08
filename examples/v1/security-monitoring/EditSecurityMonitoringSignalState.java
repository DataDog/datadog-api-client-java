// Change the triage state of a security signal returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.SecurityMonitoringApi;
import com.datadog.api.client.v1.model.SuccessfulSignalUpdateResponse;
import com.datadog.api.client.v1.model.SignalArchiveReason;
import com.datadog.api.client.v1.model.SignalStateUpdateRequest;
import com.datadog.api.client.v1.model.SignalTriageState;
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

    SignalStateUpdateRequest body = new SignalStateUpdateRequest()
.archiveReason(SignalArchiveReason.NONE)
.state(SignalTriageState.OPEN);

    try {
      SuccessfulSignalUpdateResponse result = apiInstance.editSecurityMonitoringSignalState("AQAAAYDiB_Ol8PbzFAAAAABBWURpQl9PbEFBQU0yeXhGTG9ZV2JnQUE", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#editSecurityMonitoringSignalState");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}