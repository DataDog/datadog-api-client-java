// Edit a global variable returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariable;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableAttributes;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableParserType;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableParseTestOptions;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableParseTestOptionsType;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableRequest;
import com.datadog.api.client.v1.model.SyntheticsGlobalVariableValue;
import com.datadog.api.client.v1.model.SyntheticsVariableParser;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsGlobalVariableRequest body = new SyntheticsGlobalVariableRequest()
.attributes(new SyntheticsGlobalVariableAttributes()
.restrictedRoles(Collections.singletonList("xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx")))
.description("Example description")
.name("MY_VARIABLE")
.parseTestOptions(new SyntheticsGlobalVariableParseTestOptions()
.field("content-type")
.localVariableName("LOCAL_VARIABLE")
.parser(new SyntheticsVariableParser()
.type(SyntheticsGlobalVariableParserType.REGEX)
.value(".*"))
.type(SyntheticsGlobalVariableParseTestOptionsType.HTTP_BODY))
.parseTestPublicId("abc-def-123")
.tags(Arrays.asList("team:front", "test:workflow-1"))
.value(new SyntheticsGlobalVariableValue()
.secure(true)
.value("value"));

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