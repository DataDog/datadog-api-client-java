// Create an Elastic Cloud integration account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ElasticCloudIntegrationAccountsApi;
import com.datadog.api.client.v2.model.ElasticCloudDetailedIndexStatsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ElasticCloudIndexStatsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountCreateAttributes;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountCreateRequest;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountResponse;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountSettingsRequest;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.ElasticCloudPendingTaskStatsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ElasticCloudPrimaryShardGracefulTimeoutIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ElasticCloudPrimaryShardStatsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ElasticCloudShardAllocationStatsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ElasticCloudSlmStatsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.IntegrationAccountBasicAuthRequest;
import com.datadog.api.client.v2.model.IntegrationAccountBasicAuthType;
import com.datadog.api.client.v2.model.IntegrationAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createElasticCloudIntegrationAccount", true);
    ElasticCloudIntegrationAccountsApi apiInstance =
        new ElasticCloudIntegrationAccountsApi(defaultClient);

    ElasticCloudIntegrationAccountCreateRequest body =
        new ElasticCloudIntegrationAccountCreateRequest()
            .data(
                new ElasticCloudIntegrationAccountCreateData()
                    .attributes(
                        new ElasticCloudIntegrationAccountCreateAttributes()
                            .authentication(
                                new ElasticCloudIntegrationAccountAuthenticationRequest(
                                    new IntegrationAccountBasicAuthRequest()
                                        .authType(IntegrationAccountBasicAuthType.BASIC)
                                        .password("your-password")
                                        .username("datadog")))
                            .dataflows(
                                new ElasticCloudIntegrationDataflowsRequest()
                                    .elasticCloudDetailedIndexStats(
                                        new ElasticCloudDetailedIndexStatsIntegrationDataflowRequest()
                                            .enabled(true))
                                    .elasticCloudIndexStats(
                                        new ElasticCloudIndexStatsIntegrationDataflowRequest()
                                            .enabled(true))
                                    .elasticCloudPendingTaskStats(
                                        new ElasticCloudPendingTaskStatsIntegrationDataflowRequest()
                                            .enabled(true))
                                    .elasticCloudPrimaryShardGracefulTimeout(
                                        new ElasticCloudPrimaryShardGracefulTimeoutIntegrationDataflowRequest()
                                            .enabled(true))
                                    .elasticCloudPrimaryShardStats(
                                        new ElasticCloudPrimaryShardStatsIntegrationDataflowRequest()
                                            .enabled(true))
                                    .elasticCloudShardAllocationStats(
                                        new ElasticCloudShardAllocationStatsIntegrationDataflowRequest()
                                            .enabled(true))
                                    .elasticCloudSlmStats(
                                        new ElasticCloudSlmStatsIntegrationDataflowRequest()
                                            .enabled(true)))
                            .name("elastic-cloud-prod")
                            .settings(
                                new ElasticCloudIntegrationAccountSettingsRequest()
                                    .tags("env:prod,team:saasint")
                                    .url("https://example.es.us-central1.gcp.cloud.es.io:9243")))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      ElasticCloudIntegrationAccountResponse result =
          apiInstance.createElasticCloudIntegrationAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " ElasticCloudIntegrationAccountsApi#createElasticCloudIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
