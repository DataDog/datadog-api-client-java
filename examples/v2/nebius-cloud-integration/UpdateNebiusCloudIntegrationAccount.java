// Update a Nebius Cloud integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.NebiusCloudIntegrationApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.NebiusCloudCostCollectionIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.NebiusCloudCostCollectionIntegrationDataflowSettingsRequest;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountResponse;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountServiceAccountAuthType;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountServiceAccountAuthUpdate;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountSettingsUpdate;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.NebiusCloudIntegrationAccountUpdateRequest;
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
    defaultClient.setUnstableOperationEnabled("v2.updateNebiusCloudIntegrationAccount", true);
    NebiusCloudIntegrationApi apiInstance = new NebiusCloudIntegrationApi(defaultClient);

    NebiusCloudIntegrationAccountUpdateRequest body =
        new NebiusCloudIntegrationAccountUpdateRequest()
            .data(
                new NebiusCloudIntegrationAccountUpdateData()
                    .attributes(
                        new NebiusCloudIntegrationAccountUpdateAttributes()
                            .authentication(
                                new NebiusCloudIntegrationAccountAuthenticationUpdate(
                                    new NebiusCloudIntegrationAccountServiceAccountAuthUpdate()
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
                                new NebiusCloudIntegrationAccountSettingsUpdate()
                                    .accountTags(Arrays.asList("env:prod", "team:ai"))
                                    .tenantId("tenant-12345678")))
                    .id("e5f6a7b8-c9d0-4e1f-8a2b-3c4d5e6f7081")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      NebiusCloudIntegrationAccountResponse result =
          apiInstance.updateNebiusCloudIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling NebiusCloudIntegrationApi#updateNebiusCloudIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
