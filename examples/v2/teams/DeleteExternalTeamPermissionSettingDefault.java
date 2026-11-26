// Delete an external team permission default returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.model.ExternalTeamPermissionSettingDefaultsSource;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    try {
      apiInstance.deleteExternalTeamPermissionSettingDefault(
          ExternalTeamPermissionSettingDefaultsSource.SCIM, "add_and_remove_subteam");
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling TeamsApi#deleteExternalTeamPermissionSettingDefault");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
