// List namespaces returns "AWS Namespaces List object" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwsIntegrationApi;
import com.datadog.api.client.v2.model.AWSNamespacesResponse;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.listAWSNamespaces", true);
    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);

    try {
      AWSNamespacesResponse result = apiInstance.listAWSNamespaces();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#listAWSNamespaces");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
