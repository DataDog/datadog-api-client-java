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

    UpdateAppTagsRequest body =
        new UpdateAppTagsRequest()
            .data(
                new UpdateAppTagsRequestData()
                    .attributes(
                        new UpdateAppTagsRequestDataAttributes()
                            .tags(Arrays.asList("team:platform", "service:ops")))
                    .type(AppTagsType.TAGS));

    try {
      apiInstance.updateAppTags(UUID.fromString("65bb1f25-52e1-4510-9f8d-22d1516ed693"), body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppBuilderApi#updateAppTags");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
