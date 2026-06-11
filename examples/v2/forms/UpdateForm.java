// Update a form returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FormsApi;
import com.datadog.api.client.v2.model.FormDatastoreConfigAttributes;
import com.datadog.api.client.v2.model.FormResponse;
import com.datadog.api.client.v2.model.FormType;
import com.datadog.api.client.v2.model.FormUpdateAttributes;
import com.datadog.api.client.v2.model.UpdateFormData;
import com.datadog.api.client.v2.model.UpdateFormDataAttributes;
import com.datadog.api.client.v2.model.UpdateFormRequest;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateForm", true);
    FormsApi apiInstance = new FormsApi(defaultClient);

    // there is a valid "form" in the system
    UUID FORM_DATA_ID = null;
    try {
      FORM_DATA_ID = UUID.fromString(System.getenv("FORM_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    UpdateFormRequest body =
        new UpdateFormRequest()
            .data(
                new UpdateFormData()
                    .attributes(
                        new UpdateFormDataAttributes()
                            .formUpdate(
                                new FormUpdateAttributes()
                                    .datastoreConfig(
                                        new FormDatastoreConfigAttributes()
                                            .datastoreId(
                                                UUID.fromString(
                                                    "5108ea24-dd83-4696-9caa-f069f73d0fad"))
                                            .primaryColumnName("id")
                                            .primaryKeyGenerationStrategy("none"))
                                    .description("An updated description.")
                                    .name("Updated Form Name")))
                    .id(FORM_DATA_ID)
                    .type(FormType.FORMS));

    try {
      FormResponse result = apiInstance.updateForm(FORM_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormsApi#updateForm");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
