// Get all SLO corrections returns "OK" response with pagination

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.PaginationIterable;
import com.datadog.api.client.v1.api.ServiceLevelObjectiveCorrectionsApi;
import com.datadog.api.client.v1.api.ServiceLevelObjectiveCorrectionsApi.ListSLOCorrectionOptionalParameters;
import com.datadog.api.client.v1.model.SLOCorrection;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceLevelObjectiveCorrectionsApi apiInstance =
        new ServiceLevelObjectiveCorrectionsApi(defaultClient);

    try {
      PaginationIterable<SLOCorrection> iterable =
          apiInstance.listSLOCorrectionWithPagination(
              new ListSLOCorrectionOptionalParameters().limit(2L));

      for (SLOCorrection item : iterable) {
        System.out.println(item);
      }
    } catch (RuntimeException e) {
      System.err.println(
          "Exception when calling"
              + " ServiceLevelObjectiveCorrectionsApi#listSLOCorrectionWithPagination");
      System.err.println("Reason: " + e.getMessage());
      e.printStackTrace();
    }
  }
}
