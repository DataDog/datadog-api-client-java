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
@JsonSerialize(using = CIAppPipelineEventStageLevel.CIAppPipelineEventStageLevelSerializer.class)
public class CIAppPipelineEventStageLevel extends ModelEnum<String> {

  public static final CIAppPipelineEventStageLevel STAGE =
      new CIAppPipelineEventStageLevel("stage");

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("stage"));

  CIAppPipelineEventStageLevel(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class CIAppPipelineEventStageLevelSerializer
      extends StdSerializer<CIAppPipelineEventStageLevel> {
    public CIAppPipelineEventStageLevelSerializer(Class<CIAppPipelineEventStageLevel> t) {
      super(t);
    }

    public CIAppPipelineEventStageLevelSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CIAppPipelineEventStageLevel value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CIAppPipelineEventStageLevel fromValue(String value) {
    return new CIAppPipelineEventStageLevel(value);
  }
}
