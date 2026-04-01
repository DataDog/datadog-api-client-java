// Update an incident user-defined field returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldAttributesUpdateRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldCategory;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldCollected;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldResponse;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldType;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldUpdateData;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldUpdateRequest;
import com.datadog.api.client.v2.model.IncidentUserDefinedFieldValidValue;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentUserDefinedField", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    IncidentUserDefinedFieldUpdateRequest body =
        new IncidentUserDefinedFieldUpdateRequest()
            .data(
                new IncidentUserDefinedFieldUpdateData()
                    .attributes(
                        new IncidentUserDefinedFieldAttributesUpdateRequest()
                            .category(IncidentUserDefinedFieldCategory.WHAT_HAPPENED)
                            .collected(IncidentUserDefinedFieldCollected.ACTIVE)
                            .defaultValue("critical")
                            .displayName("Root Cause")
                            .ordinal("1.5")
                            .required(false)
                            .validValues(
                                Collections.singletonList(
                                    new IncidentUserDefinedFieldValidValue()
                                        .description("A critical severity incident.")
                                        .displayName("Critical")
                                        .shortDescription("Critical")
                                        .value("critical"))))
                    .id("00000000-0000-0000-0000-000000000000")
                    .type(IncidentUserDefinedFieldType.USER_DEFINED_FIELD));

    try {
      IncidentUserDefinedFieldResponse result =
          apiInstance.updateIncidentUserDefinedField("00000000-0000-0000-0000-000000000000", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentUserDefinedField");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
