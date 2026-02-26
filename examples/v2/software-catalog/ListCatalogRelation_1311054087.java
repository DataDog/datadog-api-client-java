// Get a list of entity relations returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SoftwareCatalogApi;
import com.datadog.api.client.v2.api.SoftwareCatalogApi.ListCatalogRelationOptionalParameters;
import com.datadog.api.client.v2.model.ListRelationCatalogResponse;
import com.datadog.api.client.v2.model.RelationResponse;
import com.datadog.api.client.PaginationIterable;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SoftwareCatalogApi apiInstance = new SoftwareCatalogApi(defaultClient);

    try {
      PaginationIterable<RelationResponse> iterable = apiInstance.listCatalogRelationWithPagination(new ListCatalogRelationOptionalParameters().pageLimit(20L));

      for (RelationResponse item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling SoftwareCatalogApi#listCatalogRelationWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}