// Reorder tag pipeline rulesets returns "Successfully reordered rulesets" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.ReorderRulesetResourceArray;
import com.datadog.api.client.v2.model.ReorderRulesetResourceData;
import com.datadog.api.client.v2.model.ReorderRulesetResourceDataType;
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

    ReorderRulesetResourceArray body = new ReorderRulesetResourceArray()
.data(Arrays.asList(new ReorderRulesetResourceData()
.id("55ef2385-9ae1-4410-90c4-5ac1b60fec10")
.type(ReorderRulesetResourceDataType.RULESET), new ReorderRulesetResourceData()
.id("a7b8c9d0-1234-5678-9abc-def012345678")
.type(ReorderRulesetResourceDataType.RULESET), new ReorderRulesetResourceData()
.id("f1e2d3c4-b5a6-9780-1234-567890abcdef")
.type(ReorderRulesetResourceDataType.RULESET)));

    try {
      apiInstance.reorderTagPipelinesRulesets(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#reorderTagPipelinesRulesets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}