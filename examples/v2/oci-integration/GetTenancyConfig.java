// Get tenancy config returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OciIntegrationApi;
import com.datadog.api.client.v2.model.TenancyConfig;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OciIntegrationApi apiInstance = new OciIntegrationApi(defaultClient);

    // there is a valid "oci_tenancy" resource in the system
    String OCI_TENANCY_DATA_ID = System.getenv("OCI_TENANCY_DATA_ID");

    try {
      TenancyConfig result = apiInstance.getTenancyConfig(OCI_TENANCY_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OciIntegrationApi#getTenancyConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
