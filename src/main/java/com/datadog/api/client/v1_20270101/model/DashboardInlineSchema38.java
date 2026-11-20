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
@JsonSerialize(using = DashboardInlineSchema38.DashboardInlineSchema38Serializer.class)
public class DashboardInlineSchema38 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("id", "title", "subtitle"));

  public static final DashboardInlineSchema38 ID = new DashboardInlineSchema38("id");
  public static final DashboardInlineSchema38 TITLE = new DashboardInlineSchema38("title");
  public static final DashboardInlineSchema38 SUBTITLE = new DashboardInlineSchema38("subtitle");

  DashboardInlineSchema38(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema38Serializer
      extends StdSerializer<DashboardInlineSchema38> {
    public DashboardInlineSchema38Serializer(Class<DashboardInlineSchema38> t) {
      super(t);
    }

    public DashboardInlineSchema38Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema38 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema38 fromValue(String value) {
    return new DashboardInlineSchema38(value);
  }
}
