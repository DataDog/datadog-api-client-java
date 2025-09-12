// Reorder rulesets returns "Successfully reordered rulesets" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.ReorderRulesetResourceArray;
import com.datadog.api.client.v2.model.ReorderRulesetResourceData;
import com.datadog.api.client.v2.model.ReorderRulesetResourceDataType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    ReorderRulesetResourceArray body =
        new ReorderRulesetResourceArray()
            .data(
                Collections.singletonList(
                    new ReorderRulesetResourceData().type(ReorderRulesetResourceDataType.RULESET)));

    try {
      apiInstance.reorderRulesets(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#reorderRulesets");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
