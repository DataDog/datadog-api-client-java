// Update custom allocation rule returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.ArbitraryRuleResponse;
import com.datadog.api.client.v2.model.ArbitraryCostUpsertRequest;
import com.datadog.api.client.v2.model.ArbitraryCostUpsertRequestData;
import com.datadog.api.client.v2.model.ArbitraryCostUpsertRequestDataAttributes;
import com.datadog.api.client.v2.model.ArbitraryCostUpsertRequestDataAttributesCostsToAllocateItems;
import com.datadog.api.client.v2.model.ArbitraryCostUpsertRequestDataAttributesStrategy;
import com.datadog.api.client.v2.model.ArbitraryCostUpsertRequestDataAttributesStrategyBasedOnCostsItems;
import com.datadog.api.client.v2.model.ArbitraryCostUpsertRequestDataType;
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

    ArbitraryCostUpsertRequest body = new ArbitraryCostUpsertRequest()
.data(new ArbitraryCostUpsertRequestData()
.attributes(new ArbitraryCostUpsertRequestDataAttributes()
.costsToAllocate(Arrays.asList(new ArbitraryCostUpsertRequestDataAttributesCostsToAllocateItems()
.condition("is")
.tag("account_id")
.value("123456789"), new ArbitraryCostUpsertRequestDataAttributesCostsToAllocateItems()
.condition("in")
.tag("environment")
.value("")
.values(Arrays.asList("production", "staging"))))
.enabled(true)
.orderId(1L)
.provider(Arrays.asList("aws", "gcp"))
.ruleName("example-arbitrary-cost-rule")
.strategy(new ArbitraryCostUpsertRequestDataAttributesStrategy()
.allocatedByTagKeys(Arrays.asList("team", "environment"))
.basedOnCosts(Arrays.asList(new ArbitraryCostUpsertRequestDataAttributesStrategyBasedOnCostsItems()
.condition("is")
.tag("service")
.value("web-api"), new ArbitraryCostUpsertRequestDataAttributesStrategyBasedOnCostsItems()
.condition("not in")
.tag("team")
.value("")
.values(Arrays.asList("legacy", "deprecated"))))
.granularity("daily")
.method("proportional"))
.type("shared"))
.type(ArbitraryCostUpsertRequestDataType.UPSERT_ARBITRARY_RULE));

    try {
      ArbitraryRuleResponse result = apiInstance.updateCustomAllocationRule(683L, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#updateCustomAllocationRule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}