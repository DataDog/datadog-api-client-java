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

/** AI Gateway routing policy resource type. */
@JsonSerialize(using = AiGatewayPolicyType.AiGatewayPolicyTypeSerializer.class)
public class AiGatewayPolicyType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("routing-documents"));

  public static final AiGatewayPolicyType ROUTING_DOCUMENTS =
      new AiGatewayPolicyType("routing-documents");

  AiGatewayPolicyType(String value) {
    super(value, allowedValues);
  }

  public static class AiGatewayPolicyTypeSerializer extends StdSerializer<AiGatewayPolicyType> {
    public AiGatewayPolicyTypeSerializer(Class<AiGatewayPolicyType> t) {
      super(t);
    }

    public AiGatewayPolicyTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AiGatewayPolicyType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AiGatewayPolicyType fromValue(String value) {
    return new AiGatewayPolicyType(value);
  }
}
