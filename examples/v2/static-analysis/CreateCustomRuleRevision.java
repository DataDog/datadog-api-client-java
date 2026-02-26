// Create Custom Rule Revision returns "Successfully created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.StaticAnalysisApi;
import com.datadog.api.client.v2.model.Argument;
import com.datadog.api.client.v2.model.CustomRuleRevisionAttributesCategory;
import com.datadog.api.client.v2.model.CustomRuleRevisionAttributesSeverity;
import com.datadog.api.client.v2.model.CustomRuleRevisionDataType;
import com.datadog.api.client.v2.model.CustomRuleRevisionInputAttributes;
import com.datadog.api.client.v2.model.CustomRuleRevisionRequest;
import com.datadog.api.client.v2.model.CustomRuleRevisionRequestData;
import com.datadog.api.client.v2.model.CustomRuleRevisionTest;
import com.datadog.api.client.v2.model.Language;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createCustomRuleRevision", true);
    StaticAnalysisApi apiInstance = new StaticAnalysisApi(defaultClient);

    CustomRuleRevisionRequest body = new CustomRuleRevisionRequest()
.data(new CustomRuleRevisionRequestData()
.attributes(new CustomRuleRevisionInputAttributes()
.arguments(Collections.singletonList(new Argument()
.description("YXJndW1lbnQgZGVzY3JpcHRpb24=")
.name("YXJndW1lbnRfbmFtZQ==")))
.category(CustomRuleRevisionAttributesCategory.SECURITY)
.code("Y29uZHVjdG9yOgogICAgLSBkZXBsb3lfb25seTogdHJ1ZQ==")
.creationMessage("Initial revision")
.cve("CVE-2024-1234")
.cwe("CWE-79")
.description("bG9uZyBkZXNjcmlwdGlvbg==")
.documentationUrl("https://docs.example.com/rules/my-rule")
.isPublished(false)
.isTesting(false)
.language(Language.PYTHON)
.severity(CustomRuleRevisionAttributesSeverity.ERROR)
.shortDescription("c2hvcnQgZGVzY3JpcHRpb24=")
.shouldUseAiFix(false)
.tags(Arrays.asList("security", "custom"))
.tests(Collections.singletonList(new CustomRuleRevisionTest()
.annotationCount(1L)
.code("Y29uZHVjdG9yOgogICAgLSBkZXBsb3lfb25seTogdHJ1ZQ==")
.filename("test.yaml")))
.treeSitterQuery("Y29uZHVjdG9yOgogICAgLSBkZXBsb3lfb25seTogdHJ1ZQ=="))
.type(CustomRuleRevisionDataType.CUSTOM_RULE_REVISION));

    try {
      apiInstance.createCustomRuleRevision("ruleset_name", "rule_name", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling StaticAnalysisApi#createCustomRuleRevision");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}