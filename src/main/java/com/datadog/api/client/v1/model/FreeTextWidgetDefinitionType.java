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

/** Type of the free text widget. */
@JsonSerialize(using = FreeTextWidgetDefinitionType.FreeTextWidgetDefinitionTypeSerializer.class)
public class FreeTextWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("free_text"));

  public static final FreeTextWidgetDefinitionType FREE_TEXT =
      new FreeTextWidgetDefinitionType("free_text");

  FreeTextWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class FreeTextWidgetDefinitionTypeSerializer
      extends StdSerializer<FreeTextWidgetDefinitionType> {
    public FreeTextWidgetDefinitionTypeSerializer(Class<FreeTextWidgetDefinitionType> t) {
      super(t);
    }

    public FreeTextWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FreeTextWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FreeTextWidgetDefinitionType fromValue(String value) {
    return new FreeTextWidgetDefinitionType(value);
  }
}
