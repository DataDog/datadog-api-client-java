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
 * Identifies which host map request format the sibling fields on <code>
 * HostMapWidgetDefinitionRequests</code> describe: an infrastructure-backed request or a DDSQL
 * published-dataset request.
 */
@JsonSerialize(
    using = HostMapWidgetDefinitionRequestType.HostMapWidgetDefinitionRequestTypeSerializer.class)
public class HostMapWidgetDefinitionRequestType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("infrastructure_hostmap", "data_projection"));

  public static final HostMapWidgetDefinitionRequestType INFRASTRUCTURE_HOSTMAP =
      new HostMapWidgetDefinitionRequestType("infrastructure_hostmap");
  public static final HostMapWidgetDefinitionRequestType DATA_PROJECTION =
      new HostMapWidgetDefinitionRequestType("data_projection");

  HostMapWidgetDefinitionRequestType(String value) {
    super(value, allowedValues);
  }

  public static class HostMapWidgetDefinitionRequestTypeSerializer
      extends StdSerializer<HostMapWidgetDefinitionRequestType> {
    public HostMapWidgetDefinitionRequestTypeSerializer(
        Class<HostMapWidgetDefinitionRequestType> t) {
      super(t);
    }

    public HostMapWidgetDefinitionRequestTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        HostMapWidgetDefinitionRequestType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static HostMapWidgetDefinitionRequestType fromValue(String value) {
    return new HostMapWidgetDefinitionRequestType(value);
  }
}
