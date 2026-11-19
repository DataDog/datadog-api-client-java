// Create a cost recommendation custom rule returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleCreateAttributes;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleCreateData;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleCreateRequest;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleFilter;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleFilterType;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleResponse;
import com.datadog.api.client.v2.model.CostRecommendationCustomRuleType;
import java.util.Collections;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createCostRecommendationCustomRule", true);
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    CostRecommendationCustomRuleCreateRequest body =
        new CostRecommendationCustomRuleCreateRequest()
            .data(
                new CostRecommendationCustomRuleCreateData()
                    .attributes(
                        new CostRecommendationCustomRuleCreateAttributes()
                            .enabled(true)
                            .filters(
                                Collections.singletonList(
                                    new CostRecommendationCustomRuleFilter()
                                        .filterType(CostRecommendationCustomRuleFilterType.IS)
                                        .tag("env")
                                        .values(Collections.singletonList("staging"))))
                            .name("Staging instances")
                            .notes("Staging instances can run with less headroom.")
                            .recommenderId("aws_ec2_instance_unused")
                            .settings(
                                Map.ofEntries(
                                    Map.entry("lookback_days", 14.0),
                                    Map.entry("max_cpu_user_limit", 0.05))))
                    .type(CostRecommendationCustomRuleType.CUSTOM_RULES));

    try {
      CostRecommendationCustomRuleResponse result =
          apiInstance.createCostRecommendationCustomRule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudCostManagementApi#createCostRecommendationCustomRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
