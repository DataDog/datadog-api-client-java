// Get a list of deployment events returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DoraMetricsApi;
import com.datadog.api.client.v2.model.DORADeploymentsListResponse;
import com.datadog.api.client.v2.model.DORAListDeploymentsRequest;
import com.datadog.api.client.v2.model.DORAListDeploymentsRequestAttributes;
import com.datadog.api.client.v2.model.DORAListDeploymentsRequestData;
import com.datadog.api.client.v2.model.DORAListDeploymentsRequestDataType;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DoraMetricsApi apiInstance = new DoraMetricsApi(defaultClient);

    DORAListDeploymentsRequest body =
        new DORAListDeploymentsRequest()
            .data(
                new DORAListDeploymentsRequestData()
                    .attributes(
                        new DORAListDeploymentsRequestAttributes()
                            .from(OffsetDateTime.parse("2025-03-23T00:00:00Z"))
                            .limit(1)
                            .to(OffsetDateTime.parse("2025-03-24T00:00:00Z")))
                    .type(DORAListDeploymentsRequestDataType.DORA_DEPLOYMENTS_LIST_REQUEST));

    try {
      DORADeploymentsListResponse result = apiInstance.listDORADeployments(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DoraMetricsApi#listDORADeployments");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
