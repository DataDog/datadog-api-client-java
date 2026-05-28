// Update an annotation returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AnnotationsApi;
import com.datadog.api.client.v2.model.AnnotationColor;
import com.datadog.api.client.v2.model.AnnotationCreateAttributes;
import com.datadog.api.client.v2.model.AnnotationKind;
import com.datadog.api.client.v2.model.AnnotationRequestData;
import com.datadog.api.client.v2.model.AnnotationResponse;
import com.datadog.api.client.v2.model.AnnotationType;
import com.datadog.api.client.v2.model.AnnotationUpdateRequest;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateAnnotation", true);
    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);

    // there is a valid "annotation" in the system
    UUID ANNOTATION_DATA_ID = null;
    try {
      ANNOTATION_DATA_ID = UUID.fromString(System.getenv("ANNOTATION_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    AnnotationUpdateRequest body =
        new AnnotationUpdateRequest()
            .data(
                new AnnotationRequestData()
                    .attributes(
                        new AnnotationCreateAttributes()
                            .color(AnnotationColor.GREEN)
                            .description("Updated annotation.")
                            .pageId("dashboard:abc-def-xyz")
                            .startTime(1704067200000L)
                            .type(AnnotationKind.POINT_IN_TIME))
                    .type(AnnotationType.ANNOTATION));

    try {
      AnnotationResponse result = apiInstance.updateAnnotation(ANNOTATION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#updateAnnotation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
