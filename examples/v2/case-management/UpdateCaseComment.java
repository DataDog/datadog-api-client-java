// Update case comment returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.CaseUpdateComment;
import com.datadog.api.client.v2.model.CaseUpdateCommentAttributes;
import com.datadog.api.client.v2.model.CaseUpdateCommentRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateCaseComment", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    CaseUpdateCommentRequest body =
        new CaseUpdateCommentRequest()
            .data(
                new CaseUpdateComment()
                    .attributes(new CaseUpdateCommentAttributes().comment("Updated comment text"))
                    .type(CaseResourceType.CASE));

    try {
      apiInstance.updateCaseComment(
          "f98a5a5b-e0ff-45d4-b2f5-afe6e74de504", "f98a5a5b-e0ff-45d4-b2f5-afe6e74de504", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateCaseComment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
