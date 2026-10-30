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

/**
 * Node field the column fills. <code>title</code> is bold text at the top of the node; <code>
 * subtitle</code> is smaller text below it.
 */
@JsonSerialize(
    using = TopologyMapInlineNodeStringColumnId.TopologyMapInlineNodeStringColumnIdSerializer.class)
public class TopologyMapInlineNodeStringColumnId extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("title", "subtitle"));

  public static final TopologyMapInlineNodeStringColumnId TITLE =
      new TopologyMapInlineNodeStringColumnId("title");
  public static final TopologyMapInlineNodeStringColumnId SUBTITLE =
      new TopologyMapInlineNodeStringColumnId("subtitle");

  TopologyMapInlineNodeStringColumnId(String value) {
    super(value, allowedValues);
  }

  public static class TopologyMapInlineNodeStringColumnIdSerializer
      extends StdSerializer<TopologyMapInlineNodeStringColumnId> {
    public TopologyMapInlineNodeStringColumnIdSerializer(
        Class<TopologyMapInlineNodeStringColumnId> t) {
      super(t);
    }

    public TopologyMapInlineNodeStringColumnIdSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        TopologyMapInlineNodeStringColumnId value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TopologyMapInlineNodeStringColumnId fromValue(String value) {
    return new TopologyMapInlineNodeStringColumnId(value);
  }
}
