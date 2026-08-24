// Update an Elastic Cloud monitoring account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ElasticCloudMonitoringApi;
import com.datadog.api.client.v2.model.ElasticCloudAuthentication;
import com.datadog.api.client.v2.model.ElasticCloudBasicAuth;
import com.datadog.api.client.v2.model.ElasticCloudBasicAuthType;
import com.datadog.api.client.v2.model.ElasticCloudDataflow;
import com.datadog.api.client.v2.model.ElasticCloudDataflowId;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringAccountResponse;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringAccountUpdateAttributes;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringAccountUpdateData;
import com.datadog.api.client.v2.model.ElasticCloudMonitoringAccountUpdateRequest;
import com.datadog.api.client.v2.model.ElasticCloudSettingsUpdate;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateElasticCloudMonitoringAccount", true);
    ElasticCloudMonitoringApi apiInstance = new ElasticCloudMonitoringApi(defaultClient);

    ElasticCloudMonitoringAccountUpdateRequest body =
        new ElasticCloudMonitoringAccountUpdateRequest()
            .data(
                new ElasticCloudMonitoringAccountUpdateData()
                    .attributes(
                        new ElasticCloudMonitoringAccountUpdateAttributes()
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
                                new ElasticCloudSettingsUpdate()
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
          apiInstance.updateElasticCloudMonitoringAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ElasticCloudMonitoringApi#updateElasticCloudMonitoringAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
