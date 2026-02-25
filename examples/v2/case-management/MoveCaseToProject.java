// Update case project returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.ProjectRelationship;
import com.datadog.api.client.v2.model.ProjectRelationshipData;
import com.datadog.api.client.v2.model.ProjectResourceType;
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
    defaultClient.setUnstableOperationEnabled("v2.moveCaseToProject", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    ProjectRelationship body = new ProjectRelationship()
.data(new ProjectRelationshipData()
.id("e555e290-ed65-49bd-ae18-8acbfcf18db7")
.type(ProjectResourceType.PROJECT));

    try {
      CaseResponse result = apiInstance.moveCaseToProject("f98a5a5b-e0ff-45d4-b2f5-afe6e74de504", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#moveCaseToProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}