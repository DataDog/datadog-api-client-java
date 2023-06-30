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

/** Used to distinguish between pipelines, stages, jobs and steps. */
@JsonSerialize(using = CIAppPipelineEventStepLevel.CIAppPipelineEventStepLevelSerializer.class)
public class CIAppPipelineEventStepLevel extends ModelEnum<String> {

  public static final CIAppPipelineEventStepLevel STEP = new CIAppPipelineEventStepLevel("step");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("step"));

  CIAppPipelineEventStepLevel(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class CIAppPipelineEventStepLevelSerializer
      extends StdSerializer<CIAppPipelineEventStepLevel> {
    public CIAppPipelineEventStepLevelSerializer(Class<CIAppPipelineEventStepLevel> t) {
      super(t);
    }

    public CIAppPipelineEventStepLevelSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CIAppPipelineEventStepLevel value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CIAppPipelineEventStepLevel fromValue(String value) {
    return new CIAppPipelineEventStepLevel(value);
  }
}
