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

/** Reference type for the mobile application for a mobile synthetics test. */
@JsonSerialize(
    using =
        SyntheticsMobileTestsMobileApplicationReferenceType
            .SyntheticsMobileTestsMobileApplicationReferenceTypeSerializer.class)
public class SyntheticsMobileTestsMobileApplicationReferenceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("latest", "version"));

  public static final SyntheticsMobileTestsMobileApplicationReferenceType LATEST =
      new SyntheticsMobileTestsMobileApplicationReferenceType("latest");
  public static final SyntheticsMobileTestsMobileApplicationReferenceType VERSION =
      new SyntheticsMobileTestsMobileApplicationReferenceType("version");

  SyntheticsMobileTestsMobileApplicationReferenceType(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsMobileTestsMobileApplicationReferenceTypeSerializer
      extends StdSerializer<SyntheticsMobileTestsMobileApplicationReferenceType> {
    public SyntheticsMobileTestsMobileApplicationReferenceTypeSerializer(
        Class<SyntheticsMobileTestsMobileApplicationReferenceType> t) {
      super(t);
    }

    public SyntheticsMobileTestsMobileApplicationReferenceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsMobileTestsMobileApplicationReferenceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsMobileTestsMobileApplicationReferenceType fromValue(String value) {
    return new SyntheticsMobileTestsMobileApplicationReferenceType(value);
  }
}
