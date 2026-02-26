// Comment case returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseComment;
import com.datadog.api.client.v2.model.CaseCommentAttributes;
import com.datadog.api.client.v2.model.CaseCommentRequest;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.TimelineResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    // there is a valid "case" in the system
    String CASE_ID = System.getenv("CASE_ID");

    CaseCommentRequest body =
        new CaseCommentRequest()
            .data(
                new CaseComment()
                    .attributes(new CaseCommentAttributes().comment("Hello World !"))
                    .type(CaseResourceType.CASE));

    try {
      TimelineResponse result = apiInstance.commentCase(CASE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#commentCase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
