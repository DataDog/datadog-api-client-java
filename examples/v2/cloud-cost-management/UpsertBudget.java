// Create or update a budget returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.BudgetWithEntries;
import com.datadog.api.client.v2.model.BudgetAttributes;
import com.datadog.api.client.v2.model.BudgetWithEntries;
import com.datadog.api.client.v2.model.BudgetWithEntriesData;
import com.datadog.api.client.v2.model.BudgetWithEntriesDataAttributesEntriesItems;
import com.datadog.api.client.v2.model.BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems;
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

    BudgetWithEntries body = new BudgetWithEntries()
.data(new BudgetWithEntriesData()
.attributes(new BudgetAttributes()
.createdAt(1738258683590L)
.createdBy("00000000-0a0a-0a0a-aaa0-00000000000a")
.endMonth(202502L)
.entries(Collections.singletonList(new BudgetWithEntriesDataAttributesEntriesItems()
.tagFilters(Collections.singletonList(new BudgetWithEntriesDataAttributesEntriesItemsTagFiltersItems()))))
.metricsQuery("aws.cost.amortized{service:ec2} by {service}")
.name("my budget")
.orgId(123L)
.startMonth(202501L)
.totalAmount(1000.0)
.updatedAt(1738258683590L)
.updatedBy("00000000-0a0a-0a0a-aaa0-00000000000a"))
.id("00000000-0a0a-0a0a-aaa0-00000000000a")
.type(""));

    try {
      BudgetWithEntries result = apiInstance.upsertBudget(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#upsertBudget");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}