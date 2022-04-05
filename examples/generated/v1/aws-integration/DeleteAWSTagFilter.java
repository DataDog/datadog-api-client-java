import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsIntegrationApi apiInstance = new AwsIntegrationApi(defaultClient);
        AWSTagFilterDeleteRequest body = new AWSTagFilterDeleteRequest(); // AWSTagFilterDeleteRequest | Delete a tag filtering entry for a given AWS account and `dd-aws` namespace.
        try {
            Object result = apiInstance.deleteAWSTagFilter(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#deleteAWSTagFilter");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
