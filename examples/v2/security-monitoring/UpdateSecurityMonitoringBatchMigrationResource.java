// Update a batch migration resource returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourceResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourceType;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourceUpdateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourceUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourceUpdateRequest;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.updateSecurityMonitoringBatchMigrationResource", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "batch_migration" in the system
    UUID BATCH_MIGRATION_DATA_ID = null;
    try {
      BATCH_MIGRATION_DATA_ID = UUID.fromString(System.getenv("BATCH_MIGRATION_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "batch_migration_resource" in the system
    UUID BATCH_MIGRATION_RESOURCE_ID = null;
    try {
      BATCH_MIGRATION_RESOURCE_ID = UUID.fromString(System.getenv("BATCH_MIGRATION_RESOURCE_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    SecurityMonitoringBatchMigrationResourceUpdateRequest body =
        new SecurityMonitoringBatchMigrationResourceUpdateRequest()
            .data(
                new SecurityMonitoringBatchMigrationResourceUpdateData()
                    .type(SecurityMonitoringBatchMigrationResourceType.BATCH_MIGRATION_RESOURCE)
                    .attributes(
                        new SecurityMonitoringBatchMigrationResourceUpdateAttributes()
                            .input("index=wineventlog EventCode=4625 | stats count by user")));

    try {
      SecurityMonitoringBatchMigrationResourceResponse result =
          apiInstance.updateSecurityMonitoringBatchMigrationResource(
              BATCH_MIGRATION_DATA_ID, BATCH_MIGRATION_RESOURCE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#updateSecurityMonitoringBatchMigrationResource");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
