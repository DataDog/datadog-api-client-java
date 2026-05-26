// Create a dataset returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetAttributesRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetColumn;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetCreateData;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetCreateRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetCreateResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetCreateType;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDefinition;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetSearch;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetTimeWindow;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createSecurityMonitoringDataset", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringDatasetCreateRequest body =
        new SecurityMonitoringDatasetCreateRequest()
            .data(
                new SecurityMonitoringDatasetCreateData()
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
                    .type(SecurityMonitoringDatasetCreateType.DATASET_CREATE));

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
