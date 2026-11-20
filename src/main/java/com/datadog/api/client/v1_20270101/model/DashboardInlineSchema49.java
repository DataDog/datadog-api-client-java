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
@JsonSerialize(using = DashboardInlineSchema49.DashboardInlineSchema49Serializer.class)
public class DashboardInlineSchema49 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("custom_bg", "custom_text", "custom_image"));

  public static final DashboardInlineSchema49 CUSTOM_BG = new DashboardInlineSchema49("custom_bg");
  public static final DashboardInlineSchema49 CUSTOM_TEXT =
      new DashboardInlineSchema49("custom_text");
  public static final DashboardInlineSchema49 CUSTOM_IMAGE =
      new DashboardInlineSchema49("custom_image");

  DashboardInlineSchema49(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema49Serializer
      extends StdSerializer<DashboardInlineSchema49> {
    public DashboardInlineSchema49Serializer(Class<DashboardInlineSchema49> t) {
      super(t);
    }

    public DashboardInlineSchema49Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema49 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema49 fromValue(String value) {
    return new DashboardInlineSchema49(value);
  }
}
