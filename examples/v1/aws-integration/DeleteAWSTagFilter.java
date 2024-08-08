// Delete a tag filtering entry returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.AwsIntegrationApi;
import com.datadog.api.client.v1.model.AWSNamespace;
import com.datadog.api.client.v1.model.AWSTagFilterDeleteRequest;
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
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSTagFilterDeleteRequest body = new AWSTagFilterDeleteRequest()
.accountId("FAKEAC0FAKEAC2FAKEAC")
.namespace(AWSNamespace.ELB);

    try {
      apiInstance.deleteAWSTagFilter(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#deleteAWSTagFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}