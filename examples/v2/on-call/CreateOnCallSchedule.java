// Create On-Call schedule returns "Created" response
import java.time.OffsetDateTime;

import com.datadog.api.client.ApiException;
import com.datadog.api.client.ApiClient;
import com.datadog.api.client.v2.api.OnCallApi;
import com.datadog.api.client.v2.model.Schedule;
import com.datadog.api.client.v2.model.DataRelationshipsTeams;
import com.datadog.api.client.v2.model.DataRelationshipsTeamsDataItems;
import com.datadog.api.client.v2.model.DataRelationshipsTeamsDataItemsType;
import com.datadog.api.client.v2.model.LayerAttributesInterval;
import com.datadog.api.client.v2.model.ScheduleCreateRequest;
import com.datadog.api.client.v2.model.ScheduleCreateRequestData;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataAttributes;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataAttributesLayersItems;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataRelationships;
import com.datadog.api.client.v2.model.ScheduleCreateRequestDataType;
import com.datadog.api.client.v2.model.ScheduleRequestDataAttributesLayersItemsMembersItems;
import com.datadog.api.client.v2.model.ScheduleRequestDataAttributesLayersItemsMembersItemsUser;
import com.datadog.api.client.v2.model.TimeRestriction;
import com.datadog.api.client.v2.model.Weekday;
import java.io.File;
import java.time.OffsetDateTime;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = ApiClient.getDefaultApiClient();
    OnCallApi apiInstance = new OnCallApi(defaultClient);

    // there is a valid "user" in the system
    String USER_DATA_ID = System.getenv("USER_DATA_ID");

    // there is a valid "dd_team" in the system
    String DD_TEAM_DATA_ID = System.getenv("DD_TEAM_DATA_ID");

    ScheduleCreateRequest body = new ScheduleCreateRequest()
.data(new ScheduleCreateRequestData()
.attributes(new ScheduleCreateRequestDataAttributes()
.layers(Collections.singletonList(new ScheduleCreateRequestDataAttributesLayersItems()
.effectiveDate(OffsetDateTime.now().plusDays(-10))
.endDate(OffsetDateTime.now().plusDays(10))
.interval(new LayerAttributesInterval()
.days(1))
.members(Collections.singletonList(new ScheduleRequestDataAttributesLayersItemsMembersItems()
.user(new ScheduleRequestDataAttributesLayersItemsMembersItemsUser()
.id(USER_DATA_ID))))
.name("Layer 1")
.restrictions(Collections.singletonList(new TimeRestriction()
.endDay(Weekday.FRIDAY)
.endTime("17:00:00")
.startDay(Weekday.MONDAY)
.startTime("09:00:00")))
.rotationStart(OffsetDateTime.now().plusDays(-5))))
.name("Example-On-Call")
.timeZone("America/New_York"))
.relationships(new ScheduleCreateRequestDataRelationships()
.teams(new DataRelationshipsTeams()
.data(Collections.singletonList(new DataRelationshipsTeamsDataItems()
.id(DD_TEAM_DATA_ID)
.type(DataRelationshipsTeamsDataItemsType.TEAMS)))))
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