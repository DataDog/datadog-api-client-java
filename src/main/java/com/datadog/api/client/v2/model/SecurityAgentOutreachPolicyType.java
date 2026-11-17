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

/** Type of the outreach policy resource. */
@JsonSerialize(
    using = SecurityAgentOutreachPolicyType.SecurityAgentOutreachPolicyTypeSerializer.class)
public class SecurityAgentOutreachPolicyType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("outreach_policy"));

  public static final SecurityAgentOutreachPolicyType OUTREACH_POLICY =
      new SecurityAgentOutreachPolicyType("outreach_policy");

  SecurityAgentOutreachPolicyType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityAgentOutreachPolicyTypeSerializer
      extends StdSerializer<SecurityAgentOutreachPolicyType> {
    public SecurityAgentOutreachPolicyTypeSerializer(Class<SecurityAgentOutreachPolicyType> t) {
      super(t);
    }

    public SecurityAgentOutreachPolicyTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityAgentOutreachPolicyType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityAgentOutreachPolicyType fromValue(String value) {
    return new SecurityAgentOutreachPolicyType(value);
  }
}
