// List source maps returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumApi;
import com.datadog.api.client.v2.api.RumApi.ListSourcemapsOptionalParameters;
import com.datadog.api.client.v2.model.ListSourcemapsResponse;
import com.datadog.api.client.v2.model.SourcemapMapKind;
import com.datadog.api.client.v2.model.SourcemapSymbolType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.listSourcemaps", true);
    RumApi apiInstance = new RumApi(defaultClient);

    try {
      ListSourcemapsResponse result =
          apiInstance.listSourcemaps(
              new ListSourcemapsOptionalParameters()
                  .mapkind(SourcemapMapKind.WASM)
                  .symbolType(SourcemapSymbolType.SOURCEMAP)
                  .filterService(Collections.singletonList("my-wasm-app"))
                  .filterVersion(Collections.singletonList("1.0.0")));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumApi#listSourcemaps");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
