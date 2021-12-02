// List all users returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.UsersApi;
import com.datadog.api.v2.client.model.UsersResponse;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    UsersApi apiInstance = new UsersApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ATTRIBUTES_EMAIL = System.getenv("USER_DATA_ATTRIBUTES_EMAIL");

    try {
      UsersResponse result = apiInstance.listUsers();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
