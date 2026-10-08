// Create On-Call schedule overrides returns "Created" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.CreateOverrideRequestAttributes;
import com.datadog.api.client.v2.model.CreateOverrideRequestData;
import com.datadog.api.client.v2.model.CreateOverrideRequestRelationships;
import com.datadog.api.client.v2.model.CreateOverridesRequest;
import com.datadog.api.client.v2.model.OverrideCreateResponse;
import com.datadog.api.client.v2.model.OverrideDataType;
import com.datadog.api.client.v2.model.OverrideRelationshipsUser;
import com.datadog.api.client.v2.model.OverrideRelationshipsUserData;
import com.datadog.api.client.v2.model.OverrideRelationshipsUserDataType;
import java.time.OffsetDateTime;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    defaultClient.setAccessToken(System.getenv("DD_BEARER_TOKEN"));
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "schedule" in the system
    String SCHEDULE_DATA_ID = System.getenv("SCHEDULE_DATA_ID");

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    CreateOverridesRequest body =
        new CreateOverridesRequest()
            .data(
                Collections.singletonList(
                    new CreateOverrideRequestData()
                        .attributes(
                            new CreateOverrideRequestAttributes()
                                .end(OffsetDateTime.now().plusDays(1))
                                .start(OffsetDateTime.now()))
                        .relationships(
                            new CreateOverrideRequestRelationships()
                                .user(
                                    new OverrideRelationshipsUser()
                                        .data(
                                            new OverrideRelationshipsUserData()
                                                .id(USER_DATA_ID)
                                                .type(OverrideRelationshipsUserDataType.USERS))))
                        .type(OverrideDataType.OVERRIDES)));

    try {
      OverrideCreateResponse result = apiInstance.createScheduleOverrides(SCHEDULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#createScheduleOverrides");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
