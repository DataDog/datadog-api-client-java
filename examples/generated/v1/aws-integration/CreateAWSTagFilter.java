import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.AwsIntegrationApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
    AWSTagFilterCreateRequest body =
        new AWSTagFilterCreateRequest(); // AWSTagFilterCreateRequest | Set an AWS tag filter using
                                         // an `aws_account_identifier`, `namespace`, and filtering
                                         // string. Namespace options are `application_elb`, `elb`,
                                         // `lambda`, `network_elb`, `rds`, `sqs`, and `custom`.
    try {
      Object result = apiInstance.createAWSTagFilter(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#createAWSTagFilter");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
