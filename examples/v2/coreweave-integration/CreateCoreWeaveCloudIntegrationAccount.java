// Create a CoreWeave integration account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CoreWeaveIntegrationApi;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountAPITokenAuthRequest;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountAPITokenAuthType;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountCreateAttributes;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountResponse;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationAccountSettingsRequest;
import com.datadog.api.client.v2.model.CoreWeaveCloudIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.CoreWeaveCloudLogsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.CoreWeaveCloudMetricsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createCoreWeaveCloudIntegrationAccount", true);
    CoreWeaveIntegrationApi apiInstance = new CoreWeaveIntegrationApi(defaultClient);

    CoreWeaveCloudIntegrationAccountCreateRequest body =
        new CoreWeaveCloudIntegrationAccountCreateRequest()
            .data(
                new CoreWeaveCloudIntegrationAccountCreateData()
                    .attributes(
                        new CoreWeaveCloudIntegrationAccountCreateAttributes()
                            .authentication(
                                new CoreWeaveCloudIntegrationAccountAuthenticationRequest(
                                    new CoreWeaveCloudIntegrationAccountAPITokenAuthRequest()
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
                                new CoreWeaveCloudIntegrationAccountSettingsRequest()
                                    .accountTags(Arrays.asList("env:prod", "team:gpu"))
                                    .clusterFilters(
                                        Arrays.asList("cluster:prod-*", "!cluster:dev"))))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      CoreWeaveCloudIntegrationAccountResponse result =
          apiInstance.createCoreWeaveCloudIntegrationAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling CoreWeaveIntegrationApi#createCoreWeaveCloudIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
