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

/**
 * Represents the resource type for individual steps in an escalation policy used during incident
 * response.
 */
@JsonSerialize(using = EscalationType.EscalationTypeSerializer.class)
public class EscalationType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("escalation_policy_steps"));

  public static final EscalationType ESCALATION_POLICY_STEPS =
      new EscalationType("escalation_policy_steps");

  EscalationType(String value) {
    super(value, allowedValues);
  }

  public static class EscalationTypeSerializer extends StdSerializer<EscalationType> {
    public EscalationTypeSerializer(Class<EscalationType> t) {
      super(t);
    }

    public EscalationTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(EscalationType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static EscalationType fromValue(String value) {
    return new EscalationType(value);
  }
}
