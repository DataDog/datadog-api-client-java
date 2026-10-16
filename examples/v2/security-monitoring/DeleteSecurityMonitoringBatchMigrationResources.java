// Delete resources from a batch migration returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourcesDeleteAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourcesDeleteData;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourcesDeleteRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourcesType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.deleteSecurityMonitoringBatchMigrationResources", true);
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

    SecurityMonitoringBatchMigrationResourcesDeleteRequest body =
        new SecurityMonitoringBatchMigrationResourcesDeleteRequest()
            .data(
                new SecurityMonitoringBatchMigrationResourcesDeleteData()
                    .type(SecurityMonitoringBatchMigrationResourcesType.BATCH_MIGRATION_RESOURCES)
                    .attributes(
                        new SecurityMonitoringBatchMigrationResourcesDeleteAttributes()
                            .resourceIds(Collections.singletonList(BATCH_MIGRATION_RESOURCE_ID))));

    try {
      apiInstance.deleteSecurityMonitoringBatchMigrationResources(BATCH_MIGRATION_DATA_ID, body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#deleteSecurityMonitoringBatchMigrationResources");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
