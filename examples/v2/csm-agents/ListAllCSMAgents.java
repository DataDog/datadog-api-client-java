// Get all CSM Agents returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CsmAgentsApi;
import com.datadog.api.client.v2.model.CsmAgentsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CsmAgentsApi apiInstance = new CsmAgentsApi(defaultClient);

    try {
      CsmAgentsResponse result = apiInstance.listAllCSMAgents();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CsmAgentsApi#listAllCSMAgents");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
