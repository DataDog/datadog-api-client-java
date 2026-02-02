// Get dataset dependencies returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDependenciesAttributesRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDependenciesDataRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDependenciesRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDependenciesResponse;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDependenciesType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled(
        "v2.batchGetSecurityMonitoringDatasetDependencies", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    SecurityMonitoringDatasetDependenciesRequest body =
        new SecurityMonitoringDatasetDependenciesRequest()
            .data(
                new SecurityMonitoringDatasetDependenciesDataRequest()
                    .attributes(
                        new SecurityMonitoringDatasetDependenciesAttributesRequest()
                            .datasetIds(Collections.singletonList("dataset-1")))
                    .type(
                        SecurityMonitoringDatasetDependenciesType
                            .SECURITY_MONITORING_DATASET_DEPENDENCIES));

    try {
      SecurityMonitoringDatasetDependenciesResponse result =
          apiInstance.batchGetSecurityMonitoringDatasetDependencies(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling"
              + " SecurityMonitoringApi#batchGetSecurityMonitoringDatasetDependencies");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
