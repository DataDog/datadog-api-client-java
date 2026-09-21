// Search cost recommendations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CostRecommendationArray;
import com.datadog.api.client.v2.model.RecommendationsFilterRequest;
import com.datadog.api.client.v2.model.RecommendationsFilterRequestData;
import com.datadog.api.client.v2.model.RecommendationsFilterRequestDataAttributes;
import com.datadog.api.client.v2.model.RecommendationsFilterRequestDataType;
import com.datadog.api.client.v2.model.RecommendationsFilterRequestScope;
import com.datadog.api.client.v2.model.RecommendationsFilterRequestSortItems;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.searchCostRecommendations", true);
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    RecommendationsFilterRequest body =
        new RecommendationsFilterRequest()
            .data(
                new RecommendationsFilterRequestData()
                    .attributes(
                        new RecommendationsFilterRequestDataAttributes()
                            .scope(RecommendationsFilterRequestScope.CCM)
                            .sort(
                                Collections.singletonList(
                                    new RecommendationsFilterRequestSortItems()
                                        .expression("potential_daily_savings.amount")
                                        .order("DESC"))))
                    .id("@resource_table:aws_ec2_instance")
                    .type(RecommendationsFilterRequestDataType.RECOMMENDATIONS_FILTER));

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
