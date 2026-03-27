// Update a feature flag returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.FeatureFlagResponse;
import com.datadog.api.client.v2.model.UpdateFeatureFlagAttributes;
import com.datadog.api.client.v2.model.UpdateFeatureFlagData;
import com.datadog.api.client.v2.model.UpdateFeatureFlagDataType;
import com.datadog.api.client.v2.model.UpdateFeatureFlagRequest;
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
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    // there is a valid "feature_flag" in the system
    UUID FEATURE_FLAG_DATA_ID = null;
    try {
      FEATURE_FLAG_DATA_ID = UUID.fromString(System.getenv("FEATURE_FLAG_DATA_ID"));
    } catch (IllegalArgumentException e) {
        System.err.println("Error parsing UUID: " + e.getMessage());
    }

    UpdateFeatureFlagRequest body = new UpdateFeatureFlagRequest()
.data(new UpdateFeatureFlagData()
.type(UpdateFeatureFlagDataType.FEATURE_FLAGS)
.attributes(new UpdateFeatureFlagAttributes()
.description("Updated description for the feature flag")
.name("Updated Test Feature Flag Example-Feature-Flag")));

    try {
      FeatureFlagResponse result = apiInstance.updateFeatureFlag(FEATURE_FLAG_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#updateFeatureFlag");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}