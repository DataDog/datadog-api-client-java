// Delete an existing Action Connection returns "The resource was deleted successfully." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    try {
      apiInstance.deleteActionConnection("connection_id");
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#deleteActionConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
