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
    String sloId = "sloId_example"; // String | The ID of the service level objective.
    String force =
        "force_example"; // String | Delete the monitor even if it's referenced by other resources
    // (for example SLO, composite monitor).
    try {
      SLODeleteResponse result =
          apiInstance.deleteSLO(
              sloId, new ServiceLevelObjectivesApi.DeleteSLOOptionalParameters().force(force));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectivesApi#deleteSLO");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
