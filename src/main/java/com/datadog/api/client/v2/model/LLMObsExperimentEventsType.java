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

/** Resource type for an experiment events collection. */
@JsonSerialize(using = LLMObsExperimentEventsType.LLMObsExperimentEventsTypeSerializer.class)
public class LLMObsExperimentEventsType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("experiment_events"));

  public static final LLMObsExperimentEventsType EXPERIMENT_EVENTS =
      new LLMObsExperimentEventsType("experiment_events");

  LLMObsExperimentEventsType(String value) {
    super(value, allowedValues);
  }

  public static class LLMObsExperimentEventsTypeSerializer
      extends StdSerializer<LLMObsExperimentEventsType> {
    public LLMObsExperimentEventsTypeSerializer(Class<LLMObsExperimentEventsType> t) {
      super(t);
    }

    public LLMObsExperimentEventsTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        LLMObsExperimentEventsType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static LLMObsExperimentEventsType fromValue(String value) {
    return new LLMObsExperimentEventsType(value);
  }
}
