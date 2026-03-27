// Get team on-call users returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.api.OnCallApi.GetTeamOnCallUsersOptionalParameters;
import com.datadog.api.client.v2.model.TeamOnCallResponders;
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
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there are valid "routing_rules" in the system
    String ROUTING_RULES_DATA_ID = System.getenv("ROUTING_RULES_DATA_ID");

    try {
      TeamOnCallResponders result = apiInstance.getTeamOnCallUsers(ROUTING_RULES_DATA_ID,new GetTeamOnCallUsersOptionalParameters().include("responders,escalations.responders"));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#getTeamOnCallUsers");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}