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

/** Experiment variant results resource type. */
@JsonSerialize(
    using =
        ExperimentsVariantResultsV2DTODataType.ExperimentsVariantResultsV2DTODataTypeSerializer
            .class)
public class ExperimentsVariantResultsV2DTODataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("experiment-variant-results"));

  public static final ExperimentsVariantResultsV2DTODataType EXPERIMENT_VARIANT_RESULTS =
      new ExperimentsVariantResultsV2DTODataType("experiment-variant-results");

  ExperimentsVariantResultsV2DTODataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsVariantResultsV2DTODataTypeSerializer
      extends StdSerializer<ExperimentsVariantResultsV2DTODataType> {
    public ExperimentsVariantResultsV2DTODataTypeSerializer(
        Class<ExperimentsVariantResultsV2DTODataType> t) {
      super(t);
    }

    public ExperimentsVariantResultsV2DTODataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsVariantResultsV2DTODataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsVariantResultsV2DTODataType fromValue(String value) {
    return new ExperimentsVariantResultsV2DTODataType(value);
  }
}
