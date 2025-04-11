// Create on-call schedule returns "Created" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.Schedule;
import com.datadog.api.client.v2.model.ScheduleCreateRequest;
import com.datadog.api.client.v2.model.ScheduleCreateRequestData;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataAttributes;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataAttributesLayersItems;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataAttributesLayersItemsInterval;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataAttributesLayersItemsMembersItems;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataAttributesLayersItemsMembersItemsUser;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItems;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataRelationships;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataRelationshipsTeams;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataRelationshipsTeamsDataItems;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataRelationshipsTeamsDataItemsType;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    // there is a valid "team" in the system
    String TEAM_DATA_ID = System.getenv("TEAM_DATA_ID");

    ScheduleCreateRequest body =
        new ScheduleCreateRequest()
            .data(
                new ScheduleCreateRequestData()
                    .attributes(
                        new ScheduleCreateRequestDataAttributes()
                            .layers(
                                Collections.singletonList(
                                    new ScheduleCreateRequestDataAttributesLayersItems()
                                        .effectiveDate(OffsetDateTime.now().plusDays(-10))
                                        .endDate(OffsetDateTime.now().plusDays(10))
                                        .interval(
                                            new ScheduleCreateRequestDataAttributesLayersItemsInterval()
                                                .days(1))
                                        .members(
                                            Collections.singletonList(
                                                new ScheduleCreateRequestDataAttributesLayersItemsMembersItems()
                                                    .user(
                                                        new ScheduleCreateRequestDataAttributesLayersItemsMembersItemsUser()
                                                            .id(USER_DATA_ID))))
                                        .name("Layer 1")
                                        .restrictions(
                                            Collections.singletonList(
                                                new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItems()
                                                    .endDay(
                                                        ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
                                                            .FRIDAY)
                                                    .endTime("17:00:00")
                                                    .startDay(
                                                        ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
                                                            .MONDAY)
                                                    .startTime("09:00:00")))
                                        .rotationStart(OffsetDateTime.now().plusDays(-5))))
                            .name("Example-On-Call")
                            .tags(Arrays.asList("tag1", "tag2"))
                            .timeZone("America/New_York"))
                    .relationships(
                        new ScheduleCreateRequestDataRelationships()
                            .teams(
                                new ScheduleCreateRequestDataRelationshipsTeams()
                                    .data(
                                        Collections.singletonList(
                                            new ScheduleCreateRequestDataRelationshipsTeamsDataItems()
                                                .id(TEAM_DATA_ID)
                                                .type(
                                                    ScheduleCreateRequestDataRelationshipsTeamsDataItemsType
                                                        .TEAMS)))))
                    .type(ScheduleCreateRequestDataType.SCHEDULES));

    try {
      Schedule result = apiInstance.createOnCallSchedule(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#createOnCallSchedule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
