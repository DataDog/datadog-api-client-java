// Update case priority returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CasesApi;
import com.datadog.api.client.v2.model.CasePriority;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.CaseUpdatePriority;
import com.datadog.api.client.v2.model.CaseUpdatePriorityAttributes;
import com.datadog.api.client.v2.model.CaseUpdatePriorityRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CasesApi apiInstance = new CasesApi(defaultClient);

    // there is a valid "case" in the system
    String CASE_ID = System.getenv("CASE_ID");

    CaseUpdatePriorityRequest body =
        new CaseUpdatePriorityRequest()
            .data(
                new CaseUpdatePriority()
                    .attributes(new CaseUpdatePriorityAttributes().priority(CasePriority.P3))
                    .type(CaseResourceType.CASE));

    try {
      CaseResponse result = apiInstance.updatePriority(CASE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CasesApi#updatePriority");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
