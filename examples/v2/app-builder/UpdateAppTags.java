// Update App Tags returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppBuilderApi;
import com.datadog.api.client.v2.model.AppTagsType;
import com.datadog.api.client.v2.model.UpdateAppTagsRequest;
import com.datadog.api.client.v2.model.UpdateAppTagsRequestData;
import com.datadog.api.client.v2.model.UpdateAppTagsRequestDataAttributes;
import java.util.Arrays;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AppBuilderApi apiInstance = new AppBuilderApi(defaultClient);

    // there is a valid "app" in the system
    UUID APP_DATA_ID = null;
    try {
      APP_DATA_ID = UUID.fromString(System.getenv("APP_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    UpdateAppTagsRequest body =
        new UpdateAppTagsRequest()
            .data(
                new UpdateAppTagsRequestData()
                    .attributes(
                        new UpdateAppTagsRequestDataAttributes()
                            .tags(Arrays.asList("team:platform", "service:ops")))
                    .type(AppTagsType.TAGS));

    try {
      apiInstance.updateAppTags(APP_DATA_ID, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppBuilderApi#updateAppTags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
