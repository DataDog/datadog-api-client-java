// Create On-Call Page Comment returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.CreateOnCallPageCommentRequest;
import com.datadog.api.client.v2.model.CreateOnCallPageCommentRequestAttributes;
import com.datadog.api.client.v2.model.CreateOnCallPageCommentRequestData;
import com.datadog.api.client.v2.model.OnCallPageCommentType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    CreateOnCallPageCommentRequest body =
        new CreateOnCallPageCommentRequest()
            .data(
                new CreateOnCallPageCommentRequestData()
                    .attributes(
                        new CreateOnCallPageCommentRequestAttributes()
                            .body("Comment from the API client integration tests."))
                    .id(UUID.fromString("3c5f5b5e-3a3e-4f8c-9b1d-2f6a7e8d9c0b"))
                    .type(OnCallPageCommentType.COMMENTS));

    try {
      apiInstance.createOnCallPageComment("f63eb677-07ce-46ab-b2e0-80ca1ffe91bf", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#createOnCallPageComment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
