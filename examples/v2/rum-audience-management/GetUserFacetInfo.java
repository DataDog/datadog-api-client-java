// Get user facet info returns "Successful response with facet information" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumAudienceManagementApi;
import com.datadog.api.client.v2.model.FacetInfoRequest;
import com.datadog.api.client.v2.model.FacetInfoRequestData;
import com.datadog.api.client.v2.model.FacetInfoRequestDataAttributes;
import com.datadog.api.client.v2.model.FacetInfoRequestDataAttributesSearch;
import com.datadog.api.client.v2.model.FacetInfoRequestDataAttributesTermSearch;
import com.datadog.api.client.v2.model.FacetInfoRequestDataType;
import com.datadog.api.client.v2.model.FacetInfoResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getUserFacetInfo", true);
    RumAudienceManagementApi apiInstance = new RumAudienceManagementApi(defaultClient);

    FacetInfoRequest body =
        new FacetInfoRequest()
            .data(
                new FacetInfoRequestData()
                    .attributes(
                        new FacetInfoRequestDataAttributes()
                            .facetId("first_browser_name")
                            .limit(10L)
                            .search(
                                new FacetInfoRequestDataAttributesSearch()
                                    .query("user_org_id:5001 AND first_country_code:US"))
                            .termSearch(
                                new FacetInfoRequestDataAttributesTermSearch().value("Chrome")))
                    .id("facet_info_request")
                    .type(FacetInfoRequestDataType.USERS_FACET_INFO_REQUEST));

    try {
      FacetInfoResponse result = apiInstance.getUserFacetInfo(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumAudienceManagementApi#getUserFacetInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
