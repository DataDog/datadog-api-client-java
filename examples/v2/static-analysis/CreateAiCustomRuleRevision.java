// Create an AI custom rule revision returns "Successfully created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.AiCustomRuleRevisionDataType;
import com.datadog.api.client.v2.model.AiCustomRuleRevisionExecutionMode;
import com.datadog.api.client.v2.model.AiCustomRuleRevisionRequest;
import com.datadog.api.client.v2.model.AiCustomRuleRevisionRequestAttributes;
import com.datadog.api.client.v2.model.AiCustomRuleRevisionRequestData;
import com.datadog.api.client.v2.model.CustomRuleRevisionAttributesCategory;
import com.datadog.api.client.v2.model.CustomRuleRevisionAttributesSeverity;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createAiCustomRuleRevision", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    AiCustomRuleRevisionRequest body =
        new AiCustomRuleRevisionRequest()
            .data(
                new AiCustomRuleRevisionRequestData()
                    .attributes(
                        new AiCustomRuleRevisionRequestAttributes()
                            .category(CustomRuleRevisionAttributesCategory.SECURITY)
                            .content("Content")
                            .cwe("79")
                            .description("Ruleset description")
                            .executionMode(AiCustomRuleRevisionExecutionMode.AUTO)
                            .globs(Collections.singletonList("**/*.py"))
                            .isPublished(false)
                            .isTesting(false)
                            .severity(CustomRuleRevisionAttributesSeverity.ERROR)
                            .shortDescription("Ruleset short description")
                            .versionId(1L))
                    .id("revision-abc-123")
                    .type(AiCustomRuleRevisionDataType.AI_RULE_REVISION));

    try {
      apiInstance.createAiCustomRuleRevision("my-ai-ruleset", "my-ai-rule", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#createAiCustomRuleRevision");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
