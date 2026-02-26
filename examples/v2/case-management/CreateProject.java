// Create a project returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.ProjectCreate;
import com.datadog.api.client.v2.model.ProjectCreateAttributes;
import com.datadog.api.client.v2.model.ProjectCreateRequest;
import com.datadog.api.client.v2.model.ProjectResourceType;
import com.datadog.api.client.v2.model.ProjectResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    ProjectCreateRequest body =
        new ProjectCreateRequest()
            .data(
                new ProjectCreate()
                    .attributes(
                        new ProjectCreateAttributes().key("SEC").name("Security Investigation"))
                    .type(ProjectResourceType.PROJECT));

    try {
      ProjectResponse result = apiInstance.createProject(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#createProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
