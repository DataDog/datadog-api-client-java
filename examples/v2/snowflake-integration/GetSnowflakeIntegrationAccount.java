// Get a Snowflake integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SnowflakeIntegrationApi;
import com.datadog.api.client.v2.model.SnowflakeIntegrationAccountResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getSnowflakeIntegrationAccount", true);
    SnowflakeIntegrationApi apiInstance = new SnowflakeIntegrationApi(defaultClient);

    try {
      SnowflakeIntegrationAccountResponse result =
          apiInstance.getSnowflakeIntegrationAccount("account_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SnowflakeIntegrationApi#getSnowflakeIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
