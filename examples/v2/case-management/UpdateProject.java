// Update a project returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.ProjectResourceType;
import com.datadog.api.client.v2.model.ProjectResponse;
import com.datadog.api.client.v2.model.ProjectUpdate;
import com.datadog.api.client.v2.model.ProjectUpdateAttributes;
import com.datadog.api.client.v2.model.ProjectUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    ProjectUpdateRequest body =
        new ProjectUpdateRequest()
            .data(
                new ProjectUpdate()
                    .type(ProjectResourceType.PROJECT)
                    .attributes(
                        new ProjectUpdateAttributes()
                            .name("Updated Project Name Example-Case-Management")));

    try {
      ProjectResponse result =
          apiInstance.updateProject("d4bbe1af-f36e-42f1-87c1-493ca35c320e", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
