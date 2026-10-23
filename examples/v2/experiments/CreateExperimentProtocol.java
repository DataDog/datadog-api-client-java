// Create experiment protocol returns "Created" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsCreateExperimentProtocolRequest;
import com.datadog.api.client.v2.model.ExperimentsCreateExperimentProtocolRequestData;
import com.datadog.api.client.v2.model.ExperimentsCreateExperimentProtocolRequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsPublicProtocolResponse;
import com.datadog.api.client.v2.model.ExperimentsPublicProtocolResponseDataType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    ExperimentsCreateExperimentProtocolRequest body =
        new ExperimentsCreateExperimentProtocolRequest()
            .data(
                new ExperimentsCreateExperimentProtocolRequestData()
                    .type(ExperimentsPublicProtocolResponseDataType.PROTOCOLS)
                    .attributes(
                        new ExperimentsCreateExperimentProtocolRequestDataAttributes()
                            .name("ex-protocol-14bb9543f523edde")
                            .description("Protocol created by the API test.")));

    try {
      ExperimentsPublicProtocolResponse result = apiInstance.createExperimentProtocol(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#createExperimentProtocol");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
