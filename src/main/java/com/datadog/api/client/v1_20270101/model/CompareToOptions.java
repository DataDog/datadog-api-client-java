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
@JsonSerialize(using = CompareToOptions.CompareToOptionsSerializer.class)
public class CompareToOptions extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("hour_before", "day_before", "week_before", "month_before"));

  public static final CompareToOptions HOUR_BEFORE = new CompareToOptions("hour_before");
  public static final CompareToOptions DAY_BEFORE = new CompareToOptions("day_before");
  public static final CompareToOptions WEEK_BEFORE = new CompareToOptions("week_before");
  public static final CompareToOptions MONTH_BEFORE = new CompareToOptions("month_before");

  CompareToOptions(String value) {
    super(value, allowedValues);
  }

  public static class CompareToOptionsSerializer extends StdSerializer<CompareToOptions> {
    public CompareToOptionsSerializer(Class<CompareToOptions> t) {
      super(t);
    }

    public CompareToOptionsSerializer() {
      this(null);
    }

    @Override
    public void serialize(CompareToOptions value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CompareToOptions fromValue(String value) {
    return new CompareToOptions(value);
  }
}
