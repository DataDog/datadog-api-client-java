// Validate budget returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.BudgetValidationRequest;
import com.datadog.api.client.v2.model.BudgetValidationRequestData;
import com.datadog.api.client.v2.model.BudgetValidationResponse;
import com.datadog.api.client.v2.model.BudgetWithEntriesDataAttributes;
import com.datadog.api.client.v2.model.BudgetWithEntriesDataAttributesEntriesItems;
import com.datadog.api.client.v2.model.BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems;
import com.datadog.api.client.v2.model.BudgetWithEntriesDataType;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    BudgetValidationRequest body =
        new BudgetValidationRequest()
            .data(
                new BudgetValidationRequestData()
                    .attributes(
                        new BudgetWithEntriesDataAttributes()
                            .createdAt(1738258683590L)
                            .createdBy("00000000-0a0a-0a0a-aaa0-00000000000a")
                            .endMonth(202502L)
                            .entries(
                                Arrays.asList(
                                    new BudgetWithEntriesDataAttributesEntriesItems()
                                        .amount(500.0)
                                        .month(202501L)
                                        .tagFilters(
                                            Collections.singletonList(
                                                new BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems()
                                                    .tagKey("service")
                                                    .tagValue("ec2"))),
                                    new BudgetWithEntriesDataAttributesEntriesItems()
                                        .amount(500.0)
                                        .month(202502L)
                                        .tagFilters(
                                            Collections.singletonList(
                                                new BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems()
                                                    .tagKey("service")
                                                    .tagValue("ec2")))))
                            .metricsQuery("aws.cost.amortized{service:ec2} by {service}")
                            .name("my budget")
                            .orgId(123L)
                            .startMonth(202501L)
                            .totalAmount(1000.0)
                            .updatedAt(1738258683590L)
                            .updatedBy("00000000-0a0a-0a0a-aaa0-00000000000a"))
                    .id("1")
                    .type(BudgetWithEntriesDataType.BUDGET));

    try {
      BudgetValidationResponse result = apiInstance.validateBudget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#validateBudget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
