// List experiment protocols returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.api.ExperimentsApi.ListExperimentProtocolsOptionalParameters;
import com.datadog.api.client.v2.model.ExperimentsPublicProtocolListResponseArray;
import com.datadog.api.client.v2.model.ExperimentsPublicProtocolResponseDataAttributesStatus;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    // there is a valid "experiment_protocol" in the system
    String EXPERIMENT_PROTOCOL_DATA_ATTRIBUTES_NAME =
        System.getenv("EXPERIMENT_PROTOCOL_DATA_ATTRIBUTES_NAME");

    try {
      ExperimentsPublicProtocolListResponseArray result =
          apiInstance.listExperimentProtocols(
              new ListExperimentProtocolsOptionalParameters()
                  .filterStatus(
                      Collections.singletonList(
                          ExperimentsPublicProtocolResponseDataAttributesStatus.DRAFT))
                  .filterQuery(EXPERIMENT_PROTOCOL_DATA_ATTRIBUTES_NAME));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#listExperimentProtocols");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
