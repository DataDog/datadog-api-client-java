// Preview catalog entities returns "Accepted" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SoftwareCatalogApi;
import com.datadog.api.client.v2.model.EntityResponseArray;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SoftwareCatalogApi apiInstance = new SoftwareCatalogApi(defaultClient);

    try {
      EntityResponseArray result = apiInstance.previewCatalogEntities();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftwareCatalogApi#previewCatalogEntities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
