// List bandits returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsBanditV2ListDTOArray;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.listBandits", true);
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    try {
      ExperimentsBanditV2ListDTOArray result = apiInstance.listBandits();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#listBandits");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
