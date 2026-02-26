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

/** Type of the multiple value field definitions. */
@JsonSerialize(
    using = IncidentFieldAttributesValueType.IncidentFieldAttributesValueTypeSerializer.class)
public class IncidentFieldAttributesValueType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("multiselect", "textarray", "metrictag", "autocomplete"));

  public static final IncidentFieldAttributesValueType MULTISELECT =
      new IncidentFieldAttributesValueType("multiselect");
  public static final IncidentFieldAttributesValueType TEXTARRAY =
      new IncidentFieldAttributesValueType("textarray");
  public static final IncidentFieldAttributesValueType METRICTAG =
      new IncidentFieldAttributesValueType("metrictag");
  public static final IncidentFieldAttributesValueType AUTOCOMPLETE =
      new IncidentFieldAttributesValueType("autocomplete");

  IncidentFieldAttributesValueType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentFieldAttributesValueTypeSerializer
      extends StdSerializer<IncidentFieldAttributesValueType> {
    public IncidentFieldAttributesValueTypeSerializer(Class<IncidentFieldAttributesValueType> t) {
      super(t);
    }

    public IncidentFieldAttributesValueTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentFieldAttributesValueType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentFieldAttributesValueType fromValue(String value) {
    return new IncidentFieldAttributesValueType(value);
  }
}
