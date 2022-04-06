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
    AWSAccount body =
        new AWSAccount(); // AWSAccount | Your Datadog role delegation name. For more information
    // about your AWS account Role name, see the [Datadog AWS integration
    // configuration
    // info](https://docs.datadoghq.com/integrations/amazon_web_services/#setup).
    try {
      AWSAccountCreateResponse result = apiInstance.createNewAWSExternalID(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AwsIntegrationApi#createNewAWSExternalID");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
