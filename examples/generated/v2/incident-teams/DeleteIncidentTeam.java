import java.util.*;
import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.model.*;
import com.datadog.api.v2.client.api.IncidentTeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        IncidentTeamsApi apiInstance = new IncidentTeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | The ID of the incident team.
        try {
            apiInstance.deleteIncidentTeam(teamId);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentTeamsApi#deleteIncidentTeam");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
