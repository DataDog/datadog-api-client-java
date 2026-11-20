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
    using = NumberBarTableColumnFormatMode.NumberBarTableColumnFormatModeSerializer.class)
public class NumberBarTableColumnFormatMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("number", "bar"));

  public static final NumberBarTableColumnFormatMode NUMBER =
      new NumberBarTableColumnFormatMode("number");
  public static final NumberBarTableColumnFormatMode BAR =
      new NumberBarTableColumnFormatMode("bar");

  NumberBarTableColumnFormatMode(String value) {
    super(value, allowedValues);
  }

  public static class NumberBarTableColumnFormatModeSerializer
      extends StdSerializer<NumberBarTableColumnFormatMode> {
    public NumberBarTableColumnFormatModeSerializer(Class<NumberBarTableColumnFormatMode> t) {
      super(t);
    }

    public NumberBarTableColumnFormatModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NumberBarTableColumnFormatMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NumberBarTableColumnFormatMode fromValue(String value) {
    return new NumberBarTableColumnFormatMode(value);
  }
}
