// Delete an Azure integration returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.AzureIntegrationApi;
import com.datadog.api.client.v1.model.AzureAccount;
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
.clientId("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d")
.tenantName("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d");

    try {
      apiInstance.deleteAzureIntegration(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AzureIntegrationApi#deleteAzureIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}