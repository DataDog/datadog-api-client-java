// Update a unit cost returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.UnitCostQueryDefinition;
import com.datadog.api.client.v2.model.UnitCostRequestAttributes;
import com.datadog.api.client.v2.model.UnitCostResponse;
import com.datadog.api.client.v2.model.UnitCostType;
import com.datadog.api.client.v2.model.UnitCostUpdateRequest;
import com.datadog.api.client.v2.model.UnitCostUpdateRequestData;
import java.util.Collections;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateUnitCost", true);
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    UnitCostUpdateRequest body =
        new UnitCostUpdateRequest()
            .data(
                new UnitCostUpdateRequestData()
                    .attributes(
                        new UnitCostRequestAttributes()
                            .denominatorQuery(
                                new UnitCostQueryDefinition()
                                    .formulas(
                                        Collections.singletonList(
                                            Map.ofEntries(Map.entry("formula", "numerator"))))
                                    .queries(
                                        Collections.singletonList(
                                            Map.ofEntries(
                                                Map.entry("data_source", "cloud_cost"),
                                                Map.entry("name", "numerator"),
                                                Map.entry(
                                                    "query",
                                                    "sum:aws.cost.net.amortized.shared.resources.allocated{*}.rollup(sum,"
                                                        + " daily)")))))
                            .description(
                                "Amortized cloud spend divided by the number of active users.")
                            .name("Cloud cost per active user")
                            .numeratorQuery(
                                new UnitCostQueryDefinition()
                                    .formulas(
                                        Collections.singletonList(
                                            Map.ofEntries(Map.entry("formula", "numerator"))))
                                    .queries(
                                        Collections.singletonList(
                                            Map.ofEntries(
                                                Map.entry("data_source", "cloud_cost"),
                                                Map.entry("name", "numerator"),
                                                Map.entry(
                                                    "query",
                                                    "sum:aws.cost.net.amortized.shared.resources.allocated{*}.rollup(sum,"
                                                        + " daily)")))))
                            .unitLabel("user"))
                    .id(UUID.fromString("64aecd58-e355-4f07-9c3a-56ff6bda6cd8"))
                    .type(UnitCostType.UNIT_COST));

    try {
      UnitCostResponse result =
          apiInstance.updateUnitCost(UUID.fromString("64aecd58-e355-4f07-9c3a-56ff6bda6cd8"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#updateUnitCost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
