// Delete a tag filtering entry returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.AwsIntegrationApi;
import com.datadog.api.v1.client.model.AWSNamespace;
import com.datadog.api.v1.client.model.AWSTagFilterDeleteRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSTagFilterDeleteRequest body =
        new AWSTagFilterDeleteRequest()
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
