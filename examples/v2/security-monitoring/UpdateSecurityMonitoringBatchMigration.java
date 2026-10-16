// Update a batch migration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationType;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationUpdateRequest;
import java.util.Arrays;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.updateSecurityMonitoringBatchMigration", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "batch_migration" in the system
    UUID BATCH_MIGRATION_DATA_ID = null;
    try {
      BATCH_MIGRATION_DATA_ID = UUID.fromString(System.getenv("BATCH_MIGRATION_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    SecurityMonitoringBatchMigrationUpdateRequest body =
        new SecurityMonitoringBatchMigrationUpdateRequest()
            .data(
                new SecurityMonitoringBatchMigrationUpdateData()
                    .type(SecurityMonitoringBatchMigrationType.BATCH_MIGRATION)
                    .attributes(
                        new SecurityMonitoringBatchMigrationUpdateAttributes()
                            .name("Example-Security-Monitoring-updated")
                            .tags(Arrays.asList("source:splunk", "team:secops"))));

    try {
      SecurityMonitoringBatchMigrationResponse result =
          apiInstance.updateSecurityMonitoringBatchMigration(BATCH_MIGRATION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#updateSecurityMonitoringBatchMigration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
