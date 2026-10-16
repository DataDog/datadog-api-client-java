// Create a batch migration returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationCreateAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationCreateData;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationCreateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourceCreateItem;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResourceInputType;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringBatchMigrationType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.createSecurityMonitoringBatchMigration", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringBatchMigrationCreateRequest body =
        new SecurityMonitoringBatchMigrationCreateRequest()
            .data(
                new SecurityMonitoringBatchMigrationCreateData()
                    .type(SecurityMonitoringBatchMigrationType.BATCH_MIGRATION)
                    .attributes(
                        new SecurityMonitoringBatchMigrationCreateAttributes()
                            .name("Example-Security-Monitoring")
                            .description("Rules imported from Splunk")
                            .tags(Collections.singletonList("source:splunk"))
                            .resources(
                                Collections.singletonList(
                                    new SecurityMonitoringBatchMigrationResourceCreateItem()
                                        .name("Repeated Windows login failures")
                                        .description(
                                            "Detects repeated failed Windows authentication"
                                                + " attempts.")
                                        .inputType(
                                            SecurityMonitoringBatchMigrationResourceInputType.SPL)
                                        .input("index=wineventlog EventCode=4625")))));

    try {
      SecurityMonitoringBatchMigrationResponse result =
          apiInstance.createSecurityMonitoringBatchMigration(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#createSecurityMonitoringBatchMigration");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
