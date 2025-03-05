// Post an AWS on demand task returns "AWS on demand task created successfully." response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.AgentlessScanningApi;
import com.datadog.api.client.v2.model.AwsOnDemandCreateAttributes;
import com.datadog.api.client.v2.model.AwsOnDemandCreateData;
import com.datadog.api.client.v2.model.AwsOnDemandCreateRequest;
import com.datadog.api.client.v2.model.AwsOnDemandResponse;
import com.datadog.api.client.v2.model.AwsOnDemandType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    AgentlessScanningApi apiInstance = new AgentlessScanningApi(defaultClient);

    AwsOnDemandCreateRequest body =
        new AwsOnDemandCreateRequest()
            .data(
                new AwsOnDemandCreateData()
                    .attributes(
                        new AwsOnDemandCreateAttributes()
                            .arn(
                                "arn:aws:lambda:eu-west-3:376334461865:function:This-Is-An-Api-Spec-Test"))
                    .type(AwsOnDemandType.AWS_RESOURCE));

    try {
      AwsOnDemandResponse result = apiInstance.createAwsOnDemandTask(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AgentlessScanningApi#createAwsOnDemandTask");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
