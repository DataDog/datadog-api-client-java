// Create an SLO correction returns "OK" response
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v1.api.ServiceLevelObjectiveCorrectionsApi;
import com.datadog.api.client.v1.model.SLOCorrectionResponse;
import com.datadog.api.client.v1.model.SLOCorrectionCategory;
import com.datadog.api.client.v1.model.SLOCorrectionCreateData;
import com.datadog.api.client.v1.model.SLOCorrectionCreateRequest;
import com.datadog.api.client.v1.model.SLOCorrectionCreateRequestAttributes;
import com.datadog.api.client.v1.model.SLOCorrectionType;
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

    // there is a valid "slo" in the system
    String SLO_DATA_0_ID = System.getenv("SLO_DATA_0_ID");

    SLOCorrectionCreateRequest body = new SLOCorrectionCreateRequest()
.data(new SLOCorrectionCreateData()
.attributes(new SLOCorrectionCreateRequestAttributes()
.category(SLOCorrectionCategory.SCHEDULED_MAINTENANCE)
.description("Example-Service-Level-Objective-Correction")
.end(OffsetDateTime.now().plusHours(1).toInstant().getEpochSecond())
.sloId(SLO_DATA_0_ID)
.start(OffsetDateTime.now().toInstant().getEpochSecond())
.timezone("UTC"))
.type(SLOCorrectionType.CORRECTION));

    try {
      SLOCorrectionResponse result = apiInstance.createSLOCorrection(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectiveCorrectionsApi#createSLOCorrection");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}