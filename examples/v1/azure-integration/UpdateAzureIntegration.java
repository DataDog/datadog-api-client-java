// Update an Azure integration returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.AzureIntegrationApi;
import com.datadog.api.client.v1.model.AzureAccount;
import com.datadog.api.client.v1.model.AzureAccountMetricsConfig;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AzureIntegrationApi apiInstance = new AzureIntegrationApi(defaultClient);

    AzureAccount body = new AzureAccount()
.appServicePlanFilters("key:value,filter:example")
.automute(true)
.clientId("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d")
.clientSecret("TestingRh2nx664kUy5dIApvM54T4AtO")
.containerAppFilters("key:value,filter:example")
.cspmEnabled(true)
.customMetricsEnabled(true)
.errors(Collections.singletonList("*"))
.hostFilters("key:value,filter:example")
.newClientId("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d")
.newTenantName("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d")
.resourceCollectionEnabled(true)
.metricsConfig(new AzureAccountMetricsConfig()
.excludedResourceProviders(Arrays.asList("Microsoft.Sql", "Microsoft.Cdn")))
.tenantName("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d");

    try {
      apiInstance.updateAzureIntegration(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AzureIntegrationApi#updateAzureIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}