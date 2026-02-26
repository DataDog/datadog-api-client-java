// Change the triage state of a security signal returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalTriageUpdateResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalArchiveReason;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalState;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalStateUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalStateUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalStateUpdateRequest;
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

    SecurityMonitoringSignalStateUpdateRequest body = new SecurityMonitoringSignalStateUpdateRequest()
.data(new SecurityMonitoringSignalStateUpdateData()
.attributes(new SecurityMonitoringSignalStateUpdateAttributes()
.archiveReason(SecurityMonitoringSignalArchiveReason.NONE)
.state(SecurityMonitoringSignalState.OPEN)));

    try {
      SecurityMonitoringSignalTriageUpdateResponse result = apiInstance.editSecurityMonitoringSignalState("AQAAAYG1bl5K4HuUewAAAABBWUcxYmw1S0FBQmt2RmhRN0V4ZUVnQUE", body);
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