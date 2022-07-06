// Update an SLO correction returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.ServiceLevelObjectiveCorrectionsApi;
import com.datadog.api.client.v1.model.SLOCorrectionCategory;
import com.datadog.api.client.v1.model.SLOCorrectionResponse;
import com.datadog.api.client.v1.model.SLOCorrectionType;
import com.datadog.api.client.v1.model.SLOCorrectionUpdateData;
import com.datadog.api.client.v1.model.SLOCorrectionUpdateRequest;
import com.datadog.api.client.v1.model.SLOCorrectionUpdateRequestAttributes;
import java.time.OffsetDateTime;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    ServiceLevelObjectiveCorrectionsApi apiInstance =
        new ServiceLevelObjectiveCorrectionsApi(defaultClient);

    // there is a valid "correction" for "slo"
    String CORRECTION_DATA_ID = System.getenv("CORRECTION_DATA_ID");

    SLOCorrectionUpdateRequest body =
        new SLOCorrectionUpdateRequest()
            .data(
                new SLOCorrectionUpdateData()
                    .attributes(
                        new SLOCorrectionUpdateRequestAttributes()
                            .category(SLOCorrectionCategory.DEPLOYMENT)
                            .description("Example-Update_an_SLO_correction_returns_OK_response")
                            .end(OffsetDateTime.now().plusHours(1).toInstant().getEpochSecond())
                            .start(OffsetDateTime.now().toInstant().getEpochSecond())
                            .timezone("UTC"))
                    .type(SLOCorrectionType.CORRECTION));

    try {
      SLOCorrectionResponse result = apiInstance.updateSLOCorrection(CORRECTION_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println(
          "Exception when calling ServiceLevelObjectiveCorrectionsApi#updateSLOCorrection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
