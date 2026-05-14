// List API specs returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SpecsApi;
import com.datadog.api.client.v2.model.SpecsListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SpecsApi apiInstance = new SpecsApi(defaultClient);

    try {
      SpecsListResponse result = apiInstance.listSpecs();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SpecsApi#listSpecs");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
