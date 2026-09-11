// Update a Snowflake integration account returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SnowflakeIntegrationApi;
import com.datadog.api.client.v2.model.IntegrationAccountType;
import com.datadog.api.client.v2.model.SnowflakeAccountUsageMetricsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.SnowflakeAccountUsageMetricsIntegrationDataflowSettingsRequest;
import com.datadog.api.client.v2.model.SnowflakeCloudCostMetricsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.SnowflakeCloudCostMetricsIntegrationDataflowSettingsRequest;
import com.datadog.api.client.v2.model.SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest;
import com.datadog.api.client.v2.model.SnowflakeEventTableLogsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.SnowflakeEventTableLogsIntegrationDataflowSettingsRequest;
import com.datadog.api.client.v2.model.SnowflakeIntegrationAccountAuthenticationRequest;
import com.datadog.api.client.v2.model.SnowflakeIntegrationAccountPrivateKeyAuthType;
import com.datadog.api.client.v2.model.SnowflakeIntegrationAccountResponse;
import com.datadog.api.client.v2.model.SnowflakeIntegrationAccountSettingsUpdate;
import com.datadog.api.client.v2.model.SnowflakeIntegrationAccountUpdateAttributes;
import com.datadog.api.client.v2.model.SnowflakeIntegrationAccountUpdateData;
import com.datadog.api.client.v2.model.SnowflakeIntegrationAccountUpdateRequest;
import com.datadog.api.client.v2.model.SnowflakeIntegrationDataflowsRequest;
import com.datadog.api.client.v2.model.SnowflakeOrganizationUsageMetricsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.SnowflakeOrganizationUsageMetricsIntegrationDataflowSettingsRequest;
import com.datadog.api.client.v2.model.SnowflakeQueryHistoryLogsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.SnowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest;
import com.datadog.api.client.v2.model.SnowflakeSecurityLogsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.SnowflakeSecurityLogsIntegrationDataflowSettingsRequest;
import com.datadog.api.client.v2.model.SnowflakeTaskHistoryLogsIntegrationDataflowRequest;
import com.datadog.api.client.v2.model.SnowflakeTaskHistoryLogsIntegrationDataflowSettingsRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateSnowflakeIntegrationAccount", true);
    SnowflakeIntegrationApi apiInstance = new SnowflakeIntegrationApi(defaultClient);

    SnowflakeIntegrationAccountUpdateRequest body =
        new SnowflakeIntegrationAccountUpdateRequest()
            .data(
                new SnowflakeIntegrationAccountUpdateData()
                    .attributes(
                        new SnowflakeIntegrationAccountUpdateAttributes()
                            .authentication(
                                new SnowflakeIntegrationAccountAuthenticationRequest()
                                    .authType(
                                        SnowflakeIntegrationAccountPrivateKeyAuthType
                                            .SNOWFLAKE_PRIVATE_KEY)
                                    .privateKey(
                                        """
-----BEGIN PRIVATE KEY-----
MIIE...
-----END PRIVATE KEY-----
""")
                                    .privateKeyName("my-rsa-key")
                                    .privateKeyPassphrase("your-private-key-passphrase"))
                            .dataflows(
                                new SnowflakeIntegrationDataflowsRequest()
                                    .snowflakeAccountUsageMetrics(
                                        new SnowflakeAccountUsageMetricsIntegrationDataflowRequest()
                                            .enabled(true)
                                            .settings(
                                                new SnowflakeAccountUsageMetricsIntegrationDataflowSettingsRequest()
                                                    .accountUsageMetricsAggregateLast24h(false)))
                                    .snowflakeCloudCostMetrics(
                                        new SnowflakeCloudCostMetricsIntegrationDataflowRequest()
                                            .enabled(true)
                                            .settings(
                                                new SnowflakeCloudCostMetricsIntegrationDataflowSettingsRequest()
                                                    .queryTags("env,team,cost_center")))
                                    .snowflakeDataObservabilityQualityMonitoring(
                                        new SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowRequest()
                                            .enabled(true)
                                            .settings(
                                                new SnowflakeDataObservabilityQualityMonitoringIntegrationDataflowSettingsRequest()
                                                    .doTableCrawlerCron("0 */6 * * *")
                                                    .syncSnowflakeSystemDatabase(true)))
                                    .snowflakeEventTableLogs(
                                        new SnowflakeEventTableLogsIntegrationDataflowRequest()
                                            .enabled(true)
                                            .settings(
                                                new SnowflakeEventTableLogsIntegrationDataflowSettingsRequest()
                                                    .eventTableEventsEnabled(true)
                                                    .eventTableLogsEnabled(true)
                                                    .eventTableLogsIntervalMin(15L)
                                                    .eventTableSpanEventsEnabled(false)
                                                    .eventTableSpansEnabled(false)))
                                    .snowflakeOrganizationUsageMetrics(
                                        new SnowflakeOrganizationUsageMetricsIntegrationDataflowRequest()
                                            .enabled(true)
                                            .settings(
                                                new SnowflakeOrganizationUsageMetricsIntegrationDataflowSettingsRequest()
                                                    .organizationUsageMetricsAggregateLast24h(
                                                        false)))
                                    .snowflakeQueryHistoryLogs(
                                        new SnowflakeQueryHistoryLogsIntegrationDataflowRequest()
                                            .enabled(true)
                                            .settings(
                                                new SnowflakeQueryHistoryLogsIntegrationDataflowSettingsRequest()
                                                    .joinQueryHistoryWithAccessHistoryEnabled(true)
                                                    .queryHistoryLogsIntervalMin(15L)))
                                    .snowflakeSecurityLogs(
                                        new SnowflakeSecurityLogsIntegrationDataflowRequest()
                                            .enabled(true)
                                            .settings(
                                                new SnowflakeSecurityLogsIntegrationDataflowSettingsRequest()
                                                    .securityLogsIntervalMin(60L)))
                                    .snowflakeTaskHistoryLogs(
                                        new SnowflakeTaskHistoryLogsIntegrationDataflowRequest()
                                            .enabled(true)
                                            .settings(
                                                new SnowflakeTaskHistoryLogsIntegrationDataflowSettingsRequest()
                                                    .taskHistoryLogsIntervalMin(30L))))
                            .name("prod-snowflake")
                            .settings(
                                new SnowflakeIntegrationAccountSettingsUpdate()
                                    .snowflakeAccountIdentifier("myorg-myaccount")
                                    .username("datadog_user")))
                    .id("a1b2c3d4-e5f6-7890-abcd-ef1234567890")
                    .type(IntegrationAccountType.INTEGRATION_ACCOUNT));

    try {
      SnowflakeIntegrationAccountResponse result =
          apiInstance.updateSnowflakeIntegrationAccount("account_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SnowflakeIntegrationApi#updateSnowflakeIntegrationAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
