// Set an AWS tag filter returns "OK" response

import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.AwsIntegrationApi;
import com.datadog.api.v1.client.model.AWSNamespace;
import com.datadog.api.v1.client.model.AWSTagFilterCreateRequest;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    AWSTagFilterCreateRequest body =
        new AWSTagFilterCreateRequest()
            .accountId("1234567")
            .namespace(AWSNamespace.ELB)
            .tagFilterStr("prod*");

    try {
      apiInstance.createAWSTagFilter(body);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#createAWSTagFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
