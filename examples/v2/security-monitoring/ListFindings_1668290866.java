// List findings with detection_type query param returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.ListFindingsOptionalParameters;
import com.datadog.api.client.v2.model.FindingVulnerabilityType;
import com.datadog.api.client.v2.model.ListFindingsResponse;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listFindings", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    try {
      ListFindingsResponse result =
          apiInstance.listFindings(
              new ListFindingsOptionalParameters()
                  .filterVulnerabilityType(
                      Arrays.asList(
                          FindingVulnerabilityType.MISCONFIGURATION,
                          FindingVulnerabilityType.ATTACK_PATH)));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#listFindings");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
