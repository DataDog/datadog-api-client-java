// Delete a Data Access Control dataset returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.DataAccessControlsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DataAccessControlsApi apiInstance = new DataAccessControlsApi(defaultClient);

    // there is a valid "dataset" in the system
    String DATASET_DATA_ID = System.getenv("DATASET_DATA_ID");

    try {
      apiInstance.deleteDataset(DATASET_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling DataAccessControlsApi#deleteDataset");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
