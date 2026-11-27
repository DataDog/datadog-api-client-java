// Search RUM operations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumOperationsApi;
import com.datadog.api.client.v2.api.RumOperationsApi.ListRUMOperationsOptionalParameters;
import com.datadog.api.client.v2.model.RUMOperationsListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    // there is a valid "rum_operation" in the system
    String RUM_OPERATION_DATA_ATTRIBUTES_NAME = System.getenv("RUM_OPERATION_DATA_ATTRIBUTES_NAME");

    try {
      RUMOperationsListResponse result =
          apiInstance.listRUMOperations(
              new ListRUMOperationsOptionalParameters().query(RUM_OPERATION_DATA_ATTRIBUTES_NAME));
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
