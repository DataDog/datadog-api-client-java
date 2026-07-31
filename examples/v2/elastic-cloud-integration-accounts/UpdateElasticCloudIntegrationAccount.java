// Update an Elastic Cloud integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ElasticCloudIntegrationAccountsApi;
import com.datadog.api.client.v2.model.ElasticCloudAuthentication;
import com.datadog.api.client.v2.model.ElasticCloudBasicAuth;
import com.datadog.api.client.v2.model.ElasticCloudBasicAuthType;
import com.datadog.api.client.v2.model.ElasticCloudDataflow;
import com.datadog.api.client.v2.model.ElasticCloudDataflowId;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountResponse;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.ElasticCloudInterfaceId;
import com.datadog.api.client.v2.model.ElasticCloudInterfaceUpdate;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringInterfaceType;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringInterfaceUpdate;
import com.datadog.api.client.v2.model.ElasticCloudSettingsUpdate;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import java.util.Collections;

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
                            ._interface(
                                new ElasticCloudInterfaceUpdate(
                                    new ElasticCloudMonitoringInterfaceUpdate()
                                        .authentication(
                                            new ElasticCloudAuthentication(
                                                new ElasticCloudBasicAuth()
                                                    .password("your-password")
                                                    .type(ElasticCloudBasicAuthType.BASIC)
                                                    .username("datadog")))
                                        .dataflows(
                                            Collections.singletonList(
                                                new ElasticCloudDataflow()
                                                    .enabled(true)
                                                    .id(ElasticCloudDataflowId.METRICS)))
                                        .settings(
                                            new ElasticCloudSettingsUpdate()
                                                .catAllocationStatsEnabled(false)
                                                .detailedIndexStatsEnabled(false)
                                                .indexStatsEnabled(false)
                                                .pendingTaskStatsEnabled(false)
                                                .pshardGracefulToEnabled(false)
                                                .pshardStatsEnabled(false)
                                                .slmStatsEnabled(false)
                                                .tags(Collections.singletonList("env:prod"))
                                                .url(
                                                    "https://example.es.us-central1.gcp.cloud.es.io:9243"))
                                        .type(ElasticCloudMonitoringInterfaceType.ELASTIC_CLOUD)))
                            .name("elastic-cloud-prod"))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      ElasticCloudIntegrationAccountResponse result =
          apiInstance.updateElasticCloudIntegrationAccount(
              ElasticCloudInterfaceId.ELASTIC_CLOUD, "account_id", body);
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
