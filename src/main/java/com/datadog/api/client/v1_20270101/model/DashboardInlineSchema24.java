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
@JsonSerialize(using = DashboardInlineSchema24.DashboardInlineSchema24Serializer.class)
public class DashboardInlineSchema24 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "compact", "full", "fit-content"));

  public static final DashboardInlineSchema24 AUTO = new DashboardInlineSchema24("auto");
  public static final DashboardInlineSchema24 COMPACT = new DashboardInlineSchema24("compact");
  public static final DashboardInlineSchema24 FULL = new DashboardInlineSchema24("full");
  public static final DashboardInlineSchema24 FIT_CONTENT =
      new DashboardInlineSchema24("fit-content");

  DashboardInlineSchema24(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema24Serializer
      extends StdSerializer<DashboardInlineSchema24> {
    public DashboardInlineSchema24Serializer(Class<DashboardInlineSchema24> t) {
      super(t);
    }

    public DashboardInlineSchema24Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema24 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema24 fromValue(String value) {
    return new DashboardInlineSchema24(value);
  }
}
