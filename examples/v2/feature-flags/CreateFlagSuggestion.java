// Create a flag suggestion returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.CreateFlagSuggestionAttributes;
import com.datadog.api.client.v2.model.CreateFlagSuggestionData;
import com.datadog.api.client.v2.model.CreateFlagSuggestionRequest;
import com.datadog.api.client.v2.model.FlagSuggestionAction;
import com.datadog.api.client.v2.model.FlagSuggestionDataType;
import com.datadog.api.client.v2.model.FlagSuggestionProperty;
import com.datadog.api.client.v2.model.FlagSuggestionResponse;
import com.datadog.api.client.v2.model.SuggestionMetadata;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    CreateFlagSuggestionRequest body =
        new CreateFlagSuggestionRequest()
            .data(
                new CreateFlagSuggestionData()
                    .attributes(
                        new CreateFlagSuggestionAttributes()
                            .action(FlagSuggestionAction.ARCHIVED)
                            .comment("Archive this deprecated flag")
                            .environmentId(UUID.fromString("550e8400-e29b-41d4-a716-446655440001"))
                            .notificationRuleTargets(Collections.singletonList("user@example.com"))
                            .property(FlagSuggestionProperty.FLAG)
                            .suggestion("ENABLED")
                            .suggestionMetadata(
                                new SuggestionMetadata()
                                    .variantId("550e8400-e29b-41d4-a716-446655440005")))
                    .type(FlagSuggestionDataType.FLAG_SUGGESTIONS));

    try {
      FlagSuggestionResponse result =
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
