// Publish a batch migration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationPublishAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationPublishData;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationPublishRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationPublishResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationPublishType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.publishSecurityMonitoringBatchMigration", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringBatchMigrationPublishRequest body =
        new SecurityMonitoringBatchMigrationPublishRequest()
            .data(
                new SecurityMonitoringBatchMigrationPublishData()
                    .attributes(
                        new SecurityMonitoringBatchMigrationPublishAttributes()
                            .resourceIds(
                                Collections.singletonList(
                                    UUID.fromString("c968cf83-56c2-4d54-a993-6c86dfb83527"))))
                    .type(SecurityMonitoringBatchMigrationPublishType.BATCH_MIGRATION_PUBLISH));

    try {
      SecurityMonitoringBatchMigrationPublishResponse result =
          apiInstance.publishSecurityMonitoringBatchMigration(
              UUID.fromString("7cdb3a75-64fb-46ce-9445-41969e78fe8e"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#publishSecurityMonitoringBatchMigration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
