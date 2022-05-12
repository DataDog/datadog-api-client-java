// Grant role to an archive returns "OK" response

import com.datadog.api.v2.client.ApiClient;
import com.datadog.api.v2.client.ApiException;
import com.datadog.api.v2.client.Configuration;
import com.datadog.api.v2.client.api.LogsArchivesApi;
import com.datadog.api.v2.client.model.RelationshipToRole;
import com.datadog.api.v2.client.model.RelationshipToRoleData;
import com.datadog.api.v2.client.model.RolesType;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    LogsArchivesApi apiInstance = new LogsArchivesApi(defaultClient);

    RelationshipToRole body =
        new RelationshipToRole()
            .data(
                new RelationshipToRoleData()
                    .id("3653d3c6-0c75-11ea-ad28-fb5701eabc7d")
                    .type(RolesType.ROLES));

    try {
      apiInstance.addReadRoleToArchive("archive_id", body);
    } catch (ApiException e) {
      System.err.println("Exception when calling LogsArchivesApi#addReadRoleToArchive");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
