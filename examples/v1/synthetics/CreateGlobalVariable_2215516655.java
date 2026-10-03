// Create a persistent email global variable returns a generated address

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariable;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsGlobalVariableRequest body =
        new SyntheticsGlobalVariableRequest()
            .name("PERSISTENT_EMAIL_EXAMPLESYNTHETIC")
            .description("Persistent email variable")
            .isEmail(true);

    try {
      SyntheticsGlobalVariable result = apiInstance.createGlobalVariable(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#createGlobalVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
