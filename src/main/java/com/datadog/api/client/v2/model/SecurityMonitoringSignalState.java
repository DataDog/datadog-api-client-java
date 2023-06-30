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

/** The new triage state of the signal. */
@JsonSerialize(using = SecurityMonitoringSignalState.SecurityMonitoringSignalStateSerializer.class)
public class SecurityMonitoringSignalState extends ModelEnum<String> {

  public static final SecurityMonitoringSignalState OPEN =
      new SecurityMonitoringSignalState("open");
  public static final SecurityMonitoringSignalState ARCHIVED =
      new SecurityMonitoringSignalState("archived");
  public static final SecurityMonitoringSignalState UNDER_REVIEW =
      new SecurityMonitoringSignalState("under_review");

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("open", "archived", "under_review"));

  SecurityMonitoringSignalState(String value) {
    this.value = value;
    this.localAllowedValues = allowedValues;
  }

  public static class SecurityMonitoringSignalStateSerializer
      extends StdSerializer<SecurityMonitoringSignalState> {
    public SecurityMonitoringSignalStateSerializer(Class<SecurityMonitoringSignalState> t) {
      super(t);
    }

    public SecurityMonitoringSignalStateSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringSignalState value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringSignalState fromValue(String value) {
    return new SecurityMonitoringSignalState(value);
  }
}
