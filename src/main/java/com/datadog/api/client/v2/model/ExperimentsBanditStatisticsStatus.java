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

/** Whether the latest saved refresh calculated its statistics. Absent for older refreshes. */
@JsonSerialize(
    using = ExperimentsBanditStatisticsStatus.ExperimentsBanditStatisticsStatusSerializer.class)
public class ExperimentsBanditStatisticsStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("calculated", "failed"));

  public static final ExperimentsBanditStatisticsStatus CALCULATED =
      new ExperimentsBanditStatisticsStatus("calculated");
  public static final ExperimentsBanditStatisticsStatus FAILED =
      new ExperimentsBanditStatisticsStatus("failed");

  ExperimentsBanditStatisticsStatus(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsBanditStatisticsStatusSerializer
      extends StdSerializer<ExperimentsBanditStatisticsStatus> {
    public ExperimentsBanditStatisticsStatusSerializer(Class<ExperimentsBanditStatisticsStatus> t) {
      super(t);
    }

    public ExperimentsBanditStatisticsStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsBanditStatisticsStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsBanditStatisticsStatus fromValue(String value) {
    return new ExperimentsBanditStatisticsStatus(value);
  }
}
