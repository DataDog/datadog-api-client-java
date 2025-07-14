// Delete a dataset returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DatasetsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DatasetsApi apiInstance = new DatasetsApi(defaultClient);

    try {
      apiInstance.deleteDataset("dataset_id");
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#deleteDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
