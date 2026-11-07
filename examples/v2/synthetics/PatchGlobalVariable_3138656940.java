// Patch a persistent email global variable preserves its address and type

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SyntheticsApi;
import com.datadog.api.client.v2.model.GlobalVariableJsonPatchRequest;
import com.datadog.api.client.v2.model.GlobalVariableJsonPatchRequestData;
import com.datadog.api.client.v2.model.GlobalVariableJsonPatchRequestDataAttributes;
import com.datadog.api.client.v2.model.GlobalVariableJsonPatchType;
import com.datadog.api.client.v2.model.GlobalVariableResponse;
import com.datadog.api.client.v2.model.JsonPatchOperation;
import com.datadog.api.client.v2.model.JsonPatchOperationOp;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    // there is a valid "synthetics_email_global_variable" in the system
    String SYNTHETICS_EMAIL_GLOBAL_VARIABLE_ID =
        System.getenv("SYNTHETICS_EMAIL_GLOBAL_VARIABLE_ID");

    GlobalVariableJsonPatchRequest body =
        new GlobalVariableJsonPatchRequest()
            .data(
                new GlobalVariableJsonPatchRequestData()
                    .type(GlobalVariableJsonPatchType.GLOBAL_VARIABLES_JSON_PATCH)
                    .attributes(
                        new GlobalVariableJsonPatchRequestDataAttributes()
                            .jsonPatch(
                                Collections.singletonList(
                                    new JsonPatchOperation()
                                        .op(JsonPatchOperationOp.REPLACE)
                                        .path("/description")
                                        .value("Updated persistent email variable")))));

    try {
      GlobalVariableResponse result =
          apiInstance.patchGlobalVariable(SYNTHETICS_EMAIL_GLOBAL_VARIABLE_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#patchGlobalVariable");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
