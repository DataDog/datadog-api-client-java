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

/** The weekday when the restriction period starts (Monday through Sunday). */
@JsonSerialize(
    using =
        ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
            .ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDaySerializer
            .class)
public class ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      MONDAY =
          new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("monday");
  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      TUESDAY =
          new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("tuesday");
  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      WEDNESDAY =
          new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("wednesday");
  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      THURSDAY =
          new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("thursday");
  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      FRIDAY =
          new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("friday");
  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      SATURDAY =
          new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("saturday");
  public static final ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      SUNDAY =
          new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("sunday");

  ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay(String value) {
    super(value, allowedValues);
  }

  public static
  class ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDaySerializer
      extends StdSerializer<
          ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay> {
    public ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDaySerializer(
        Class<ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay> t) {
      super(t);
    }

    public ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDaySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay fromValue(
      String value) {
    return new ScheduleCreateRequestDataAttributesLayersItemsRestrictionsItemsStartDay(value);
  }
}
