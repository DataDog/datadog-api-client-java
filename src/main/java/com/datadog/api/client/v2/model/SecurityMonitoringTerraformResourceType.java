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

/** The type of security monitoring resource to export to Terraform. */
@JsonSerialize(
    using =
        SecurityMonitoringTerraformResourceType.SecurityMonitoringTerraformResourceTypeSerializer
            .class)
public class SecurityMonitoringTerraformResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("suppressions", "critical_assets"));

  public static final SecurityMonitoringTerraformResourceType SUPPRESSIONS =
      new SecurityMonitoringTerraformResourceType("suppressions");
  public static final SecurityMonitoringTerraformResourceType CRITICAL_ASSETS =
      new SecurityMonitoringTerraformResourceType("critical_assets");

  SecurityMonitoringTerraformResourceType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringTerraformResourceTypeSerializer
      extends StdSerializer<SecurityMonitoringTerraformResourceType> {
    public SecurityMonitoringTerraformResourceTypeSerializer(
        Class<SecurityMonitoringTerraformResourceType> t) {
      super(t);
    }

    public SecurityMonitoringTerraformResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringTerraformResourceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringTerraformResourceType fromValue(String value) {
    return new SecurityMonitoringTerraformResourceType(value);
  }
}
