// Delete an annotation returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AnnotationsApi;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.deleteAnnotation", true);
    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);

    // there is a valid "annotation" in the system
    UUID ANNOTATION_DATA_ID = null;
    try {
      ANNOTATION_DATA_ID = UUID.fromString(System.getenv("ANNOTATION_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      apiInstance.deleteAnnotation(ANNOTATION_DATA_ID);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#deleteAnnotation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
