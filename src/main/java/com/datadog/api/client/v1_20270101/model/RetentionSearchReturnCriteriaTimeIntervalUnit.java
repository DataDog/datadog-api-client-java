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
        RetentionSearchReturnCriteriaTimeIntervalUnit
            .RetentionSearchReturnCriteriaTimeIntervalUnitSerializer.class)
public class RetentionSearchReturnCriteriaTimeIntervalUnit extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("day", "week", "month"));

  public static final RetentionSearchReturnCriteriaTimeIntervalUnit DAY =
      new RetentionSearchReturnCriteriaTimeIntervalUnit("day");
  public static final RetentionSearchReturnCriteriaTimeIntervalUnit WEEK =
      new RetentionSearchReturnCriteriaTimeIntervalUnit("week");
  public static final RetentionSearchReturnCriteriaTimeIntervalUnit MONTH =
      new RetentionSearchReturnCriteriaTimeIntervalUnit("month");

  RetentionSearchReturnCriteriaTimeIntervalUnit(String value) {
    super(value, allowedValues);
  }

  public static class RetentionSearchReturnCriteriaTimeIntervalUnitSerializer
      extends StdSerializer<RetentionSearchReturnCriteriaTimeIntervalUnit> {
    public RetentionSearchReturnCriteriaTimeIntervalUnitSerializer(
        Class<RetentionSearchReturnCriteriaTimeIntervalUnit> t) {
      super(t);
    }

    public RetentionSearchReturnCriteriaTimeIntervalUnitSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RetentionSearchReturnCriteriaTimeIntervalUnit value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RetentionSearchReturnCriteriaTimeIntervalUnit fromValue(String value) {
    return new RetentionSearchReturnCriteriaTimeIntervalUnit(value);
  }
}
