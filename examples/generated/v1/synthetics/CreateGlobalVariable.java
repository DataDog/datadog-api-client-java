import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.SyntheticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        SyntheticsApi apiInstance = new SyntheticsApi(defaultClient);
        SyntheticsGlobalVariable body = new SyntheticsGlobalVariable(); // SyntheticsGlobalVariable | Details of the global variable to create.
        try {
            SyntheticsGlobalVariable result = apiInstance.createGlobalVariable(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#createGlobalVariable");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
