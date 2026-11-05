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

/** Verdict of the investigation. Only completed investigations have one. */
@JsonSerialize(
    using = SecurityAgentInvestigationVerdict.SecurityAgentInvestigationVerdictSerializer.class)
public class SecurityAgentInvestigationVerdict extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("benign", "suspicious", "malicious"));

  public static final SecurityAgentInvestigationVerdict BENIGN =
      new SecurityAgentInvestigationVerdict("benign");
  public static final SecurityAgentInvestigationVerdict SUSPICIOUS =
      new SecurityAgentInvestigationVerdict("suspicious");
  public static final SecurityAgentInvestigationVerdict MALICIOUS =
      new SecurityAgentInvestigationVerdict("malicious");

  SecurityAgentInvestigationVerdict(String value) {
    super(value, allowedValues);
  }

  public static class SecurityAgentInvestigationVerdictSerializer
      extends StdSerializer<SecurityAgentInvestigationVerdict> {
    public SecurityAgentInvestigationVerdictSerializer(Class<SecurityAgentInvestigationVerdict> t) {
      super(t);
    }

    public SecurityAgentInvestigationVerdictSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityAgentInvestigationVerdict value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityAgentInvestigationVerdict fromValue(String value) {
    return new SecurityAgentInvestigationVerdict(value);
  }
}
