// List RUM segment templates returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.RumUserSegmentsApi;
import com.datadog.api.client.v2.model.RumSegmentTemplateListResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listRumSegmentTemplates", true);
    RumUserSegmentsApi apiInstance = new RumUserSegmentsApi(defaultClient);

    try {
      RumSegmentTemplateListResponse result = apiInstance.listRumSegmentTemplates();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling RumUserSegmentsApi#listRumSegmentTemplates");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
