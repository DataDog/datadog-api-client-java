// Get rows by id returns "Some or all requested rows were found." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ReferenceTablesApi;
import com.datadog.api.client.v2.model.TableRowResourceArray;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ReferenceTablesApi apiInstance = new ReferenceTablesApi(defaultClient);

    try {
      TableRowResourceArray result =
          apiInstance.getRowsByID("table-123", Arrays.asList("row1", "row2"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReferenceTablesApi#getRowsByID");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
