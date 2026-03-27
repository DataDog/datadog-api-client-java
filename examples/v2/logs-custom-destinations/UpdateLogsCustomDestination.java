// Update a custom destination returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LogsCustomDestinationsApi;
import com.datadog.api.client.v2.model.CustomDestinationAttributeTagsRestrictionListType;
import com.datadog.api.client.v2.model.CustomDestinationResponse;
import com.datadog.api.client.v2.model.CustomDestinationType;
import com.datadog.api.client.v2.model.CustomDestinationUpdateRequest;
import com.datadog.api.client.v2.model.CustomDestinationUpdateRequestAttributes;
import com.datadog.api.client.v2.model.CustomDestinationUpdateRequestDefinition;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    LogsCustomDestinationsApi apiInstance = new LogsCustomDestinationsApi(defaultClient);

    // there is a valid "custom_destination" in the system
    String CUSTOM_DESTINATION_DATA_ID = System.getenv("CUSTOM_DESTINATION_DATA_ID");

    CustomDestinationUpdateRequest body =
        new CustomDestinationUpdateRequest()
            .data(
                new CustomDestinationUpdateRequestDefinition()
                    .attributes(
                        new CustomDestinationUpdateRequestAttributes()
                            .name("Nginx logs (Updated)")
                            .query("source:nginx")
                            .enabled(false)
                            .forwardTags(false)
                            .forwardTagsRestrictionListType(
                                CustomDestinationAttributeTagsRestrictionListType.BLOCK_LIST))
                    .type(CustomDestinationType.CUSTOM_DESTINATION)
                    .id(CUSTOM_DESTINATION_DATA_ID));

    try {
      CustomDestinationResponse result =
          apiInstance.updateLogsCustomDestination(CUSTOM_DESTINATION_DATA_ID, body);
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
