// Create tag pipeline ruleset returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.RulesetResp;
import com.datadog.api.client.v2.model.CreateRulesetRequest;
import com.datadog.api.client.v2.model.CreateRulesetRequestData;
import com.datadog.api.client.v2.model.CreateRulesetRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateRulesetRequestDataAttributesRulesItems;
import com.datadog.api.client.v2.model.CreateRulesetRequestDataAttributesRulesItemsQuery;
import com.datadog.api.client.v2.model.CreateRulesetRequestDataAttributesRulesItemsQueryAddition;
import com.datadog.api.client.v2.model.CreateRulesetRequestDataAttributesRulesItemsReferenceTable;
import com.datadog.api.client.v2.model.CreateRulesetRequestDataType;
import com.datadog.api.client.v2.model.DataAttributesRulesItemsMapping;
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

    CreateRulesetRequest body = new CreateRulesetRequest()
.data(new CreateRulesetRequestData()
.attributes(new CreateRulesetRequestDataAttributes()
.enabled(true)
.rules(Collections.singletonList(new CreateRulesetRequestDataAttributesRulesItems()
.enabled(true)
.mapping(null)
.name("Add Cost Center Tag")
.query(new CreateRulesetRequestDataAttributesRulesItemsQuery()
.addition(new CreateRulesetRequestDataAttributesRulesItemsQueryAddition()
.key("cost_center")
.value("engineering"))
.caseInsensitivity(false)
.ifNotExists(true)
.query("""
account_id:"123456789" AND service:"web-api"
"""))
.referenceTable(null))))
.id("New Ruleset")
.type(CreateRulesetRequestDataType.CREATE_RULESET));

    try {
      RulesetResp result = apiInstance.createTagPipelinesRuleset(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#createTagPipelinesRuleset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}