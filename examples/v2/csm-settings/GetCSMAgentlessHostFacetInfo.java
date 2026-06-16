// Get agentless host facet info returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmSettingsApi;
import com.datadog.api.client.v2.model.CsmHostFacetInfoResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getCSMAgentlessHostFacetInfo", true);
    CsmSettingsApi apiInstance = new CsmSettingsApi(defaultClient);

    try {
      CsmHostFacetInfoResponse result = apiInstance.getCSMAgentlessHostFacetInfo("cloud_provider");
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsmSettingsApi#getCSMAgentlessHostFacetInfo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
