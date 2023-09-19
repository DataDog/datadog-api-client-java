// Create a new RUM application returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumApi;
import com.datadog.api.client.v2.model.RUMApplicationCreate;
import com.datadog.api.client.v2.model.RUMApplicationCreateAttributes;
import com.datadog.api.client.v2.model.RUMApplicationCreateRequest;
import com.datadog.api.client.v2.model.RUMApplicationCreateType;
import com.datadog.api.client.v2.model.RUMApplicationResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    RumApi apiInstance = new RumApi(defaultClient);

    RUMApplicationCreateRequest body =
        new RUMApplicationCreateRequest()
            .data(
                new RUMApplicationCreate()
                    .attributes(
                        new RUMApplicationCreateAttributes()
                            .name("test-rum-5c67ebb32077e1d9")
                            .type("ios"))
                    .type(RUMApplicationCreateType.RUM_APPLICATION_CREATE));

    try {
      RUMApplicationResponse result = apiInstance.createRUMApplication(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumApi#createRUMApplication");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
