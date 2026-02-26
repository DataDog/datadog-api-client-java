// Create ServiceNow template returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.ServiceNowIntegrationApi;
import com.datadog.api.client.v2.model.ServiceNowTemplateResponse;
import com.datadog.api.client.v2.model.ServiceNowTemplateCreateRequest;
import com.datadog.api.client.v2.model.ServiceNowTemplateCreateRequestAttributes;
import com.datadog.api.client.v2.model.ServiceNowTemplateCreateRequestData;
import com.datadog.api.client.v2.model.ServiceNowTemplateType;
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
    defaultClient.setUnstableOperationEnabled("v2.createServiceNowTemplate", true);
    ServiceNowIntegrationApi apiInstance = new ServiceNowIntegrationApi(defaultClient);

    ServiceNowTemplateCreateRequest body = new ServiceNowTemplateCreateRequest()
.data(new ServiceNowTemplateCreateRequestData()
.attributes(new ServiceNowTemplateCreateRequestAttributes()
.assignmentGroupId(UUID.fromString("65b3341b-0680-47f9-a6d4-134db45c603e"))
.businessServiceId(UUID.fromString("65b3341b-0680-47f9-a6d4-134db45c603e"))
.fieldsMapping(Map.ofEntries(Map.entry("category", "software"),Map.entry("priority", "1")))
.handleName("incident-template")
.instanceId(UUID.fromString("65b3341b-0680-47f9-a6d4-134db45c603e"))
.servicenowTablename("incident")
.userId(UUID.fromString("65b3341b-0680-47f9-a6d4-134db45c603e")))
.type(ServiceNowTemplateType.SERVICENOW_TEMPLATES));

    try {
      ServiceNowTemplateResponse result = apiInstance.createServiceNowTemplate(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceNowIntegrationApi#createServiceNowTemplate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}