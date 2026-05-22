// List test examples returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.TestExamplesApi;
import com.datadog.api.client.v2.model.TestExamplesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    TestExamplesApi apiInstance = new TestExamplesApi(defaultClient);

    try {
      TestExamplesResponse result = apiInstance.listTestExamples();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TestExamplesApi#listTestExamples");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
