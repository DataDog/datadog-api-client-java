// Get dataset dependencies returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDependenciesRequest;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDependenciesRequestAttributes;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDependenciesRequestData;
import com.datadog.api.client.v2.model.SecurityMonitoringDatasetDependenciesResponse;
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
                new SecurityMonitoringDatasetDependenciesRequestData()
                    .attributes(
                        new SecurityMonitoringDatasetDependenciesRequestAttributes()
                            .datasetIds(
                                Collections.singletonList(
                                    "123e4567-e89b-12d3-a456-426614174000"))));

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
