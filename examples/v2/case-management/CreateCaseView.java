// Create a case view returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseViewCreate;
import com.datadog.api.client.v2.model.CaseViewCreateAttributes;
import com.datadog.api.client.v2.model.CaseViewCreateRequest;
import com.datadog.api.client.v2.model.CaseViewResourceType;
import com.datadog.api.client.v2.model.CaseViewResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    CaseViewCreateRequest body =
        new CaseViewCreateRequest()
            .data(
                new CaseViewCreate()
                    .attributes(
                        new CaseViewCreateAttributes()
                            .name("Open bugs")
                            .projectId("e555e290-ed65-49bd-ae18-8acbfcf18db7")
                            .query("status:open type:bug"))
                    .type(CaseViewResourceType.VIEW));

    try {
      CaseViewResponse result = apiInstance.createCaseView(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#createCaseView");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
