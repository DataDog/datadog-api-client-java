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

/** Severity of a security rule */
@JsonSerialize(using = SecurityRuleSeverity.SecurityRuleSeveritySerializer.class)
public class SecurityRuleSeverity extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("critical", "high", "medium", "low", "unknown", "info"));

  public static final SecurityRuleSeverity CRITICAL = new SecurityRuleSeverity("critical");
  public static final SecurityRuleSeverity HIGH = new SecurityRuleSeverity("high");
  public static final SecurityRuleSeverity MEDIUM = new SecurityRuleSeverity("medium");
  public static final SecurityRuleSeverity LOW = new SecurityRuleSeverity("low");
  public static final SecurityRuleSeverity UNKNOWN = new SecurityRuleSeverity("unknown");
  public static final SecurityRuleSeverity INFO = new SecurityRuleSeverity("info");

  SecurityRuleSeverity(String value) {
    super(value, allowedValues);
  }

  public static class SecurityRuleSeveritySerializer extends StdSerializer<SecurityRuleSeverity> {
    public SecurityRuleSeveritySerializer(Class<SecurityRuleSeverity> t) {
      super(t);
    }

    public SecurityRuleSeveritySerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityRuleSeverity value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityRuleSeverity fromValue(String value) {
    return new SecurityRuleSeverity(value);
  }
}
