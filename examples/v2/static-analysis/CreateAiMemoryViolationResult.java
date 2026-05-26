// Create an AI memory violation result returns "Successfully created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.AiMemoryViolationResultDataType;
import com.datadog.api.client.v2.model.AiMemoryViolationResultRequest;
import com.datadog.api.client.v2.model.AiMemoryViolationResultRequestAttributes;
import com.datadog.api.client.v2.model.AiMemoryViolationResultRequestData;
import com.datadog.api.client.v2.model.AiMemoryViolationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createAiMemoryViolationResult", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    AiMemoryViolationResultRequest body =
        new AiMemoryViolationResultRequest()
            .data(
                new AiMemoryViolationResultRequestData()
                    .attributes(
                        new AiMemoryViolationResultRequestAttributes()
                            .line(10L)
                            .message("This is a false positive because the input is sanitized.")
                            .name("src/main.py")
                            .repositoryId("my-repo")
                            .rule("my-ai-ruleset/my-ai-rule")
                            .sha("abc123def456789012345678901234567890abcd")
                            .type(AiMemoryViolationType.FP))
                    .id("violation-abc")
                    .type(AiMemoryViolationResultDataType.AI_MEMORY_VIOLATION_RESULT));

    try {
      apiInstance.createAiMemoryViolationResult(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#createAiMemoryViolationResult");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
