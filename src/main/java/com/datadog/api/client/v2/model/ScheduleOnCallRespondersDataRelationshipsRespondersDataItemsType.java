/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.datadog.api.client.ModelEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Identifies the resource type for a responder group linked to a schedule's on-call responders
 * lookup.
 */
@JsonSerialize(
    using =
        ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsType
            .ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsTypeSerializer.class)
public class ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsType
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("schedule_oncall_responder"));

  public static final ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsType
      SCHEDULE_ONCALL_RESPONDER =
          new ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsType(
              "schedule_oncall_responder");

  ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsType(String value) {
    super(value, allowedValues);
  }

  public static class ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsTypeSerializer
      extends StdSerializer<ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsType> {
    public ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsTypeSerializer(
        Class<ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsType> t) {
      super(t);
    }

    public ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsType fromValue(
      String value) {
    return new ScheduleOnCallRespondersDataRelationshipsRespondersDataItemsType(value);
  }
}
