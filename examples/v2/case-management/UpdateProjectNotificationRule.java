// Update a notification rule returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseNotificationRuleAttributes;
import com.datadog.api.client.v2.model.CaseNotificationRuleRecipient;
import com.datadog.api.client.v2.model.CaseNotificationRuleRecipientData;
import com.datadog.api.client.v2.model.CaseNotificationRuleResourceType;
import com.datadog.api.client.v2.model.CaseNotificationRuleTrigger;
import com.datadog.api.client.v2.model.CaseNotificationRuleTriggerData;
import com.datadog.api.client.v2.model.CaseNotificationRuleUpdate;
import com.datadog.api.client.v2.model.CaseNotificationRuleUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    CaseNotificationRuleUpdateRequest body =
        new CaseNotificationRuleUpdateRequest()
            .data(
                new CaseNotificationRuleUpdate()
                    .attributes(
                        new CaseNotificationRuleAttributes()
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
      apiInstance.updateProjectNotificationRule(
          "e555e290-ed65-49bd-ae18-8acbfcf18db7", "e555e290-ed65-49bd-ae18-8acbfcf18db7", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateProjectNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
