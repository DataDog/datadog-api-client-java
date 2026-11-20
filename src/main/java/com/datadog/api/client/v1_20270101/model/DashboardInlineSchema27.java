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
@JsonSerialize(using = DashboardInlineSchema27.DashboardInlineSchema27Serializer.class)
public class DashboardInlineSchema27 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "compact", "full", "fit-content"));

  public static final DashboardInlineSchema27 AUTO = new DashboardInlineSchema27("auto");
  public static final DashboardInlineSchema27 COMPACT = new DashboardInlineSchema27("compact");
  public static final DashboardInlineSchema27 FULL = new DashboardInlineSchema27("full");
  public static final DashboardInlineSchema27 FIT_CONTENT =
      new DashboardInlineSchema27("fit-content");

  DashboardInlineSchema27(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema27Serializer
      extends StdSerializer<DashboardInlineSchema27> {
    public DashboardInlineSchema27Serializer(Class<DashboardInlineSchema27> t) {
      super(t);
    }

    public DashboardInlineSchema27Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema27 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema27 fromValue(String value) {
    return new DashboardInlineSchema27(value);
  }
}
