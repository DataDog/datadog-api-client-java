// Order RUM retention filters returns "Ordered" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRetentionFiltersApi;
import com.datadog.api.client.v2.model.RumRetentionFilterType;
import com.datadog.api.client.v2.model.RumRetentionFiltersOrderData;
import com.datadog.api.client.v2.model.RumRetentionFiltersOrderRequest;
import com.datadog.api.client.v2.model.RumRetentionFiltersOrderResponse;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRetentionFiltersApi apiInstance = new RumRetentionFiltersApi(defaultClient);

    RumRetentionFiltersOrderRequest body =
        new RumRetentionFiltersOrderRequest()
            .data(
                Arrays.asList(
                    new RumRetentionFiltersOrderData()
                        .type(RumRetentionFilterType.RETENTION_FILTERS)
                        .id("325631eb-94c9-49c0-93f9-ab7e4fd24529"),
                    new RumRetentionFiltersOrderData()
                        .type(RumRetentionFilterType.RETENTION_FILTERS)
                        .id("42d89430-5b80-426e-a44b-ba3b417ece25"),
                    new RumRetentionFiltersOrderData()
                        .type(RumRetentionFilterType.RETENTION_FILTERS)
                        .id("bff0bc34-99e9-4c16-adce-f47e71948c23")));

    try {
      RumRetentionFiltersOrderResponse result =
          apiInstance.orderRetentionFilters("1d4b9c34-7ac4-423a-91cf-9902d926e9b3", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRetentionFiltersApi#orderRetentionFilters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
