// Create a flag change suggestion returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.CreateFlagSuggestionAttributes;
import com.datadog.api.client.v2.model.CreateFlagSuggestionData;
import com.datadog.api.client.v2.model.CreateFlagSuggestionRequest;
import com.datadog.api.client.v2.model.FeatureFlagSuggestionDataType;
import com.datadog.api.client.v2.model.FeatureFlagSuggestionMetadataRequest;
import com.datadog.api.client.v2.model.FeatureFlagSuggestionResponse;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    CreateFlagSuggestionRequest body =
        new CreateFlagSuggestionRequest()
            .data(
                new CreateFlagSuggestionData()
                    .attributes(
                        new CreateFlagSuggestionAttributes()
                            .action("updated")
                            .comment("Restrict this flag to server applications.")
                            .environmentId(UUID.fromString("550e8400-e29b-41d4-a716-446655440001"))
                            .notificationRuleTargets(
                                Collections.singletonList("requester@example.com"))
                            .property("DISTRIBUTION_CHANNEL")
                            .suggestion("SERVER")
                            .suggestionMetadata(
                                new FeatureFlagSuggestionMetadataRequest()
                                    .variantId(
                                        UUID.fromString("550e8400-e29b-41d4-a716-446655440002"))))
                    .type(FeatureFlagSuggestionDataType.FLAG_SUGGESTIONS));

    try {
      FeatureFlagSuggestionResponse result =
          apiInstance.createFlagSuggestion(
              UUID.fromString("550e8400-e29b-41d4-a716-446655440000"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#createFlagSuggestion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
