// List all GCP integrations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.GcpIntegrationApi;
import com.datadog.api.client.v1.model.GCPAccount;
import java.util.List;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);

    try {
      List<GCPAccount> result = apiInstance.listGCPIntegration();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GcpIntegrationApi#listGCPIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
