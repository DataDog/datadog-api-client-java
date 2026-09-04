// Search inferred DEM journeys returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DemApi;
import com.datadog.api.client.v2.model.DemSearchInferredJourneysResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DemApi apiInstance = new DemApi(defaultClient);

    try {
      DemSearchInferredJourneysResponse result = apiInstance.searchInferredJourneys();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DemApi#searchInferredJourneys");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
