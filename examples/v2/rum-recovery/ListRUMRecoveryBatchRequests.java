// List batch recovery requests returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRecoveryApi;
import com.datadog.api.client.v2.model.RUMRecoveryBatchListResponse;
import com.datadog.api.client.v2.model.RUMRecoveryBatchRequestType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRecoveryApi apiInstance = new RumRecoveryApi(defaultClient);

    try {
      RUMRecoveryBatchListResponse result =
          apiInstance.listRUMRecoveryBatchRequests(RUMRecoveryBatchRequestType.BATCH);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumRecoveryApi#listRUMRecoveryBatchRequests");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
