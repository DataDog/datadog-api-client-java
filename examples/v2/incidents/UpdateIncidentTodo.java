// Update an incident todo returns "OK" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.IncidentsApi;
import com.datadog.api.client.v2.model.IncidentTodoAssignee;
import com.datadog.api.client.v2.model.IncidentTodoAttributes;
import com.datadog.api.client.v2.model.IncidentTodoPatchData;
import com.datadog.api.client.v2.model.IncidentTodoPatchRequest;
import com.datadog.api.client.v2.model.IncidentTodoResponse;
import com.datadog.api.client.v2.model.IncidentTodoType;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setUnstableOperationEnabled("v2.updateIncidentTodo", true);
    IncidentsApi apiInstance = new IncidentsApi(defaultClient);

    // there is a valid "incident" in the system
    String INCIDENT_DATA_ID = System.getenv("INCIDENT_DATA_ID");

    // the "incident" has an "incident_todo"
    String INCIDENT_TODO_DATA_ID = System.getenv("INCIDENT_TODO_DATA_ID");

    IncidentTodoPatchRequest body =
        new IncidentTodoPatchRequest()
            .data(
                new IncidentTodoPatchData()
                    .attributes(
                        new IncidentTodoAttributes()
                            .assignees(
                                Collections.singletonList(
                                    new IncidentTodoAssignee("@test.user@test.com")))
                            .content("Restore lost data.")
                            .completed("2023-03-06T22:00:00.000000+00:00")
                            .dueDate("2023-07-10T05:00:00.000000+00:00"))
                    .type(IncidentTodoType.INCIDENT_TODOS));

    try {
      IncidentTodoResponse result =
          apiInstance.updateIncidentTodo(INCIDENT_DATA_ID, INCIDENT_TODO_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling IncidentsApi#updateIncidentTodo");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
