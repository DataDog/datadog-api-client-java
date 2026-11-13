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
 * The direction the bandit optimizes the metric in. It's fixed when the bandit starts. Null before
 * the first saved refresh.
 */
@JsonSerialize(
    using = ExperimentsBanditDesiredChange.ExperimentsBanditDesiredChangeSerializer.class)
public class ExperimentsBanditDesiredChange extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("METRIC_INCREASES", "METRIC_DECREASES"));

  public static final ExperimentsBanditDesiredChange METRIC_INCREASES =
      new ExperimentsBanditDesiredChange("METRIC_INCREASES");
  public static final ExperimentsBanditDesiredChange METRIC_DECREASES =
      new ExperimentsBanditDesiredChange("METRIC_DECREASES");

  ExperimentsBanditDesiredChange(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsBanditDesiredChangeSerializer
      extends StdSerializer<ExperimentsBanditDesiredChange> {
    public ExperimentsBanditDesiredChangeSerializer(Class<ExperimentsBanditDesiredChange> t) {
      super(t);
    }

    public ExperimentsBanditDesiredChangeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsBanditDesiredChange value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsBanditDesiredChange fromValue(String value) {
    return new ExperimentsBanditDesiredChange(value);
  }
}
