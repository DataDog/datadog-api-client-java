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

/** The sort parameters used for querying security signals. */
@JsonSerialize(using = SecurityMonitoringSignalsSort.SecurityMonitoringSignalsSortSerializer.class)
public class SecurityMonitoringSignalsSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("timestamp", "-timestamp"));

  public static final SecurityMonitoringSignalsSort TIMESTAMP_ASCENDING =
      new SecurityMonitoringSignalsSort("timestamp");
  public static final SecurityMonitoringSignalsSort TIMESTAMP_DESCENDING =
      new SecurityMonitoringSignalsSort("-timestamp");

  SecurityMonitoringSignalsSort(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringSignalsSortSerializer
      extends StdSerializer<SecurityMonitoringSignalsSort> {
    public SecurityMonitoringSignalsSortSerializer(Class<SecurityMonitoringSignalsSort> t) {
      super(t);
    }

    public SecurityMonitoringSignalsSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringSignalsSort value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringSignalsSort fromValue(String value) {
    return new SecurityMonitoringSignalsSort(value);
  }
}
