// Create investigation notebook for case returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseInvestigationNotebookCreateData;
import com.datadog.api.client.v2.model.CaseInvestigationNotebookCreateRequest;
import com.datadog.api.client.v2.model.CaseInvestigationNotebookResourceType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    CaseInvestigationNotebookCreateRequest body =
        new CaseInvestigationNotebookCreateRequest()
            .data(
                new CaseInvestigationNotebookCreateData()
                    .type(CaseInvestigationNotebookResourceType.NOTEBOOK));

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
