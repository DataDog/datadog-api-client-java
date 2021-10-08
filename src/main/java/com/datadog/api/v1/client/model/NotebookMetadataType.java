/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
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

/** Metadata type of the notebook. */
@JsonSerialize(using = NotebookMetadataType.NotebookMetadataTypeSerializer.class)
public class NotebookMetadataType {

  public static final NotebookMetadataType POSTMORTEM = new NotebookMetadataType("postmortem");
  public static final NotebookMetadataType RUNBOOK = new NotebookMetadataType("runbook");
  public static final NotebookMetadataType INVESTIGATION =
      new NotebookMetadataType("investigation");
  public static final NotebookMetadataType DOCUMENTATION =
      new NotebookMetadataType("documentation");
  public static final NotebookMetadataType REPORT = new NotebookMetadataType("report");

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("postmortem", "runbook", "investigation", "documentation", "report"));

  private String value;

  public boolean isValid() {
    return allowedValues.contains(this.value);
  }

  NotebookMetadataType(String value) {
    this.value = value;
  }

  public static class NotebookMetadataTypeSerializer extends StdSerializer<NotebookMetadataType> {
    public NotebookMetadataTypeSerializer(Class<NotebookMetadataType> t) {
      super(t);
    }

    public NotebookMetadataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        NotebookMetadataType value, JsonGenerator jgen, SerializerProvider provider)
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

  /** Return true if this NotebookMetadataType object is equal to o. */
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    return this.value.equals(((NotebookMetadataType) o).value);
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
  public static NotebookMetadataType fromValue(String value) {
    return new NotebookMetadataType(value);
  }
}
