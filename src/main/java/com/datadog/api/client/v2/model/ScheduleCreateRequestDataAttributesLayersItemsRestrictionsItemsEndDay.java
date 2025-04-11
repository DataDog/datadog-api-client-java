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

/** The weekday when the restriction period ends (Monday through Sunday). */
@JsonSerialize(
    using =
        ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
            .ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDaySerializer.class)
public class ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay MONDAY =
      new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("monday");
  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
      TUESDAY =
          new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("tuesday");
  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
      WEDNESDAY =
          new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("wednesday");
  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
      THURSDAY =
          new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("thursday");
  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay FRIDAY =
      new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("friday");
  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
      SATURDAY =
          new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("saturday");
  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay SUNDAY =
      new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("sunday");

  ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay(String value) {
    super(value, allowedValues);
  }

  public static
  class ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDaySerializer
      extends StdSerializer<ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay> {
    public ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDaySerializer(
        Class<ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay> t) {
      super(t);
    }

    public ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDaySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay fromValue(
      String value) {
    return new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsEndDay(value);
  }
}
