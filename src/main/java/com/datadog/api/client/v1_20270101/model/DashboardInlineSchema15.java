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
@JsonSerialize(using = DashboardInlineSchema15.DashboardInlineSchema15Serializer.class)
public class DashboardInlineSchema15 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "compact", "full", "fit-content"));

  public static final DashboardInlineSchema15 AUTO = new DashboardInlineSchema15("auto");
  public static final DashboardInlineSchema15 COMPACT = new DashboardInlineSchema15("compact");
  public static final DashboardInlineSchema15 FULL = new DashboardInlineSchema15("full");
  public static final DashboardInlineSchema15 FIT_CONTENT =
      new DashboardInlineSchema15("fit-content");

  DashboardInlineSchema15(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema15Serializer
      extends StdSerializer<DashboardInlineSchema15> {
    public DashboardInlineSchema15Serializer(Class<DashboardInlineSchema15> t) {
      super(t);
    }

    public DashboardInlineSchema15Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema15 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema15 fromValue(String value) {
    return new DashboardInlineSchema15(value);
  }
}
