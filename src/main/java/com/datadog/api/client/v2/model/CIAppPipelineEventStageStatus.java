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

/** The final status of the stage. */
@JsonSerialize(using = CIAppPipelineEventStageStatus.CIAppPipelineEventStageStatusSerializer.class)
public class CIAppPipelineEventStageStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("success", "error", "canceled", "skipped"));

  public static final CIAppPipelineEventStageStatus SUCCESS =
      new CIAppPipelineEventStageStatus("success");
  public static final CIAppPipelineEventStageStatus ERROR =
      new CIAppPipelineEventStageStatus("error");
  public static final CIAppPipelineEventStageStatus CANCELED =
      new CIAppPipelineEventStageStatus("canceled");
  public static final CIAppPipelineEventStageStatus SKIPPED =
      new CIAppPipelineEventStageStatus("skipped");

  CIAppPipelineEventStageStatus(String value) {
    super(value, allowedValues);
  }

  public static class CIAppPipelineEventStageStatusSerializer
      extends StdSerializer<CIAppPipelineEventStageStatus> {
    public CIAppPipelineEventStageStatusSerializer(Class<CIAppPipelineEventStageStatus> t) {
      super(t);
    }

    public CIAppPipelineEventStageStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CIAppPipelineEventStageStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CIAppPipelineEventStageStatus fromValue(String value) {
    return new CIAppPipelineEventStageStatus(value);
  }
}
