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

/** Estimated risk of a remediation step or proposed fix. */
@JsonSerialize(using = RemediationRiskLevel.RemediationRiskLevelSerializer.class)
public class RemediationRiskLevel extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("low", "medium", "high"));

  public static final RemediationRiskLevel LOW = new RemediationRiskLevel("low");
  public static final RemediationRiskLevel MEDIUM = new RemediationRiskLevel("medium");
  public static final RemediationRiskLevel HIGH = new RemediationRiskLevel("high");

  RemediationRiskLevel(String value) {
    super(value, allowedValues);
  }

  public static class RemediationRiskLevelSerializer extends StdSerializer<RemediationRiskLevel> {
    public RemediationRiskLevelSerializer(Class<RemediationRiskLevel> t) {
      super(t);
    }

    public RemediationRiskLevelSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        RemediationRiskLevel value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RemediationRiskLevel fromValue(String value) {
    return new RemediationRiskLevel(value);
  }
}
