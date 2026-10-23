// Replace experiment protocol returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.api.ExperimentsApi.ReplaceExperimentProtocolOptionalParameters;
import com.datadog.api.client.v2.model.ExperimentsPublicProtocolResponse;
import com.datadog.api.client.v2.model.ExperimentsPublicProtocolResponseDataType;
import com.datadog.api.client.v2.model.ExperimentsReplaceExperimentProtocolRequest;
import com.datadog.api.client.v2.model.ExperimentsReplaceExperimentProtocolRequestData;
import com.datadog.api.client.v2.model.ExperimentsReplaceExperimentProtocolRequestDataAttributes;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    // there is a valid "published_protocol" in the system
    String PUBLISHED_PROTOCOL_DATA_ATTRIBUTES_UPDATED_AT =
        System.getenv("PUBLISHED_PROTOCOL_DATA_ATTRIBUTES_UPDATED_AT");
    UUID PUBLISHED_PROTOCOL_DATA_ID = null;
    try {
      PUBLISHED_PROTOCOL_DATA_ID = UUID.fromString(System.getenv("PUBLISHED_PROTOCOL_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    // there is a valid "experiment_subject_type" in the system
    UUID EXPERIMENT_SUBJECT_TYPE_DATA_ID = null;
    try {
      EXPERIMENT_SUBJECT_TYPE_DATA_ID =
          UUID.fromString(System.getenv("EXPERIMENT_SUBJECT_TYPE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    ExperimentsReplaceExperimentProtocolRequest body =
        new ExperimentsReplaceExperimentProtocolRequest()
            .data(
                new ExperimentsReplaceExperimentProtocolRequestData()
                    .type(ExperimentsPublicProtocolResponseDataType.PROTOCOLS)
                    .id(PUBLISHED_PROTOCOL_DATA_ID)
                    .attributes(
                        new ExperimentsReplaceExperimentProtocolRequestDataAttributes()
                            .subjectTypeId(EXPERIMENT_SUBJECT_TYPE_DATA_ID)
                            .isEqualSplitEnforced(false)
                            .isMinimumDurationEnabled(false)
                            .isDurationRequiredToStart(false)
                            .isMetricLimitEnabled(false)
                            .defaultDurationDays(14L)));

    try {
      ExperimentsPublicProtocolResponse result =
          apiInstance.replaceExperimentProtocol(
              PUBLISHED_PROTOCOL_DATA_ID,
              body,
              new ReplaceExperimentProtocolOptionalParameters()
                  .expectedUpdatedAt(PUBLISHED_PROTOCOL_DATA_ATTRIBUTES_UPDATED_AT));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#replaceExperimentProtocol");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
