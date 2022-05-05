// Get a user invitation returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.UsersApi;
import com.datadog.api.v2.client.model.UserInvitationResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    UsersApi apiInstance = new UsersApi(defaultClient);

    // the "user" has a "user_invitation"
    String USER_INVITATION_ID = System.getenv("USER_INVITATION_ID");

    try {
      UserInvitationResponse result = apiInstance.getInvitation(USER_INVITATION_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#getInvitation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
