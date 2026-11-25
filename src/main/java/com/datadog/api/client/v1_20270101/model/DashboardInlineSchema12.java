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
@JsonSerialize(using = DashboardInlineSchema12.DashboardInlineSchema12Serializer.class)
public class DashboardInlineSchema12 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "compact", "full", "fit-content"));

  public static final DashboardInlineSchema12 AUTO = new DashboardInlineSchema12("auto");
  public static final DashboardInlineSchema12 COMPACT = new DashboardInlineSchema12("compact");
  public static final DashboardInlineSchema12 FULL = new DashboardInlineSchema12("full");
  public static final DashboardInlineSchema12 FIT_CONTENT =
      new DashboardInlineSchema12("fit-content");

  DashboardInlineSchema12(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema12Serializer
      extends StdSerializer<DashboardInlineSchema12> {
    public DashboardInlineSchema12Serializer(Class<DashboardInlineSchema12> t) {
      super(t);
    }

    public DashboardInlineSchema12Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema12 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema12 fromValue(String value) {
    return new DashboardInlineSchema12(value);
  }
}
