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

/** The type of feedback. */
@JsonSerialize(
    using =
        SecurityMonitoringSignalInvestigationFeedbackType
            .SecurityMonitoringSignalInvestigationFeedbackTypeSerializer.class)
public class SecurityMonitoringSignalInvestigationFeedbackType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("investigation_feedback"));

  public static final SecurityMonitoringSignalInvestigationFeedbackType INVESTIGATION_FEEDBACK =
      new SecurityMonitoringSignalInvestigationFeedbackType("investigation_feedback");

  SecurityMonitoringSignalInvestigationFeedbackType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringSignalInvestigationFeedbackTypeSerializer
      extends StdSerializer<SecurityMonitoringSignalInvestigationFeedbackType> {
    public SecurityMonitoringSignalInvestigationFeedbackTypeSerializer(
        Class<SecurityMonitoringSignalInvestigationFeedbackType> t) {
      super(t);
    }

    public SecurityMonitoringSignalInvestigationFeedbackTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringSignalInvestigationFeedbackType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringSignalInvestigationFeedbackType fromValue(String value) {
    return new SecurityMonitoringSignalInvestigationFeedbackType(value);
  }
}
