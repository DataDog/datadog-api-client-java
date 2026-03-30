// Get presigned URLs for uploading a test file returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.SyntheticsApi;
import com.datadog.api.client.v2.model.SyntheticsTestFileMultipartPresignedUrlsPart;
import com.datadog.api.client.v2.model.SyntheticsTestFileMultipartPresignedUrlsRequest;
import com.datadog.api.client.v2.model.SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix;
import com.datadog.api.client.v2.model.SyntheticsTestFileMultipartPresignedUrlsResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsTestFileMultipartPresignedUrlsRequest body =
        new SyntheticsTestFileMultipartPresignedUrlsRequest()
            .bucketKeyPrefix(
                SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix.API_UPLOAD_FILE)
            .parts(
                Collections.singletonList(
                    new SyntheticsTestFileMultipartPresignedUrlsPart()
                        .md5("1B2M2Y8AsgTpgAmY7PhCfg==")
                        .partNumber(1L)));

    try {
      SyntheticsTestFileMultipartPresignedUrlsResponse result =
          apiInstance.getTestFileMultipartPresignedUrls("abc-def-123", body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#getTestFileMultipartPresignedUrls");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
