// Get a GitHub App Action Connection

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ActionConnectionApi;
import com.datadog.api.client.v2.model.GetActionConnectionResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ActionConnectionApi apiInstance = new ActionConnectionApi(defaultClient);

    // there is a valid "github_app_action_connection" in the system
    String GITHUB_APP_ACTION_CONNECTION_DATA_ID =
        System.getenv("GITHUB_APP_ACTION_CONNECTION_DATA_ID");

    try {
      GetActionConnectionResponse result =
          apiInstance.getActionConnection(GITHUB_APP_ACTION_CONNECTION_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ActionConnectionApi#getActionConnection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
