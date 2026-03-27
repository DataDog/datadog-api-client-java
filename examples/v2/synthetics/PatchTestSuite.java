// Patch a test suite returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SyntheticsApi;
import com.datadog.api.client.v2.model.JsonPatchOperation;
import com.datadog.api.client.v2.model.JsonPatchOperationOp;
import com.datadog.api.client.v2.model.SuiteJsonPatchRequest;
import com.datadog.api.client.v2.model.SuiteJsonPatchRequestData;
import com.datadog.api.client.v2.model.SuiteJsonPatchRequestDataAttributes;
import com.datadog.api.client.v2.model.SuiteJsonPatchType;
import com.datadog.api.client.v2.model.SyntheticsSuiteResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SuiteJsonPatchRequest body =
        new SuiteJsonPatchRequest()
            .data(
                new SuiteJsonPatchRequestData()
                    .attributes(
                        new SuiteJsonPatchRequestDataAttributes()
                            .jsonPatch(
                                Collections.singletonList(
                                    new JsonPatchOperation()
                                        .op(JsonPatchOperationOp.ADD)
                                        .path("/name"))))
                    .type(SuiteJsonPatchType.SUITES_JSON_PATCH));

    try {
      SyntheticsSuiteResponse result = apiInstance.patchTestSuite("123-abc-456", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#patchTestSuite");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
