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

/** Bandit resource type. */
@JsonSerialize(
    using = ExperimentsBanditV2DTODataType.ExperimentsBanditV2DTODataTypeSerializer.class)
public class ExperimentsBanditV2DTODataType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("bandits"));

  public static final ExperimentsBanditV2DTODataType BANDITS =
      new ExperimentsBanditV2DTODataType("bandits");

  ExperimentsBanditV2DTODataType(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsBanditV2DTODataTypeSerializer
      extends StdSerializer<ExperimentsBanditV2DTODataType> {
    public ExperimentsBanditV2DTODataTypeSerializer(Class<ExperimentsBanditV2DTODataType> t) {
      super(t);
    }

    public ExperimentsBanditV2DTODataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsBanditV2DTODataType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsBanditV2DTODataType fromValue(String value) {
    return new ExperimentsBanditV2DTODataType(value);
  }
}
