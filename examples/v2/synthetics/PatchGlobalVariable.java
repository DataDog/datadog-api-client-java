// Patch a global variable returns "OK" response

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
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    GlobalVariableJsonPatchRequest body =
        new GlobalVariableJsonPatchRequest()
            .data(
                new GlobalVariableJsonPatchRequestData()
                    .attributes(
                        new GlobalVariableJsonPatchRequestDataAttributes()
                            .jsonPatch(
                                Collections.singletonList(
                                    new JsonPatchOperation()
                                        .op(JsonPatchOperationOp.ADD)
                                        .path("/name"))))
                    .type(GlobalVariableJsonPatchType.GLOBAL_VARIABLES_JSON_PATCH));

    try {
      GlobalVariableResponse result = apiInstance.patchGlobalVariable("variable_id", body);
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
