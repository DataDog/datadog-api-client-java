/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v1_20270101.model;

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

/** Test-only generated schema for the dashboard versioning proof of concept. */
@JsonSerialize(using = HostmapNodeType.HostmapNodeTypeSerializer.class)
public class HostmapNodeType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("cluster", "container", "host", "pod"));

  public static final HostmapNodeType CLUSTER = new HostmapNodeType("cluster");
  public static final HostmapNodeType CONTAINER = new HostmapNodeType("container");
  public static final HostmapNodeType HOST = new HostmapNodeType("host");
  public static final HostmapNodeType POD = new HostmapNodeType("pod");

  HostmapNodeType(String value) {
    super(value, allowedValues);
  }

  public static class HostmapNodeTypeSerializer extends StdSerializer<HostmapNodeType> {
    public HostmapNodeTypeSerializer(Class<HostmapNodeType> t) {
      super(t);
    }

    public HostmapNodeTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(HostmapNodeType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HostmapNodeType fromValue(String value) {
    return new HostmapNodeType(value);
  }
}
