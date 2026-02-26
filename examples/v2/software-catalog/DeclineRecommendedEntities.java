// Decline recommended entities in bulk returns "No Content" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SoftwareCatalogApi;
import com.datadog.api.client.v2.model.RecommendedEntityID;
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
    defaultClient.setUnstableOperationEnabled("v2.declineRecommendedEntities", true);
    SoftwareCatalogApi apiInstance = new SoftwareCatalogApi(defaultClient);

    List<RecommendedEntityID> body = Collections.singletonList(new RecommendedEntityID()
.id("123abcdef"));

    try {
      apiInstance.declineRecommendedEntities(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftwareCatalogApi#declineRecommendedEntities");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}