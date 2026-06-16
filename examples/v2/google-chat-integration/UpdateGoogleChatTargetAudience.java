// Update a target audience returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.GoogleChatIntegrationApi;
import com.datadog.api.client.v2.model.GoogleChatTargetAudienceResponse;
import com.datadog.api.client.v2.model.GoogleChatTargetAudienceType;
import com.datadog.api.client.v2.model.GoogleChatTargetAudienceUpdateRequest;
import com.datadog.api.client.v2.model.GoogleChatTargetAudienceUpdateRequestAttributes;
import com.datadog.api.client.v2.model.GoogleChatTargetAudienceUpdateRequestData;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    GoogleChatIntegrationApi apiInstance = new GoogleChatIntegrationApi(defaultClient);

    GoogleChatTargetAudienceUpdateRequest body =
        new GoogleChatTargetAudienceUpdateRequest()
            .data(
                new GoogleChatTargetAudienceUpdateRequestData()
                    .attributes(
                        new GoogleChatTargetAudienceUpdateRequestAttributes()
                            .audienceId("fake-audience-id-1")
                            .audienceName("fake audience name 1"))
                    .type(GoogleChatTargetAudienceType.GOOGLE_CHAT_TARGET_AUDIENCE_TYPE));

    try {
      GoogleChatTargetAudienceResponse result =
          apiInstance.updateGoogleChatTargetAudience(
              "organization_binding_id", "target_audience_id", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling GoogleChatIntegrationApi#updateGoogleChatTargetAudience");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
