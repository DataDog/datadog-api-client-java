// Set an AWS tag filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.Configuration;
import com.datadog.api.client.v1.api.AwsIntegrationApi;
import com.datadog.api.client.v1.model.AWSNamespace;
import com.datadog.api.client.v1.model.AWSTagFilterCreateRequest;

public class CreateAWSTagFilter {
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
