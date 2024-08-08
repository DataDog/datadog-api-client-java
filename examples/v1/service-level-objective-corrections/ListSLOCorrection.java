// Get all SLO corrections returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.ServiceLevelObjectiveCorrectionsApi;
import com.datadog.api.client.v1.api.ServiceLevelObjectiveCorrectionsApi.ListSLOCorrectionOptionalParameters;
import com.datadog.api.client.v1.model.SLOCorrectionListResponse;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceLevelObjectiveCorrectionsApi apiInstance = new ServiceLevelObjectiveCorrectionsApi(defaultClient);

    try {
      SLOCorrectionListResponse result = apiInstance.listSLOCorrection(new ListSLOCorrectionOptionalParameters().offset(1L).limit(1L));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectiveCorrectionsApi#listSLOCorrection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}