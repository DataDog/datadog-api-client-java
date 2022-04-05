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
        String publicId = "publicId_example"; // String | The public ID of the test for which to search results for.
        Long fromTs = 56L; // Long | Timestamp in milliseconds from which to start querying results.
        Long toTs = 56L; // Long | Timestamp in milliseconds up to which to query results.
        List<String> probeDc = Arrays.asList(); // List<String> | Locations for which to query results.
        try {
            SyntheticsGetAPITestLatestResultsResponse result = apiInstance.getAPITestLatestResults(publicId, new SyntheticsApi.GetAPITestLatestResultsOptionalParameters()
                .fromTs(fromTs)
                .toTs(toTs)
                .probeDc(probeDc));
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SyntheticsApi#getAPITestLatestResults");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
