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

/** Resource type of an LLM Observability patterns configuration. */
@JsonSerialize(using = LLMObsPatternsConfigType.LLMObsPatternsConfigTypeSerializer.class)
public class LLMObsPatternsConfigType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("topic_discovery_configs"));

  public static final LLMObsPatternsConfigType TOPIC_DISCOVERY_CONFIGS =
      new LLMObsPatternsConfigType("topic_discovery_configs");

  LLMObsPatternsConfigType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsPatternsConfigTypeSerializer
      extends StdSerializer<LLMObsPatternsConfigType> {
    public LLMObsPatternsConfigTypeSerializer(Class<LLMObsPatternsConfigType> t) {
      super(t);
    }

    public LLMObsPatternsConfigTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsPatternsConfigType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsPatternsConfigType fromValue(String value) {
    return new LLMObsPatternsConfigType(value);
  }
}
