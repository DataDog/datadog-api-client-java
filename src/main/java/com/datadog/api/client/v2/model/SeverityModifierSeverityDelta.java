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

/** The direction in which to shift the severity of matched findings by one rank. */
@JsonSerialize(using = SeverityModifierSeverityDelta.SeverityModifierSeverityDeltaSerializer.class)
public class SeverityModifierSeverityDelta extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("up_one", "down_one"));

  public static final SeverityModifierSeverityDelta UP_ONE =
      new SeverityModifierSeverityDelta("up_one");
  public static final SeverityModifierSeverityDelta DOWN_ONE =
      new SeverityModifierSeverityDelta("down_one");

  SeverityModifierSeverityDelta(String value) {
    super(value, allowedValues);
  }

  public static class SeverityModifierSeverityDeltaSerializer
      extends StdSerializer<SeverityModifierSeverityDelta> {
    public SeverityModifierSeverityDeltaSerializer(Class<SeverityModifierSeverityDelta> t) {
      super(t);
    }

    public SeverityModifierSeverityDeltaSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SeverityModifierSeverityDelta value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SeverityModifierSeverityDelta fromValue(String value) {
    return new SeverityModifierSeverityDelta(value);
  }
}
