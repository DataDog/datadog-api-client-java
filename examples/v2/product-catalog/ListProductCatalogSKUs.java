// List SKUs returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ProductCatalogApi;
import com.datadog.api.client.v2.model.ProductCatalogSKUsAPIVersion;
import com.datadog.api.client.v2.model.ProductCatalogSKUsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listProductCatalogSKUs", true);
    ProductCatalogApi apiInstance = new ProductCatalogApi(defaultClient);

    try {
      ProductCatalogSKUsResponse result =
          apiInstance.listProductCatalogSKUs(ProductCatalogSKUsAPIVersion.V1);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProductCatalogApi#listProductCatalogSKUs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
