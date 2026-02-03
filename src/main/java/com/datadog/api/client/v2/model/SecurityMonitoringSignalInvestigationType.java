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

/** The type of investigation signal. */
@JsonSerialize(
    using =
        SecurityMonitoringSignalInvestigationType
            .SecurityMonitoringSignalInvestigationTypeSerializer.class)
public class SecurityMonitoringSignalInvestigationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("investigation_signal"));

  public static final SecurityMonitoringSignalInvestigationType INVESTIGATION_SIGNAL =
      new SecurityMonitoringSignalInvestigationType("investigation_signal");

  SecurityMonitoringSignalInvestigationType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringSignalInvestigationTypeSerializer
      extends StdSerializer<SecurityMonitoringSignalInvestigationType> {
    public SecurityMonitoringSignalInvestigationTypeSerializer(
        Class<SecurityMonitoringSignalInvestigationType> t) {
      super(t);
    }

    public SecurityMonitoringSignalInvestigationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringSignalInvestigationType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringSignalInvestigationType fromValue(String value) {
    return new SecurityMonitoringSignalInvestigationType(value);
  }
}
