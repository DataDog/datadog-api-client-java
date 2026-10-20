// Patch a saved filter accepts the current timestamp for rules

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
import java.time.OffsetDateTime;
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
                    .attributes(
                        new PatchSavedFilterAttributes()
                            .lastUpdatedAt(OffsetDateTime.parse("2026-10-16T20:20:30Z"))
                            .targetingRules(
                                Collections.singletonList(
                                    new SavedFilterTargetingRuleRequest()
                                        .conditions(
                                            Collections.singletonList(
                                                new SavedFilterConditionRequest()
                                                    .attribute("user_id")
                                                    .operator(SavedFilterConditionOperator.ONE_OF)
                                                    .value(
                                                        Collections.singletonList(
                                                            "test-user-2")))))))
                    .type(SavedFilterDataType.SAVED_FILTERS));

    try {
      SavedFilterResponse result =
          apiInstance.updateSavedFilterAttributes(
              UUID.fromString("a8c393b4-3a9c-48fd-aa48-402c97e8d9c9"), body);
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
