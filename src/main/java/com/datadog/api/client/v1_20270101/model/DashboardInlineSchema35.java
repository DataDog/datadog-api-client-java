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
@JsonSerialize(using = DashboardInlineSchema35.DashboardInlineSchema35Serializer.class)
public class DashboardInlineSchema35 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "compact", "full", "fit-content"));

  public static final DashboardInlineSchema35 AUTO = new DashboardInlineSchema35("auto");
  public static final DashboardInlineSchema35 COMPACT = new DashboardInlineSchema35("compact");
  public static final DashboardInlineSchema35 FULL = new DashboardInlineSchema35("full");
  public static final DashboardInlineSchema35 FIT_CONTENT =
      new DashboardInlineSchema35("fit-content");

  DashboardInlineSchema35(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema35Serializer
      extends StdSerializer<DashboardInlineSchema35> {
    public DashboardInlineSchema35Serializer(Class<DashboardInlineSchema35> t) {
      super(t);
    }

    public DashboardInlineSchema35Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema35 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema35 fromValue(String value) {
    return new DashboardInlineSchema35(value);
  }
}
