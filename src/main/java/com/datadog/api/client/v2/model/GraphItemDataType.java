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

/** Graph items resource type. */
@JsonSerialize(using = GraphItemDataType.GraphItemDataTypeSerializer.class)
public class GraphItemDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("graph_items"));

  public static final GraphItemDataType GRAPH_ITEMS = new GraphItemDataType("graph_items");

  GraphItemDataType(String value) {
    super(value, allowedValues);
  }

  public static class GraphItemDataTypeSerializer extends StdSerializer<GraphItemDataType> {
    public GraphItemDataTypeSerializer(Class<GraphItemDataType> t) {
      super(t);
    }

    public GraphItemDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(GraphItemDataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GraphItemDataType fromValue(String value) {
    return new GraphItemDataType(value);
  }
}
