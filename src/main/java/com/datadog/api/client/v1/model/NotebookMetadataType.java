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

/** Metadata type of the notebook. */
@JsonSerialize(using = NotebookMetadataType.NotebookMetadataTypeSerializer.class)
public class NotebookMetadataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("postmortem", "runbook", "investigation", "documentation", "report"));

  public static final NotebookMetadataType POSTMORTEM = new NotebookMetadataType("postmortem");
  public static final NotebookMetadataType RUNBOOK = new NotebookMetadataType("runbook");
  public static final NotebookMetadataType INVESTIGATION =
      new NotebookMetadataType("investigation");
  public static final NotebookMetadataType DOCUMENTATION =
      new NotebookMetadataType("documentation");
  public static final NotebookMetadataType REPORT = new NotebookMetadataType("report");

  NotebookMetadataType(String value) {
    super(value, allowedValues);
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

  @JsonCreator
  public static NotebookMetadataType fromValue(String value) {
    return new NotebookMetadataType(value);
  }
}
