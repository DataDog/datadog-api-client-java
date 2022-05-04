// List all Azure integrations returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.AzureIntegrationApi;
import com.datadog.api.v1.client.model.AzureAccount;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
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
