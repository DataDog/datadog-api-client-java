// Assign case returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CasesApi;
import com.datadog.api.client.v2.model.CaseAssign;
import com.datadog.api.client.v2.model.CaseAssignAttributes;
import com.datadog.api.client.v2.model.CaseAssignRequest;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.CaseResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CasesApi apiInstance = new CasesApi(defaultClient);

    // there is a valid "case" in the system
    String CASE_ID = System.getenv("CASE_ID");

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    CaseAssignRequest body =
        new CaseAssignRequest()
            .data(
                new CaseAssign()
                    .attributes(new CaseAssignAttributes().assigneeId(USER_DATA_ID))
                    .type(CaseResourceType.CASE));

    try {
      CaseResponse result = apiInstance.assignCase(CASE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CasesApi#assignCase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
