import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.AwsLogsIntegrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        AwsLogsIntegrationApi apiInstance = new AwsLogsIntegrationApi(defaultClient);
        try {
            List<AWSLogsListResponse> result = apiInstance.listAWSLogsIntegrations();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AwsLogsIntegrationApi#listAWSLogsIntegrations");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
