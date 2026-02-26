// Get all SLO corrections returns "OK" response with pagination

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.ServiceLevelObjectiveCorrectionsApi;
import com.datadog.api.client.v1.api.ServiceLevelObjectiveCorrectionsApi.ListSLOCorrectionOptionalParameters;
import com.datadog.api.client.v1.model.SLOCorrectionListResponse;
import com.datadog.api.client.v1.model.SLOCorrection;
import com.datadog.api.client.PaginationIterable;
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
      PaginationIterable<SLOCorrection> iterable = apiInstance.listSLOCorrectionWithPagination(new ListSLOCorrectionOptionalParameters().limit(2L));

      for (SLOCorrection item : iterable) {
       System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println("Exception when calling ServiceLevelObjectiveCorrectionsApi#listSLOCorrectionWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}