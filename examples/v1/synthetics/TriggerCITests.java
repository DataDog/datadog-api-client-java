// Trigger tests from CI/CD pipelines returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.SyntheticsApi;
import com.datadog.api.client.v1.model.SyntheticsTriggerCITestsResponse;
import com.datadog.api.client.v1.model.SyntheticsBasicAuth;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthWeb;
import com.datadog.api.client.v1.model.SyntheticsBasicAuthWebType;
import com.datadog.api.client.v1.model.SyntheticsCIBatchMetadata;
import com.datadog.api.client.v1.model.SyntheticsCIBatchMetadataCI;
import com.datadog.api.client.v1.model.SyntheticsCIBatchMetadataGit;
import com.datadog.api.client.v1.model.SyntheticsCIBatchMetadataPipeline;
import com.datadog.api.client.v1.model.SyntheticsCIBatchMetadataProvider;
import com.datadog.api.client.v1.model.SyntheticsCITest;
import com.datadog.api.client.v1.model.SyntheticsCITestBody;
import com.datadog.api.client.v1.model.SyntheticsTestOptionsRetry;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsCITestBody body = new SyntheticsCITestBody()
.tests(Collections.singletonList(new SyntheticsCITest()
.basicAuth(new SyntheticsBasicAuth(
new SyntheticsBasicAuthWeb()
.password("PaSSw0RD!")
.type(SyntheticsBasicAuthWebType.WEB)
.username("my_username")))
.deviceIds(Collections.singletonList("chrome.laptop_large"))
.locations(Collections.singletonList("aws:eu-west-3"))
.metadata(new SyntheticsCIBatchMetadata()
.ci(new SyntheticsCIBatchMetadataCI()
.pipeline(new SyntheticsCIBatchMetadataPipeline())
.provider(new SyntheticsCIBatchMetadataProvider()))
.git(new SyntheticsCIBatchMetadataGit()))
.publicId("aaa-aaa-aaa")
.retry(new SyntheticsTestOptionsRetry())));

    try {
      SyntheticsTriggerCITestsResponse result = apiInstance.triggerCITests(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SyntheticsApi#triggerCITests");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}