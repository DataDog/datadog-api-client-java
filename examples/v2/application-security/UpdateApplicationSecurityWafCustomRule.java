// Update a WAF Custom Rule returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ApplicationSecurityApi;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleCondition;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleConditionInput;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleConditionInputAddress;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleConditionOperator;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleConditionParameters;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleScope;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleTags;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleTagsCategory;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleType;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleUpdateAttributes;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleUpdateData;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleUpdateRequest;
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
    ApplicationSecurityApi apiInstance = new ApplicationSecurityApi(defaultClient);

    // there is a valid "custom_rule" in the system
    String CUSTOM_RULE_DATA_ID = System.getenv("CUSTOM_RULE_DATA_ID");

    ApplicationSecurityWafCustomRuleUpdateRequest body = new ApplicationSecurityWafCustomRuleUpdateRequest()
.data(new ApplicationSecurityWafCustomRuleUpdateData()
.type(ApplicationSecurityWafCustomRuleType.CUSTOM_RULE)
.attributes(new ApplicationSecurityWafCustomRuleUpdateAttributes()
.blocking(false)
.conditions(Collections.singletonList(new ApplicationSecurityWafCustomRuleCondition()
.operator(ApplicationSecurityWafCustomRuleConditionOperator.MATCH_REGEX)
.parameters(new ApplicationSecurityWafCustomRuleConditionParameters()
.inputs(Collections.singletonList(new ApplicationSecurityWafCustomRuleConditionInput()
.address(ApplicationSecurityWafCustomRuleConditionInputAddress.SERVER_REQUEST_QUERY)
.keyPath(Collections.singletonList("id"))))
.regex("badactor"))))
.enabled(false)
.name("test")
.pathGlob("/test")
.scope(Collections.singletonList(new ApplicationSecurityWafCustomRuleScope()
.env("test")
.service("test")))
.tags(new ApplicationSecurityWafCustomRuleTags()
.category(ApplicationSecurityWafCustomRuleTagsCategory.ATTACK_ATTEMPT)
.type("test"))));

    try {
      ApplicationSecurityWafCustomRuleResponse result = apiInstance.updateApplicationSecurityWafCustomRule(CUSTOM_RULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ApplicationSecurityApi#updateApplicationSecurityWafCustomRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}