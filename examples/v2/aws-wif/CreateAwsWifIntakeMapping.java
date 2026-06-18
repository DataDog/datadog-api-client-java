// Create an AWS WIF intake mapping returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AwswifApi;
import com.datadog.api.client.v2.model.AwsWifIntakeMappingAttributes;
import com.datadog.api.client.v2.model.AwsWifIntakeMappingCreateData;
import com.datadog.api.client.v2.model.AwsWifIntakeMappingCreateRequest;
import com.datadog.api.client.v2.model.AwsWifIntakeMappingResponse;
import com.datadog.api.client.v2.model.AwsWifIntakeMappingType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AwswifApi apiInstance = new AwswifApi(defaultClient);

    AwsWifIntakeMappingCreateRequest body =
        new AwsWifIntakeMappingCreateRequest()
            .data(
                new AwsWifIntakeMappingCreateData()
                    .attributes(
                        new AwsWifIntakeMappingAttributes()
                            .arnPattern("arn:aws:iam::123456789012:role/my-agent-role"))
                    .type(AwsWifIntakeMappingType.AWS_WIF_INTAKE_MAPPING));

    try {
      AwsWifIntakeMappingResponse result = apiInstance.createAwsWifIntakeMapping(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwswifApi#createAwsWifIntakeMapping");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
