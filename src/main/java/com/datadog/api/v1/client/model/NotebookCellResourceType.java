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

/** Type of the Notebook Cell resource. */
@JsonSerialize(using = NotebookCellResourceType.NotebookCellResourceTypeSerializer.class)
public class NotebookCellResourceType {

  public static final NotebookCellResourceType NOTEBOOK_CELLS =
      new NotebookCellResourceType("notebook_cells");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("notebook_cells"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  NotebookCellResourceType(String value) {
    this.value = value;
  }

  public static class NotebookCellResourceTypeSerializer
      extends StdSerializer<NotebookCellResourceType> {
    public NotebookCellResourceTypeSerializer(Class<NotebookCellResourceType> t) {
      super(t);
    }

    public NotebookCellResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NotebookCellResourceType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this NotebookCellResourceType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((NotebookCellResourceType) o).value);
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
  public static NotebookCellResourceType fromValue(String value) {
    return new NotebookCellResourceType(value);
  }
}
