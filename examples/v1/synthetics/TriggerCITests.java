// Trigger tests from CI/CD pipelines returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.SyntheticsApi;
import com.datadog.api.v1.client.model.SyntheticsBasicAuth;
import com.datadog.api.v1.client.model.SyntheticsBasicAuthWeb;
import com.datadog.api.v1.client.model.SyntheticsBasicAuthWebType;
import com.datadog.api.v1.client.model.SyntheticsCIBatchMetadata;
import com.datadog.api.v1.client.model.SyntheticsCIBatchMetadataCI;
import com.datadog.api.v1.client.model.SyntheticsCIBatchMetadataGit;
import com.datadog.api.v1.client.model.SyntheticsCIBatchMetadataPipeline;
import com.datadog.api.v1.client.model.SyntheticsCIBatchMetadataProvider;
import com.datadog.api.v1.client.model.SyntheticsCITest;
import com.datadog.api.v1.client.model.SyntheticsCITestBody;
import com.datadog.api.v1.client.model.SyntheticsDeviceID;
import com.datadog.api.v1.client.model.SyntheticsTestOptionsRetry;
import com.datadog.api.v1.client.model.SyntheticsTriggerCITestsResponse;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);

    SyntheticsCITestBody body =
        new SyntheticsCITestBody()
            .tests(
                Collections.singletonList(
                    new SyntheticsCITest()
                        .basicAuth(
                            new SyntheticsBasicAuth(
                                new SyntheticsBasicAuthWeb()
                                    .password("PaSSw0RD!")
                                    .type(SyntheticsBasicAuthWebType.WEB)
                                    .username("my_username")))
                        .deviceIds(Collections.singletonList(SyntheticsDeviceID.LAPTOP_LARGE))
                        .locations(Collections.singletonList("aws:eu-west-3"))
                        .metadata(
                            new SyntheticsCIBatchMetadata()
                                .ci(
                                    new SyntheticsCIBatchMetadataCI()
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
