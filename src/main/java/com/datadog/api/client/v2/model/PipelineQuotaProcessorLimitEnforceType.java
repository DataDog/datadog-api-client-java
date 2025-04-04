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
        PipelineQuotaProcessorLimitEnforceType.PipelineQuotaProcessorLimitEnforceTypeSerializer
            .class)
public class PipelineQuotaProcessorLimitEnforceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("bytes", "events"));

  public static final PipelineQuotaProcessorLimitEnforceType BYTES =
      new PipelineQuotaProcessorLimitEnforceType("bytes");
  public static final PipelineQuotaProcessorLimitEnforceType EVENTS =
      new PipelineQuotaProcessorLimitEnforceType("events");

  PipelineQuotaProcessorLimitEnforceType(String value) {
    super(value, allowedValues);
  }

  public static class PipelineQuotaProcessorLimitEnforceTypeSerializer
      extends StdSerializer<PipelineQuotaProcessorLimitEnforceType> {
    public PipelineQuotaProcessorLimitEnforceTypeSerializer(
        Class<PipelineQuotaProcessorLimitEnforceType> t) {
      super(t);
    }

    public PipelineQuotaProcessorLimitEnforceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PipelineQuotaProcessorLimitEnforceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PipelineQuotaProcessorLimitEnforceType fromValue(String value) {
    return new PipelineQuotaProcessorLimitEnforceType(value);
  }
}
