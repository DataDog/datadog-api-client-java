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
 * The type of the resource. The value should always be <code>entra_id_azure_app_registrations
 * </code>.
 */
@JsonSerialize(
    using =
        SecurityMonitoringEntraIdAzureAppRegistrationsResourceType
            .SecurityMonitoringEntraIdAzureAppRegistrationsResourceTypeSerializer.class)
public class SecurityMonitoringEntraIdAzureAppRegistrationsResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("entra_id_azure_app_registrations"));

  public static final SecurityMonitoringEntraIdAzureAppRegistrationsResourceType
      ENTRA_ID_AZURE_APP_REGISTRATIONS =
          new SecurityMonitoringEntraIdAzureAppRegistrationsResourceType(
              "entra_id_azure_app_registrations");

  SecurityMonitoringEntraIdAzureAppRegistrationsResourceType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringEntraIdAzureAppRegistrationsResourceTypeSerializer
      extends StdSerializer<SecurityMonitoringEntraIdAzureAppRegistrationsResourceType> {
    public SecurityMonitoringEntraIdAzureAppRegistrationsResourceTypeSerializer(
        Class<SecurityMonitoringEntraIdAzureAppRegistrationsResourceType> t) {
      super(t);
    }

    public SecurityMonitoringEntraIdAzureAppRegistrationsResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringEntraIdAzureAppRegistrationsResourceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringEntraIdAzureAppRegistrationsResourceType fromValue(String value) {
    return new SecurityMonitoringEntraIdAzureAppRegistrationsResourceType(value);
  }
}
