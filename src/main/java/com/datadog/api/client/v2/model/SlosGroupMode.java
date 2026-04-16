/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

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

/** How SLO results are grouped in the response. */
@JsonSerialize(using = SlosGroupMode.SlosGroupModeSerializer.class)
public class SlosGroupMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("overall", "components"));

  public static final SlosGroupMode OVERALL = new SlosGroupMode("overall");
  public static final SlosGroupMode COMPONENTS = new SlosGroupMode("components");

  SlosGroupMode(String value) {
    super(value, allowedValues);
  }

  public static class SlosGroupModeSerializer extends StdSerializer<SlosGroupMode> {
    public SlosGroupModeSerializer(Class<SlosGroupMode> t) {
      super(t);
    }

    public SlosGroupModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(SlosGroupMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SlosGroupMode fromValue(String value) {
    return new SlosGroupMode(value);
  }
}
