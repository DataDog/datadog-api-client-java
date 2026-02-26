// List resource filters returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.api.SecurityMonitoringApi.GetResourceEvaluationFiltersOptionalParameters;
import com.datadog.api.client.v2.model.GetResourceEvaluationFiltersResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    try {
      GetResourceEvaluationFiltersResponse result =
          apiInstance.getResourceEvaluationFilters(
              new GetResourceEvaluationFiltersOptionalParameters()
                  .cloudProvider("aws")
                  .accountId("123456789"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SecurityMonitoringApi#getResourceEvaluationFilters");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
