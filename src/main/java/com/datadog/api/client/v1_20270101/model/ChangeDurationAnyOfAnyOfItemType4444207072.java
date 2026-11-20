/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(
    using =
        ChangeDurationAnyOfAnyOfItemType4444207072
            .ChangeDurationAnyOfAnyOfItemType4444207072Serializer.class)
public class ChangeDurationAnyOfAnyOfItemType4444207072 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("previous_timeframe", "previous_day", "previous_week", "previous_month"));

  public static final ChangeDurationAnyOfAnyOfItemType4444207072 PREVIOUS_TIMEFRAME =
      new ChangeDurationAnyOfAnyOfItemType4444207072("previous_timeframe");
  public static final ChangeDurationAnyOfAnyOfItemType4444207072 PREVIOUS_DAY =
      new ChangeDurationAnyOfAnyOfItemType4444207072("previous_day");
  public static final ChangeDurationAnyOfAnyOfItemType4444207072 PREVIOUS_WEEK =
      new ChangeDurationAnyOfAnyOfItemType4444207072("previous_week");
  public static final ChangeDurationAnyOfAnyOfItemType4444207072 PREVIOUS_MONTH =
      new ChangeDurationAnyOfAnyOfItemType4444207072("previous_month");

  ChangeDurationAnyOfAnyOfItemType4444207072(String value) {
    super(value, allowedValues);
  }

  public static class ChangeDurationAnyOfAnyOfItemType4444207072Serializer
      extends StdSerializer<ChangeDurationAnyOfAnyOfItemType4444207072> {
    public ChangeDurationAnyOfAnyOfItemType4444207072Serializer(
        Class<ChangeDurationAnyOfAnyOfItemType4444207072> t) {
      super(t);
    }

    public ChangeDurationAnyOfAnyOfItemType4444207072Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        ChangeDurationAnyOfAnyOfItemType4444207072 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ChangeDurationAnyOfAnyOfItemType4444207072 fromValue(String value) {
    return new ChangeDurationAnyOfAnyOfItemType4444207072(value);
  }
}
