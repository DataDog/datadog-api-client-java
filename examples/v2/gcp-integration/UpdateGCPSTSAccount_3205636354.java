// Update STS Service Account returns "OK" response with enable resource collection turned on

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GcpIntegrationApi;
import com.datadog.api.client.v2.model.GCPSTSServiceAccountAttributes;
import com.datadog.api.client.v2.model.GCPSTSServiceAccountResponse;
import com.datadog.api.client.v2.model.GCPSTSServiceAccountUpdateRequest;
import com.datadog.api.client.v2.model.GCPSTSServiceAccountUpdateRequestData;
import com.datadog.api.client.v2.model.GCPServiceAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);

    // there is a valid "gcp_sts_account" in the system
    String GCP_STS_ACCOUNT_DATA_ID = System.getenv("GCP_STS_ACCOUNT_DATA_ID");

    GCPSTSServiceAccountUpdateRequest body =
        new GCPSTSServiceAccountUpdateRequest()
            .data(
                new GCPSTSServiceAccountUpdateRequestData()
                    .attributes(
                        new GCPSTSServiceAccountAttributes()
                            .clientEmail("Test-252bf553ef04b351@example.com")
                            .resourceCollectionEnabled(true))
                    .id(GCP_STS_ACCOUNT_DATA_ID)
                    .type(GCPServiceAccountType.GCP_SERVICE_ACCOUNT));

    try {
      GCPSTSServiceAccountResponse result =
          apiInstance.updateGCPSTSAccount(GCP_STS_ACCOUNT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GcpIntegrationApi#updateGCPSTSAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
