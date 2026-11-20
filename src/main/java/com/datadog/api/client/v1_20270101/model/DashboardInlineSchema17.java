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
@JsonSerialize(using = DashboardInlineSchema17.DashboardInlineSchema17Serializer.class)
public class DashboardInlineSchema17 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("auto", "compact", "full", "fit-content"));

  public static final DashboardInlineSchema17 AUTO = new DashboardInlineSchema17("auto");
  public static final DashboardInlineSchema17 COMPACT = new DashboardInlineSchema17("compact");
  public static final DashboardInlineSchema17 FULL = new DashboardInlineSchema17("full");
  public static final DashboardInlineSchema17 FIT_CONTENT =
      new DashboardInlineSchema17("fit-content");

  DashboardInlineSchema17(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema17Serializer
      extends StdSerializer<DashboardInlineSchema17> {
    public DashboardInlineSchema17Serializer(Class<DashboardInlineSchema17> t) {
      super(t);
    }

    public DashboardInlineSchema17Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema17 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema17 fromValue(String value) {
    return new DashboardInlineSchema17(value);
  }
}
