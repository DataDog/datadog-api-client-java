// Reorder custom allocation rules returns "Successfully reordered rules" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.ReorderRuleResourceArray;
import com.datadog.api.client.v2.model.ReorderRuleResourceData;
import com.datadog.api.client.v2.model.ReorderRuleResourceDataType;
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

    ReorderRuleResourceArray body = new ReorderRuleResourceArray()
.data(Arrays.asList(new ReorderRuleResourceData()
.id("456")
.type(ReorderRuleResourceDataType.ARBITRARY_RULE), new ReorderRuleResourceData()
.id("123")
.type(ReorderRuleResourceDataType.ARBITRARY_RULE), new ReorderRuleResourceData()
.id("789")
.type(ReorderRuleResourceDataType.ARBITRARY_RULE)));

    try {
      apiInstance.reorderCustomAllocationRules(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#reorderCustomAllocationRules");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}