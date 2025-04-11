// Update on-call schedule returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.Schedule;
import com.datadog.api.client.v2.model.ScheduleUpdateRequest;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestData;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataAttributes;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataAttributesLayersItems;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataAttributesLayersItemsInterval;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataAttributesLayersItemsMembersItems;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataAttributesLayersItemsMembersItemsUser;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItems;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataRelationships;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataRelationshipsTeams;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataRelationshipsTeamsDataItems;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataRelationshipsTeamsDataItemsType;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataType;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "schedule" in the system
    String SCHEDULE_DATA_ID = System.getenv("SCHEDULE_DATA_ID");
    String SCHEDULE_DATA_RELATIONSHIPS_LAYERS_DATA_0_ID =
        System.getenv("SCHEDULE_DATA_RELATIONSHIPS_LAYERS_DATA_0_ID");

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    // there is a valid "team" in the system
    String TEAM_DATA_ID = System.getenv("TEAM_DATA_ID");

    ScheduleUpdateRequest body =
        new ScheduleUpdateRequest()
            .data(
                new ScheduleUpdateRequestData()
                    .id(SCHEDULE_DATA_ID)
                    .attributes(
                        new ScheduleUpdateRequestDataAttributes()
                            .layers(
                                Collections.singletonList(
                                    new ScheduleUpdateRequestDataAttributesLayersItems()
                                        .id(SCHEDULE_DATA_RELATIONSHIPS_LAYERS_DATA_0_ID)
                                        .effectiveDate(OffsetDateTime.now().plusDays(-10))
                                        .endDate(OffsetDateTime.now().plusDays(10))
                                        .interval(
                                            new ScheduleUpdateRequestDataAttributesLayersItemsInterval()
                                                .seconds(300L))
                                        .members(
                                            Collections.singletonList(
                                                new ScheduleUpdateRequestDataAttributesLayersItemsMembersItems()
                                                    .user(
                                                        new ScheduleUpdateRequestDataAttributesLayersItemsMembersItemsUser()
                                                            .id(USER_DATA_ID))))
                                        .name("Layer 1")
                                        .restrictions(
                                            Collections.singletonList(
                                                new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItems()
                                                    .endDay(
                                                        ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
                                                            .FRIDAY)
                                                    .endTime("17:00:00")
                                                    .startDay(
                                                        ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
                                                            .MONDAY)
                                                    .startTime("09:00:00")))
                                        .rotationStart(OffsetDateTime.now().plusDays(-5))))
                            .name("Example-On-Call")
                            .tags(Arrays.asList("tag1", "tag2", "tag3"))
                            .timeZone("America/New_York"))
                    .relationships(
                        new ScheduleUpdateRequestDataRelationships()
                            .teams(
                                new ScheduleUpdateRequestDataRelationshipsTeams()
                                    .data(
                                        Collections.singletonList(
                                            new ScheduleUpdateRequestDataRelationshipsTeamsDataItems()
                                                .id(TEAM_DATA_ID)
                                                .type(
                                                    ScheduleUpdateRequestDataRelationshipsTeamsDataItemsType
                                                        .TEAMS)))))
                    .type(ScheduleUpdateRequestDataType.SCHEDULES));

    try {
      Schedule result = apiInstance.updateOnCallSchedule(SCHEDULE_DATA_ID, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OnCallApi#updateOnCallSchedule");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
