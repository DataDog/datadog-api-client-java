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

/** Defines the day of the week on which the time restriction starts. */
@JsonSerialize(
    using =
        ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
            .ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDaySerializer
            .class)
public class ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      MONDAY =
          new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("monday");
  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      TUESDAY =
          new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("tuesday");
  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      WEDNESDAY =
          new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("wednesday");
  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      THURSDAY =
          new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("thursday");
  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      FRIDAY =
          new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("friday");
  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      SATURDAY =
          new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("saturday");
  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay
      SUNDAY =
          new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay("sunday");

  ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay(String value) {
    super(value, allowedValues);
  }

  public static
  class ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDaySerializer
      extends StdSerializer<
          ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay> {
    public ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDaySerializer(
        Class<ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay> t) {
      super(t);
    }

    public ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDaySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay fromValue(
      String value) {
    return new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsStartDay(value);
  }
}
