// Create a WAF custom rule returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ApplicationSecurityApi;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleAction;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleActionAction;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleActionParameters;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleCondition;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleConditionInput;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleConditionInputAddress;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleConditionOperator;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleConditionOptions;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleConditionParameters;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleCreateAttributes;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleCreateData;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleCreateRequest;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleResponse;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleScope;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleTags;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleTagsCategory;
import com.datadog.api.client.v2.model.ApplicationSecurityWafCustomRuleType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ApplicationSecurityApi apiInstance = new ApplicationSecurityApi(defaultClient);

    ApplicationSecurityWafCustomRuleCreateRequest body =
        new ApplicationSecurityWafCustomRuleCreateRequest()
            .data(
                new ApplicationSecurityWafCustomRuleCreateData()
                    .attributes(
                        new ApplicationSecurityWafCustomRuleCreateAttributes()
                            .action(
                                new ApplicationSecurityWafCustomRuleAction()
                                    .action(
                                        ApplicationSecurityWafCustomRuleActionAction.BLOCK_REQUEST)
                                    .parameters(
                                        new ApplicationSecurityWafCustomRuleActionParameters()
                                            .location("/blocking")
                                            .statusCode(403L)))
                            .blocking(false)
                            .conditions(
                                Collections.singletonList(
                                    new ApplicationSecurityWafCustomRuleCondition()
                                        .operator(
                                            ApplicationSecurityWafCustomRuleConditionOperator
                                                .MATCH_REGEX)
                                        .parameters(
                                            new ApplicationSecurityWafCustomRuleConditionParameters()
                                                .data("blocked_users")
                                                .inputs(
                                                    Collections.singletonList(
                                                        new ApplicationSecurityWafCustomRuleConditionInput()
                                                            .address(
                                                                ApplicationSecurityWafCustomRuleConditionInputAddress
                                                                    .SERVER_DB_STATEMENT)))
                                                .options(
                                                    new ApplicationSecurityWafCustomRuleConditionOptions()
                                                        .caseSensitive(false)
                                                        .minLength(0L))
                                                .regex("path.*")
                                                .value("custom_tag"))))
                            .enabled(false)
                            .name("Block request from a bad useragent")
                            .pathGlob("/api/search/*")
                            .scope(
                                Collections.singletonList(
                                    new ApplicationSecurityWafCustomRuleScope()
                                        .env("prod")
                                        .service("billing-service")))
                            .tags(
                                new ApplicationSecurityWafCustomRuleTags()
                                    .category(
                                        ApplicationSecurityWafCustomRuleTagsCategory.BUSINESS_LOGIC)
                                    .type("users.login.success")))
                    .type(ApplicationSecurityWafCustomRuleType.CUSTOM_RULE));

    try {
      ApplicationSecurityWafCustomRuleResponse result =
          apiInstance.createApplicationSecurityWafCustomRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ApplicationSecurityApi#createApplicationSecurityWafCustomRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
