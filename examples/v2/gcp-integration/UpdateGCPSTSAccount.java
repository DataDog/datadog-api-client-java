// Update STS Service Account returns "OK" response

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

    GCPSTSServiceAccountUpdateRequest body =
        new GCPSTSServiceAccountUpdateRequest()
            .data(
                new GCPSTSServiceAccountUpdateRequestData()
                    .attributes(
                        new GCPSTSServiceAccountAttributes()
                            .clientEmail(
                                "datadog-service-account@test-project.iam.gserviceaccount.com"))
                    .id("d291291f-12c2-22g4-j290-123456678897")
                    .type(GCPServiceAccountType.GCP_SERVICE_ACCOUNT));

    try {
      GCPSTSServiceAccountResponse result = apiInstance.updateGCPSTSAccount("account_id", body);
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
