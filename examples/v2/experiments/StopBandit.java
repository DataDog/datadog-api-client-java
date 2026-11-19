// Stop bandit returns "The bandit is stopped and serves the chosen variant." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsStopBanditV2Request;
import com.datadog.api.client.v2.model.ExperimentsStopBanditV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsStopBanditV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsStopBanditV2RequestDataType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    defaultClient.setUnstableOperationEnabled("v2.stopBandit", true);
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    ExperimentsStopBanditV2Request body =
        new ExperimentsStopBanditV2Request()
            .data(
                new ExperimentsStopBanditV2RequestData()
                    .attributes(
                        new ExperimentsStopBanditV2RequestDataAttributes()
                            .servedVariantKey("green"))
                    .type(ExperimentsStopBanditV2RequestDataType.STOP_BANDIT_REQUEST));

    try {
      apiInstance.stopBandit(UUID.fromString("4b1f3c2e-8d5a-4f6b-9c7e-1a2b3c4d5e6f"), body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#stopBandit");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
