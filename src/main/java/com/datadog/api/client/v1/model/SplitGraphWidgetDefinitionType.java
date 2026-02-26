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

/** Type of the split graph widget */
@JsonSerialize(
    using = SplitGraphWidgetDefinitionType.SplitGraphWidgetDefinitionTypeSerializer.class)
public class SplitGraphWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("split_group"));

  public static final SplitGraphWidgetDefinitionType SPLIT_GROUP =
      new SplitGraphWidgetDefinitionType("split_group");

  SplitGraphWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class SplitGraphWidgetDefinitionTypeSerializer
      extends StdSerializer<SplitGraphWidgetDefinitionType> {
    public SplitGraphWidgetDefinitionTypeSerializer(Class<SplitGraphWidgetDefinitionType> t) {
      super(t);
    }

    public SplitGraphWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SplitGraphWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SplitGraphWidgetDefinitionType fromValue(String value) {
    return new SplitGraphWidgetDefinitionType(value);
  }
}
