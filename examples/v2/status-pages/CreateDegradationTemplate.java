// Create degradation template returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.CreateDegradationRequestDataAttributesStatus;
import com.datadog.api.client.v2.model.CreateDegradationTemplateRequest;
import com.datadog.api.client.v2.model.CreateDegradationTemplateRequestData;
import com.datadog.api.client.v2.model.CreateDegradationTemplateRequestDataAttributes;
import com.datadog.api.client.v2.model.CreateDegradationTemplateRequestDataAttributesComponentsAffectedItems;
import com.datadog.api.client.v2.model.CreateDegradationTemplateRequestDataAttributesUpdatesItems;
import com.datadog.api.client.v2.model.DegradationTemplate;
import com.datadog.api.client.v2.model.PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus;
import com.datadog.api.client.v2.model.PatchDegradationTemplateRequestDataType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    CreateDegradationTemplateRequest body =
        new CreateDegradationTemplateRequest()
            .data(
                new CreateDegradationTemplateRequestData()
                    .attributes(
                        new CreateDegradationTemplateRequestDataAttributes()
                            .componentsAffected(
                                Collections.singletonList(
                                    new CreateDegradationTemplateRequestDataAttributesComponentsAffectedItems()
                                        .id("")
                                        .status(
                                            PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus
                                                .OPERATIONAL)))
                            .name("")
                            .updates(
                                Collections.singletonList(
                                    new CreateDegradationTemplateRequestDataAttributesUpdatesItems()
                                        .status(
                                            CreateDegradationRequestDataAttributesStatus
                                                .INVESTIGATING))))
                    .type(PatchDegradationTemplateRequestDataType.DEGRADATION_TEMPLATES));

    try {
      DegradationTemplate result =
          apiInstance.createDegradationTemplate(
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#createDegradationTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
