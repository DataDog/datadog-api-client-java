// Search for SLOs returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.ServiceLevelObjectivesApi;
import com.datadog.api.client.v1.api.ServiceLevelObjectivesApi.SearchSLOOptionalParameters;
import com.datadog.api.client.v1.model.SearchSLOResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);

    // there is a valid "slo" in the system
    String SLO_DATA_0_NAME = System.getenv("SLO_DATA_0_NAME");

    try {
      SearchSLOResponse result =
          apiInstance.searchSLO(
              new SearchSLOOptionalParameters()
                  .query(SLO_DATA_0_NAME)
                  .pageSize(20L)
                  .pageNumber(0L));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectivesApi#searchSLO");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
