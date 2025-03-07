// Create a new pipeline returns "Pipeline created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ObservabilityPipelinesApi;
import com.datadog.api.client.v2.model.Pipeline;
import com.datadog.api.client.v2.model.PipelineData;
import com.datadog.api.client.v2.model.PipelineDataAttributes;
import com.datadog.api.client.v2.model.PipelineDataAttributesConfig;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ObservabilityPipelinesApi apiInstance = new ObservabilityPipelinesApi(defaultClient);

    Pipeline body =
        new Pipeline()
            .data(
                new PipelineData()
                    .attributes(
                        new PipelineDataAttributes()
                            .config(new PipelineDataAttributesConfig())
                            .name(""))
                    .id("e8890e15-053e-4d34-9404-1b41b9e403e2")
                    .type("pipeline"));

    try {
      Pipeline result = apiInstance.createPipeline(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ObservabilityPipelinesApi#createPipeline");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
