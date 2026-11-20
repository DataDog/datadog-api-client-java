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
@JsonSerialize(using = DashboardInlineSchema18.DashboardInlineSchema18Serializer.class)
public class DashboardInlineSchema18 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "compact", "full", "fit-content"));

  public static final DashboardInlineSchema18 AUTO = new DashboardInlineSchema18("auto");
  public static final DashboardInlineSchema18 COMPACT = new DashboardInlineSchema18("compact");
  public static final DashboardInlineSchema18 FULL = new DashboardInlineSchema18("full");
  public static final DashboardInlineSchema18 FIT_CONTENT =
      new DashboardInlineSchema18("fit-content");

  DashboardInlineSchema18(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema18Serializer
      extends StdSerializer<DashboardInlineSchema18> {
    public DashboardInlineSchema18Serializer(Class<DashboardInlineSchema18> t) {
      super(t);
    }

    public DashboardInlineSchema18Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema18 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema18 fromValue(String value) {
    return new DashboardInlineSchema18(value);
  }
}
