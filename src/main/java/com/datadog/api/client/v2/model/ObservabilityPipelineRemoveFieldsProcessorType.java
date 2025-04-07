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

/** The processor type. The value should always be <code>remove_fields</code>. */
@JsonSerialize(
    using =
        ObservabilityPipelineRemoveFieldsProcessorType
            .ObservabilityPipelineRemoveFieldsProcessorTypeSerializer.class)
public class ObservabilityPipelineRemoveFieldsProcessorType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("remove_fields"));

  public static final ObservabilityPipelineRemoveFieldsProcessorType REMOVE_FIELDS =
      new ObservabilityPipelineRemoveFieldsProcessorType("remove_fields");

  ObservabilityPipelineRemoveFieldsProcessorType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineRemoveFieldsProcessorTypeSerializer
      extends StdSerializer<ObservabilityPipelineRemoveFieldsProcessorType> {
    public ObservabilityPipelineRemoveFieldsProcessorTypeSerializer(
        Class<ObservabilityPipelineRemoveFieldsProcessorType> t) {
      super(t);
    }

    public ObservabilityPipelineRemoveFieldsProcessorTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineRemoveFieldsProcessorType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineRemoveFieldsProcessorType fromValue(String value) {
    return new ObservabilityPipelineRemoveFieldsProcessorType(value);
  }
}
