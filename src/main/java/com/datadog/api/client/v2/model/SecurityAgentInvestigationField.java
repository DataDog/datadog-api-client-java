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

/** An attribute of an investigation that <code>fields[investigations]</code> can select. */
@JsonSerialize(
    using = SecurityAgentInvestigationField.SecurityAgentInvestigationFieldSerializer.class)
public class SecurityAgentInvestigationField extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "signal_id",
              "rule_id",
              "state",
              "verdict",
              "conclusion",
              "signal",
              "key_entities",
              "key_evidence",
              "steps",
              "response_suggestions",
              "created_at",
              "updated_at"));

  public static final SecurityAgentInvestigationField SIGNAL_ID =
      new SecurityAgentInvestigationField("signal_id");
  public static final SecurityAgentInvestigationField RULE_ID =
      new SecurityAgentInvestigationField("rule_id");
  public static final SecurityAgentInvestigationField STATE =
      new SecurityAgentInvestigationField("state");
  public static final SecurityAgentInvestigationField VERDICT =
      new SecurityAgentInvestigationField("verdict");
  public static final SecurityAgentInvestigationField CONCLUSION =
      new SecurityAgentInvestigationField("conclusion");
  public static final SecurityAgentInvestigationField SIGNAL =
      new SecurityAgentInvestigationField("signal");
  public static final SecurityAgentInvestigationField KEY_ENTITIES =
      new SecurityAgentInvestigationField("key_entities");
  public static final SecurityAgentInvestigationField KEY_EVIDENCE =
      new SecurityAgentInvestigationField("key_evidence");
  public static final SecurityAgentInvestigationField STEPS =
      new SecurityAgentInvestigationField("steps");
  public static final SecurityAgentInvestigationField RESPONSE_SUGGESTIONS =
      new SecurityAgentInvestigationField("response_suggestions");
  public static final SecurityAgentInvestigationField CREATED_AT =
      new SecurityAgentInvestigationField("created_at");
  public static final SecurityAgentInvestigationField UPDATED_AT =
      new SecurityAgentInvestigationField("updated_at");

  SecurityAgentInvestigationField(String value) {
    super(value, allowedValues);
  }

  public static class SecurityAgentInvestigationFieldSerializer
      extends StdSerializer<SecurityAgentInvestigationField> {
    public SecurityAgentInvestigationFieldSerializer(Class<SecurityAgentInvestigationField> t) {
      super(t);
    }

    public SecurityAgentInvestigationFieldSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityAgentInvestigationField value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityAgentInvestigationField fromValue(String value) {
    return new SecurityAgentInvestigationField(value);
  }
}
