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
@JsonSerialize(using = DashboardInlineSchema44.DashboardInlineSchema44Serializer.class)
public class DashboardInlineSchema44 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("*", "integer"));

  public static final DashboardInlineSchema44 ALL = new DashboardInlineSchema44("*");
  public static final DashboardInlineSchema44 INTEGER = new DashboardInlineSchema44("integer");

  DashboardInlineSchema44(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema44Serializer
      extends StdSerializer<DashboardInlineSchema44> {
    public DashboardInlineSchema44Serializer(Class<DashboardInlineSchema44> t) {
      super(t);
    }

    public DashboardInlineSchema44Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema44 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema44 fromValue(String value) {
    return new DashboardInlineSchema44(value);
  }
}
