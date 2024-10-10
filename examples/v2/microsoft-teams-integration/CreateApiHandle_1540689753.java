// Create api handle returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.MicrosoftTeamsIntegrationApi;
import com.datadog.api.client.v2.model.MicrosoftTeamsApiHandleRequestAttributes;
import com.datadog.api.client.v2.model.MicrosoftTeamsApiHandleRequestData;
import com.datadog.api.client.v2.model.MicrosoftTeamsApiHandleType;
import com.datadog.api.client.v2.model.MicrosoftTeamsCreateApiHandleRequest;
import com.datadog.api.client.v2.model.MicrosoftTeamsCreateApiHandleResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    MicrosoftTeamsIntegrationApi apiInstance = new MicrosoftTeamsIntegrationApi(defaultClient);

    MicrosoftTeamsCreateApiHandleRequest body =
        new MicrosoftTeamsCreateApiHandleRequest()
            .data(
                new MicrosoftTeamsApiHandleRequestData()
                    .attributes(
                        new MicrosoftTeamsApiHandleRequestAttributes()
                            .channelId(
                                "19:iD_D2xy_sAa-JV851JJYwIa6mlW9F9Nxm3SLyZq68qY1@thread.tacv2")
                            .name("Example-Microsoft-Teams-Integration")
                            .teamId("e5f50a58-c929-4fb3-8866-e2cd836de3c2")
                            .tenantId("4d3bac44-0230-4732-9e70-cc00736f0a97"))
                    .type(MicrosoftTeamsApiHandleType.HANDLE));

    try {
      MicrosoftTeamsCreateApiHandleResponse result = apiInstance.createApiHandle(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling MicrosoftTeamsIntegrationApi#createApiHandle");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
