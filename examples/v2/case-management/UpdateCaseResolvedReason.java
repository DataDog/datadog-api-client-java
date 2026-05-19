// Update case resolved reason returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.CaseUpdateResolvedReason;
import com.datadog.api.client.v2.model.CaseUpdateResolvedReasonAttributes;
import com.datadog.api.client.v2.model.CaseUpdateResolvedReasonRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateCaseResolvedReason", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    CaseUpdateResolvedReasonRequest body =
        new CaseUpdateResolvedReasonRequest()
            .data(
                new CaseUpdateResolvedReason()
                    .attributes(
                        new CaseUpdateResolvedReasonAttributes()
                            .securityResolvedReason("FALSE_POSITIVE"))
                    .type(CaseResourceType.CASE));

    try {
      CaseResponse result =
          apiInstance.updateCaseResolvedReason("f98a5a5b-e0ff-45d4-b2f5-afe6e74de504", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#updateCaseResolvedReason");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
