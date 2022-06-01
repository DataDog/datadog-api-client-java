/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.v1.client.model;

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

/** Dimension of the Scatterplot. */
@JsonSerialize(using = ScatterplotDimension.ScatterplotDimensionSerializer.class)
public class ScatterplotDimension {

  public static final ScatterplotDimension X = new ScatterplotDimension("x");
  public static final ScatterplotDimension Y = new ScatterplotDimension("y");
  public static final ScatterplotDimension RADIUS = new ScatterplotDimension("radius");
  public static final ScatterplotDimension COLOR = new ScatterplotDimension("color");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("x", "y", "radius", "color"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  ScatterplotDimension(String value) {
    this.value = value;
  }

  public static class ScatterplotDimensionSerializer extends StdSerializer<ScatterplotDimension> {
    public ScatterplotDimensionSerializer(Class<ScatterplotDimension> t) {
      super(t);
    }

    public ScatterplotDimensionSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ScatterplotDimension value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this ScatterplotDimension object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((ScatterplotDimension) o).value);
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
  public static ScatterplotDimension fromValue(String value) {
    return new ScatterplotDimension(value);
  }
}
