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
    Boolean withConfiguredAlertIds =
        true; // Boolean | Get the IDs of SLO monitors that reference this SLO.
    try {
      SLOResponse result =
          apiInstance.getSLO(
              sloId,
              new ServiceLevelObjectivesApi.GetSLOOptionalParameters()
                  .withConfiguredAlertIds(withConfiguredAlertIds));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ServiceLevelObjectivesApi#getSLO");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
