// Get a Google Chat organization binding returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GoogleChatIntegrationApi;
import com.datadog.api.client.v2.model.GoogleChatOrganizationResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GoogleChatIntegrationApi apiInstance = new GoogleChatIntegrationApi(defaultClient);

    try {
      GoogleChatOrganizationResponse result =
          apiInstance.getGoogleChatOrganization("organization_binding_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling GoogleChatIntegrationApi#getGoogleChatOrganization");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
