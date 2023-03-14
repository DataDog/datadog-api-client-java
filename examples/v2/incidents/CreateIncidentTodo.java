// Create an incident todo returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentTodoAssignee;
import com.datadog.api.client.v2.model.IncidentTodoAttributes;
import com.datadog.api.client.v2.model.IncidentTodoCreateData;
import com.datadog.api.client.v2.model.IncidentTodoCreateRequest;
import com.datadog.api.client.v2.model.IncidentTodoResponse;
import com.datadog.api.client.v2.model.IncidentTodoType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.createIncidentTodo", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    IncidentTodoCreateRequest body =
        new IncidentTodoCreateRequest()
            .data(
                new IncidentTodoCreateData()
                    .attributes(
                        new IncidentTodoAttributes()
                            .assignees(
                                Collections.singletonList(
                                    new IncidentTodoAssignee("@test.user@test.com")))
                            .content("Restore lost data."))
                    .type(IncidentTodoType.INCIDENT_TODOS));

    try {
      IncidentTodoResponse result = apiInstance.createIncidentTodo(INCIDENT_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#createIncidentTodo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
