// Patch a saved filter replaces rules and preserves metadata

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.PatchSavedFilterAttributes;
import com.datadog.api.client.v2.model.PatchSavedFilterData;
import com.datadog.api.client.v2.model.PatchSavedFilterRequest;
import com.datadog.api.client.v2.model.SavedFilterConditionOperator;
import com.datadog.api.client.v2.model.SavedFilterConditionRequest;
import com.datadog.api.client.v2.model.SavedFilterDataType;
import com.datadog.api.client.v2.model.SavedFilterResponse;
import com.datadog.api.client.v2.model.SavedFilterTargetingRuleRequest;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    PatchSavedFilterRequest body =
        new PatchSavedFilterRequest()
            .data(
                new PatchSavedFilterData()
                    .type(SavedFilterDataType.SAVED_FILTERS)
                    .attributes(
                        new PatchSavedFilterAttributes()
                            .targetingRules(
                                Collections.singletonList(
                                    new SavedFilterTargetingRuleRequest()
                                        .conditions(
                                            Collections.singletonList(
                                                new SavedFilterConditionRequest()
                                                    .operator(SavedFilterConditionOperator.ONE_OF)
                                                    .attribute("email")
                                                    .value(
                                                        Collections.singletonList(
                                                            "test@example.com"))))))));

    try {
      SavedFilterResponse result =
          apiInstance.updateSavedFilterAttributes(
              UUID.fromString("2cfc7949-7eb4-4d76-b1b8-d1aa9b565535"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#updateSavedFilterAttributes");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
