// Update a custom framework returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.FrameworkControl;
import com.datadog.api.client.v2.model.FrameworkRequirement;
import com.datadog.api.client.v2.model.UpdateCustomFrameworkRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateCustomFramework", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    UpdateCustomFrameworkRequest body =
        new UpdateCustomFrameworkRequest()
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
      apiInstance.updateCustomFramework("handle", "version", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#updateCustomFramework");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
