// Get all notebooks returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v1.api.NotebooksApi;
import com.datadog.api.client.v1.api.NotebooksApi.ListNotebooksOptionalParameters;
import com.datadog.api.client.v1.model.NotebooksResponseData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    NotebooksApi apiInstance = new NotebooksApi(defaultClient);

    try {
      PaginationIterable<NotebooksResponseData> iterable =
          apiInstance.listNotebooksWithPagination(new ListNotebooksOptionalParameters().count(2L));

      for (NotebooksResponseData item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling NotebooksApi#listNotebooksWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
