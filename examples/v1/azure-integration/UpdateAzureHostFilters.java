// Update Azure integration host filters returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.AzureIntegrationApi;
import com.datadog.api.client.v1.model.AzureAccount;
import com.datadog.api.client.v1.model.AzureAccountMetricsConfig;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);

    AzureAccount body =
        new AzureAccount()
            .appServicePlanFilters("key:value,filter:example")
            .automute(true)
            .clientId("testc7f6-1234-5678-9101-3fcbf464test")
            .clientSecret("TestingRh2nx664kUy5dIApvM54T4AtO")
            .containerAppFilters("key:value,filter:example")
            .cspmEnabled(true)
            .customMetricsEnabled(true)
            .errors(Collections.singletonList("*"))
            .hostFilters("key:value,filter:example")
            .metricsConfig(
                new AzureAccountMetricsConfig()
                    .excludedResourceProviders(Arrays.asList("Microsoft.Sql", "Microsoft.Cdn")))
            .newClientId("new1c7f6-1234-5678-9101-3fcbf464test")
            .newTenantName("new1c44-1234-5678-9101-cc00736ftest")
            .resourceCollectionEnabled(true)
            .tenantName("testc44-1234-5678-9101-cc00736ftest");

    try {
      apiInstance.updateAzureHostFilters(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AzureIntegrationApi#updateAzureHostFilters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
