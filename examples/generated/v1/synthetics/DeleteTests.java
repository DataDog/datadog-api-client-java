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
        SyntheticsDeleteTestsPayload body = new SyntheticsDeleteTestsPayload(); // SyntheticsDeleteTestsPayload | Public ID list of the Synthetic tests to be deleted.
        try {
            SyntheticsDeleteTestsResponse result = apiInstance.deleteTests(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#deleteTests");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
