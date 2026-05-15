// Create Publish Request returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AppBuilderApi;
import com.datadog.api.client.v2.model.CreatePublishRequestRequest;
import com.datadog.api.client.v2.model.CreatePublishRequestRequestData;
import com.datadog.api.client.v2.model.CreatePublishRequestRequestDataAttributes;
import com.datadog.api.client.v2.model.PublishAppResponse;
import com.datadog.api.client.v2.model.PublishRequestType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AppBuilderApi apiInstance = new AppBuilderApi(defaultClient);

    CreatePublishRequestRequest body =
        new CreatePublishRequestRequest()
            .data(
                new CreatePublishRequestRequestData()
                    .attributes(
                        new CreatePublishRequestRequestDataAttributes()
                            .description("Adds new dashboard widgets and a few bug fixes.")
                            .title("Release v1.2 to production"))
                    .type(PublishRequestType.PUBLISHREQUEST));

    try {
      PublishAppResponse result =
          apiInstance.createPublishRequest(
              UUID.fromString("65bb1f25-52e1-4510-9f8d-22d1516ed693"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AppBuilderApi#createPublishRequest");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
