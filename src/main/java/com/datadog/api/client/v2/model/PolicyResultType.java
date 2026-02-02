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

/** The type of the resource. The value should always be <code>policy_result</code>. */
@JsonSerialize(using = PolicyResultType.PolicyResultTypeSerializer.class)
public class PolicyResultType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("policy_result"));

  public static final PolicyResultType POLICY_RESULT = new PolicyResultType("policy_result");

  PolicyResultType(String value) {
    super(value, allowedValues);
  }

  public static class PolicyResultTypeSerializer extends StdSerializer<PolicyResultType> {
    public PolicyResultTypeSerializer(Class<PolicyResultType> t) {
      super(t);
    }

    public PolicyResultTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(PolicyResultType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PolicyResultType fromValue(String value) {
    return new PolicyResultType(value);
  }
}
