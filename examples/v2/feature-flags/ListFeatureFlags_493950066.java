// List feature flags filters disabled production status

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.api.FeatureFlagsApi.ListFeatureFlagsOptionalParameters;
import com.datadog.api.client.v2.model.FeatureFlagProductionStatus;
import com.datadog.api.client.v2.model.ListFeatureFlagsResponse;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    // there is a valid "feature_flag_list_a" in the system
    UUID FEATURE_FLAG_LIST_A_DATA_ID = null;
    try {
      FEATURE_FLAG_LIST_A_DATA_ID = UUID.fromString(System.getenv("FEATURE_FLAG_LIST_A_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "feature_flag_list_b" in the system
    UUID FEATURE_FLAG_LIST_B_DATA_ID = null;
    try {
      FEATURE_FLAG_LIST_B_DATA_ID = UUID.fromString(System.getenv("FEATURE_FLAG_LIST_B_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      ListFeatureFlagsResponse result =
          apiInstance.listFeatureFlags(
              new ListFeatureFlagsOptionalParameters()
                  .flagIds(Arrays.asList(FEATURE_FLAG_LIST_A_DATA_ID, FEATURE_FLAG_LIST_B_DATA_ID))
                  .productionStatus(
                      Collections.singletonList(FeatureFlagProductionStatus.DISABLED)));
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
