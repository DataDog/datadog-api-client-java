// Update an Elastic Cloud integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ElasticCloudIntegrationAccountsApi;
import com.datadog.api.client.v2.model.ElasticCloudDetailedIndexStatsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ElasticCloudIndexStatsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountResponse;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountSettingsUpdate;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.ElasticCloudPendingTaskStatsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ElasticCloudPrimaryShardGracefulTimeoutIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ElasticCloudPrimaryShardStatsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ElasticCloudShardAllocationStatsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.ElasticCloudSlmStatsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.IntegrationAccountBasicAuthType;
import com.datadog.api.client.v2.model.IntegrationAccountBasicAuthUpdate;
import com.datadog.api.client.v2.model.IntegrationAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateElasticCloudIntegrationAccount", true);
    ElasticCloudIntegrationAccountsApi apiInstance =
        new ElasticCloudIntegrationAccountsApi(defaultClient);

    ElasticCloudIntegrationAccountUpdateRequest body =
        new ElasticCloudIntegrationAccountUpdateRequest()
            .data(
                new ElasticCloudIntegrationAccountUpdateData()
                    .attributes(
                        new ElasticCloudIntegrationAccountUpdateAttributes()
                            .authentication(
                                new ElasticCloudIntegrationAccountAuthenticationUpdate(
                                    new IntegrationAccountBasicAuthUpdate()
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
                                new ElasticCloudIntegrationAccountSettingsUpdate()
                                    .tags("env:prod,team:saasint")
                                    .url("https://example.es.us-central1.gcp.cloud.es.io:9243")))
                    .id("953a0060-81ec-4221-aed4-d4733b59cd96")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      ElasticCloudIntegrationAccountResponse result =
          apiInstance.updateElasticCloudIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " ElasticCloudIntegrationAccountsApi#updateElasticCloudIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
