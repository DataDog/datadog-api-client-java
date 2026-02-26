// Update a Slack integration channel returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SlackIntegrationApi;
import com.datadog.api.client.v1.model.SlackIntegrationChannel;
import com.datadog.api.client.v1.model.SlackIntegrationChannelDisplay;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SlackIntegrationApi apiInstance = new SlackIntegrationApi(defaultClient);

    SlackIntegrationChannel body =
        new SlackIntegrationChannel()
            .display(
                new SlackIntegrationChannelDisplay()
                    .message(true)
                    .muteButtons(false)
                    .notified(true)
                    .snapshot(true)
                    .tags(true))
            .name("#general");

    try {
      SlackIntegrationChannel result =
          apiInstance.updateSlackIntegrationChannel("account_name", "channel_name", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SlackIntegrationApi#updateSlackIntegrationChannel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
