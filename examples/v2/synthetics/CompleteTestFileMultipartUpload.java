// Complete a multipart upload of a test file returns "No Content" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SyntheticsApi;
import com.datadog.api.client.v2.model.SyntheticsTestFileCompleteMultipartUploadPart;
import com.datadog.api.client.v2.model.SyntheticsTestFileCompleteMultipartUploadRequest;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsTestFileCompleteMultipartUploadRequest body =
        new SyntheticsTestFileCompleteMultipartUploadRequest()
            .key("org-123/api-upload-file/abc-def-123/2024-01-01T00:00:00_uuid.json")
            .parts(
                Collections.singletonList(
                    new SyntheticsTestFileCompleteMultipartUploadPart()
                        .eTag("""
"d41d8cd98f00b204e9800998ecf8427e"
""")
                        .partNumber(1L)))
            .uploadId("upload-id-abc123");

    try {
      apiInstance.completeTestFileMultipartUpload("abc-def-123", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#completeTestFileMultipartUpload");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
