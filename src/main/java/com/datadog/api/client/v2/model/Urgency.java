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

/** Specifies the level of urgency for a routing rule (low, high, or dynamic). */
@JsonSerialize(using = Urgency.UrgencySerializer.class)
public class Urgency extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("low", "high", "dynamic"));

  public static final Urgency LOW = new Urgency("low");
  public static final Urgency HIGH = new Urgency("high");
  public static final Urgency DYNAMIC = new Urgency("dynamic");

  Urgency(String value) {
    super(value, allowedValues);
  }

  public static class UrgencySerializer extends StdSerializer<Urgency> {
    public UrgencySerializer(Class<Urgency> t) {
      super(t);
    }

    public UrgencySerializer() {
      this(null);
    }

    @Override
    public void serialize(Urgency value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static Urgency fromValue(String value) {
    return new Urgency(value);
  }
}
