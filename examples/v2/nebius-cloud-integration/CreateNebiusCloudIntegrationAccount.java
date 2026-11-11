// Create a Nebius Cloud integration account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.NebiusCloudIntegrationApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.NebiusCloudCostCollectionIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.NebiusCloudCostCollectionIntegrationDataflowSettingsRequest;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountCreateAttributes;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountResponse;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountServiceAccountAuthRequest;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountServiceAccountAuthType;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountSettingsRequest;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.NebiusCloudLogsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.NebiusCloudLogsIntegrationDataflowSettingsRequest;
import com.datadog.api.client.v2.model.NebiusCloudResourcesIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.NebiusCloudServiceQuotaCollectionIntegrationDataflowRequest;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createNebiusCloudIntegrationAccount", true);
    NebiusCloudIntegrationApi apiInstance = new NebiusCloudIntegrationApi(defaultClient);

    NebiusCloudIntegrationAccountCreateRequest body =
        new NebiusCloudIntegrationAccountCreateRequest()
            .data(
                new NebiusCloudIntegrationAccountCreateData()
                    .attributes(
                        new NebiusCloudIntegrationAccountCreateAttributes()
                            .authentication(
                                new NebiusCloudIntegrationAccountAuthenticationRequest(
                                    new NebiusCloudIntegrationAccountServiceAccountAuthRequest()
                                        .authType(
                                            NebiusCloudIntegrationAccountServiceAccountAuthType
                                                .NEBIUS_SERVICE_ACCOUNT)
                                        .privateKey(
                                            """
-----BEGIN PRIVATE KEY-----
MIIE...
-----END PRIVATE KEY-----
""")
                                        .publicKeyId("publickey-yyyyyyyy")
                                        .serviceAccountId("serviceaccount-xxxxxxxx")
                                        .staticApiKey("eyJhbGciOi...static-api-key")))
                            .dataflows(
                                new NebiusCloudIntegrationDataflowsRequest()
                                    .nebiusCloudCostCollection(
                                        new NebiusCloudCostCollectionIntegrationDataflowRequest()
                                            .enabled(true)
                                            .settings(
                                                new NebiusCloudCostCollectionIntegrationDataflowSettingsRequest()
                                                    .accessKeyId("AKID0123456789ABCDEF")
                                                    .accessKeySecret("wJalrXUtnFEMIstaticaccesskey")
                                                    .bucketName("nebius-cost-exports")
                                                    .bucketPrefixPath("cost-export/2026/")
                                                    .bucketRegion("eu-north1")))
                                    .nebiusCloudLogs(
                                        new NebiusCloudLogsIntegrationDataflowRequest()
                                            .enabled(true)
                                            .settings(
                                                new NebiusCloudLogsIntegrationDataflowSettingsRequest()
                                                    .enabledServices(
                                                        Arrays.asList(
                                                            "nebius-cloud-compute",
                                                            "nebius-cloud-kubernetes",
                                                            "default"))))
                                    .nebiusCloudResources(
                                        new NebiusCloudResourcesIntegrationDataflowRequest()
                                            .enabled(true))
                                    .nebiusCloudServiceQuotaCollection(
                                        new NebiusCloudServiceQuotaCollectionIntegrationDataflowRequest()
                                            .enabled(true)))
                            .name("nebius-prod")
                            .settings(
                                new NebiusCloudIntegrationAccountSettingsRequest()
                                    .accountTags(Arrays.asList("env:prod", "team:ai"))
                                    .tenantId("tenant-12345678")))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      NebiusCloudIntegrationAccountResponse result =
          apiInstance.createNebiusCloudIntegrationAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling NebiusCloudIntegrationApi#createNebiusCloudIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
