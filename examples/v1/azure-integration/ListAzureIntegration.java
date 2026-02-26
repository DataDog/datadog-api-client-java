// List all Azure integrations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.AzureIntegrationApi;
import com.datadog.api.client.v1.model.AzureAccount;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);

    try {
      List<AzureAccount> result = apiInstance.listAzureIntegration();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AzureIntegrationApi#listAzureIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
