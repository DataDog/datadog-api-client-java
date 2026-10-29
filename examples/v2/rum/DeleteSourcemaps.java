// Delete source maps returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumApi;
import com.datadog.api.client.v2.api.RumApi.DeleteSourcemapsOptionalParameters;
import com.datadog.api.client.v2.model.SourcemapMapKind;
import com.datadog.api.client.v2.model.SourcemapSymbolType;
import com.datadog.api.client.v2.model.SourcemapsResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.deleteSourcemaps", true);
    RumApi apiInstance = new RumApi(defaultClient);

    try {
      SourcemapsResponse result =
          apiInstance.deleteSourcemaps(
              SourcemapMapKind.WASM,
              true,
              new DeleteSourcemapsOptionalParameters()
                  .symbolType(SourcemapSymbolType.SOURCEMAP)
                  .filterService(Collections.singletonList("nonexistent-svc"))
                  .filterVersion(Collections.singletonList("0.0.0-none")));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumApi#deleteSourcemaps");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
