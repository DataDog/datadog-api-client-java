// Create an annotation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AnnotationsApi;
import com.datadog.api.client.v2.model.AnnotationColor;
import com.datadog.api.client.v2.model.AnnotationCreateAttributes;
import com.datadog.api.client.v2.model.AnnotationCreateRequest;
import com.datadog.api.client.v2.model.AnnotationKind;
import com.datadog.api.client.v2.model.AnnotationRequestData;
import com.datadog.api.client.v2.model.AnnotationResponse;
import com.datadog.api.client.v2.model.AnnotationType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createAnnotation", true);
    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);

    AnnotationCreateRequest body =
        new AnnotationCreateRequest()
            .data(
                new AnnotationRequestData()
                    .attributes(
                        new AnnotationCreateAttributes()
                            .color(AnnotationColor.BLUE)
                            .description("Deployed v2.3.1 to production.")
                            .pageId("dashboard:abc-def-xyz")
                            .startTime(1704067200000L)
                            .type(AnnotationKind.POINT_IN_TIME)
                            .widgetIds(Collections.singletonList("1234567890")))
                    .type(AnnotationType.ANNOTATION));

    try {
      AnnotationResponse result = apiInstance.createAnnotation(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#createAnnotation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
