// List RUM operation links returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumOperationsApi;
import com.datadog.api.client.v2.api.RumOperationsApi.ListRUMOperationStrongLinksOptionalParameters;
import com.datadog.api.client.v2.model.RUMOperationStrongLinksListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    RumOperationsApi apiInstance = new RumOperationsApi(defaultClient);

    // there is a valid "rum_operation" in the system
    String RUM_OPERATION_DATA_ID = System.getenv("RUM_OPERATION_DATA_ID");

    try {
      RUMOperationStrongLinksListResponse result =
          apiInstance.listRUMOperationStrongLinks(
              new ListRUMOperationStrongLinksOptionalParameters()
                  .operationId(RUM_OPERATION_DATA_ID));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumOperationsApi#listRUMOperationStrongLinks");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
