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

/** Unit for quota enforcement in bytes for data size or events for count. */
@JsonSerialize(
    using =
        ObservabilityPipelineQuotaProcessorLimitEnforceType
            .ObservabilityPipelineQuotaProcessorLimitEnforceTypeSerializer.class)
public class ObservabilityPipelineQuotaProcessorLimitEnforceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("bytes", "events"));

  public static final ObservabilityPipelineQuotaProcessorLimitEnforceType BYTES =
      new ObservabilityPipelineQuotaProcessorLimitEnforceType("bytes");
  public static final ObservabilityPipelineQuotaProcessorLimitEnforceType EVENTS =
      new ObservabilityPipelineQuotaProcessorLimitEnforceType("events");

  ObservabilityPipelineQuotaProcessorLimitEnforceType(String value) {
    super(value, allowedValues);
  }

  public static class ObservabilityPipelineQuotaProcessorLimitEnforceTypeSerializer
      extends StdSerializer<ObservabilityPipelineQuotaProcessorLimitEnforceType> {
    public ObservabilityPipelineQuotaProcessorLimitEnforceTypeSerializer(
        Class<ObservabilityPipelineQuotaProcessorLimitEnforceType> t) {
      super(t);
    }

    public ObservabilityPipelineQuotaProcessorLimitEnforceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ObservabilityPipelineQuotaProcessorLimitEnforceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ObservabilityPipelineQuotaProcessorLimitEnforceType fromValue(String value) {
    return new ObservabilityPipelineQuotaProcessorLimitEnforceType(value);
  }
}
