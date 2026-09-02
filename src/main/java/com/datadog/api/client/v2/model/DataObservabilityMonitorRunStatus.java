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

/** The status of a data observability monitor run. */
@JsonSerialize(
    using = DataObservabilityMonitorRunStatus.DataObservabilityMonitorRunStatusSerializer.class)
public class DataObservabilityMonitorRunStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("pending", "ok", "warn", "alert", "error"));

  public static final DataObservabilityMonitorRunStatus PENDING =
      new DataObservabilityMonitorRunStatus("pending");
  public static final DataObservabilityMonitorRunStatus OK =
      new DataObservabilityMonitorRunStatus("ok");
  public static final DataObservabilityMonitorRunStatus WARN =
      new DataObservabilityMonitorRunStatus("warn");
  public static final DataObservabilityMonitorRunStatus ALERT =
      new DataObservabilityMonitorRunStatus("alert");
  public static final DataObservabilityMonitorRunStatus ERROR =
      new DataObservabilityMonitorRunStatus("error");

  DataObservabilityMonitorRunStatus(String value) {
    super(value, allowedValues);
  }

  public static class DataObservabilityMonitorRunStatusSerializer
      extends StdSerializer<DataObservabilityMonitorRunStatus> {
    public DataObservabilityMonitorRunStatusSerializer(Class<DataObservabilityMonitorRunStatus> t) {
      super(t);
    }

    public DataObservabilityMonitorRunStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        DataObservabilityMonitorRunStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static DataObservabilityMonitorRunStatus fromValue(String value) {
    return new DataObservabilityMonitorRunStatus(value);
  }
}
