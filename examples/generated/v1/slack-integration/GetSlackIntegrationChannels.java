import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SlackIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    SlackIntegrationApi apiInstance = new SlackIntegrationApi(defaultClient);
    String accountName = "accountName_example"; // String | Your Slack account name.
    try {
      List<SlackIntegrationChannel> result = apiInstance.getSlackIntegrationChannels(accountName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SlackIntegrationApi#getSlackIntegrationChannels");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
