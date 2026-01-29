// Update a dataset returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDefinition;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDefinitionColumn;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDefinitionColumnType;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetType;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetUpdateAttributesRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetUpdateDataRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetUpdateRequest;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateSecurityMonitoringDataset", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringDatasetUpdateRequest body =
        new SecurityMonitoringDatasetUpdateRequest()
            .data(
                new SecurityMonitoringDatasetUpdateDataRequest()
                    .attributes(
                        new SecurityMonitoringDatasetUpdateAttributesRequest()
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
                            .description("Updated dataset description")
                            .version(1L))
                    .type(SecurityMonitoringDatasetType.SECURITY_MONITORING_DATASET));

    try {
      apiInstance.updateSecurityMonitoringDataset(
          UUID.fromString("123e4567-e89b-12d3-a456-426614174000"), body);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#updateSecurityMonitoringDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
