// Update a Splunk custom destination's destination preserves the sourcetype returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsCustomDestinationsApi;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestination;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestinationSplunk;
import com.datadog.api.client.v2.model.CustomDestinationForwardDestinationSplunkType;
import com.datadog.api.client.v2.model.CustomDestinationResponse;
import com.datadog.api.client.v2.model.CustomDestinationType;
import com.datadog.api.client.v2.model.CustomDestinationUpdateRequest;
import com.datadog.api.client.v2.model.CustomDestinationUpdateRequestAttributes;
import com.datadog.api.client.v2.model.CustomDestinationUpdateRequestDefinition;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    LogsCustomDestinationsApi apiInstance = new LogsCustomDestinationsApi(defaultClient);

    // there is a valid "custom_destination_splunk_with_sourcetype" in the system
    String CUSTOM_DESTINATION_SPLUNK_WITH_SOURCETYPE_DATA_ID =
        System.getenv("CUSTOM_DESTINATION_SPLUNK_WITH_SOURCETYPE_DATA_ID");

    CustomDestinationUpdateRequest body =
        new CustomDestinationUpdateRequest()
            .data(
                new CustomDestinationUpdateRequestDefinition()
                    .attributes(
                        new CustomDestinationUpdateRequestAttributes()
                            .forwarderDestination(
                                new CustomDestinationForwardDestination(
                                    new CustomDestinationForwardDestinationSplunk()
                                        .type(
                                            CustomDestinationForwardDestinationSplunkType
                                                .SPLUNK_HEC)
                                        .endpoint("https://updated-example.com")
                                        .accessToken("my-access-token"))))
                    .type(CustomDestinationType.CUSTOM_DESTINATION)
                    .id(CUSTOM_DESTINATION_SPLUNK_WITH_SOURCETYPE_DATA_ID));

    try {
      CustomDestinationResponse result =
          apiInstance.updateLogsCustomDestination(
              CUSTOM_DESTINATION_SPLUNK_WITH_SOURCETYPE_DATA_ID, body);
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
