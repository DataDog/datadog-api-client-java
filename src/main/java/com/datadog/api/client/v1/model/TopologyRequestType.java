/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1.model;

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

/** Widget request type. */
@JsonSerialize(using = TopologyRequestType.TopologyRequestTypeSerializer.class)
public class TopologyRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("topology"));

  public static final TopologyRequestType TOPOLOGY = new TopologyRequestType("topology");

  TopologyRequestType(String value) {
    super(value, allowedValues);
  }

  public static class TopologyRequestTypeSerializer extends StdSerializer<TopologyRequestType> {
    public TopologyRequestTypeSerializer(Class<TopologyRequestType> t) {
      super(t);
    }

    public TopologyRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TopologyRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TopologyRequestType fromValue(String value) {
    return new TopologyRequestType(value);
  }
}
