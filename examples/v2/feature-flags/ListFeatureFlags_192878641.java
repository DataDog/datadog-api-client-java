// List feature flags gives page parameters precedence over aliases

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.api.FeatureFlagsApi.ListFeatureFlagsOptionalParameters;
import com.datadog.api.client.v2.model.ListFeatureFlagsResponse;
import java.util.Collections;

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
                  .limit(2L)
                  .offset(1L)
                  .pageLimit(1L)
                  .pageOffset(0L)
                  .sort("name"));
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
