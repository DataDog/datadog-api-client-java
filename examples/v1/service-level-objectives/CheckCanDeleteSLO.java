// Check if SLOs can be safely deleted returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.ServiceLevelObjectivesApi;
import com.datadog.api.client.v1.model.CheckCanDeleteSLOResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    try {
      CheckCanDeleteSLOResponse result = apiInstance.checkCanDeleteSLO("id1, id2, id3");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectivesApi#checkCanDeleteSLO");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
