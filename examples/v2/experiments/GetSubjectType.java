// Get subject type returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.ExperimentsApi;
import com.datadog.api.client.v2.model.ExperimentsSubjectTypeV2DTO;
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

    try {
      ExperimentsSubjectTypeV2DTO result =
          apiInstance.getSubjectType(EXPERIMENT_SUBJECT_TYPE_DATA_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExperimentsApi#getSubjectType");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
