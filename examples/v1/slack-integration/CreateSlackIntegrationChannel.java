// Create a Slack integration channel returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SlackIntegrationApi;
import com.datadog.api.v1.client.model.SlackIntegrationChannel;
import com.datadog.api.v1.client.model.SlackIntegrationChannelDisplay;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SlackIntegrationApi apiInstance = new SlackIntegrationApi(defaultClient);

    SlackIntegrationChannel body =
        new SlackIntegrationChannel()
            .display(
                new SlackIntegrationChannelDisplay()
                    .message(true)
                    .notified(true)
                    .snapshot(true)
                    .tags(true))
            .name("#general");

    try {
      SlackIntegrationChannel result =
          apiInstance.createSlackIntegrationChannel("account_name", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling SlackIntegrationApi#createSlackIntegrationChannel");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
