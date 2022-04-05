import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SlackIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SlackIntegrationApi apiInstance = new SlackIntegrationApi(defaultClient);
        String accountName = "accountName_example"; // String | Your Slack account name.
        String channelName = "channelName_example"; // String | The name of the Slack channel being operated on.
        try {
            apiInstance.removeSlackIntegrationChannel(accountName, channelName);
        } catch (ApiException e) {
            System.err.println("Exception when calling SlackIntegrationApi#removeSlackIntegrationChannel");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
