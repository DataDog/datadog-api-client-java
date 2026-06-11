// Create a target audience returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GoogleChatIntegrationApi;
import com.datadog.api.client.v2.model.GoogleChatTargetAudienceCreateRequest;
import com.datadog.api.client.v2.model.GoogleChatTargetAudienceCreateRequestAttributes;
import com.datadog.api.client.v2.model.GoogleChatTargetAudienceCreateRequestData;
import com.datadog.api.client.v2.model.GoogleChatTargetAudienceResponse;
import com.datadog.api.client.v2.model.GoogleChatTargetAudienceType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GoogleChatIntegrationApi apiInstance = new GoogleChatIntegrationApi(defaultClient);

    GoogleChatTargetAudienceCreateRequest body =
        new GoogleChatTargetAudienceCreateRequest()
            .data(
                new GoogleChatTargetAudienceCreateRequestData()
                    .attributes(
                        new GoogleChatTargetAudienceCreateRequestAttributes()
                            .audienceId("fake-audience-id-1")
                            .audienceName("fake audience name 1"))
                    .type(GoogleChatTargetAudienceType.GOOGLE_CHAT_TARGET_AUDIENCE_TYPE));

    try {
      GoogleChatTargetAudienceResponse result =
          apiInstance.createGoogleChatTargetAudience("organization_binding_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling GoogleChatIntegrationApi#createGoogleChatTargetAudience");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
