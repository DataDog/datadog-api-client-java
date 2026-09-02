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

/** The resource type for a form publication. */
@JsonSerialize(using = FormPublicationType.FormPublicationTypeSerializer.class)
public class FormPublicationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("form_publications"));

  public static final FormPublicationType FORM_PUBLICATIONS =
      new FormPublicationType("form_publications");

  FormPublicationType(String value) {
    super(value, allowedValues);
  }

  public static class FormPublicationTypeSerializer extends StdSerializer<FormPublicationType> {
    public FormPublicationTypeSerializer(Class<FormPublicationType> t) {
      super(t);
    }

    public FormPublicationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        FormPublicationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static FormPublicationType fromValue(String value) {
    return new FormPublicationType(value);
  }
}
