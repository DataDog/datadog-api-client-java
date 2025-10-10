// Update tag pipeline ruleset returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.RulesetResp;
import com.datadog.api.client.v2.model.UpdateRulesetRequest;
import com.datadog.api.client.v2.model.UpdateRulesetRequestData;
import com.datadog.api.client.v2.model.UpdateRulesetRequestDataAttributes;
import com.datadog.api.client.v2.model.UpdateRulesetRequestDataAttributesRulesItems;
import com.datadog.api.client.v2.model.UpdateRulesetRequestDataAttributesRulesItemsMapping;
import com.datadog.api.client.v2.model.UpdateRulesetRequestDataType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    UpdateRulesetRequest body =
        new UpdateRulesetRequest()
            .data(
                new UpdateRulesetRequestData()
                    .attributes(
                        new UpdateRulesetRequestDataAttributes()
                            .enabled(true)
                            .lastVersion(3611102L)
                            .rules(
                                Collections.singletonList(
                                    new UpdateRulesetRequestDataAttributesRulesItems()
                                        .enabled(true)
                                        .mapping(
                                            new UpdateRulesetRequestDataAttributesRulesItemsMapping()
                                                .destinationKey("team_owner")
                                                .ifNotExists(true)
                                                .sourceKeys(
                                                    Arrays.asList("account_name", "account_id")))
                                        .name("Account Name Mapping")
                                        .query(null)
                                        .referenceTable(null))))
                    .id("New Ruleset")
                    .type(UpdateRulesetRequestDataType.UPDATE_RULESET));

    try {
      RulesetResp result =
          apiInstance.updateTagPipelinesRuleset("ee10c3ff-312f-464c-b4f6-46adaa6d00a1", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#updateTagPipelinesRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
