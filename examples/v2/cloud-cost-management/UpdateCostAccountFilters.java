// Update account filters returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.model.AccountFilteringConfig;
import com.datadog.api.client.v2.model.AccountFiltersPatchData;
import com.datadog.api.client.v2.model.AccountFiltersPatchRequest;
import com.datadog.api.client.v2.model.AccountFiltersPatchRequestAttributes;
import com.datadog.api.client.v2.model.AccountFiltersPatchRequestType;
import com.datadog.api.client.v2.model.AccountFiltersResponse;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    AccountFiltersPatchRequest body =
        new AccountFiltersPatchRequest()
            .data(
                new AccountFiltersPatchData()
                    .attributes(
                        new AccountFiltersPatchRequestAttributes()
                            .accountFilters(
                                new AccountFilteringConfig()
                                    .excludedAccounts(Arrays.asList("123456789123", "123456789143"))
                                    .includeNewAccounts(true)
                                    .includedAccounts(
                                        Arrays.asList("123456789123", "123456789143"))))
                    .type(AccountFiltersPatchRequestType.ACCOUNT_FILTERS_PATCH_REQUEST));

    try {
      AccountFiltersResponse result =
          apiInstance.updateCostAccountFilters(9223372036854775807L, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#updateCostAccountFilters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
