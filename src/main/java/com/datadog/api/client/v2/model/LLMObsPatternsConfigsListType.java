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

/** Resource type of a list of LLM Observability patterns configurations. */
@JsonSerialize(using = LLMObsPatternsConfigsListType.LLMObsPatternsConfigsListTypeSerializer.class)
public class LLMObsPatternsConfigsListType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("list_topic_discovery_configs_response"));

  public static final LLMObsPatternsConfigsListType LIST_TOPIC_DISCOVERY_CONFIGS_RESPONSE =
      new LLMObsPatternsConfigsListType("list_topic_discovery_configs_response");

  LLMObsPatternsConfigsListType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsPatternsConfigsListTypeSerializer
      extends StdSerializer<LLMObsPatternsConfigsListType> {
    public LLMObsPatternsConfigsListTypeSerializer(Class<LLMObsPatternsConfigsListType> t) {
      super(t);
    }

    public LLMObsPatternsConfigsListTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsPatternsConfigsListType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsPatternsConfigsListType fromValue(String value) {
    return new LLMObsPatternsConfigsListType(value);
  }
}
