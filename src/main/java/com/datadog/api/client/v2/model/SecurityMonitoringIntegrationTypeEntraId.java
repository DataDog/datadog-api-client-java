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

/** The source type for an Entra ID entity context sync. */
@JsonSerialize(
    using =
        SecurityMonitoringIntegrationTypeEntraId.SecurityMonitoringIntegrationTypeEntraIdSerializer
            .class)
public class SecurityMonitoringIntegrationTypeEntraId extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("ENTRA_ID"));

  public static final SecurityMonitoringIntegrationTypeEntraId ENTRA_ID =
      new SecurityMonitoringIntegrationTypeEntraId("ENTRA_ID");

  SecurityMonitoringIntegrationTypeEntraId(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringIntegrationTypeEntraIdSerializer
      extends StdSerializer<SecurityMonitoringIntegrationTypeEntraId> {
    public SecurityMonitoringIntegrationTypeEntraIdSerializer(
        Class<SecurityMonitoringIntegrationTypeEntraId> t) {
      super(t);
    }

    public SecurityMonitoringIntegrationTypeEntraIdSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringIntegrationTypeEntraId value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringIntegrationTypeEntraId fromValue(String value) {
    return new SecurityMonitoringIntegrationTypeEntraId(value);
  }
}
