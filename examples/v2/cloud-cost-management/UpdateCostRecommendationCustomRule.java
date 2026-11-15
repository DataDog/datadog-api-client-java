// Update a cost recommendation custom rule returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleFilter;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleFilterType;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleResponse;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleType;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleUpdateAttributes;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleUpdateData;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleUpdateRequest;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateCostRecommendationCustomRule", true);
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    CostRecommendationCustomRuleUpdateRequest body =
        new CostRecommendationCustomRuleUpdateRequest()
            .data(
                new CostRecommendationCustomRuleUpdateData()
                    .attributes(
                        new CostRecommendationCustomRuleUpdateAttributes()
                            .enabled(false)
                            .filters(
                                Collections.singletonList(
                                    new CostRecommendationCustomRuleFilter()
                                        .filterType(CostRecommendationCustomRuleFilterType.IS)
                                        .tag("env")
                                        .values(Collections.singletonList("staging"))))
                            .name("Staging and development instances")
                            .notes("Staging instances can run with less headroom.")
                            .settings(
                                Map.ofEntries(
                                    Map.entry("lookback_days", 14.0),
                                    Map.entry("max_cpu_user_limit", 0.05))))
                    .id("8a1b6f3e-2c4d-4e5f-9a7b-1c2d3e4f5a6b")
                    .type(CostRecommendationCustomRuleType.CUSTOM_RULES));

    try {
      CostRecommendationCustomRuleResponse result =
          apiInstance.updateCostRecommendationCustomRule(
              "8a1b6f3e-2c4d-4e5f-9a7b-1c2d3e4f5a6b", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudCostManagementApi#updateCostRecommendationCustomRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
