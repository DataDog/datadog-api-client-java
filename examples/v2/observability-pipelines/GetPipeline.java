// Get a specific pipeline returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ObservabilityPipelinesApi;
import com.datadog.api.client.v2.model.ObservabilityPipeline;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ObservabilityPipelinesApi apiInstance = new ObservabilityPipelinesApi(defaultClient);

    // there is a valid "pipeline" in the system
    String PIPELINE_DATA_ID = System.getenv("PIPELINE_DATA_ID");

    try {
      ObservabilityPipeline result = apiInstance.getPipeline(PIPELINE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservabilityPipelinesApi#getPipeline");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
