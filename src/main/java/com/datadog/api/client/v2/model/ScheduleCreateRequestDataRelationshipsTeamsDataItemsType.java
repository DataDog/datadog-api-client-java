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

/** Teams resource type. */
@JsonSerialize(
    using =
        ScheduleCreateRequestDataRelationshipsTeamsDataItemsType
            .ScheduleCreateRequestDataRelationshipsTeamsDataItemsTypeSerializer.class)
public class ScheduleCreateRequestDataRelationshipsTeamsDataItemsType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("teams"));

  public static final ScheduleCreateRequestDataRelationshipsTeamsDataItemsType TEAMS =
      new ScheduleCreateRequestDataRelationshipsTeamsDataItemsType("teams");

  ScheduleCreateRequestDataRelationshipsTeamsDataItemsType(String value) {
    super(value, allowedValues);
  }

  public static class ScheduleCreateRequestDataRelationshipsTeamsDataItemsTypeSerializer
      extends StdSerializer<ScheduleCreateRequestDataRelationshipsTeamsDataItemsType> {
    public ScheduleCreateRequestDataRelationshipsTeamsDataItemsTypeSerializer(
        Class<ScheduleCreateRequestDataRelationshipsTeamsDataItemsType> t) {
      super(t);
    }

    public ScheduleCreateRequestDataRelationshipsTeamsDataItemsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScheduleCreateRequestDataRelationshipsTeamsDataItemsType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScheduleCreateRequestDataRelationshipsTeamsDataItemsType fromValue(String value) {
    return new ScheduleCreateRequestDataRelationshipsTeamsDataItemsType(value);
  }
}
