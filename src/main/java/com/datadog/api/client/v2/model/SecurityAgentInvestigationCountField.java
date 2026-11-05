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

/** Field to count completed investigations by. */
@JsonSerialize(
    using =
        SecurityAgentInvestigationCountField.SecurityAgentInvestigationCountFieldSerializer.class)
public class SecurityAgentInvestigationCountField extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("verdict", "rule_type", "signal_source", "entity"));

  public static final SecurityAgentInvestigationCountField VERDICT =
      new SecurityAgentInvestigationCountField("verdict");
  public static final SecurityAgentInvestigationCountField RULE_TYPE =
      new SecurityAgentInvestigationCountField("rule_type");
  public static final SecurityAgentInvestigationCountField SIGNAL_SOURCE =
      new SecurityAgentInvestigationCountField("signal_source");
  public static final SecurityAgentInvestigationCountField ENTITY =
      new SecurityAgentInvestigationCountField("entity");

  SecurityAgentInvestigationCountField(String value) {
    super(value, allowedValues);
  }

  public static class SecurityAgentInvestigationCountFieldSerializer
      extends StdSerializer<SecurityAgentInvestigationCountField> {
    public SecurityAgentInvestigationCountFieldSerializer(
        Class<SecurityAgentInvestigationCountField> t) {
      super(t);
    }

    public SecurityAgentInvestigationCountFieldSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityAgentInvestigationCountField value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityAgentInvestigationCountField fromValue(String value) {
    return new SecurityAgentInvestigationCountField(value);
  }
}
