// Update case due date returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.CaseUpdateDueDate;
import com.datadog.api.client.v2.model.CaseUpdateDueDateAttributes;
import com.datadog.api.client.v2.model.CaseUpdateDueDateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    CaseUpdateDueDateRequest body =
        new CaseUpdateDueDateRequest()
            .data(
                new CaseUpdateDueDate()
                    .attributes(new CaseUpdateDueDateAttributes().dueDate("2026-12-31"))
                    .type(CaseResourceType.CASE));

    try {
      CaseResponse result =
          apiInstance.updateCaseDueDate("f98a5a5b-e0ff-45d4-b2f5-afe6e74de504", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateCaseDueDate");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
