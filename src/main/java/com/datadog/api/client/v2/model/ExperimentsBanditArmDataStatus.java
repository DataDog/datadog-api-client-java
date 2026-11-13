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

/** Where the arm's reward variance came from, or why it's unavailable. */
@JsonSerialize(
    using = ExperimentsBanditArmDataStatus.ExperimentsBanditArmDataStatusSerializer.class)
public class ExperimentsBanditArmDataStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "usable",
              "insufficient_data",
              "zero_variance",
              "pooled_within_variance",
              "pooled_total_variance"));

  public static final ExperimentsBanditArmDataStatus USABLE =
      new ExperimentsBanditArmDataStatus("usable");
  public static final ExperimentsBanditArmDataStatus INSUFFICIENT_DATA =
      new ExperimentsBanditArmDataStatus("insufficient_data");
  public static final ExperimentsBanditArmDataStatus ZERO_VARIANCE =
      new ExperimentsBanditArmDataStatus("zero_variance");
  public static final ExperimentsBanditArmDataStatus POOLED_WITHIN_VARIANCE =
      new ExperimentsBanditArmDataStatus("pooled_within_variance");
  public static final ExperimentsBanditArmDataStatus POOLED_TOTAL_VARIANCE =
      new ExperimentsBanditArmDataStatus("pooled_total_variance");

  ExperimentsBanditArmDataStatus(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsBanditArmDataStatusSerializer
      extends StdSerializer<ExperimentsBanditArmDataStatus> {
    public ExperimentsBanditArmDataStatusSerializer(Class<ExperimentsBanditArmDataStatus> t) {
      super(t);
    }

    public ExperimentsBanditArmDataStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsBanditArmDataStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsBanditArmDataStatus fromValue(String value) {
    return new ExperimentsBanditArmDataStatus(value);
  }
}
