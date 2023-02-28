// Create an SLO correction with rrule returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.ServiceLevelObjectiveCorrectionsApi;
import com.datadog.api.client.v1.model.SLOCorrectionCategory;
import com.datadog.api.client.v1.model.SLOCorrectionCreateData;
import com.datadog.api.client.v1.model.SLOCorrectionCreateRequest;
import com.datadog.api.client.v1.model.SLOCorrectionCreateRequestAttributes;
import com.datadog.api.client.v1.model.SLOCorrectionResponse;
import com.datadog.api.client.v1.model.SLOCorrectionType;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
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
                            .start(OffsetDateTime.now().toInstant().getEpochSecond())
                            .duration(3600L)
                            .rrule("FREQ=DAILY;INTERVAL=10;COUNT=5")
                            .timezone("UTC"))
                    .type(SLOCorrectionType.CORRECTION));

    try {
      SLOCorrectionResponse result = apiInstance.createSLOCorrection(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceLevelObjectiveCorrectionsApi#createSLOCorrection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
