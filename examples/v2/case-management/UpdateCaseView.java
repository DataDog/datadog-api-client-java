// Update a case view returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseViewResourceType;
import com.datadog.api.client.v2.model.CaseViewResponse;
import com.datadog.api.client.v2.model.CaseViewUpdate;
import com.datadog.api.client.v2.model.CaseViewUpdateAttributes;
import com.datadog.api.client.v2.model.CaseViewUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateCaseView", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    CaseViewUpdateRequest body =
        new CaseViewUpdateRequest()
            .data(
                new CaseViewUpdate()
                    .attributes(new CaseViewUpdateAttributes())
                    .type(CaseViewResourceType.VIEW));

    try {
      CaseViewResponse result =
          apiInstance.updateCaseView("a1b2c3d4-e5f6-7890-abcd-ef1234567890", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateCaseView");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
