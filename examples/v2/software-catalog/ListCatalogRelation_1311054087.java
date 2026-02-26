// Get a list of entity relations returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v2.api.SoftwareCatalogApi;
import com.datadog.api.client.v2.api.SoftwareCatalogApi.ListCatalogRelationOptionalParameters;
import com.datadog.api.client.v2.model.RelationResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SoftwareCatalogApi apiInstance = new SoftwareCatalogApi(defaultClient);

    try {
      PaginationIterable<RelationResponse> iterable =
          apiInstance.listCatalogRelationWithPagination(
              new ListCatalogRelationOptionalParameters().pageLimit(20L));

      for (RelationResponse item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling SoftwareCatalogApi#listCatalogRelationWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
