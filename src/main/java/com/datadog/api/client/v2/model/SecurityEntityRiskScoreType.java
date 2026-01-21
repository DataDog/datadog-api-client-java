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

/** Resource type */
@JsonSerialize(using = SecurityEntityRiskScoreType.SecurityEntityRiskScoreTypeSerializer.class)
public class SecurityEntityRiskScoreType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("security_entity_risk_score"));

  public static final SecurityEntityRiskScoreType SECURITY_ENTITY_RISK_SCORE =
      new SecurityEntityRiskScoreType("security_entity_risk_score");

  SecurityEntityRiskScoreType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityEntityRiskScoreTypeSerializer
      extends StdSerializer<SecurityEntityRiskScoreType> {
    public SecurityEntityRiskScoreTypeSerializer(Class<SecurityEntityRiskScoreType> t) {
      super(t);
    }

    public SecurityEntityRiskScoreTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityEntityRiskScoreType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityEntityRiskScoreType fromValue(String value) {
    return new SecurityEntityRiskScoreType(value);
  }
}
