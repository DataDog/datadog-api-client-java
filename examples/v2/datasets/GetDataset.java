// Get a single dataset by ID returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DatasetsApi;
import com.datadog.api.client.v2.model.DatasetResponseSingle;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DatasetsApi apiInstance = new DatasetsApi(defaultClient);

    try {
      DatasetResponseSingle result = apiInstance.getDataset("dataset_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DatasetsApi#getDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
