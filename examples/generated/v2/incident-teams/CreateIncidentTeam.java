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
        IncidentTeamCreateRequest body = new IncidentTeamCreateRequest(); // IncidentTeamCreateRequest | Incident Team Payload.
        try {
            IncidentTeamResponse result = apiInstance.createIncidentTeam(body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling IncidentTeamsApi#createIncidentTeam");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
