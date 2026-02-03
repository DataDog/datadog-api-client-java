// Create a security signal investigation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalInvestigationRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalInvestigationRequestAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalInvestigationRequestData;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalInvestigationResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringSignalInvestigationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createSignalInvestigation", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringSignalInvestigationRequest body =
        new SecurityMonitoringSignalInvestigationRequest()
            .data(
                new SecurityMonitoringSignalInvestigationRequestData()
                    .attributes(
                        new SecurityMonitoringSignalInvestigationRequestAttributes()
                            .deployment("live")
                            .signalId("AAAAAWgN8Xwgr1vKDQAAAABBV2dOOFh3ZzZobm1mWXJFYTR0OA"))
                    .type(SecurityMonitoringSignalInvestigationType.INVESTIGATION_SIGNAL));

    try {
      SecurityMonitoringSignalInvestigationResponse result =
          apiInstance.createSignalInvestigation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createSignalInvestigation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
