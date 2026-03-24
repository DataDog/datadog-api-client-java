// Get a Data Access Control dataset by ID returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DataAccessControlsApi;
import com.datadog.api.client.v2.model.DatasetResponseSingle;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getDataset", true);
    DataAccessControlsApi apiInstance = new DataAccessControlsApi(defaultClient);

    try {
      DatasetResponseSingle result = apiInstance.getDataset("0879ce27-29a1-481f-a12e-bc2a48ec9ae1");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAccessControlsApi#getDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
