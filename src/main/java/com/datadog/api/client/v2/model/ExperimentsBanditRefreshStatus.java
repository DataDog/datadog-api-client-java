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

/** The status of the refresh. */
@JsonSerialize(
    using = ExperimentsBanditRefreshStatus.ExperimentsBanditRefreshStatusSerializer.class)
public class ExperimentsBanditRefreshStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("PENDING", "RUNNING", "SUCCEEDED", "FAILED", "CANCELLED"));

  public static final ExperimentsBanditRefreshStatus PENDING =
      new ExperimentsBanditRefreshStatus("PENDING");
  public static final ExperimentsBanditRefreshStatus RUNNING =
      new ExperimentsBanditRefreshStatus("RUNNING");
  public static final ExperimentsBanditRefreshStatus SUCCEEDED =
      new ExperimentsBanditRefreshStatus("SUCCEEDED");
  public static final ExperimentsBanditRefreshStatus FAILED =
      new ExperimentsBanditRefreshStatus("FAILED");
  public static final ExperimentsBanditRefreshStatus CANCELLED =
      new ExperimentsBanditRefreshStatus("CANCELLED");

  ExperimentsBanditRefreshStatus(String value) {
    super(value, allowedValues);
  }

  public static class ExperimentsBanditRefreshStatusSerializer
      extends StdSerializer<ExperimentsBanditRefreshStatus> {
    public ExperimentsBanditRefreshStatusSerializer(Class<ExperimentsBanditRefreshStatus> t) {
      super(t);
    }

    public ExperimentsBanditRefreshStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        ExperimentsBanditRefreshStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static ExperimentsBanditRefreshStatus fromValue(String value) {
    return new ExperimentsBanditRefreshStatus(value);
  }
}
