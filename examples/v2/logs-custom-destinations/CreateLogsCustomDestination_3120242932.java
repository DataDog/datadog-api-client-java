// Create a Splunk custom destination with an empty string sourcetype returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsCustomDestinationsApi;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequest;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequestAttributes;
import com.datadog.api.client.v2.model.CustomDestinationCreateRequestDefinition;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestination;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestinationSplunk;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestinationSplunkType;
import com.datadog.api.client.v2.model.CustomDestinationResponse;
import com.datadog.api.client.v2.model.CustomDestinationType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    LogsCustomDestinationsApi apiInstance = new LogsCustomDestinationsApi(defaultClient);

    CustomDestinationCreateRequest body =
        new CustomDestinationCreateRequest()
            .data(
                new CustomDestinationCreateRequestDefinition()
                    .attributes(
                        new CustomDestinationCreateRequestAttributes()
                            .enabled(false)
                            .forwardTags(false)
                            .forwarderDestination(
                                new CustomDestinationForwardDestination(
                                    new CustomDestinationForwardDestinationSplunk()
                                        .accessToken("my-access-token")
                                        .endpoint("https://example.com")
                                        .type(
                                            CustomDestinationForwardDestinationSplunkType
                                                .SPLUNK_HEC)
                                        .sourcetype("")))
                            .name("Nginx logs")
                            .query("source:nginx"))
                    .type(CustomDestinationType.CUSTOM_DESTINATION));

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
