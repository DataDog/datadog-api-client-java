// Update the RUM configuration returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumConfigApi;
import com.datadog.api.client.v2.model.RumConfigResponse;
import com.datadog.api.client.v2.model.RumConfigType;
import com.datadog.api.client.v2.model.RumConfigUpdateAttributes;
import com.datadog.api.client.v2.model.RumConfigUpdateData;
import com.datadog.api.client.v2.model.RumConfigUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateRumConfig", true);
    RumConfigApi apiInstance = new RumConfigApi(defaultClient);

    RumConfigUpdateRequest body =
        new RumConfigUpdateRequest()
            .data(
                new RumConfigUpdateData()
                    .attributes(new RumConfigUpdateAttributes().enforcedApplicationTags(true))
                    .type(RumConfigType.RUM_CONFIG));

    try {
      RumConfigResponse result = apiInstance.updateRumConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumConfigApi#updateRumConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
