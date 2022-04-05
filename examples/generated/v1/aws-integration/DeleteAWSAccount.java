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
        AWSAccountDeleteRequest body = new AWSAccountDeleteRequest(); // AWSAccountDeleteRequest | AWS request object
        try {
            Object result = apiInstance.deleteAWSAccount(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsIntegrationApi#deleteAWSAccount");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
