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

/** Type of the Notebook Cell resource. */
@JsonSerialize(using = NotebookCellResourceType.NotebookCellResourceTypeSerializer.class)
public class NotebookCellResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("notebook_cells"));

  public static final NotebookCellResourceType NOTEBOOK_CELLS =
      new NotebookCellResourceType("notebook_cells");

  NotebookCellResourceType(String value) {
    super(value, allowedValues);
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

  @JsonCreator
  public static NotebookCellResourceType fromValue(String value) {
    return new NotebookCellResourceType(value);
  }
}
