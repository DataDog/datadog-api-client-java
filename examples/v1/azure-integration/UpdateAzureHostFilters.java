// Update Azure integration host filters returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.AzureIntegrationApi;
import com.datadog.api.client.v1.model.AzureAccount;
import com.datadog.api.client.v1.model.ResourceProviderConfig;
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
.clientId("testc7f6-1234-5678-9101-3fcbf464test")
.clientSecret("TestingRh2nx664kUy5dIApvM54T4AtO")
.containerAppFilters("key:value,filter:example")
.cspmEnabled(true)
.customMetricsEnabled(true)
.errors(Collections.singletonList("*"))
.hostFilters("key:value,filter:example")
.metricsEnabled(true)
.metricsEnabledDefault(true)
.newClientId("new1c7f6-1234-5678-9101-3fcbf464test")
.newTenantName("new1c44-1234-5678-9101-cc00736ftest")
.resourceCollectionEnabled(true)
.resourceProviderConfigs(Collections.singletonList(new ResourceProviderConfig()
.metricsEnabled(true)
.namespace("Microsoft.Compute")))
.tenantName("testc44-1234-5678-9101-cc00736ftest")
.usageMetricsEnabled(true);

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