// Update tag pipeline ruleset with if_tag_exists returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.RulesetResp;
import com.datadog.api.client.v2.model.DataAttributesRulesItemsIfTagExists;
import com.datadog.api.client.v2.model.DataAttributesRulesItemsMapping;
import com.datadog.api.client.v2.model.UpdateRulesetRequest;
import com.datadog.api.client.v2.model.UpdateRulesetRequestData;
import com.datadog.api.client.v2.model.UpdateRulesetRequestDataAttributes;
import com.datadog.api.client.v2.model.UpdateRulesetRequestDataAttributesRulesItems;
import com.datadog.api.client.v2.model.UpdateRulesetRequestDataAttributesRulesItemsQuery;
import com.datadog.api.client.v2.model.UpdateRulesetRequestDataAttributesRulesItemsReferenceTable;
import com.datadog.api.client.v2.model.UpdateRulesetRequestDataType;
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
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    UpdateRulesetRequest body = new UpdateRulesetRequest()
.data(new UpdateRulesetRequestData()
.attributes(new UpdateRulesetRequestDataAttributes()
.enabled(true)
.lastVersion(3611102L)
.rules(Collections.singletonList(new UpdateRulesetRequestDataAttributesRulesItems()
.enabled(true)
.mapping(new DataAttributesRulesItemsMapping()
.destinationKey("team_owner")
.ifTagExists(DataAttributesRulesItemsIfTagExists.REPLACE)
.sourceKeys(Arrays.asList("account_name", "account_id")))
.name("Account Name Mapping")
.query(null)
.referenceTable(null))))
.id("New Ruleset")
.type(UpdateRulesetRequestDataType.UPDATE_RULESET));

    try {
      RulesetResp result = apiInstance.updateTagPipelinesRuleset("ee10c3ff-312f-464c-b4f6-46adaa6d00a1", body);
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