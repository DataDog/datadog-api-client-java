// Update On-Call schedule returns "OK" response
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.ApiException;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.DataRelationshipsTeams;
import com.datadog.api.client.v2.model.DataRelationshipsTeamsDataItems;
import com.datadog.api.client.v2.model.DataRelationshipsTeamsDataItemsType;
import com.datadog.api.client.v2.model.LayerAttributesInterval;
import com.datadog.api.client.v2.model.Schedule;
import com.datadog.api.client.v2.model.ScheduleRequestDataAttributesLayersItemsMembersItems;
import com.datadog.api.client.v2.model.ScheduleRequestDataAttributesLayersItemsMembersItemsUser;
import com.datadog.api.client.v2.model.ScheduleUpdateRequest;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestData;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataAttributes;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataAttributesLayersItems;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataRelationships;
import com.datadog.api.client.v2.model.ScheduleUpdateRequestDataType;
import com.datadog.api.client.v2.model.TimeRestriction;
import com.datadog.api.client.v2.model.Weekday;
import java.time.OffsetDateTime;
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

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

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
                                        .interval(new LayerAttributesInterval().seconds(3600L))
                                        .members(
                                            Collections.singletonList(
                                                new ScheduleRequestDataAttributesLayersItemsMembersItems()
                                                    .user(
                                                        new ScheduleRequestDataAttributesLayersItemsMembersItemsUser()
                                                            .id(USER_DATA_ID))))
                                        .name("Layer 1")
                                        .restrictions(
                                            Collections.singletonList(
                                                new TimeRestriction()
                                                    .endDay(Weekday.FRIDAY)
                                                    .endTime("17:00:00")
                                                    .startDay(Weekday.MONDAY)
                                                    .startTime("09:00:00")))
                                        .rotationStart(OffsetDateTime.now().plusDays(-5))))
                            .name("Example-On-Call")
                            .timeZone("America/New_York"))
                    .relationships(
                        new ScheduleUpdateRequestDataRelationships()
                            .teams(
                                new DataRelationshipsTeams()
                                    .data(
                                        Collections.singletonList(
                                            new DataRelationshipsTeamsDataItems()
                                                .id(DD_TEAM_DATA_ID)
                                                .type(DataRelationshipsTeamsDataItemsType.TEAMS)))))
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
