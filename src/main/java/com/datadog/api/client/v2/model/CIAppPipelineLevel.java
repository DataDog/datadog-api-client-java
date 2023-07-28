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

/** Pipeline execution level. */
@JsonSerialize(using = CIAppPipelineLevel.CIAppPipelineLevelSerializer.class)
public class CIAppPipelineLevel extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pipeline", "stage", "job", "step", "custom"));

  public static final CIAppPipelineLevel PIPELINE = new CIAppPipelineLevel("pipeline");
  public static final CIAppPipelineLevel STAGE = new CIAppPipelineLevel("stage");
  public static final CIAppPipelineLevel JOB = new CIAppPipelineLevel("job");
  public static final CIAppPipelineLevel STEP = new CIAppPipelineLevel("step");
  public static final CIAppPipelineLevel CUSTOM = new CIAppPipelineLevel("custom");

  CIAppPipelineLevel(String value) {
    super(value, allowedValues);
  }

  public static class CIAppPipelineLevelSerializer extends StdSerializer<CIAppPipelineLevel> {
    public CIAppPipelineLevelSerializer(Class<CIAppPipelineLevel> t) {
      super(t);
    }

    public CIAppPipelineLevelSerializer() {
      this(null);
    }

    @Override
    public void serialize(CIAppPipelineLevel value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CIAppPipelineLevel fromValue(String value) {
    return new CIAppPipelineLevel(value);
  }
}
