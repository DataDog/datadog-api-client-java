// Create a global variable returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariable;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableAttributes;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableParseTestOptions;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableParseTestOptionsType;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableParserType;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableValue;
import com.datadog.api.client.v1.model.SyntheticsVariableParser;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsGlobalVariable body =
        new SyntheticsGlobalVariable()
            .attributes(
                new SyntheticsGlobalVariableAttributes()
                    .restrictedRoles(
                        Collections.singletonList("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")))
            .description("Example description")
            .name("MY_VARIABLE")
            .parseTestOptions(
                new SyntheticsGlobalVariableParseTestOptions()
                    .field("content-type")
                    .parser(
                        new SyntheticsVariableParser()
                            .type(SyntheticsGlobalVariableParserType.REGEX)
                            .value(".*"))
                    .type(SyntheticsGlobalVariableParseTestOptionsType.HTTP_BODY))
            .parseTestPublicId("abc-def-123")
            .tags(Arrays.asList("team:front", "test:workflow-1"))
            .value(new SyntheticsGlobalVariableValue().secure(true).value("value"));

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
