// Create experiment returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsCreateExperimentV2Request;
import com.datadog.api.client.v2.model.ExperimentsCreateExperimentV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsCreateExperimentV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsExperimentV2DTO;
import com.datadog.api.client.v2.model.ExperimentsPatchExperimentV2ResponseDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    ExperimentsCreateExperimentV2Request body =
        new ExperimentsCreateExperimentV2Request()
            .data(
                new ExperimentsCreateExperimentV2RequestData()
                    .type(ExperimentsPatchExperimentV2ResponseDataType.EXPERIMENTS)
                    .attributes(
                        new ExperimentsCreateExperimentV2RequestDataAttributes()
                            .name("ex-14bb9543f523edde")));

    try {
      ExperimentsExperimentV2DTO result = apiInstance.createExperiment(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#createExperiment");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
