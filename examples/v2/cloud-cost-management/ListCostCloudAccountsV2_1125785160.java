// List Cloud Cost Management cloud accounts with AWS CUR 2.0 filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CloudCostManagementApi;
import com.datadog.api.client.v2.api.CloudCostManagementApi.ListCostCloudAccountsV2OptionalParameters;
import com.datadog.api.client.v2.model.CloudCostAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    CloudCostManagementApi apiInstance = new CloudCostManagementApi(defaultClient);

    try {
      CloudCostAccountsResponse result =
          apiInstance.listCostCloudAccountsV2(
              new ListCostCloudAccountsV2OptionalParameters().filterCloud("aws_cur2"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CloudCostManagementApi#listCostCloudAccountsV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
