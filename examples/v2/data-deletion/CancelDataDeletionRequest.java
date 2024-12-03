// Cancels a data deletion request returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DataDeletionApi;
import com.datadog.api.client.v2.model.CancelDataDeletionResponseBody;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DataDeletionApi apiInstance = new DataDeletionApi(defaultClient);

    // there is a valid "deletion_request" in the system
    String DELETION_REQUEST_DATA_ID = System.getenv("DELETION_REQUEST_DATA_ID");

    try {
      CancelDataDeletionResponseBody result =
          apiInstance.cancelDataDeletionRequest(DELETION_REQUEST_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataDeletionApi#cancelDataDeletionRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
