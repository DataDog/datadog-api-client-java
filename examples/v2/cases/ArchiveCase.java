// Archive case returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CasesApi;
import com.datadog.api.client.v2.model.CaseEmpty;
import com.datadog.api.client.v2.model.CaseEmptyRequest;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.CaseResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CasesApi apiInstance = new CasesApi(defaultClient);

    // there is a valid "case" in the system
    String CASE_ID = System.getenv("CASE_ID");

    CaseEmptyRequest body =
        new CaseEmptyRequest().data(new CaseEmpty().type(CaseResourceType.CASE));

    try {
      CaseResponse result = apiInstance.archiveCase(CASE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CasesApi#archiveCase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
