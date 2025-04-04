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

/** Defines the day of the week on which the time restriction ends. */
@JsonSerialize(
    using =
        ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
            .ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDaySerializer.class)
public class ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "monday", "tuesday", "wednesday", "thursday", "friday", "saturday", "sunday"));

  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay MONDAY =
      new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("monday");
  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
      TUESDAY =
          new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("tuesday");
  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
      WEDNESDAY =
          new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("wednesday");
  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
      THURSDAY =
          new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("thursday");
  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay FRIDAY =
      new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("friday");
  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay
      SATURDAY =
          new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("saturday");
  public static final ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay SUNDAY =
      new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay("sunday");

  ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay(String value) {
    super(value, allowedValues);
  }

  public static
  class ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDaySerializer
      extends StdSerializer<ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay> {
    public ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDaySerializer(
        Class<ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay> t) {
      super(t);
    }

    public ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDaySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay fromValue(
      String value) {
    return new ScheduleUpdateRequestDataAttributesLayersItemsRestrictionsItemsEndDay(value);
  }
}
