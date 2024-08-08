// Get all teams with fields_team parameter returns "OK" response

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.TeamsApi;
import com.datadog.api.client.v2.api.TeamsApi.ListTeamsOptionalParameters;
import com.datadog.api.client.v2.model.TeamsResponse;
import com.datadog.api.client.v2.model.TeamsField;
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
    TeamsApi apiInstance = new TeamsApi(defaultClient);

    try {
      TeamsResponse result = apiInstance.listTeams(new ListTeamsOptionalParameters().fieldsTeam(Arrays.asList(TeamsField.ID, TeamsField.NAME, TeamsField.HANDLE)));
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TeamsApi#listTeams");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}