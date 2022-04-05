import com.datadog.api.v1.client.ApiClient;
import com.datadog.api.v1.client.ApiException;
import com.datadog.api.v1.client.Configuration;
import com.datadog.api.v1.client.api.ServiceLevelObjectivesApi;
import com.datadog.api.v1.client.model.*;
import java.util.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();

    ServiceLevelObjectivesApi apiInstance = new ServiceLevelObjectivesApi(defaultClient);
    String sloId = "sloId_example"; // String | The ID of the service level objective object.
    Long fromTs = 56L; // Long | The `from` timestamp for the query window in epoch seconds.
    Long toTs = 56L; // Long | The `to` timestamp for the query window in epoch seconds.
    Double target =
        3.4D; // Double | The SLO target. If `target` is passed in, the response will include the
    // remaining error budget and a timeframe value of `custom`.
    Boolean applyCorrection =
        true; // Boolean | Defaults to `true`. If any SLO corrections are applied and this parameter
    // is set to `false`, then the corrections will not be applied and the SLI values will
    // not be affected.
    try {
      SLOHistoryResponse result =
          apiInstance.getSLOHistory(
              sloId,
              fromTs,
              toTs,
              new ServiceLevelObjectivesApi.GetSLOHistoryOptionalParameters()
                  .target(target)
                  .applyCorrection(applyCorrection));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectivesApi#getSLOHistory");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
