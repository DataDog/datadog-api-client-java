// Create Custom Ruleset returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.Argument;
import com.datadog.api.client.v2.model.CustomRule;
import com.datadog.api.client.v2.model.CustomRuleRevisionAttributesCategory;
import com.datadog.api.client.v2.model.CustomRuleRevisionAttributesSeverity;
import com.datadog.api.client.v2.model.CustomRuleRevisionInput;
import com.datadog.api.client.v2.model.CustomRuleRevisionTest;
import com.datadog.api.client.v2.model.CustomRulesetDataType;
import com.datadog.api.client.v2.model.CustomRulesetRequest;
import com.datadog.api.client.v2.model.CustomRulesetRequestData;
import com.datadog.api.client.v2.model.CustomRulesetRequestDataAttributes;
import com.datadog.api.client.v2.model.CustomRulesetResponse;
import com.datadog.api.client.v2.model.Language;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createCustomRuleset", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    CustomRulesetRequest body =
        new CustomRulesetRequest()
            .data(
                new CustomRulesetRequestData()
                    .attributes(
                        new CustomRulesetRequestDataAttributes()
                            .description("bG9uZyBkZXNjcmlwdGlvbg==")
                            .name("my-ruleset")
                            .rules(
                                Collections.singletonList(
                                    new CustomRule()
                                        .id("my-rule")
                                        .lastRevision(
                                            new CustomRuleRevisionInput()
                                                .arguments(
                                                    Collections.singletonList(
                                                        new Argument()
                                                            .description(
                                                                "YXJndW1lbnQgZGVzY3JpcHRpb24=")
                                                            .name("YXJndW1lbnRfbmFtZQ==")))
                                                .category(
                                                    CustomRuleRevisionAttributesCategory.SECURITY)
                                                .code(
                                                    "Y29uZHVjdG9yOgogICAgLSBkZXBsb3lfb25seTogdHJ1ZQ==")
                                                .creationMessage("Initial revision")
                                                .cve("CVE-2024-1234")
                                                .cwe("CWE-79")
                                                .description("bG9uZyBkZXNjcmlwdGlvbg==")
                                                .documentationUrl(
                                                    "https://docs.example.com/rules/my-rule")
                                                .isPublished(false)
                                                .isTesting(false)
                                                .language(Language.PYTHON)
                                                .severity(
                                                    CustomRuleRevisionAttributesSeverity.ERROR)
                                                .shortDescription("c2hvcnQgZGVzY3JpcHRpb24=")
                                                .shouldUseAiFix(false)
                                                .tags(Arrays.asList("security", "custom"))
                                                .tests(
                                                    Collections.singletonList(
                                                        new CustomRuleRevisionTest()
                                                            .annotationCount(1L)
                                                            .code(
                                                                "Y29uZHVjdG9yOgogICAgLSBkZXBsb3lfb25seTogdHJ1ZQ==")
                                                            .filename("test.yaml")))
                                                .treeSitterQuery(
                                                    "Y29uZHVjdG9yOgogICAgLSBkZXBsb3lfb25seTogdHJ1ZQ=="))
                                        .name("my-rule")
                                        .revisions(
                                            Collections.singletonList(
                                                new CustomRuleRevisionInput()
                                                    .arguments(
                                                        Collections.singletonList(
                                                            new Argument()
                                                                .description(
                                                                    "YXJndW1lbnQgZGVzY3JpcHRpb24=")
                                                                .name("YXJndW1lbnRfbmFtZQ==")))
                                                    .category(
                                                        CustomRuleRevisionAttributesCategory
                                                            .SECURITY)
                                                    .code(
                                                        "Y29uZHVjdG9yOgogICAgLSBkZXBsb3lfb25seTogdHJ1ZQ==")
                                                    .creationMessage("Initial revision")
                                                    .cve("CVE-2024-1234")
                                                    .cwe("CWE-79")
                                                    .description("bG9uZyBkZXNjcmlwdGlvbg==")
                                                    .documentationUrl(
                                                        "https://docs.example.com/rules/my-rule")
                                                    .isPublished(false)
                                                    .isTesting(false)
                                                    .language(Language.PYTHON)
                                                    .severity(
                                                        CustomRuleRevisionAttributesSeverity.ERROR)
                                                    .shortDescription("c2hvcnQgZGVzY3JpcHRpb24=")
                                                    .shouldUseAiFix(false)
                                                    .tags(Arrays.asList("security", "custom"))
                                                    .tests(
                                                        Collections.singletonList(
                                                            new CustomRuleRevisionTest()
                                                                .annotationCount(1L)
                                                                .code(
                                                                    "Y29uZHVjdG9yOgogICAgLSBkZXBsb3lfb25seTogdHJ1ZQ==")
                                                                .filename("test.yaml")))
                                                    .treeSitterQuery(
                                                        "Y29uZHVjdG9yOgogICAgLSBkZXBsb3lfb25seTogdHJ1ZQ==")))))
                            .shortDescription("c2hvcnQgZGVzY3JpcHRpb24="))
                    .id("my-ruleset")
                    .type(CustomRulesetDataType.CUSTOM_RULESET));

    try {
      CustomRulesetResponse result = apiInstance.createCustomRuleset(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#createCustomRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
