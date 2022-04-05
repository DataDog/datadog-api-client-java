import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.ServiceLevelObjectivesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
        String sloId = "sloId_example"; // String | The ID of the service level objective object.
        ServiceLevelObjective body = new ServiceLevelObjective(); // ServiceLevelObjective | The edited service level objective request object.
        try {
            SLOListResponse result = apiInstance.updateSLO(sloId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectivesApi#updateSLO");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
