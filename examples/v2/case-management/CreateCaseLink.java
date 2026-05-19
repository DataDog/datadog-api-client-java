// Create a case link returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseLinkAttributes;
import com.datadog.api.client.v2.model.CaseLinkCreate;
import com.datadog.api.client.v2.model.CaseLinkCreateRequest;
import com.datadog.api.client.v2.model.CaseLinkResourceType;
import com.datadog.api.client.v2.model.CaseLinkResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createCaseLink", true);
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    CaseLinkCreateRequest body =
        new CaseLinkCreateRequest()
            .data(
                new CaseLinkCreate()
                    .attributes(
                        new CaseLinkAttributes()
                            .childEntityId("4417921d-0866-4a38-822c-6f2a0f65f77d")
                            .childEntityType("CASE")
                            .parentEntityId("bf0cbac6-4c16-4cfb-b6bf-ca5e0ec37a4f")
                            .parentEntityType("CASE")
                            .relationship("BLOCKS"))
                    .type(CaseLinkResourceType.LINK));

    try {
      CaseLinkResponse result = apiInstance.createCaseLink(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#createCaseLink");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
