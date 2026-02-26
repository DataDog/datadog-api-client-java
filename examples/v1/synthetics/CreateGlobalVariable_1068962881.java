// Create a global variable from test returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariable;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableParseTestOptions;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableParseTestOptionsType;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableRequest;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableValue;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    // there is a valid "synthetics_api_test_multi_step" in the system
    String SYNTHETICS_API_TEST_MULTI_STEP_PUBLIC_ID =
        System.getenv("SYNTHETICS_API_TEST_MULTI_STEP_PUBLIC_ID");

    SyntheticsGlobalVariableRequest body =
        new SyntheticsGlobalVariableRequest()
            .description("")
            .name("GLOBAL_VARIABLE_FROM_TEST_PAYLOAD_EXAMPLESYNTHETIC")
            .value(new SyntheticsGlobalVariableValue().secure(false).value(""))
            .parseTestPublicId(SYNTHETICS_API_TEST_MULTI_STEP_PUBLIC_ID)
            .parseTestOptions(
                new SyntheticsGlobalVariableParseTestOptions()
                    .type(SyntheticsGlobalVariableParseTestOptionsType.LOCAL_VARIABLE)
                    .localVariableName("EXTRACTED_VALUE"));

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
