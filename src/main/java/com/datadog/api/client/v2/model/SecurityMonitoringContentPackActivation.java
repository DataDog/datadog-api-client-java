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

/** The activation status of a content pack */
@JsonSerialize(
    using =
        SecurityMonitoringContentPackActivation.SecurityMonitoringContentPackActivationSerializer
            .class)
public class SecurityMonitoringContentPackActivation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("never_activated", "activated", "deactivated"));

  public static final SecurityMonitoringContentPackActivation NEVER_ACTIVATED =
      new SecurityMonitoringContentPackActivation("never_activated");
  public static final SecurityMonitoringContentPackActivation ACTIVATED =
      new SecurityMonitoringContentPackActivation("activated");
  public static final SecurityMonitoringContentPackActivation DEACTIVATED =
      new SecurityMonitoringContentPackActivation("deactivated");

  SecurityMonitoringContentPackActivation(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringContentPackActivationSerializer
      extends StdSerializer<SecurityMonitoringContentPackActivation> {
    public SecurityMonitoringContentPackActivationSerializer(
        Class<SecurityMonitoringContentPackActivation> t) {
      super(t);
    }

    public SecurityMonitoringContentPackActivationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringContentPackActivation value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringContentPackActivation fromValue(String value) {
    return new SecurityMonitoringContentPackActivation(value);
  }
}
