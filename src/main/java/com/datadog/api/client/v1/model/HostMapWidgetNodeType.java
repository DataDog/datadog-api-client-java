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

/** Which type of infrastructure entity to visualize in the host map. */
@JsonSerialize(using = HostMapWidgetNodeType.HostMapWidgetNodeTypeSerializer.class)
public class HostMapWidgetNodeType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("host", "container", "pod", "cluster"));

  public static final HostMapWidgetNodeType HOST = new HostMapWidgetNodeType("host");
  public static final HostMapWidgetNodeType CONTAINER = new HostMapWidgetNodeType("container");
  public static final HostMapWidgetNodeType POD = new HostMapWidgetNodeType("pod");
  public static final HostMapWidgetNodeType CLUSTER = new HostMapWidgetNodeType("cluster");

  HostMapWidgetNodeType(String value) {
    super(value, allowedValues);
  }

  public static class HostMapWidgetNodeTypeSerializer extends StdSerializer<HostMapWidgetNodeType> {
    public HostMapWidgetNodeTypeSerializer(Class<HostMapWidgetNodeType> t) {
      super(t);
    }

    public HostMapWidgetNodeTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HostMapWidgetNodeType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HostMapWidgetNodeType fromValue(String value) {
    return new HostMapWidgetNodeType(value);
  }
}
