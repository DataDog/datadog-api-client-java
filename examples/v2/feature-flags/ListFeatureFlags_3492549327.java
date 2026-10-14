// List feature flags excludes unknown saved filters

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.api.FeatureFlagsApi.ListFeatureFlagsOptionalParameters;
import com.datadog.api.client.v2.model.ListFeatureFlagsResponse;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    try {
      ListFeatureFlagsResponse result =
          apiInstance.listFeatureFlags(
              new ListFeatureFlagsOptionalParameters()
                  .tags(Collections.singletonList("list-test:example-feature-flag"))
                  .savedFilterId(UUID.fromString("00000000-0000-0000-0000-000000000000")));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#listFeatureFlags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
