// Search RUM operations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumOperationsApi;
import com.datadog.api.client.v2.model.RUMOperationsListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listRUMOperations", true);
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    try {
      RUMOperationsListResponse result = apiInstance.listRUMOperations();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumOperationsApi#listRUMOperations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
