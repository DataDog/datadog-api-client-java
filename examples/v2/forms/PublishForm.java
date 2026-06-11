// Publish a form version returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FormsApi;
import com.datadog.api.client.v2.model.FormPublicationResponse;
import com.datadog.api.client.v2.model.FormPublicationType;
import com.datadog.api.client.v2.model.PublishFormData;
import com.datadog.api.client.v2.model.PublishFormDataAttributes;
import com.datadog.api.client.v2.model.PublishFormRequest;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.publishForm", true);
    FormsApi apiInstance = new FormsApi(defaultClient);

    // there is a valid "form" in the system
    UUID FORM_DATA_ID = null;
    try {
      FORM_DATA_ID = UUID.fromString(System.getenv("FORM_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    PublishFormRequest body =
        new PublishFormRequest()
            .data(
                new PublishFormData()
                    .attributes(new PublishFormDataAttributes().version(1L))
                    .type(FormPublicationType.FORM_PUBLICATIONS));

    try {
      FormPublicationResponse result = apiInstance.publishForm(FORM_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormsApi#publishForm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
