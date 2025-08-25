// Create a case returns "CREATED" response

import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.CaseManagementApi;
import com.datadog.api.client.v2.model.CaseCreate;
import com.datadog.api.client.v2.model.CaseCreateAttributes;
import com.datadog.api.client.v2.model.CaseCreateRelationships;
import com.datadog.api.client.v2.model.CaseCreateRequest;
import com.datadog.api.client.v2.model.CasePriority;
import com.datadog.api.client.v2.model.CaseResourceType;
import com.datadog.api.client.v2.model.CaseResponse;
import com.datadog.api.client.v2.model.NullableUserRelationship;
import com.datadog.api.client.v2.model.NullableUserRelationshipData;
import com.datadog.api.client.v2.model.ProjectRelationship;
import com.datadog.api.client.v2.model.ProjectRelationshipData;
import com.datadog.api.client.v2.model.ProjectResourceType;
import com.datadog.api.client.v2.model.UserResourceType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    CaseManagementApi apiInstance = new CaseManagementApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    CaseCreateRequest body =
        new CaseCreateRequest()
            .data(
                new CaseCreate()
                    .attributes(
                        new CaseCreateAttributes()
                            .priority(CasePriority.NOT_DEFINED)
                            .title("Security breach investigation in 0cfbc5cbc676ee71")
                            .typeId("00000000-0000-0000-0000-000000000001"))
                    .relationships(
                        new CaseCreateRelationships()
                            .assignee(
                                new NullableUserRelationship()
                                    .data(
                                        new NullableUserRelationshipData()
                                            .id(USER_DATA_ID)
                                            .type(UserResourceType.USER)))
                            .project(
                                new ProjectRelationship()
                                    .data(
                                        new ProjectRelationshipData()
                                            .id("d4bbe1af-f36e-42f1-87c1-493ca35c320e")
                                            .type(ProjectResourceType.PROJECT))))
                    .type(CaseResourceType.CASE));

    try {
      CaseResponse result = apiInstance.createCase(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CaseManagementApi#createCase");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
