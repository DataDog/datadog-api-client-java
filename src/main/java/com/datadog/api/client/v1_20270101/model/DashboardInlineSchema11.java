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
@JsonSerialize(using = DashboardInlineSchema11.DashboardInlineSchema11Serializer.class)
public class DashboardInlineSchema11 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("none"));

  public static final DashboardInlineSchema11 NONE = new DashboardInlineSchema11("none");

  DashboardInlineSchema11(String value) {
    super(value, allowedValues);
  }

  public static class DashboardInlineSchema11Serializer
      extends StdSerializer<DashboardInlineSchema11> {
    public DashboardInlineSchema11Serializer(Class<DashboardInlineSchema11> t) {
      super(t);
    }

    public DashboardInlineSchema11Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        DashboardInlineSchema11 value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DashboardInlineSchema11 fromValue(String value) {
    return new DashboardInlineSchema11(value);
  }
}
