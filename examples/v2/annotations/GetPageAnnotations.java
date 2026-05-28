// Get annotations for a page returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AnnotationsApi;
import com.datadog.api.client.v2.model.PageAnnotationsResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.getPageAnnotations", true);
    AnnotationsApi apiInstance = new AnnotationsApi(defaultClient);

    // there is a valid "annotation" in the system
    String ANNOTATION_DATA_ATTRIBUTES_PAGE_ID = System.getenv("ANNOTATION_DATA_ATTRIBUTES_PAGE_ID");

    try {
      PageAnnotationsResponse result =
          apiInstance.getPageAnnotations(
              ANNOTATION_DATA_ATTRIBUTES_PAGE_ID, 1704067200000L, 1704153600000L);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AnnotationsApi#getPageAnnotations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
