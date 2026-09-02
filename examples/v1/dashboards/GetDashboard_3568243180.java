// Get a dashboard with five team tags and two AI tags

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v1.api.DashboardsApi;
import com.datadog.api.client.v1.model.Dashboard;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    DashboardsApi apiInstance = new DashboardsApi(defaultClient);

    // there is a valid "dashboard_with_team_and_ai_tags" in the system
    String DASHBOARD_WITH_TEAM_AND_AI_TAGS_ID = System.getenv("DASHBOARD_WITH_TEAM_AND_AI_TAGS_ID");

    try {
      Dashboard result = apiInstance.getDashboard(DASHBOARD_WITH_TEAM_AND_AI_TAGS_ID);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DashboardsApi#getDashboard");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
