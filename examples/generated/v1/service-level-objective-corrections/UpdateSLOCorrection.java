import java.util.*;
import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.model.*;
import com.datadog.api.v1.client.api.ServiceLevelObjectiveCorrectionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        ServiceLevelObjectiveCorrectionsApi apiInstance = new ServiceLevelObjectiveCorrectionsApi(defaultClient);
        String sloCorrectionId = "sloCorrectionId_example"; // String | The ID of the SLO correction object.
        SLOCorrectionUpdateRequest body = new SLOCorrectionUpdateRequest(); // SLOCorrectionUpdateRequest | The edited SLO correction object.
        try {
            SLOCorrectionResponse result = apiInstance.updateSLOCorrection(sloCorrectionId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServiceLevelObjectiveCorrectionsApi#updateSLOCorrection");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
