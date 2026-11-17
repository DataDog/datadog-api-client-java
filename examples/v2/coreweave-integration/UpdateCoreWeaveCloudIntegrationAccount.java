// Update a CoreWeave integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CoreWeaveIntegrationApi;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountAPITokenAuthType;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountAPITokenAuthUpdate;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountResponse;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountSettingsUpdate;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.CoreWeaveCloudLogsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.CoreWeaveCloudMetricsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateCoreWeaveCloudIntegrationAccount", true);
    CoreWeaveIntegrationApi apiInstance = new CoreWeaveIntegrationApi(defaultClient);

    CoreWeaveCloudIntegrationAccountUpdateRequest body =
        new CoreWeaveCloudIntegrationAccountUpdateRequest()
            .data(
                new CoreWeaveCloudIntegrationAccountUpdateData()
                    .attributes(
                        new CoreWeaveCloudIntegrationAccountUpdateAttributes()
                            .authentication(
                                new CoreWeaveCloudIntegrationAccountAuthenticationUpdate(
                                    new CoreWeaveCloudIntegrationAccountAPITokenAuthUpdate()
                                        .apiToken("CW-SECRET-xxxxxxxxxxxxxxxxxxxx")
                                        .authType(
                                            CoreWeaveCloudIntegrationAccountAPITokenAuthType
                                                .COREWEAVE_API_TOKEN)))
                            .dataflows(
                                new CoreWeaveCloudIntegrationDataflowsRequest()
                                    .coreweaveCloudLogs(
                                        new CoreWeaveCloudLogsIntegrationDataflowRequest()
                                            .enabled(true))
                                    .coreweaveCloudMetrics(
                                        new CoreWeaveCloudMetricsIntegrationDataflowRequest()
                                            .enabled(true)))
                            .name("coreweave-prod")
                            .settings(
                                new CoreWeaveCloudIntegrationAccountSettingsUpdate()
                                    .accountTags(Arrays.asList("env:prod", "team:gpu"))
                                    .clusterFilters(
                                        Arrays.asList("cluster:prod-*", "!cluster:dev"))))
                    .id("f7a8b9c0-d1e2-4f3a-9b4c-5d6e7f8091a2")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      CoreWeaveCloudIntegrationAccountResponse result =
          apiInstance.updateCoreWeaveCloudIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CoreWeaveIntegrationApi#updateCoreWeaveCloudIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
