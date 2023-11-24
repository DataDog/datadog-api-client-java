// Delete a global variable returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    // there is a valid "synthetics_global_variable" in the system
    String SYNTHETICS_GLOBAL_VARIABLE_ID = System.getenv("SYNTHETICS_GLOBAL_VARIABLE_ID");

    try {
      apiInstance.deleteGlobalVariable(SYNTHETICS_GLOBAL_VARIABLE_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#deleteGlobalVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
