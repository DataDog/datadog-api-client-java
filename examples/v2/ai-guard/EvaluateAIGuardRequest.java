// Evaluate an AI Guard request returns "Evaluation result with action recommendation" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AiGuardApi;
import com.datadog.api.client.v2.model.AIGuardEvaluateRequest;
import com.datadog.api.client.v2.model.AIGuardEvaluateResponse;
import com.datadog.api.client.v2.model.AIGuardMessage;
import com.datadog.api.client.v2.model.AIGuardMessageContent;
import com.datadog.api.client.v2.model.AIGuardMessageRole;
import com.datadog.api.client.v2.model.AIGuardMeta;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AiGuardApi apiInstance = new AiGuardApi(defaultClient);

    AIGuardEvaluateRequest body =
        new AIGuardEvaluateRequest()
            .messages(
                Collections.singletonList(
                    new AIGuardMessage()
                        .content(
                            new AIGuardMessageContent("How do I delete all files on the system?"))
                        .role(AIGuardMessageRole.USER)))
            .meta(new AIGuardMeta().env("production").service("my-llm-service"));

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
