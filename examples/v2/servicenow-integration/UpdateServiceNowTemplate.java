// Update ServiceNow template returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ServiceNowIntegrationApi;
import com.datadog.api.client.v2.model.ServiceNowTemplateResponse;
import com.datadog.api.client.v2.model.ServiceNowTemplateType;
import com.datadog.api.client.v2.model.ServiceNowTemplateUpdateRequest;
import com.datadog.api.client.v2.model.ServiceNowTemplateUpdateRequestAttributes;
import com.datadog.api.client.v2.model.ServiceNowTemplateUpdateRequestData;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateServiceNowTemplate", true);
    ServiceNowIntegrationApi apiInstance = new ServiceNowIntegrationApi(defaultClient);

    ServiceNowTemplateUpdateRequest body = new ServiceNowTemplateUpdateRequest()
.data(new ServiceNowTemplateUpdateRequestData()
.attributes(new ServiceNowTemplateUpdateRequestAttributes()
.assignmentGroupId(UUID.fromString("65b3341b-0680-47f9-a6d4-134db45c603e"))
.businessServiceId(UUID.fromString("65b3341b-0680-47f9-a6d4-134db45c603e"))
.fieldsMapping(Map.ofEntries(Map.entry("category", "hardware"),Map.entry("priority", "2")))
.handleName("incident-template-updated")
.instanceId(UUID.fromString("65b3341b-0680-47f9-a6d4-134db45c603e"))
.servicenowTablename("incident")
.userId(UUID.fromString("65b3341b-0680-47f9-a6d4-134db45c603e")))
.type(ServiceNowTemplateType.SERVICENOW_TEMPLATES));

    try {
      ServiceNowTemplateResponse result = apiInstance.updateServiceNowTemplate(UUID.fromString("65b3341b-0680-47f9-a6d4-134db45c603e"), body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceNowIntegrationApi#updateServiceNowTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}