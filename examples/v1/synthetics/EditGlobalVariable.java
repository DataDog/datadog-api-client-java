// Edit a global variable returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariable;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableParseTestOptions;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableParseTestOptionsType;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableValue;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    // there is a valid "synthetics_global_variable" in the system
    String SYNTHETICS_GLOBAL_VARIABLE_ID = System.getenv("SYNTHETICS_GLOBAL_VARIABLE_ID");

    // there is a valid "synthetics_api_test_multi_step" in the system
    String SYNTHETICS_API_TEST_MULTI_STEP_PUBLIC_ID =
        System.getenv("SYNTHETICS_API_TEST_MULTI_STEP_PUBLIC_ID");

    SyntheticsGlobalVariable body =
        new SyntheticsGlobalVariable()
            .description("Updated description.")
            .name("GLOBAL_VARIABLE_PAYLOAD_EXAMPLESYNTHETIC")
            .parseTestOptions(
                new SyntheticsGlobalVariableParseTestOptions()
                    .type(SyntheticsGlobalVariableParseTestOptionsType.LOCAL_VARIABLE)
                    .localVariableName("EXTRACTED_VALUE"))
            .parseTestPublicId(SYNTHETICS_API_TEST_MULTI_STEP_PUBLIC_ID)
            .value(new SyntheticsGlobalVariableValue().secure(false).value(""))
            .tags(Collections.singletonList("test:mytag"));

    try {
      SyntheticsGlobalVariable result =
          apiInstance.editGlobalVariable(SYNTHETICS_GLOBAL_VARIABLE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#editGlobalVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
