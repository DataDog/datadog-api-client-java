// List forms returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.FormsApi;
import com.datadog.api.client.v2.model.FormsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listForms", true);
    FormsApi apiInstance = new FormsApi(defaultClient);

    try {
      FormsResponse result = apiInstance.listForms();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FormsApi#listForms");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
