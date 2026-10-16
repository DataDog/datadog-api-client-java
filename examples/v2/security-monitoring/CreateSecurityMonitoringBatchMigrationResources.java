// Add resources to a batch migration returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourceCreateItem;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourceInputType;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourcesCreateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourcesCreateData;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourcesCreateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourcesCreateResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourcesType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled(
        "v2.createSecurityMonitoringBatchMigrationResources", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "batch_migration" in the system
    UUID BATCH_MIGRATION_DATA_ID = null;
    try {
      BATCH_MIGRATION_DATA_ID = UUID.fromString(System.getenv("BATCH_MIGRATION_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    SecurityMonitoringBatchMigrationResourcesCreateRequest body =
        new SecurityMonitoringBatchMigrationResourcesCreateRequest()
            .data(
                new SecurityMonitoringBatchMigrationResourcesCreateData()
                    .type(SecurityMonitoringBatchMigrationResourcesType.BATCH_MIGRATION_RESOURCES)
                    .attributes(
                        new SecurityMonitoringBatchMigrationResourcesCreateAttributes()
                            .resources(
                                Collections.singletonList(
                                    new SecurityMonitoringBatchMigrationResourceCreateItem()
                                        .name("Linux sudo abuse")
                                        .inputType(
                                            SecurityMonitoringBatchMigrationResourceInputType.SPL)
                                        .input(
                                            """
index=linux process=sudo "authentication failure" | stats count by user, host
""")))));

    try {
      SecurityMonitoringBatchMigrationResourcesCreateResponse result =
          apiInstance.createSecurityMonitoringBatchMigrationResources(
              BATCH_MIGRATION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#createSecurityMonitoringBatchMigrationResources");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
