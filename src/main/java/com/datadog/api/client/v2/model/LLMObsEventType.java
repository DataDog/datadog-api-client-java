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

/** Resource type for LLM Observability experiment events. */
@JsonSerialize(using = LLMObsEventType.LLMObsEventTypeSerializer.class)
public class LLMObsEventType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("events"));

  public static final LLMObsEventType EVENTS = new LLMObsEventType("events");

  LLMObsEventType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsEventTypeSerializer extends StdSerializer<LLMObsEventType> {
    public LLMObsEventTypeSerializer(Class<LLMObsEventType> t) {
      super(t);
    }

    public LLMObsEventTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(LLMObsEventType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsEventType fromValue(String value) {
    return new LLMObsEventType(value);
  }
}
