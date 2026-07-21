// Create or replace a budget's custom forecast returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.CustomForecastEntry;
import com.datadog.api.client.v2.model.CustomForecastEntryTagFilter;
import com.datadog.api.client.v2.model.CustomForecastResponse;
import com.datadog.api.client.v2.model.CustomForecastType;
import com.datadog.api.client.v2.model.CustomForecastUpsertRequest;
import com.datadog.api.client.v2.model.CustomForecastUpsertRequestData;
import com.datadog.api.client.v2.model.CustomForecastUpsertRequestDataAttributes;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    CustomForecastUpsertRequest body =
        new CustomForecastUpsertRequest()
            .data(
                new CustomForecastUpsertRequestData()
                    .attributes(
                        new CustomForecastUpsertRequestDataAttributes()
                            .budgetUid("00000000-0000-0000-0000-000000000001")
                            .entries(
                                Collections.singletonList(
                                    new CustomForecastEntry()
                                        .amount(400.0)
                                        .month(202501L)
                                        .tagFilters(
                                            Collections.singletonList(
                                                new CustomForecastEntryTagFilter()
                                                    .tagKey("service")
                                                    .tagValue("ec2"))))))
                    .id("")
                    .type(CustomForecastType.CUSTOM_FORECAST));

    try {
      CustomForecastResponse result = apiInstance.upsertCustomForecast(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#upsertCustomForecast");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
