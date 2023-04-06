// Add Fastly account returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FastlyIntegrationApi;
import com.datadog.api.client.v2.model.FastlyAccountCreateRequest;
import com.datadog.api.client.v2.model.FastlyAccountCreateRequestAttributes;
import com.datadog.api.client.v2.model.FastlyAccountCreateRequestData;
import com.datadog.api.client.v2.model.FastlyAccountResponse;
import com.datadog.api.client.v2.model.FastlyAccountType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    FastlyIntegrationApi apiInstance = new FastlyIntegrationApi(defaultClient);

    FastlyAccountCreateRequest body =
        new FastlyAccountCreateRequest()
            .data(
                new FastlyAccountCreateRequestData()
                    .attributes(
                        new FastlyAccountCreateRequestAttributes()
                            .apiKey("ExampleFastlyIntegration")
                            .name("Example-Fastly-Integration"))
                    .type(FastlyAccountType.FASTLY_ACCOUNTS));

    try {
      FastlyAccountResponse result = apiInstance.createFastlyAccount(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FastlyIntegrationApi#createFastlyAccount");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
