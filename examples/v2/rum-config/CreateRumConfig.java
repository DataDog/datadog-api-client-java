// Create the RUM configuration returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumConfigApi;
import com.datadog.api.client.v2.model.RumConfigCreateAttributes;
import com.datadog.api.client.v2.model.RumConfigCreateData;
import com.datadog.api.client.v2.model.RumConfigCreateRequest;
import com.datadog.api.client.v2.model.RumConfigResponse;
import com.datadog.api.client.v2.model.RumConfigType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createRumConfig", true);
    RumConfigApi apiInstance = new RumConfigApi(defaultClient);

    RumConfigCreateRequest body =
        new RumConfigCreateRequest()
            .data(
                new RumConfigCreateData()
                    .attributes(new RumConfigCreateAttributes().enforcedApplicationTags(true))
                    .type(RumConfigType.RUM_CONFIG));

    try {
      RumConfigResponse result = apiInstance.createRumConfig(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumConfigApi#createRumConfig");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
