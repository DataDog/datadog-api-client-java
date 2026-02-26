// List vulnerable assets returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.ListVulnerableAssetsOptionalParameters;
import com.datadog.api.client.v2.model.AssetType;
import com.datadog.api.client.v2.model.ListVulnerableAssetsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listVulnerableAssets", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    try {
      ListVulnerableAssetsResponse result =
          apiInstance.listVulnerableAssets(
              new ListVulnerableAssetsOptionalParameters()
                  .filterType(AssetType.HOST)
                  .filterRepositoryUrl("github.com/datadog/dd-go")
                  .filterRisksInProduction(true));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#listVulnerableAssets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
