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

/**
 * The JSON:API type for agentless host resources. The value should always be <code>agentless_host
 * </code>.
 */
@JsonSerialize(using = CsmAgentlessHostType.CsmAgentlessHostTypeSerializer.class)
public class CsmAgentlessHostType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("agentless_host"));

  public static final CsmAgentlessHostType AGENTLESS_HOST =
      new CsmAgentlessHostType("agentless_host");

  CsmAgentlessHostType(String value) {
    super(value, allowedValues);
  }

  public static class CsmAgentlessHostTypeSerializer extends StdSerializer<CsmAgentlessHostType> {
    public CsmAgentlessHostTypeSerializer(Class<CsmAgentlessHostType> t) {
      super(t);
    }

    public CsmAgentlessHostTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CsmAgentlessHostType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CsmAgentlessHostType fromValue(String value) {
    return new CsmAgentlessHostType(value);
  }
}
