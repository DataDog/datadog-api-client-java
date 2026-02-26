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

/** Type of the note widget. */
@JsonSerialize(using = NoteWidgetDefinitionType.NoteWidgetDefinitionTypeSerializer.class)
public class NoteWidgetDefinitionType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("note"));

  public static final NoteWidgetDefinitionType NOTE = new NoteWidgetDefinitionType("note");

  NoteWidgetDefinitionType(String value) {
    super(value, allowedValues);
  }

  public static class NoteWidgetDefinitionTypeSerializer
      extends StdSerializer<NoteWidgetDefinitionType> {
    public NoteWidgetDefinitionTypeSerializer(Class<NoteWidgetDefinitionType> t) {
      super(t);
    }

    public NoteWidgetDefinitionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NoteWidgetDefinitionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static NoteWidgetDefinitionType fromValue(String value) {
    return new NoteWidgetDefinitionType(value);
  }
}
