// Update organization handle returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GoogleChatIntegrationApi;
import com.datadog.api.client.v2.model.GoogleChatOrganizationHandleResponse;
import com.datadog.api.client.v2.model.GoogleChatOrganizationHandleType;
import com.datadog.api.client.v2.model.GoogleChatUpdateOrganizationHandleRequest;
import com.datadog.api.client.v2.model.GoogleChatUpdateOrganizationHandleRequestAttributes;
import com.datadog.api.client.v2.model.GoogleChatUpdateOrganizationHandleRequestData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GoogleChatIntegrationApi apiInstance = new GoogleChatIntegrationApi(defaultClient);

    // there is a valid "organization_handle" in the system
    String ORGANIZATION_HANDLE_DATA_ATTRIBUTES_NAME =
        System.getenv("ORGANIZATION_HANDLE_DATA_ATTRIBUTES_NAME");
    String ORGANIZATION_HANDLE_DATA_ID = System.getenv("ORGANIZATION_HANDLE_DATA_ID");

    GoogleChatUpdateOrganizationHandleRequest body =
        new GoogleChatUpdateOrganizationHandleRequest()
            .data(
                new GoogleChatUpdateOrganizationHandleRequestData()
                    .attributes(
                        new GoogleChatUpdateOrganizationHandleRequestAttributes()
                            .name("fake-handle-name--updated")))
            .type(GoogleChatOrganizationHandleType.GOOGLE_CHAT_ORGANIZATION_HANDLE_TYPE);

    try {
      GoogleChatOrganizationHandleResponse result =
          apiInstance.updateOrganizationHandle(
              "e54cb570-c674-529c-769d-84b312288ed7", ORGANIZATION_HANDLE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling GoogleChatIntegrationApi#updateOrganizationHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
