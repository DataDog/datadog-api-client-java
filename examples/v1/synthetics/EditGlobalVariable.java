// Edit a global variable returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.SyntheticsGlobalVariable;
import com.datadog.api.v1.client.model.SyntheticsGlobalVariableAttributes;
import com.datadog.api.v1.client.model.SyntheticsGlobalVariableParseTestOptions;
import com.datadog.api.v1.client.model.SyntheticsGlobalVariableParseTestOptionsType;
import com.datadog.api.v1.client.model.SyntheticsGlobalVariableParserType;
import com.datadog.api.v1.client.model.SyntheticsGlobalVariableValue;
import com.datadog.api.v1.client.model.SyntheticsVariableParser;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
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
      SyntheticsGlobalVariable result = apiInstance.editGlobalVariable("variable_id", body);
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
