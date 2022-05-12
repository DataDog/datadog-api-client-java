// Update a GCP integration returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.GcpIntegrationApi;
import com.datadog.api.v1.client.model.GCPAccount;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    GcpIntegrationApi apiInstance = new GcpIntegrationApi(defaultClient);

    GCPAccount body =
        new GCPAccount()
            .authProviderX509CertUrl("https://www.googleapis.com/oauth2/v1/certs")
            .authUri("https://accounts.google.com/o/oauth2/auth")
            .clientEmail("api-dev@datadog-sandbox.iam.gserviceaccount.com")
            .clientId("123456712345671234567")
            .clientX509CertUrl("https://www.googleapis.com/robot/v1/metadata/x509/$CLIENT_EMAIL")
            .errors(Collections.singletonList("*"))
            .hostFilters("key:value,filter:example")
            .privateKey("private_key")
            .privateKeyId("123456789abcdefghi123456789abcdefghijklm")
            .projectId("datadog-apitest")
            .tokenUri("https://accounts.google.com/o/oauth2/token")
            .type("service_account");

    try {
      apiInstance.updateGCPIntegration(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling GcpIntegrationApi#updateGCPIntegration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
