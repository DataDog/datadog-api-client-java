// List degradations with source ID filter returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.StatusPagesApi;
import com.datadog.api.client.v2.api.StatusPagesApi.ListDegradationsOptionalParameters;
import com.datadog.api.client.v2.model.DegradationArray;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    StatusPagesApi apiInstance = new StatusPagesApi(defaultClient);

    // there is a valid "degradation" in the system
    UUID DEGRADATION_DATA_ID = null;
    try {
      DEGRADATION_DATA_ID = UUID.fromString(System.getenv("DEGRADATION_DATA_ID"));
    } catch (IllegalArgumentException e) {
      System.err.println("Error parsing UUID: " + e.getMessage());
    }

    try {
      DegradationArray result =
          apiInstance.listDegradations(
              new ListDegradationsOptionalParameters().filterSourceId(DEGRADATION_DATA_ID));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling StatusPagesApi#listDegradations");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
