// Create an SLO correction with rrule returns "OK" response
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.ServiceLevelObjectiveCorrectionsApi;
import com.datadog.api.v1.client.model.SLOCorrectionCategory;
import com.datadog.api.v1.client.model.SLOCorrectionCreateData;
import com.datadog.api.v1.client.model.SLOCorrectionCreateRequest;
import com.datadog.api.v1.client.model.SLOCorrectionCreateRequestAttributes;
import com.datadog.api.v1.client.model.SLOCorrectionResponse;
import com.datadog.api.v1.client.model.SLOCorrectionType;
import java.time.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("createSloCorrection", true);
    ServiceLevelObjectiveCorrectionsApi apiInstance =
        new ServiceLevelObjectiveCorrectionsApi(defaultClient);

    // there is a valid "slo" in the system
    String SLO_DATA_0_ID = System.getenv("SLO_DATA_0_ID");

    SLOCorrectionCreateRequest body =
        new SLOCorrectionCreateRequest()
            .data(
                new SLOCorrectionCreateData()
                    .attributes(
                        new SLOCorrectionCreateRequestAttributes()
                            .category(SLOCorrectionCategory.SCHEDULED_MAINTENANCE)
                            .description(
                                "Example-Create_an_SLO_correction_with_rrule_returns_OK_response")
                            .sloId(SLO_DATA_0_ID)
                            .start(Instant.now().getEpochSecond())
                            .duration(3600L)
                            .rrule("FREQ=DAILY;INTERVAL=10;COUNT=5")
                            .timezone("UTC"))
                    .type(SLOCorrectionType.CORRECTION));

    try {
      SLOCorrectionResponse result = apiInstance.createSLOCorrection(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DowntimesApi#updateDowntime");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
