// Create a dataset returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetCreateAttributesRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetCreateDataRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetCreateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetCreateResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDefinition;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDefinitionColumn;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDefinitionColumnType;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createSecurityMonitoringDataset", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringDatasetCreateRequest body =
        new SecurityMonitoringDatasetCreateRequest()
            .data(
                new SecurityMonitoringDatasetCreateDataRequest()
                    .attributes(
                        new SecurityMonitoringDatasetCreateAttributesRequest()
                            .definition(
                                new SecurityMonitoringDatasetDefinition()
                                    .columns(
                                        Collections.singletonList(
                                            new SecurityMonitoringDatasetDefinitionColumn()
                                                .column("message")
                                                .type(
                                                    SecurityMonitoringDatasetDefinitionColumnType
                                                        .STRING)))
                                    .dataSource("logs")
                                    .indexes(Collections.singletonList("k9"))
                                    .name("my_dataset"))
                            .description("A dataset for monitoring authentication events"))
                    .type(SecurityMonitoringDatasetType.SECURITY_MONITORING_DATASET));

    try {
      SecurityMonitoringDatasetCreateResponse result =
          apiInstance.createSecurityMonitoringDataset(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#createSecurityMonitoringDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
