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
@JsonSerialize(using = DashboardInlineSchema23.DashboardInlineSchema23Serializer.class)
public class DashboardInlineSchema23 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "compact", "full", "fit-content"));

  public static final DashboardInlineSchema23 AUTO = new DashboardInlineSchema23("auto");
  public static final DashboardInlineSchema23 COMPACT = new DashboardInlineSchema23("compact");
  public static final DashboardInlineSchema23 FULL = new DashboardInlineSchema23("full");
  public static final DashboardInlineSchema23 FIT_CONTENT =
      new DashboardInlineSchema23("fit-content");

  DashboardInlineSchema23(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema23Serializer
      extends StdSerializer<DashboardInlineSchema23> {
    public DashboardInlineSchema23Serializer(Class<DashboardInlineSchema23> t) {
      super(t);
    }

    public DashboardInlineSchema23Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema23 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema23 fromValue(String value) {
    return new DashboardInlineSchema23(value);
  }
}
