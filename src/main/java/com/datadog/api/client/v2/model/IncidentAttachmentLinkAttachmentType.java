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

/** The type of link attachment attributes. */
@JsonSerialize(
    using =
        IncidentAttachmentLinkAttachmentType.IncidentAttachmentLinkAttachmentTypeSerializer.class)
public class IncidentAttachmentLinkAttachmentType extends ModelEnum<String> {

  public static final IncidentAttachmentLinkAttachmentType LINK =
      new IncidentAttachmentLinkAttachmentType("link");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("link"));

  IncidentAttachmentLinkAttachmentType(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class IncidentAttachmentLinkAttachmentTypeSerializer
      extends StdSerializer<IncidentAttachmentLinkAttachmentType> {
    public IncidentAttachmentLinkAttachmentTypeSerializer(
        Class<IncidentAttachmentLinkAttachmentType> t) {
      super(t);
    }

    public IncidentAttachmentLinkAttachmentTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        IncidentAttachmentLinkAttachmentType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static IncidentAttachmentLinkAttachmentType fromValue(String value) {
    return new IncidentAttachmentLinkAttachmentType(value);
  }
}
