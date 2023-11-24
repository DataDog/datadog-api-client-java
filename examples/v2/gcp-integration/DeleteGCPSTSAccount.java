// Delete an STS enabled GCP Account returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GcpIntegrationApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);

    // there is a valid "gcp_sts_account" in the system
    String GCP_STS_ACCOUNT_DATA_ID = System.getenv("GCP_STS_ACCOUNT_DATA_ID");

    try {
      apiInstance.deleteGCPSTSAccount(GCP_STS_ACCOUNT_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling GcpIntegrationApi#deleteGCPSTSAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
