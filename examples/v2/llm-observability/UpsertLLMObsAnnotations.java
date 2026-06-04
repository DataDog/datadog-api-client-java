// Create or update annotations returns "OK — annotations created or updated. Per-item errors are
// listed in `errors`."
// response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.LlmObservabilityApi;
import com.datadog.api.client.v2.model.LLMObsAnnotationLabelValue;
import com.datadog.api.client.v2.model.LLMObsAnnotationLabelValueValue;
import com.datadog.api.client.v2.model.LLMObsAnnotationsDataAttributesRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationsDataRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationsRequest;
import com.datadog.api.client.v2.model.LLMObsAnnotationsResponse;
import com.datadog.api.client.v2.model.LLMObsAnnotationsType;
import com.datadog.api.client.v2.model.LLMObsUpsertAnnotationItem;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.upsertLLMObsAnnotations", true);
    LlmObservabilityApi apiInstance = new LlmObservabilityApi(defaultClient);

    LLMObsAnnotationsRequest body =
        new LLMObsAnnotationsRequest()
            .data(
                new LLMObsAnnotationsDataRequest()
                    .attributes(
                        new LLMObsAnnotationsDataAttributesRequest()
                            .annotations(
                                Collections.singletonList(
                                    new LLMObsUpsertAnnotationItem()
                                        .interactionId("00000000-0000-0000-0000-000000000001")
                                        .labelValues(
                                            Arrays.asList(
                                                new LLMObsAnnotationLabelValue()
                                                    .labelSchemaId("abc-123")
                                                    .value(
                                                        new LLMObsAnnotationLabelValueValue(
                                                            "good")),
                                                new LLMObsAnnotationLabelValue()
                                                    .labelSchemaId("ef56gh78")
                                                    .value(
                                                        new LLMObsAnnotationLabelValueValue(
                                                            "positive")))))))
                    .type(LLMObsAnnotationsType.ANNOTATIONS));

    try {
      LLMObsAnnotationsResponse result =
          apiInstance.upsertLLMObsAnnotations("00000000-0000-0000-0000-000000000001", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling LlmObservabilityApi#upsertLLMObsAnnotations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
