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

/** Type of the top list widget. */
@JsonSerialize(using = ToplistWidgetDefinitionType.ToplistWidgetDefinitionTypeSerializer.class)
public class ToplistWidgetDefinitionType extends ModelEnum<String> {

  public static final ToplistWidgetDefinitionType TOPLIST =
      new ToplistWidgetDefinitionType("toplist");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("toplist"));

  ToplistWidgetDefinitionType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class ToplistWidgetDefinitionTypeSerializer
      extends StdSerializer<ToplistWidgetDefinitionType> {
    public ToplistWidgetDefinitionTypeSerializer(Class<ToplistWidgetDefinitionType> t) {
      super(t);
    }

    public ToplistWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ToplistWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ToplistWidgetDefinitionType fromValue(String value) {
    return new ToplistWidgetDefinitionType(value);
  }
}
