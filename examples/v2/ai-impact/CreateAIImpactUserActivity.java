// Send AI tool user activity returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiImpactApi;
import com.datadog.api.client.v2.model.AIImpactUserActivityAttributes;
import com.datadog.api.client.v2.model.AIImpactUserActivityData;
import com.datadog.api.client.v2.model.AIImpactUserActivityRequest;
import com.datadog.api.client.v2.model.AIImpactUserActivityType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AiImpactApi apiInstance = new AiImpactApi(defaultClient);

    AIImpactUserActivityRequest body =
        new AIImpactUserActivityRequest()
            .data(
                Collections.singletonList(
                    new AIImpactUserActivityData()
                        .attributes(
                            new AIImpactUserActivityAttributes()
                                .day("2026-05-26")
                                .isActive(true)
                                .models(Arrays.asList("claude-sonnet-4.5", "gpt-5"))
                                .tools(Arrays.asList("Claude Code", "Cursor"))
                                .userEmail("user@example.com"))
                        .type(AIImpactUserActivityType.AI_IMPACT_USER_ACTIVITY)));

    try {
      apiInstance.createAIImpactUserActivity(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiImpactApi#createAIImpactUserActivity");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
