// Delete annotations returns "OK — annotations deleted. Errors for annotations that could not be
// deleted are listed in
// `errors`." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsAnnotationsType;
import com.datadog.api.client.v2.model.LLMObsDeleteAnnotationsDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteAnnotationsDataRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteAnnotationsRequest;
import com.datadog.api.client.v2.model.LLMObsDeleteAnnotationsResponse;
import java.util.Arrays;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteLLMObsAnnotations", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsDeleteAnnotationsRequest body =
        new LLMObsDeleteAnnotationsRequest()
            .data(
                new LLMObsDeleteAnnotationsDataRequest()
                    .attributes(
                        new LLMObsDeleteAnnotationsDataAttributesRequest()
                            .annotationIds(
                                Arrays.asList(
                                    "00000000-0000-0000-0000-000000000000",
                                    "00000000-0000-0000-0000-000000000001")))
                    .type(LLMObsAnnotationsType.ANNOTATIONS));

    try {
      LLMObsDeleteAnnotationsResponse result =
          apiInstance.deleteLLMObsAnnotations("00000000-0000-0000-0000-000000000001", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#deleteLLMObsAnnotations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
