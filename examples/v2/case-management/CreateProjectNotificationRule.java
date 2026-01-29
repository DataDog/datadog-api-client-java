// Create a notification rule returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseNotificationRuleCreate;
import com.datadog.api.client.v2.model.CaseNotificationRuleCreateAttributes;
import com.datadog.api.client.v2.model.CaseNotificationRuleCreateRequest;
import com.datadog.api.client.v2.model.CaseNotificationRuleRecipient;
import com.datadog.api.client.v2.model.CaseNotificationRuleRecipientData;
import com.datadog.api.client.v2.model.CaseNotificationRuleResourceType;
import com.datadog.api.client.v2.model.CaseNotificationRuleResponse;
import com.datadog.api.client.v2.model.CaseNotificationRuleTrigger;
import com.datadog.api.client.v2.model.CaseNotificationRuleTriggerData;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    CaseNotificationRuleCreateRequest body =
        new CaseNotificationRuleCreateRequest()
            .data(
                new CaseNotificationRuleCreate()
                    .attributes(
                        new CaseNotificationRuleCreateAttributes()
                            .isEnabled(true)
                            .recipients(
                                Collections.singletonList(
                                    new CaseNotificationRuleRecipient()
                                        .data(new CaseNotificationRuleRecipientData())
                                        .type("EMAIL")))
                            .triggers(
                                Collections.singletonList(
                                    new CaseNotificationRuleTrigger()
                                        .data(new CaseNotificationRuleTriggerData())
                                        .type("CASE_CREATED"))))
                    .type(CaseNotificationRuleResourceType.NOTIFICATION_RULE));

    try {
      CaseNotificationRuleResponse result =
          apiInstance.createProjectNotificationRule("e555e290-ed65-49bd-ae18-8acbfcf18db7", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#createProjectNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
