// Update a custom destination returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsCustomDestinationsApi;
import com.datadog.api.client.v2.model.CustomDestination;
import com.datadog.api.client.v2.model.CustomDestinationAttributes;
import com.datadog.api.client.v2.model.CustomDestinationForwarderDestination;
import com.datadog.api.client.v2.model.CustomDestinationResponse;
import com.datadog.api.client.v2.model.CustomDestinationType;
import com.datadog.api.client.v2.model.CustomDestinationUpdateRequest;
import com.datadog.api.client.v2.model.HttpDestination;
import com.datadog.api.client.v2.model.HttpDestinationAuth;
import com.datadog.api.client.v2.model.HttpDestinationBasicAuth;
import com.datadog.api.client.v2.model.HttpDestinationBasicAuthType;
import com.datadog.api.client.v2.model.HttpDestinationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateLogsCustomDestination", true);
    LogsCustomDestinationsApi apiInstance = new LogsCustomDestinationsApi(defaultClient);

    // there is a valid "logs_custom_destination" in the system
    String LOGS_CUSTOM_DESTINATION_DATA_ATTRIBUTES_NAME =
        System.getenv("LOGS_CUSTOM_DESTINATION_DATA_ATTRIBUTES_NAME");
    String LOGS_CUSTOM_DESTINATION_DATA_ID = System.getenv("LOGS_CUSTOM_DESTINATION_DATA_ID");

    CustomDestinationUpdateRequest body =
        new CustomDestinationUpdateRequest()
            .data(
                new CustomDestination()
                    .id(LOGS_CUSTOM_DESTINATION_DATA_ID)
                    .attributes(
                        new CustomDestinationAttributes()
                            .name("my-destination--updated-name")
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
                    .type(CustomDestinationType.CUSTOM_DESTINATION));

    try {
      CustomDestinationResponse result =
          apiInstance.updateLogsCustomDestination(LOGS_CUSTOM_DESTINATION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling LogsCustomDestinationsApi#updateLogsCustomDestination");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
