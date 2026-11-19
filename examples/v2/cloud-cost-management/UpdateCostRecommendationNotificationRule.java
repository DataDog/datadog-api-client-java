// Update a cost recommendation notification rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleDestinationType;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleFrequency;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleMessageAction;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleMessageActions;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleMessageCustomization;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleMessageCustomizationHeader;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleMessageCustomizationMode;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleMessageCustomizationPerRec;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleResponse;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleType;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleUpdateAttributes;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleUpdateData;
import com.datadog.api.client.v2.model.CostRecommendationNotificationRuleUpdateRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateCostRecommendationNotificationRule", true);
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    CostRecommendationNotificationRuleUpdateRequest body =
        new CostRecommendationNotificationRuleUpdateRequest()
            .data(
                new CostRecommendationNotificationRuleUpdateData()
                    .attributes(
                        new CostRecommendationNotificationRuleUpdateAttributes()
                            .channelId("C0456ABCD")
                            .destinationType(
                                CostRecommendationNotificationRuleDestinationType.SLACK)
                            .enabled(false)
                            .frequency(CostRecommendationNotificationRuleFrequency.WEEKLY)
                            .intervalExecutionDate("2026-11-02")
                            .intervalExecutionTime("09:30")
                            .mentionTargets(Collections.singletonList("U01ABCDE"))
                            .messageCustomization(
                                new CostRecommendationNotificationRuleMessageCustomization()
                                    .actions(
                                        new CostRecommendationNotificationRuleMessageActions()
                                            .viewInCcm(
                                                new CostRecommendationNotificationRuleMessageAction()
                                                    .bulk(true)
                                                    .perRec(true)))
                                    .header(
                                        new CostRecommendationNotificationRuleMessageCustomizationHeader()
                                            .customText(" recommendations to review this week.")
                                            .notificationName(true)
                                            .totalSavings(true))
                                    .includeTags(Collections.singletonList("team"))
                                    .mode(
                                        CostRecommendationNotificationRuleMessageCustomizationMode
                                            .STRUCTURED)
                                    .perRec(
                                        new CostRecommendationNotificationRuleMessageCustomizationPerRec()
                                            .effort(true)
                                            .risk(true)
                                            .why(true)))
                            .name("Production recommendations")
                            .scopeQuery("service:api AND env:prod")
                            .timezone("America/New_York")
                            .weeklyExecutionDay("monday")
                            .weeklyExecutionTime("09:30")
                            .workspaceId("T0123ABCD"))
                    .id("2c59b248-6a91-4f95-972a-dc236cae9cbb")
                    .type(CostRecommendationNotificationRuleType.NOTIFICATION_RULES));

    try {
      CostRecommendationNotificationRuleResponse result =
          apiInstance.updateCostRecommendationNotificationRule(
              "2c59b248-6a91-4f95-972a-dc236cae9cbb", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudCostManagementApi#updateCostRecommendationNotificationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
