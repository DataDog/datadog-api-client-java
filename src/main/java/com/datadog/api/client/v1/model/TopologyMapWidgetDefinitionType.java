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

/** Type of the topology map widget. */
@JsonSerialize(
    using = TopologyMapWidgetDefinitionType.TopologyMapWidgetDefinitionTypeSerializer.class)
public class TopologyMapWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("topology_map"));

  public static final TopologyMapWidgetDefinitionType TOPOLOGY_MAP =
      new TopologyMapWidgetDefinitionType("topology_map");

  TopologyMapWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class TopologyMapWidgetDefinitionTypeSerializer
      extends StdSerializer<TopologyMapWidgetDefinitionType> {
    public TopologyMapWidgetDefinitionTypeSerializer(Class<TopologyMapWidgetDefinitionType> t) {
      super(t);
    }

    public TopologyMapWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TopologyMapWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TopologyMapWidgetDefinitionType fromValue(String value) {
    return new TopologyMapWidgetDefinitionType(value);
  }
}
