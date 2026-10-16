// List batch migrations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.ListSecurityMonitoringBatchMigrationsOptionalParameters;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationsListResponse;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.listSecurityMonitoringBatchMigrations", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    // there is a valid "batch_migration" in the system
    UUID BATCH_MIGRATION_DATA_ID = null;
    try {
      BATCH_MIGRATION_DATA_ID = UUID.fromString(System.getenv("BATCH_MIGRATION_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      SecurityMonitoringBatchMigrationsListResponse result =
          apiInstance.listSecurityMonitoringBatchMigrations(
              new ListSecurityMonitoringBatchMigrationsOptionalParameters()
                  .filterQuery("id:7cdb3a75-64fb-46ce-9445-41969e78fe8e"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#listSecurityMonitoringBatchMigrations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
