// Trigger recommended entity discovery returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SoftwareCatalogApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.triggerRecommendedEntities", true);
    SoftwareCatalogApi apiInstance = new SoftwareCatalogApi(defaultClient);

    try {
      apiInstance.triggerRecommendedEntities();
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftwareCatalogApi#triggerRecommendedEntities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
