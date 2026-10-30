// Evaluate an AI Guard request with a numeric confidence threshold

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGuardApi;
import com.datadog.api.client.v2.model.AIGuardConfidenceThresholdOverride;
import com.datadog.api.client.v2.model.AIGuardEvaluateRequest;
import com.datadog.api.client.v2.model.AIGuardEvaluateRequestData;
import com.datadog.api.client.v2.model.AIGuardEvaluateRequestDataAttributes;
import com.datadog.api.client.v2.model.AIGuardEvaluateResponse;
import com.datadog.api.client.v2.model.AIGuardEvaluationType;
import com.datadog.api.client.v2.model.AIGuardMessage;
import com.datadog.api.client.v2.model.AIGuardMessageContent;
import com.datadog.api.client.v2.model.AIGuardMessageRole;
import com.datadog.api.client.v2.model.AIGuardMeta;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.evaluateAIGuardRequest", true);
    AiGuardApi apiInstance = new AiGuardApi(defaultClient);

    AIGuardEvaluateRequest body =
        new AIGuardEvaluateRequest()
            .data(
                new AIGuardEvaluateRequestData()
                    .type(AIGuardEvaluationType.EVALUATIONS)
                    .attributes(
                        new AIGuardEvaluateRequestDataAttributes()
                            .messages(
                                Collections.singletonList(
                                    new AIGuardMessage()
                                        .role(AIGuardMessageRole.USER)
                                        .content(new AIGuardMessageContent("Hello world!"))))
                            .meta(
                                new AIGuardMeta()
                                    .confidenceThreshold(
                                        new AIGuardConfidenceThresholdOverride(0.8)))));

    try {
      AIGuardEvaluateResponse result = apiInstance.evaluateAIGuardRequest(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AiGuardApi#evaluateAIGuardRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
