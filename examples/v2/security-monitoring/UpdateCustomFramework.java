// Update a custom framework returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SecurityMonitoringApi;
import com.datadog.api.client.v2.model.CustomFrameworkControl;
import com.datadog.api.client.v2.model.CustomFrameworkData;
import com.datadog.api.client.v2.model.CustomFrameworkDataAttributes;
import com.datadog.api.client.v2.model.CustomFrameworkRequirement;
import com.datadog.api.client.v2.model.CustomFrameworkType;
import com.datadog.api.client.v2.model.RetrieveCustomFrameworkResponse;
import com.datadog.api.client.v2.model.UpdateCustomFrameworkRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateCustomFramework", true);
    SecurityMonitoringApi apiInstance = new SecurityMonitoringApi(defaultClient);

    UpdateCustomFrameworkRequest body =
        new UpdateCustomFrameworkRequest()
            .data(
                new CustomFrameworkData()
                    .attributes(
                        new CustomFrameworkDataAttributes()
                            .handle("")
                            .name("")
                            .requirements(
                                Collections.singletonList(
                                    new CustomFrameworkRequirement()
                                        .controls(
                                            Collections.singletonList(
                                                new CustomFrameworkControl()
                                                    .name("")
                                                    .rulesId(Collections.singletonList(""))))
                                        .name("")))
                            .version(""))
                    .type(CustomFrameworkType.CUSTOM_FRAMEWORK));

    try {
      RetrieveCustomFrameworkResponse result =
          apiInstance.updateCustomFramework("handle", "version", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SecurityMonitoringApi#updateCustomFramework");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
