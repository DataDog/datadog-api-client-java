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

/** Type of the alert graph widget. */
@JsonSerialize(
    using = AlertGraphWidgetDefinitionType.AlertGraphWidgetDefinitionTypeSerializer.class)
public class AlertGraphWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("alert_graph"));

  public static final AlertGraphWidgetDefinitionType ALERT_GRAPH =
      new AlertGraphWidgetDefinitionType("alert_graph");

  AlertGraphWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class AlertGraphWidgetDefinitionTypeSerializer
      extends StdSerializer<AlertGraphWidgetDefinitionType> {
    public AlertGraphWidgetDefinitionTypeSerializer(Class<AlertGraphWidgetDefinitionType> t) {
      super(t);
    }

    public AlertGraphWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AlertGraphWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AlertGraphWidgetDefinitionType fromValue(String value) {
    return new AlertGraphWidgetDefinitionType(value);
  }
}
