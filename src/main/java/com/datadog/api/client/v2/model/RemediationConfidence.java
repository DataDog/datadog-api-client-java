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

/** The agent's self-rated confidence in a plan. */
@JsonSerialize(using = RemediationConfidence.RemediationConfidenceSerializer.class)
public class RemediationConfidence extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("low", "medium", "high"));

  public static final RemediationConfidence LOW = new RemediationConfidence("low");
  public static final RemediationConfidence MEDIUM = new RemediationConfidence("medium");
  public static final RemediationConfidence HIGH = new RemediationConfidence("high");

  RemediationConfidence(String value) {
    super(value, allowedValues);
  }

  public static class RemediationConfidenceSerializer extends StdSerializer<RemediationConfidence> {
    public RemediationConfidenceSerializer(Class<RemediationConfidence> t) {
      super(t);
    }

    public RemediationConfidenceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RemediationConfidence value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RemediationConfidence fromValue(String value) {
    return new RemediationConfidence(value);
  }
}
