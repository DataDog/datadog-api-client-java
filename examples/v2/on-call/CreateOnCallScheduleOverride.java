// Create an override returns "Created" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.OnCallUserRelationship;
import com.datadog.api.client.v2.model.OnCallUserRelationshipData;
import com.datadog.api.client.v2.model.OnCallUserRelationshipType;
import com.datadog.api.client.v2.model.OverrideCreateData;
import com.datadog.api.client.v2.model.OverrideCreateDataAttributes;
import com.datadog.api.client.v2.model.OverrideCreateDataRelationships;
import com.datadog.api.client.v2.model.OverrideCreateDataType;
import com.datadog.api.client.v2.model.OverrideRequest;
import com.datadog.api.client.v2.model.OverrideResponse;
import java.time.OffsetDateTime;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "schedule" in the system
    String SCHEDULE_DATA_ID = System.getenv("SCHEDULE_DATA_ID");

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    OverrideRequest body =
        new OverrideRequest()
            .data(
                Collections.singletonList(
                    new OverrideCreateData()
                        .attributes(
                            new OverrideCreateDataAttributes()
                                .start(OffsetDateTime.now())
                                .end(OffsetDateTime.now().plusHours(1)))
                        .relationships(
                            new OverrideCreateDataRelationships()
                                .user(
                                    new OnCallUserRelationship()
                                        .data(
                                            new OnCallUserRelationshipData()
                                                .id(USER_DATA_ID)
                                                .type(OnCallUserRelationshipType.USERS))))
                        .type(OverrideCreateDataType.OVERRIDES)));

    try {
      OverrideResponse result = apiInstance.createOnCallScheduleOverride(SCHEDULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#createOnCallScheduleOverride");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
