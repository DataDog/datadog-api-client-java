// Update Custom Ruleset returns "Successfully updated" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.Argument;
import com.datadog.api.client.v2.model.CustomRule;
import com.datadog.api.client.v2.model.CustomRuleRevision;
import com.datadog.api.client.v2.model.CustomRuleRevisionAttributes;
import com.datadog.api.client.v2.model.CustomRuleRevisionAttributesCategory;
import com.datadog.api.client.v2.model.CustomRuleRevisionAttributesSeverity;
import com.datadog.api.client.v2.model.CustomRuleRevisionDataType;
import com.datadog.api.client.v2.model.CustomRuleRevisionTest;
import com.datadog.api.client.v2.model.CustomRulesetDataType;
import com.datadog.api.client.v2.model.CustomRulesetRequest;
import com.datadog.api.client.v2.model.CustomRulesetRequestData;
import com.datadog.api.client.v2.model.CustomRulesetRequestDataAttributes;
import com.datadog.api.client.v2.model.CustomRulesetResponse;
import com.datadog.api.client.v2.model.Language;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateCustomRuleset", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    CustomRulesetRequest body =
        new CustomRulesetRequest()
            .data(
                new CustomRulesetRequestData()
                    .attributes(
                        new CustomRulesetRequestDataAttributes()
                            .rules(
                                Collections.singletonList(
                                    new CustomRule()
                                        .createdAt(
                                            OffsetDateTime.parse("2026-01-09T13:00:57.473141Z"))
                                        .createdBy("foobarbaz")
                                        .lastRevision(
                                            new CustomRuleRevision()
                                                .attributes(
                                                    new CustomRuleRevisionAttributes()
                                                        .arguments(
                                                            Collections.singletonList(
                                                                new Argument()
                                                                    .description(
                                                                        "YXJndW1lbnQgZGVzY3JpcHRpb24=")
                                                                    .name("YXJndW1lbnRfbmFtZQ==")))
                                                        .category(
                                                            CustomRuleRevisionAttributesCategory
                                                                .SECURITY)
                                                        .checksum(
                                                            "8a66c4e4e631099ad71be3c1ea3ea8fc2d57193e56db2c296e2dd8a508b26b99")
                                                        .code(
                                                            "Y29uZHVjdG9yOgogICAgLSBkZXBsb3lfb25seTogdHJ1ZQ==")
                                                        .createdAt(
                                                            OffsetDateTime.parse(
                                                                "2026-01-09T13:00:57.473141Z"))
                                                        .createdBy("foobarbaz")
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
                                                            CustomRuleRevisionAttributesSeverity
                                                                .ERROR)
                                                        .shortDescription(
                                                            "c2hvcnQgZGVzY3JpcHRpb24=")
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
                                                .id("revision-123")
                                                .type(
                                                    CustomRuleRevisionDataType
                                                        .CUSTOM_RULE_REVISION))
                                        .name("my-rule"))))
                    .type(CustomRulesetDataType.CUSTOM_RULESET));

    try {
      CustomRulesetResponse result = apiInstance.updateCustomRuleset("ruleset_name", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#updateCustomRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
