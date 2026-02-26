// List assets SBOMs returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.ListAssetsSBOMsOptionalParameters;
import com.datadog.api.client.v2.model.AssetType;
import com.datadog.api.client.v2.model.ListAssetsSBOMsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    try {
      ListAssetsSBOMsResponse result =
          apiInstance.listAssetsSBOMs(
              new ListAssetsSBOMsOptionalParameters()
                  .filterPackageName("pandas")
                  .filterAssetType(AssetType.SERVICE));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#listAssetsSBOMs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
