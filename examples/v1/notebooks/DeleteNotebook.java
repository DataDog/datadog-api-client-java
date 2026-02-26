// Delete a notebook returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.NotebooksApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    NotebooksApi apiInstance = new NotebooksApi(defaultClient);

    // there is a valid "notebook" in the system
    Long NOTEBOOK_DATA_ID = Long.parseLong(System.getenv("NOTEBOOK_DATA_ID"));

    try {
      apiInstance.deleteNotebook(NOTEBOOK_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling NotebooksApi#deleteNotebook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
