// Get the details of a project returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CasesProjectsApi;
import com.datadog.api.client.v2.model.ProjectResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CasesProjectsApi apiInstance = new CasesProjectsApi(defaultClient);

    try {
      ProjectResponse result = apiInstance.getProject("project_id");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CasesProjectsApi#getProject");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
