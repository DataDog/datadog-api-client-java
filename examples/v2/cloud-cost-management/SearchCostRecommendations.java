// Search cost recommendations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CostRecommendationArray;
import com.datadog.api.client.v2.model.RecommendationsFilterRequest;
import com.datadog.api.client.v2.model.RecommendationsFilterRequestSortItems;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.searchCostRecommendations", true);
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    RecommendationsFilterRequest body =
        new RecommendationsFilterRequest()
            .filter("@resource_table:aws_ec2_instance")
            .sort(
                Collections.singletonList(
                    new RecommendationsFilterRequestSortItems()
                        .expression("potential_daily_savings.amount")
                        .order("DESC")));

    try {
      CostRecommendationArray result = apiInstance.searchCostRecommendations(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#searchCostRecommendations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
