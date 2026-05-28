// List annotations returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AnnotationsApi;
import com.datadog.api.client.v2.model.AnnotationsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listAnnotations", true);
    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);

    // there is a valid "annotation" in the system
    String ANNOTATION_DATA_ATTRIBUTES_PAGE_ID = System.getenv("ANNOTATION_DATA_ATTRIBUTES_PAGE_ID");

    try {
      AnnotationsResponse result =
          apiInstance.listAnnotations(
              ANNOTATION_DATA_ATTRIBUTES_PAGE_ID, 1704067200000L, 1704153600000L);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#listAnnotations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
