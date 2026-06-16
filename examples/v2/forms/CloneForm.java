// Clone a form returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FormsApi;
import com.datadog.api.client.v2.model.CloneFormData;
import com.datadog.api.client.v2.model.CloneFormDataAttributes;
import com.datadog.api.client.v2.model.CloneFormRequest;
import com.datadog.api.client.v2.model.FormResponse;
import com.datadog.api.client.v2.model.FormType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.cloneForm", true);
    FormsApi apiInstance = new FormsApi(defaultClient);

    CloneFormRequest body =
        new CloneFormRequest()
            .data(
                new CloneFormData()
                    .attributes(new CloneFormDataAttributes().name("Copy of My Form"))
                    .type(FormType.FORMS));

    try {
      FormResponse result =
          apiInstance.cloneForm(UUID.fromString("22f6006a-2302-4926-9396-d2dfcf7b0b34"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormsApi#cloneForm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
