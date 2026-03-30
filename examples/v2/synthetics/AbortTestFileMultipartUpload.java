// Abort a multipart upload of a test file returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SyntheticsApi;
import com.datadog.api.client.v2.model.SyntheticsTestFileAbortMultipartUploadRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsTestFileAbortMultipartUploadRequest body =
        new SyntheticsTestFileAbortMultipartUploadRequest()
            .key("org-123/api-upload-file/abc-def-123/2024-01-01T00:00:00_uuid.json")
            .uploadId("upload-id-abc123");

    try {
      apiInstance.abortTestFileMultipartUpload("abc-def-123", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#abortTestFileMultipartUpload");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
