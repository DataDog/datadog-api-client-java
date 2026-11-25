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
@JsonSerialize(using = DashboardInlineSchema25.DashboardInlineSchema25Serializer.class)
public class DashboardInlineSchema25 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "compact", "full", "fit-content"));

  public static final DashboardInlineSchema25 AUTO = new DashboardInlineSchema25("auto");
  public static final DashboardInlineSchema25 COMPACT = new DashboardInlineSchema25("compact");
  public static final DashboardInlineSchema25 FULL = new DashboardInlineSchema25("full");
  public static final DashboardInlineSchema25 FIT_CONTENT =
      new DashboardInlineSchema25("fit-content");

  DashboardInlineSchema25(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema25Serializer
      extends StdSerializer<DashboardInlineSchema25> {
    public DashboardInlineSchema25Serializer(Class<DashboardInlineSchema25> t) {
      super(t);
    }

    public DashboardInlineSchema25Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema25 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema25 fromValue(String value) {
    return new DashboardInlineSchema25(value);
  }
}
