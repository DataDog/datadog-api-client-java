// Create a custom framework returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CreateCustomFrameworkRequest;
import com.datadog.api.client.v2.model.FrameworkControl;
import com.datadog.api.client.v2.model.FrameworkRequirement;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    CreateCustomFrameworkRequest body =
        new CreateCustomFrameworkRequest()
            .handle("")
            .name("")
            .requirements(
                Collections.singletonList(
                    new FrameworkRequirement()
                        .controls(
                            Collections.singletonList(
                                new FrameworkControl()
                                    .name("")
                                    .ruleIds(Collections.singletonList(""))))
                        .name("")))
            .version("");

    try {
      apiInstance.createCustomFramework(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#createCustomFramework");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
