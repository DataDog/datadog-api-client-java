// Create a new entry for your service account with resource collection enabled returns "OK"
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GcpIntegrationApi;
import com.datadog.api.client.v2.model.GCPSTSServiceAccountAttributes;
import com.datadog.api.client.v2.model.GCPSTSServiceAccountCreateRequest;
import com.datadog.api.client.v2.model.GCPSTSServiceAccountData;
import com.datadog.api.client.v2.model.GCPSTSServiceAccountResponse;
import com.datadog.api.client.v2.model.GCPServiceAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);

    GCPSTSServiceAccountCreateRequest body =
        new GCPSTSServiceAccountCreateRequest()
            .data(
                new GCPSTSServiceAccountData()
                    .attributes(
                        new GCPSTSServiceAccountAttributes()
                            .resourceCollectionEnabled(true)
                            .clientEmail(
                                "Test-252bf553ef04b351@test-project.iam.gserviceaccount.com"))
                    .type(GCPServiceAccountType.GCP_SERVICE_ACCOUNT));

    try {
      GCPSTSServiceAccountResponse result = apiInstance.createGCPSTSAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GcpIntegrationApi#createGCPSTSAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
