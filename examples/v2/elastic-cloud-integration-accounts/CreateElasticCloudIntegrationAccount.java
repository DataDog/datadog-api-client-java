// Create an Elastic Cloud integration account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ElasticCloudIntegrationAccountsApi;
import com.datadog.api.client.v2.model.ElasticCloudAuthentication;
import com.datadog.api.client.v2.model.ElasticCloudBasicAuth;
import com.datadog.api.client.v2.model.ElasticCloudBasicAuthType;
import com.datadog.api.client.v2.model.ElasticCloudDataflow;
import com.datadog.api.client.v2.model.ElasticCloudDataflowId;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountAttributes;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountCreateData;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountRequest;
import com.datadog.api.client.v2.model.ElasticCloudIntegrationAccountResponse;
import com.datadog.api.client.v2.model.ElasticCloudInterface;
import com.datadog.api.client.v2.model.ElasticCloudInterfaceId;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringInterface;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringInterfaceType;
import com.datadog.api.client.v2.model.ElasticCloudSettings;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createElasticCloudIntegrationAccount", true);
    ElasticCloudIntegrationAccountsApi apiInstance =
        new ElasticCloudIntegrationAccountsApi(defaultClient);

    ElasticCloudIntegrationAccountRequest body =
        new ElasticCloudIntegrationAccountRequest()
            .data(
                new ElasticCloudIntegrationAccountCreateData()
                    .attributes(
                        new ElasticCloudIntegrationAccountAttributes()
                            ._interface(
                                new ElasticCloudInterface(
                                    new ElasticCloudMonitoringInterface()
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
                                            new ElasticCloudSettings()
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
          apiInstance.createElasticCloudIntegrationAccount(
              ElasticCloudInterfaceId.ELASTIC_CLOUD, body);
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
