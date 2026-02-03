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

/** The verdict from the investigation step. */
@JsonSerialize(
    using =
        SecurityMonitoringSignalInvestigationStepOutputVerdict
            .SecurityMonitoringSignalInvestigationStepOutputVerdictSerializer.class)
public class SecurityMonitoringSignalInvestigationStepOutputVerdict extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("unspecified", "benign", "suspicious", "inconclusive"));

  public static final SecurityMonitoringSignalInvestigationStepOutputVerdict UNSPECIFIED =
      new SecurityMonitoringSignalInvestigationStepOutputVerdict("unspecified");
  public static final SecurityMonitoringSignalInvestigationStepOutputVerdict BENIGN =
      new SecurityMonitoringSignalInvestigationStepOutputVerdict("benign");
  public static final SecurityMonitoringSignalInvestigationStepOutputVerdict SUSPICIOUS =
      new SecurityMonitoringSignalInvestigationStepOutputVerdict("suspicious");
  public static final SecurityMonitoringSignalInvestigationStepOutputVerdict INCONCLUSIVE =
      new SecurityMonitoringSignalInvestigationStepOutputVerdict("inconclusive");

  SecurityMonitoringSignalInvestigationStepOutputVerdict(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringSignalInvestigationStepOutputVerdictSerializer
      extends StdSerializer<SecurityMonitoringSignalInvestigationStepOutputVerdict> {
    public SecurityMonitoringSignalInvestigationStepOutputVerdictSerializer(
        Class<SecurityMonitoringSignalInvestigationStepOutputVerdict> t) {
      super(t);
    }

    public SecurityMonitoringSignalInvestigationStepOutputVerdictSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringSignalInvestigationStepOutputVerdict value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringSignalInvestigationStepOutputVerdict fromValue(String value) {
    return new SecurityMonitoringSignalInvestigationStepOutputVerdict(value);
  }
}
