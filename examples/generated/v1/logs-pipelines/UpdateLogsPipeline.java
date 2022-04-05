import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.LogsPipelinesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        LogsPipelinesApi apiInstance = new LogsPipelinesApi(defaultClient);
        String pipelineId = "pipelineId_example"; // String | ID of the pipeline to delete.
        LogsPipeline body = new LogsPipeline(); // LogsPipeline | New definition of the pipeline.
        try {
            LogsPipeline result = apiInstance.updateLogsPipeline(pipelineId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LogsPipelinesApi#updateLogsPipeline");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
