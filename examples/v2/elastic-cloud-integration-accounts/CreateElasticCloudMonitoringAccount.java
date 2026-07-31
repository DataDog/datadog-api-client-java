// Create an Elastic Cloud monitoring account returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ElasticCloudIntegrationAccountsApi;
import com.datadog.api.client.v2.model.ElasticCloudAuthentication;
import com.datadog.api.client.v2.model.ElasticCloudBasicAuth;
import com.datadog.api.client.v2.model.ElasticCloudBasicAuthType;
import com.datadog.api.client.v2.model.ElasticCloudDataflow;
import com.datadog.api.client.v2.model.ElasticCloudDataflowId;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringAccountAttributes;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringAccountCreateData;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringAccountRequest;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringAccountResponse;
import com.datadog.api.client.v2.model.ElasticCloudSettings;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createElasticCloudMonitoringAccount", true);
    ElasticCloudIntegrationAccountsApi apiInstance =
        new ElasticCloudIntegrationAccountsApi(defaultClient);

    ElasticCloudMonitoringAccountRequest body =
        new ElasticCloudMonitoringAccountRequest()
            .data(
                new ElasticCloudMonitoringAccountCreateData()
                    .attributes(
                        new ElasticCloudMonitoringAccountAttributes()
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
                            .name("elastic-cloud-prod")
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
                                    .url("https://example.es.us-central1.gcp.cloud.es.io:9243")))
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      ElasticCloudMonitoringAccountResponse result =
          apiInstance.createElasticCloudMonitoringAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " ElasticCloudIntegrationAccountsApi#createElasticCloudMonitoringAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
