// Update a dataset returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetAttributesRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetColumn;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDefinition;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetSearch;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetTimeWindow;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetUpdateData;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetUpdateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetUpdateType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateSecurityMonitoringDataset", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringDatasetUpdateRequest body =
        new SecurityMonitoringDatasetUpdateRequest()
            .data(
                new SecurityMonitoringDatasetUpdateData()
                    .attributes(
                        new SecurityMonitoringDatasetAttributesRequest()
                            .definition(
                                new SecurityMonitoringDatasetDefinition()
                                    .columns(
                                        Collections.singletonList(
                                            new SecurityMonitoringDatasetColumn()
                                                .column("message")
                                                .type("string")))
                                    .dataSource("logs")
                                    .name("sample_dataset")
                                    .queryFilter("status = 'active'")
                                    .search(new SecurityMonitoringDatasetSearch().query("*"))
                                    .storage("hot")
                                    .tableName("my_reference_table")
                                    .timeWindow(
                                        new SecurityMonitoringDatasetTimeWindow()
                                            .from(1700000000000L)
                                            .to(1700003600000L)))
                            .description("A sample dataset used for detection rules.")
                            .version(1L))
                    .type(SecurityMonitoringDatasetUpdateType.DATASET_UPDATE));

    try {
      apiInstance.updateSecurityMonitoringDataset("123e4567-e89b-12d3-a456-426614174000", body);
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
