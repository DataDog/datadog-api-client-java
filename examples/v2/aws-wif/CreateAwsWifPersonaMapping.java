// Create an AWS WIF persona mapping returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwswifApi;
import com.datadog.api.client.v2.model.AwsWifPersonaMappingCreateAttributes;
import com.datadog.api.client.v2.model.AwsWifPersonaMappingCreateData;
import com.datadog.api.client.v2.model.AwsWifPersonaMappingCreateRequest;
import com.datadog.api.client.v2.model.AwsWifPersonaMappingResponse;
import com.datadog.api.client.v2.model.AwsWifPersonaMappingType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwswifApi apiInstance = new AwswifApi(defaultClient);

    AwsWifPersonaMappingCreateRequest body =
        new AwsWifPersonaMappingCreateRequest()
            .data(
                new AwsWifPersonaMappingCreateData()
                    .attributes(
                        new AwsWifPersonaMappingCreateAttributes()
                            .accountIdentifier("user@example.com")
                            .arnPattern("arn:aws:iam::123456789012:role/my-workload-role"))
                    .type(AwsWifPersonaMappingType.AWS_WIF_CONFIG));

    try {
      AwsWifPersonaMappingResponse result = apiInstance.createAwsWifPersonaMapping(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwswifApi#createAwsWifPersonaMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
