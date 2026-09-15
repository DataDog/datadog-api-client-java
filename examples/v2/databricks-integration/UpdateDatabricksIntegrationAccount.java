// Update a Databricks integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DatabricksIntegrationApi;
import com.datadog.api.client.v2.model.DatabricksCloudCostMetricsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.DatabricksCloudCostMetricsIntegrationDataflowSettingsRequest;
import com.datadog.api.client.v2.model.DatabricksDataObservabilityJobsMonitoringIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest;
import com.datadog.api.client.v2.model.DatabricksDataObservabilityQualityMonitoringIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.DatabricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest;
import com.datadog.api.client.v2.model.DatabricksIntegrationAccountAuthenticationUpdate;
import com.datadog.api.client.v2.model.DatabricksIntegrationAccountOAuthAuthRequest;
import com.datadog.api.client.v2.model.DatabricksIntegrationAccountOAuthAuthType;
import com.datadog.api.client.v2.model.DatabricksIntegrationAccountResponse;
import com.datadog.api.client.v2.model.DatabricksIntegrationAccountSettingsUpdate;
import com.datadog.api.client.v2.model.DatabricksIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.DatabricksIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.DatabricksIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.DatabricksIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.DatabricksModelServingMetricsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.IntegrationAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateDatabricksIntegrationAccount", true);
    DatabricksIntegrationApi apiInstance = new DatabricksIntegrationApi(defaultClient);

    DatabricksIntegrationAccountUpdateRequest body =
        new DatabricksIntegrationAccountUpdateRequest()
            .data(
                new DatabricksIntegrationAccountUpdateData()
                    .attributes(
                        new DatabricksIntegrationAccountUpdateAttributes()
                            .authentication(
                                new DatabricksIntegrationAccountAuthenticationUpdate(
                                    new DatabricksIntegrationAccountOAuthAuthRequest()
                                        .authType(
                                            DatabricksIntegrationAccountOAuthAuthType
                                                .DATABRICKS_OAUTH)
                                        .azureTenantId("4d3bac44-0230-4732-9e70-cc00736f0a97")
                                        .clientId("5c10654a-b3a3-4840-b37f-f477590c70a0")
                                        .clientSecret("your-client-secret")))
                            .dataflows(
                                new DatabricksIntegrationDataflowsRequest()
                                    .databricksCloudCostMetrics(
                                        new DatabricksCloudCostMetricsIntegrationDataflowRequest()
                                            .enabled(true)
                                            .settings(
                                                new DatabricksCloudCostMetricsIntegrationDataflowSettingsRequest()
                                                    .ccmCollectAllWorkspaces(true)))
                                    .databricksDataObservabilityJobsMonitoring(
                                        new DatabricksDataObservabilityJobsMonitoringIntegrationDataflowRequest()
                                            .enabled(true)
                                            .settings(
                                                new DatabricksDataObservabilityJobsMonitoringIntegrationDataflowSettingsRequest()
                                                    .ddApiKeyId(
                                                        "fe383f4e-09fc-46bf-8e10-4efdd453a646")
                                                    .ddApiKeySecret("your-datadog-api-key")
                                                    .djmGlobalInitScriptEnabled(true)
                                                    .scriptGpumEnabled(true)
                                                    .scriptLogsEnabled(true)
                                                    .serverlessJobsEnabled(true)))
                                    .databricksDataObservabilityQualityMonitoring(
                                        new DatabricksDataObservabilityQualityMonitoringIntegrationDataflowRequest()
                                            .enabled(true)
                                            .settings(
                                                new DatabricksDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest()
                                                    .doCrawlersCron("0 * * * *")
                                                    .syncSystemCatalog(true)))
                                    .databricksModelServingMetrics(
                                        new DatabricksModelServingMetricsIntegrationDataflowRequest()
                                            .enabled(true)))
                            .name("My Databricks Workspace")
                            .settings(
                                new DatabricksIntegrationAccountSettingsUpdate()
                                    .systemTablesSqlWarehouseId("aba7c023d4172910")
                                    .workspaceUrl("https://dbc-1234abcd.cloud.databricks.com")))
                    .id("a9a69c2e-4f8d-4e42-9c1a-2a7a2d3b7c6f")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      DatabricksIntegrationAccountResponse result =
          apiInstance.updateDatabricksIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling DatabricksIntegrationApi#updateDatabricksIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
