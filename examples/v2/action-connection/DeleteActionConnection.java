// Delete an existing Action Connection returns "The resource was deleted successfully." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    // there is a valid "action_connection" in the system
    String ACTION_CONNECTION_DATA_ID = System.getenv("ACTION_CONNECTION_DATA_ID");

    try {
      apiInstance.deleteActionConnection(ACTION_CONNECTION_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#deleteActionConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
