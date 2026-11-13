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

/**
 * The bandit's status. STOPPED means the bandit was stopped and serves the variant chosen then.
 * COMPLETED means it reached its scheduled end and serves its fallback.
 */
@JsonSerialize(using = ExperimentsBanditStatus.ExperimentsBanditStatusSerializer.class)
public class ExperimentsBanditStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList("DRAFT", "SCHEDULED", "RUNNING", "PAUSED", "STOPPED", "COMPLETED"));

  public static final ExperimentsBanditStatus DRAFT = new ExperimentsBanditStatus("DRAFT");
  public static final ExperimentsBanditStatus SCHEDULED = new ExperimentsBanditStatus("SCHEDULED");
  public static final ExperimentsBanditStatus RUNNING = new ExperimentsBanditStatus("RUNNING");
  public static final ExperimentsBanditStatus PAUSED = new ExperimentsBanditStatus("PAUSED");
  public static final ExperimentsBanditStatus STOPPED = new ExperimentsBanditStatus("STOPPED");
  public static final ExperimentsBanditStatus COMPLETED = new ExperimentsBanditStatus("COMPLETED");

  ExperimentsBanditStatus(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsBanditStatusSerializer
      extends StdSerializer<ExperimentsBanditStatus> {
    public ExperimentsBanditStatusSerializer(Class<ExperimentsBanditStatus> t) {
      super(t);
    }

    public ExperimentsBanditStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsBanditStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsBanditStatus fromValue(String value) {
    return new ExperimentsBanditStatus(value);
  }
}
