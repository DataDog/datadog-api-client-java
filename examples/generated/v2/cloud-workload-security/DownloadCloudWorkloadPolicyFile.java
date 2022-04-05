import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.CloudWorkloadSecurityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        CloudWorkloadSecurityApi apiInstance = new CloudWorkloadSecurityApi(defaultClient);
        try {
            File result = apiInstance.downloadCloudWorkloadPolicyFile();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CloudWorkloadSecurityApi#downloadCloudWorkloadPolicyFile");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
