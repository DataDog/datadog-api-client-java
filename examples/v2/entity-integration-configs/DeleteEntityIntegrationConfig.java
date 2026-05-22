// Delete an entity integration configuration returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.EntityIntegrationConfigsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteEntityIntegrationConfig", true);
    EntityIntegrationConfigsApi apiInstance = new EntityIntegrationConfigsApi(defaultClient);

    try {
      apiInstance.deleteEntityIntegrationConfig("github");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling EntityIntegrationConfigsApi#deleteEntityIntegrationConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
