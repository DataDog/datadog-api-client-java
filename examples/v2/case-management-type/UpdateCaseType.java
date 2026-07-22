// Update a case type returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementTypeApi;
import com.datadog.api.client.v2.model.CaseTypeResourceAttributes;
import com.datadog.api.client.v2.model.CaseTypeResourceType;
import com.datadog.api.client.v2.model.CaseTypeResponse;
import com.datadog.api.client.v2.model.CaseTypeUpdate;
import com.datadog.api.client.v2.model.CaseTypeUpdateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementTypeApi apiInstance = new CaseManagementTypeApi(defaultClient);

    CaseTypeUpdateRequest body =
        new CaseTypeUpdateRequest()
            .data(
                new CaseTypeUpdate()
                    .attributes(
                        new CaseTypeResourceAttributes()
                            .description("Investigations done in case management")
                            .emoji("🕵🏻‍♂️")
                            .name("Investigation"))
                    .type(CaseTypeResourceType.CASE_TYPE));

    try {
      CaseTypeResponse result =
          apiInstance.updateCaseType("f98a5a5b-e0ff-45d4-b2f5-afe6e74de505", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementTypeApi#updateCaseType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
