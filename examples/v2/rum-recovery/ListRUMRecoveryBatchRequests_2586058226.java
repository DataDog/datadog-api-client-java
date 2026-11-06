// List batch history filters request creation time independently of session time

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumRecoveryApi;
import com.datadog.api.client.v2.api.RumRecoveryApi.ListRUMRecoveryBatchRequestsOptionalParameters;
import com.datadog.api.client.v2.model.RumRecoveryBatchListResponse;
import com.datadog.api.client.v2.model.RumRecoveryBatchRequestType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumRecoveryApi apiInstance = new RumRecoveryApi(defaultClient);

    try {
      RumRecoveryBatchListResponse result =
          apiInstance.listRUMRecoveryBatchRequests(
              RumRecoveryBatchRequestType.BATCH,
              new ListRUMRecoveryBatchRequestsOptionalParameters()
                  .from(1L)
                  .to(2L)
                  .query("service:rum18600-fixture AND @usr.id:(123 OR 456)"));
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
