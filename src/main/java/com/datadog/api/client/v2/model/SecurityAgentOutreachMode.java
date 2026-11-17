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
 * The organization's outreach mode. <code>off</code> disables user outreach. <code>manual</code>
 * only sends outreach an analyst triggers. <code>automated</code> auto-sends automated interviews
 * for rules with outreach enabled, to users whose email domain is allowed.
 */
@JsonSerialize(using = SecurityAgentOutreachMode.SecurityAgentOutreachModeSerializer.class)
public class SecurityAgentOutreachMode extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("off", "manual", "automated"));

  public static final SecurityAgentOutreachMode OFF = new SecurityAgentOutreachMode("off");
  public static final SecurityAgentOutreachMode MANUAL = new SecurityAgentOutreachMode("manual");
  public static final SecurityAgentOutreachMode AUTOMATED =
      new SecurityAgentOutreachMode("automated");

  SecurityAgentOutreachMode(String value) {
    super(value, allowedValues);
  }

  public static class SecurityAgentOutreachModeSerializer
      extends StdSerializer<SecurityAgentOutreachMode> {
    public SecurityAgentOutreachModeSerializer(Class<SecurityAgentOutreachMode> t) {
      super(t);
    }

    public SecurityAgentOutreachModeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityAgentOutreachMode value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityAgentOutreachMode fromValue(String value) {
    return new SecurityAgentOutreachMode(value);
  }
}
