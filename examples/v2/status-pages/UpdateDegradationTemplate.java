// Update degradation template returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.model.CreateDegradationRequestDataAttributesStatus;
import com.datadog.api.client.v2.model.DegradationTemplate;
import com.datadog.api.client.v2.model.PatchDegradationTemplateRequest;
import com.datadog.api.client.v2.model.PatchDegradationTemplateRequestData;
import com.datadog.api.client.v2.model.PatchDegradationTemplateRequestDataAttributes;
import com.datadog.api.client.v2.model.PatchDegradationTemplateRequestDataAttributesComponentsAffectedItems;
import com.datadog.api.client.v2.model.PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus;
import com.datadog.api.client.v2.model.PatchDegradationTemplateRequestDataAttributesUpdatesItems;
import com.datadog.api.client.v2.model.PatchDegradationTemplateRequestDataType;
import java.util.Collections;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    PatchDegradationTemplateRequest body =
        new PatchDegradationTemplateRequest()
            .data(
                new PatchDegradationTemplateRequestData()
                    .attributes(
                        new PatchDegradationTemplateRequestDataAttributes()
                            .componentsAffected(
                                Collections.singletonList(
                                    new PatchDegradationTemplateRequestDataAttributesComponentsAffectedItems()
                                        .id("")
                                        .status(
                                            PatchDegradationTemplateRequestDataAttributesComponentsAffectedItemsStatus
                                                .OPERATIONAL)))
                            .updates(
                                Collections.singletonList(
                                    new PatchDegradationTemplateRequestDataAttributesUpdatesItems()
                                        .status(
                                            CreateDegradationRequestDataAttributesStatus
                                                .INVESTIGATING))))
                    .id("")
                    .type(PatchDegradationTemplateRequestDataType.DEGRADATION_TEMPLATES));

    try {
      DegradationTemplate result =
          apiInstance.updateDegradationTemplate(
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"),
              UUID.fromString("9b1deb4d-3b7d-4bad-9bdd-2b0d7b3dcb6d"),
              body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#updateDegradationTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
