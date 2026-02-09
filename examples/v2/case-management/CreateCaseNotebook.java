// Create investigation notebook for case returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.NotebookCreateData;
import com.datadog.api.client.v2.model.NotebookCreateRequest;
import com.datadog.api.client.v2.model.NotebookResourceType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createCaseNotebook", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    NotebookCreateRequest body =
        new NotebookCreateRequest()
            .data(new NotebookCreateData().type(NotebookResourceType.NOTEBOOK));

    try {
      apiInstance.createCaseNotebook("f98a5a5b-e0ff-45d4-b2f5-afe6e74de504", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#createCaseNotebook");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
