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
@JsonSerialize(using = DashboardInlineSchema37.DashboardInlineSchema37Serializer.class)
public class DashboardInlineSchema37 extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("process", "container"));

  public static final DashboardInlineSchema37 PROCESS = new DashboardInlineSchema37("process");
  public static final DashboardInlineSchema37 CONTAINER = new DashboardInlineSchema37("container");

  DashboardInlineSchema37(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema37Serializer
      extends StdSerializer<DashboardInlineSchema37> {
    public DashboardInlineSchema37Serializer(Class<DashboardInlineSchema37> t) {
      super(t);
    }

    public DashboardInlineSchema37Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema37 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema37 fromValue(String value) {
    return new DashboardInlineSchema37(value);
  }
}
