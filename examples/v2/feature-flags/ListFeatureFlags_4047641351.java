// List feature flags combines exact keys tags search types creators and IDs

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.api.FeatureFlagsApi.ListFeatureFlagsOptionalParameters;
import com.datadog.api.client.v2.model.ListFeatureFlagsResponse;
import com.datadog.api.client.v2.model.ValueType;
import java.util.Arrays;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    // there is a valid "feature_flag_list_a" in the system
    UUID FEATURE_FLAG_LIST_A_DATA_ATTRIBUTES_CREATED_BY = null;
    try {
      FEATURE_FLAG_LIST_A_DATA_ATTRIBUTES_CREATED_BY =
          UUID.fromString(System.getenv("FEATURE_FLAG_LIST_A_DATA_ATTRIBUTES_CREATED_BY"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }
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
                  .key("list-a-example-feature-flag")
                  .tags(Arrays.asList("list-test:example-feature-flag", "color:blue"))
                  .search("LIST-A-example-feature-flag")
                  .valueType(Arrays.asList(ValueType.BOOLEAN, ValueType.STRING))
                  .createdBy(
                      Collections.singletonList(FEATURE_FLAG_LIST_A_DATA_ATTRIBUTES_CREATED_BY))
                  .flagIds(Arrays.asList(FEATURE_FLAG_LIST_A_DATA_ID, FEATURE_FLAG_LIST_B_DATA_ID))
                  .isArchived(false));
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
