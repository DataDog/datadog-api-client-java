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
@JsonSerialize(using = DashboardInlineSchema21.DashboardInlineSchema21Serializer.class)
public class DashboardInlineSchema21 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "compact", "full", "fit-content"));

  public static final DashboardInlineSchema21 AUTO = new DashboardInlineSchema21("auto");
  public static final DashboardInlineSchema21 COMPACT = new DashboardInlineSchema21("compact");
  public static final DashboardInlineSchema21 FULL = new DashboardInlineSchema21("full");
  public static final DashboardInlineSchema21 FIT_CONTENT =
      new DashboardInlineSchema21("fit-content");

  DashboardInlineSchema21(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema21Serializer
      extends StdSerializer<DashboardInlineSchema21> {
    public DashboardInlineSchema21Serializer(Class<DashboardInlineSchema21> t) {
      super(t);
    }

    public DashboardInlineSchema21Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema21 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema21 fromValue(String value) {
    return new DashboardInlineSchema21(value);
  }
}
