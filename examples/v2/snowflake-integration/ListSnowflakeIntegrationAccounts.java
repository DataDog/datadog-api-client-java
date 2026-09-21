// List Snowflake integration accounts returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SnowflakeIntegrationApi;
import com.datadog.api.client.v2.model.SnowflakeIntegrationAccountsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listSnowflakeIntegrationAccounts", true);
    SnowflakeIntegrationApi apiInstance = new SnowflakeIntegrationApi(defaultClient);

    try {
      SnowflakeIntegrationAccountsResponse result = apiInstance.listSnowflakeIntegrationAccounts();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SnowflakeIntegrationApi#listSnowflakeIntegrationAccounts");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
