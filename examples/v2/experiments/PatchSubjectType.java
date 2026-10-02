// Patch subject type returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsPatchSubjectTypeV2Request;
import com.datadog.api.client.v2.model.ExperimentsPatchSubjectTypeV2RequestData;
import com.datadog.api.client.v2.model.ExperimentsPatchSubjectTypeV2RequestDataAttributes;
import com.datadog.api.client.v2.model.ExperimentsSubjectTypeV2DTO;
import com.datadog.api.client.v2.model.ExperimentsSubjectTypeV2DTODataType;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    ExperimentsApi apiInstance = new ExperimentsApi(defaultClient);

    // there is a valid "experiment_subject_type" in the system
    UUID EXPERIMENT_SUBJECT_TYPE_DATA_ID = null;
    try {
      EXPERIMENT_SUBJECT_TYPE_DATA_ID =
          UUID.fromString(System.getenv("EXPERIMENT_SUBJECT_TYPE_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    ExperimentsPatchSubjectTypeV2Request body =
        new ExperimentsPatchSubjectTypeV2Request()
            .data(
                new ExperimentsPatchSubjectTypeV2RequestData()
                    .type(ExperimentsSubjectTypeV2DTODataType.SUBJECT_TYPES)
                    .attributes(
                        new ExperimentsPatchSubjectTypeV2RequestDataAttributes()
                            .name("ex-14bb9543f523edde updated")));

    try {
      ExperimentsSubjectTypeV2DTO result =
          apiInstance.patchSubjectType(EXPERIMENT_SUBJECT_TYPE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#patchSubjectType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
