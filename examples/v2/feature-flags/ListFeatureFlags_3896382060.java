// List feature flags filters SDK availability for ALL

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.api.FeatureFlagsApi.ListFeatureFlagsOptionalParameters;
import com.datadog.api.client.v2.model.FeatureFlagDistributionChannel;
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
                  .distributionChannel(FeatureFlagDistributionChannel.ALL));
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
