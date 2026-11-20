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
@JsonSerialize(
    using =
        BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944
            .BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944Serializer.class)
public class BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944 extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("ddsql"));

  public static final BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944 DDSQL =
      new BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944("ddsql");

  BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944(String value) {
    super(value, allowedValues);
  }

  public static class BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944Serializer
      extends StdSerializer<BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944> {
    public BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944Serializer(
        Class<BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944> t) {
      super(t);
    }

    public BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944Serializer() {
      this(null);
    }

    @Override
    public void serialize(
        BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944 value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944 fromValue(String value) {
    return new BarChartBackendRequestAnyOfAnyOfItemRequestType4443922944(value);
  }
}
