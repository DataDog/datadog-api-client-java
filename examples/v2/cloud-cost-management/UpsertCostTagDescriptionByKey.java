// Upsert a Cloud Cost Management tag description returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CostTagDescriptionType;
import com.datadog.api.client.v2.model.CostTagDescriptionUpsertRequest;
import com.datadog.api.client.v2.model.CostTagDescriptionUpsertRequestData;
import com.datadog.api.client.v2.model.CostTagDescriptionUpsertRequestDataAttributes;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    CostTagDescriptionUpsertRequest body =
        new CostTagDescriptionUpsertRequest()
            .data(
                new CostTagDescriptionUpsertRequestData()
                    .attributes(
                        new CostTagDescriptionUpsertRequestDataAttributes()
                            .cloud("aws")
                            .description("AWS account that owns this cost."))
                    .id("account_id")
                    .type(CostTagDescriptionType.COST_TAG_DESCRIPTION));

    try {
      apiInstance.upsertCostTagDescriptionByKey("tag_key", body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CloudCostManagementApi#upsertCostTagDescriptionByKey");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
