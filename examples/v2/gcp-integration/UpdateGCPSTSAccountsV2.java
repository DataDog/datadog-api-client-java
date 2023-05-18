// Update STS Service Account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GcpIntegrationApi;
import com.datadog.api.client.v2.model.AccountAttributes;
import com.datadog.api.client.v2.model.AccountPatchBody;
import com.datadog.api.client.v2.model.ServiceAccountInfoPatch;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);

    AccountPatchBody body =
        new AccountPatchBody()
            .data(
                new ServiceAccountInfoPatch()
                    .attributes(
                        new AccountAttributes()
                            .clientEmail(
                                "datadog-service-account@test-project.iam.gserviceaccount.com"))
                    .id("d291291f-12c2-22g4-j290-123456678897")
                    .type("gcp_service_account"));

    try {
      AccountPatchBody result = apiInstance.updateGCPSTSAccountsV2("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GcpIntegrationApi#updateGCPSTSAccountsV2");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
