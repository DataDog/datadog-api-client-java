// Get Internal Developer Portal configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SoftwareCatalogApi;
import com.datadog.api.client.v2.model.IDPConfigResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getIDPConfigValue", true);
    SoftwareCatalogApi apiInstance = new SoftwareCatalogApi(defaultClient);

    try {
      IDPConfigResponse result = apiInstance.getIDPConfigValue("idp_pinned_dashboards");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftwareCatalogApi#getIDPConfigValue");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
