// Bulk update cases returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseBulkActionType;
import com.datadog.api.client.v2.model.CaseBulkResourceType;
import com.datadog.api.client.v2.model.CaseBulkUpdateRequest;
import com.datadog.api.client.v2.model.CaseBulkUpdateRequestAttributes;
import com.datadog.api.client.v2.model.CaseBulkUpdateRequestData;
import java.util.Arrays;
import java.util.Map;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.bulkUpdateCases", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    CaseBulkUpdateRequest body =
        new CaseBulkUpdateRequest()
            .data(
                new CaseBulkUpdateRequestData()
                    .attributes(
                        new CaseBulkUpdateRequestAttributes()
                            .caseIds(Arrays.asList("case-id-1", "case-id-2"))
                            .payload(Map.ofEntries(Map.entry("priority", "P1")))
                            .type(CaseBulkActionType.PRIORITY))
                    .type(CaseBulkResourceType.BULK));

    try {
      apiInstance.bulkUpdateCases(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#bulkUpdateCases");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
