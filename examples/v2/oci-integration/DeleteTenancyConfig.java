// Delete tenancy config returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OciIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OciIntegrationApi apiInstance = new OciIntegrationApi(defaultClient);

    // there is a valid "oci_tenancy" resource in the system
    String OCI_TENANCY_DATA_ID = System.getenv("OCI_TENANCY_DATA_ID");

    try {
      apiInstance.deleteTenancyConfig(OCI_TENANCY_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling OciIntegrationApi#deleteTenancyConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
