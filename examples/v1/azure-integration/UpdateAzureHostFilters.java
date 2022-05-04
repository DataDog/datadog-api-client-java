// Update Azure integration host filters returns "OK" response

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

    AzureAccount body =
        new AzureAccount()
            .automute(true)
            .clientId("testc7f6-1234-5678-9101-3fcbf464test")
            .clientSecret("testingx./Sw*g/Y33t..R1cH+hScMDt")
            .errors(Collections.singletonList("*"))
            .hostFilters("key:value,filter:example")
            .newClientId("new1c7f6-1234-5678-9101-3fcbf464test")
            .newTenantName("new1c44-1234-5678-9101-cc00736ftest")
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
