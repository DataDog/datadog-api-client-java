// Get a presigned URL for downloading a test file returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SyntheticsApi;
import com.datadog.api.client.v2.model.SyntheticsTestFileDownloadRequest;
import com.datadog.api.client.v2.model.SyntheticsTestFileDownloadResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsTestFileDownloadRequest body =
        new SyntheticsTestFileDownloadRequest()
            .bucketKey("api-upload-file/abc-def-123/2024-01-01T00:00:00_uuid.json");

    try {
      SyntheticsTestFileDownloadResponse result =
          apiInstance.getTestFileDownloadUrl("abc-def-123", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#getTestFileDownloadUrl");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
