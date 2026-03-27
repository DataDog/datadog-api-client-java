// Create or update kinds returns "ACCEPTED" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.SoftwareCatalogApi;
import com.datadog.api.client.v2.model.UpsertCatalogKindResponse;
import com.datadog.api.client.v2.model.KindObj;
import com.datadog.api.client.v2.model.UpsertCatalogKindRequest;
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

    UpsertCatalogKindRequest body = new UpsertCatalogKindRequest(
new KindObj()
.kind("my-job"));

    try {
      UpsertCatalogKindResponse result = apiInstance.upsertCatalogKind(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SoftwareCatalogApi#upsertCatalogKind");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}