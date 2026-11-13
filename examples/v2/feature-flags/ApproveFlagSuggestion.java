// Approve a flag change suggestion returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FeatureFlagsApi;
import com.datadog.api.client.v2.model.ApproveFlagSuggestionAttributes;
import com.datadog.api.client.v2.model.ApproveFlagSuggestionData;
import com.datadog.api.client.v2.model.ApproveFlagSuggestionRequest;
import com.datadog.api.client.v2.model.FeatureFlagSuggestionResponse;
import com.datadog.api.client.v2.model.ReviewFlagSuggestionDataType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    FeatureFlagsApi apiInstance = new FeatureFlagsApi(defaultClient);

    ApproveFlagSuggestionRequest body =
        new ApproveFlagSuggestionRequest()
            .data(
                new ApproveFlagSuggestionData()
                    .attributes(
                        new ApproveFlagSuggestionAttributes()
                            .apply(false)
                            .comment("Approved for rollout."))
                    .type(ReviewFlagSuggestionDataType.FLAG_SUGGESTION_EVENTS));

    try {
      FeatureFlagSuggestionResponse result =
          apiInstance.approveFlagSuggestion(
              UUID.fromString("550e8400-e29b-41d4-a716-446655440020"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeatureFlagsApi#approveFlagSuggestion");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
