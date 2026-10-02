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

/** Type of metric calculation. */
@JsonSerialize(
    using =
        ExperimentsMetricV2DTODataAttributesMetricType
            .ExperimentsMetricV2DTODataAttributesMetricTypeSerializer.class)
public class ExperimentsMetricV2DTODataAttributesMetricType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("SIMPLE", "RATIO", "PERCENTILE", "UNKNOWN"));

  public static final ExperimentsMetricV2DTODataAttributesMetricType SIMPLE =
      new ExperimentsMetricV2DTODataAttributesMetricType("SIMPLE");
  public static final ExperimentsMetricV2DTODataAttributesMetricType RATIO =
      new ExperimentsMetricV2DTODataAttributesMetricType("RATIO");
  public static final ExperimentsMetricV2DTODataAttributesMetricType PERCENTILE =
      new ExperimentsMetricV2DTODataAttributesMetricType("PERCENTILE");
  public static final ExperimentsMetricV2DTODataAttributesMetricType UNKNOWN =
      new ExperimentsMetricV2DTODataAttributesMetricType("UNKNOWN");

  ExperimentsMetricV2DTODataAttributesMetricType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsMetricV2DTODataAttributesMetricTypeSerializer
      extends StdSerializer<ExperimentsMetricV2DTODataAttributesMetricType> {
    public ExperimentsMetricV2DTODataAttributesMetricTypeSerializer(
        Class<ExperimentsMetricV2DTODataAttributesMetricType> t) {
      super(t);
    }

    public ExperimentsMetricV2DTODataAttributesMetricTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsMetricV2DTODataAttributesMetricType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsMetricV2DTODataAttributesMetricType fromValue(String value) {
    return new ExperimentsMetricV2DTODataAttributesMetricType(value);
  }
}
