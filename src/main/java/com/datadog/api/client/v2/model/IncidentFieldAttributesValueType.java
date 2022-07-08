/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

/** Type of the multiple value field definitions. */
@JsonSerialize(
    using = IncidentFieldAttributesValueType.IncidentFieldAttributesValueTypeSerializer.class)
public class IncidentFieldAttributesValueType {

  public static final IncidentFieldAttributesValueType MULTISELECT =
      new IncidentFieldAttributesValueType("multiselect");
  public static final IncidentFieldAttributesValueType TEXTARRAY =
      new IncidentFieldAttributesValueType("textarray");
  public static final IncidentFieldAttributesValueType METRICTAG =
      new IncidentFieldAttributesValueType("metrictag");
  public static final IncidentFieldAttributesValueType AUTOCOMPLETE =
      new IncidentFieldAttributesValueType("autocomplete");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("multiselect", "textarray", "metrictag", "autocomplete"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  IncidentFieldAttributesValueType(String value) {
    this.value = value;
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

  @JsonValue
  public String getValue() {
    return this.value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  /** Return true if this IncidentFieldAttributesValueType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((IncidentFieldAttributesValueType) o).value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value);
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static IncidentFieldAttributesValueType fromValue(String value) {
    return new IncidentFieldAttributesValueType(value);
  }
}
