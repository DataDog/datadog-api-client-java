// List vulnerabilities returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.ListVulnerabilitiesOptionalParameters;
import com.datadog.api.client.v2.model.AssetType;
import com.datadog.api.client.v2.model.ListVulnerabilitiesResponse;
import com.datadog.api.client.v2.model.VulnerabilitySeverity;
import com.datadog.api.client.v2.model.VulnerabilityTool;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listVulnerabilities", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    try {
      ListVulnerabilitiesResponse result =
          apiInstance.listVulnerabilities(
              new ListVulnerabilitiesOptionalParameters()
                  .filterCvssBaseSeverity(VulnerabilitySeverity.HIGH)
                  .filterAssetType(AssetType.SERVICE)
                  .filterTool(VulnerabilityTool.INFRA));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#listVulnerabilities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
