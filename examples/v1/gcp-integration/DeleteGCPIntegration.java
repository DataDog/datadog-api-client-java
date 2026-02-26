// Delete a GCP integration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.GcpIntegrationApi;
import com.datadog.api.client.v1.model.GCPAccount;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);

    GCPAccount body =
        new GCPAccount()
            .clientEmail("252bf553ef04b351@example.com")
            .clientId("163662907116366290710")
            .projectId("datadog-apitest");

    try {
      apiInstance.deleteGCPIntegration(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling GcpIntegrationApi#deleteGCPIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
