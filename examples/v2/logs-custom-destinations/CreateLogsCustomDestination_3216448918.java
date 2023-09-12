// Create a custom destination with HTTP basic auth forwarding returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsCustomDestinationsApi;
import com.datadog.api.client.v2.model.CustomDestinationAttributes;
import com.datadog.api.client.v2.model.CustomDestinationCreatePayload;
import com.datadog.api.client.v2.model.CustomDestinationForwarderDestination;
import com.datadog.api.client.v2.model.CustomDestinationResponse;
import com.datadog.api.client.v2.model.CustomDestinationWithoutId;
import com.datadog.api.client.v2.model.HttpDestination;
import com.datadog.api.client.v2.model.HttpDestinationAuth;
import com.datadog.api.client.v2.model.HttpDestinationBasicAuth;
import com.datadog.api.client.v2.model.HttpDestinationBasicAuthType;
import com.datadog.api.client.v2.model.HttpDestinationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createLogsCustomDestination", true);
    LogsCustomDestinationsApi apiInstance = new LogsCustomDestinationsApi(defaultClient);

    CustomDestinationCreatePayload body =
        new CustomDestinationCreatePayload()
            .data(
                new CustomDestinationWithoutId()
                    .attributes(
                        new CustomDestinationAttributes()
                            .name("my-destination")
                            .version(0L)
                            .forwarderDestination(
                                new CustomDestinationForwarderDestination(
                                    new HttpDestination()
                                        .type(HttpDestinationType.HTTP)
                                        .endpoint("https://example.org/my-intake")
                                        .auth(
                                            new HttpDestinationAuth(
                                                new HttpDestinationBasicAuth()
                                                    .type(HttpDestinationBasicAuthType.BASIC)
                                                    .username("username")
                                                    .password("password"))))))
                    .type("custom_destination"));

    try {
      CustomDestinationResponse result = apiInstance.createLogsCustomDestination(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LogsCustomDestinationsApi#createLogsCustomDestination");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
