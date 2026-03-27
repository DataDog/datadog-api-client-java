// Link incident to case returns "Created" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.IncidentRelationshipData;
import com.datadog.api.client.v2.model.IncidentResourceType;
import com.datadog.api.client.v2.model.RelationshipToIncidentRequest;
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
    defaultClient.setUnstableOperationEnabled("v2.linkIncident", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    RelationshipToIncidentRequest body = new RelationshipToIncidentRequest()
.data(new IncidentRelationshipData()
.id("00000000-0000-0000-0000-000000000000")
.type(IncidentResourceType.INCIDENTS));

    try {
      CaseResponse result = apiInstance.linkIncident("f98a5a5b-e0ff-45d4-b2f5-afe6e74de504", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#linkIncident");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}