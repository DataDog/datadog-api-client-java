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

/** The processor type. The value should always be <code>add_env_vars</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineAddEnvVarsProcessorType
            .ObservabilityPipelineAddEnvVarsProcessorTypeSerializer.class)
public class ObservabilityPipelineAddEnvVarsProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("add_env_vars"));

  public static final ObservabilityPipelineAddEnvVarsProcessorType ADD_ENV_VARS =
      new ObservabilityPipelineAddEnvVarsProcessorType("add_env_vars");

  ObservabilityPipelineAddEnvVarsProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineAddEnvVarsProcessorTypeSerializer
      extends StdSerializer<ObservabilityPipelineAddEnvVarsProcessorType> {
    public ObservabilityPipelineAddEnvVarsProcessorTypeSerializer(
        Class<ObservabilityPipelineAddEnvVarsProcessorType> t) {
      super(t);
    }

    public ObservabilityPipelineAddEnvVarsProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineAddEnvVarsProcessorType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineAddEnvVarsProcessorType fromValue(String value) {
    return new ObservabilityPipelineAddEnvVarsProcessorType(value);
  }
}
