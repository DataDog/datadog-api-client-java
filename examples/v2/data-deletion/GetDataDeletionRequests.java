// Gets a list of data deletion requests returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DataDeletionApi;
import com.datadog.api.client.v2.model.GetDataDeletionsResponseBody;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getDataDeletionRequests", true);
    DataDeletionApi apiInstance = new DataDeletionApi(defaultClient);

    try {
      GetDataDeletionsResponseBody result = apiInstance.getDataDeletionRequests();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataDeletionApi#getDataDeletionRequests");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
