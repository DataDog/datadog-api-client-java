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

/** The incident attachment resource type. */
@JsonSerialize(using = IncidentAttachmentType.IncidentAttachmentTypeSerializer.class)
public class IncidentAttachmentType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("incident_attachments"));

  public static final IncidentAttachmentType INCIDENT_ATTACHMENTS =
      new IncidentAttachmentType("incident_attachments");

  IncidentAttachmentType(String value) {
    super(value, allowedValues);
  }

  public static class IncidentAttachmentTypeSerializer
      extends StdSerializer<IncidentAttachmentType> {
    public IncidentAttachmentTypeSerializer(Class<IncidentAttachmentType> t) {
      super(t);
    }

    public IncidentAttachmentTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentAttachmentType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentAttachmentType fromValue(String value) {
    return new IncidentAttachmentType(value);
  }
}
