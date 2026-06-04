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

/** Execution status of an LLM Observability experiment. */
@JsonSerialize(using = LLMObsExperimentStatus.LLMObsExperimentStatusSerializer.class)
public class LLMObsExperimentStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("running", "completed", "failed", "interrupted"));

  public static final LLMObsExperimentStatus RUNNING = new LLMObsExperimentStatus("running");
  public static final LLMObsExperimentStatus COMPLETED = new LLMObsExperimentStatus("completed");
  public static final LLMObsExperimentStatus FAILED = new LLMObsExperimentStatus("failed");
  public static final LLMObsExperimentStatus INTERRUPTED =
      new LLMObsExperimentStatus("interrupted");

  LLMObsExperimentStatus(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsExperimentStatusSerializer
      extends StdSerializer<LLMObsExperimentStatus> {
    public LLMObsExperimentStatusSerializer(Class<LLMObsExperimentStatus> t) {
      super(t);
    }

    public LLMObsExperimentStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsExperimentStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsExperimentStatus fromValue(String value) {
    return new LLMObsExperimentStatus(value);
  }
}
