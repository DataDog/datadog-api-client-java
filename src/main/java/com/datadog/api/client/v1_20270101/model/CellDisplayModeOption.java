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
@JsonSerialize(using = CellDisplayModeOption.CellDisplayModeOptionSerializer.class)
public class CellDisplayModeOption extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("number", "bar", "trend"));

  public static final CellDisplayModeOption NUMBER = new CellDisplayModeOption("number");
  public static final CellDisplayModeOption BAR = new CellDisplayModeOption("bar");
  public static final CellDisplayModeOption TREND = new CellDisplayModeOption("trend");

  CellDisplayModeOption(String value) {
    super(value, allowedValues);
  }

  public static class CellDisplayModeOptionSerializer extends StdSerializer<CellDisplayModeOption> {
    public CellDisplayModeOptionSerializer(Class<CellDisplayModeOption> t) {
      super(t);
    }

    public CellDisplayModeOptionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CellDisplayModeOption value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CellDisplayModeOption fromValue(String value) {
    return new CellDisplayModeOption(value);
  }
}
