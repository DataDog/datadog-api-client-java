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
 * The type of the resource. The value should always be <code>aws_identity_center_aws_accounts
 * </code>.
 */
@JsonSerialize(
    using =
        SecurityMonitoringAWSIdentityCenterAWSAccountsResourceType
            .SecurityMonitoringAWSIdentityCenterAWSAccountsResourceTypeSerializer.class)
public class SecurityMonitoringAWSIdentityCenterAWSAccountsResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("aws_identity_center_aws_accounts"));

  public static final SecurityMonitoringAWSIdentityCenterAWSAccountsResourceType
      AWS_IDENTITY_CENTER_AWS_ACCOUNTS =
          new SecurityMonitoringAWSIdentityCenterAWSAccountsResourceType(
              "aws_identity_center_aws_accounts");

  SecurityMonitoringAWSIdentityCenterAWSAccountsResourceType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityMonitoringAWSIdentityCenterAWSAccountsResourceTypeSerializer
      extends StdSerializer<SecurityMonitoringAWSIdentityCenterAWSAccountsResourceType> {
    public SecurityMonitoringAWSIdentityCenterAWSAccountsResourceTypeSerializer(
        Class<SecurityMonitoringAWSIdentityCenterAWSAccountsResourceType> t) {
      super(t);
    }

    public SecurityMonitoringAWSIdentityCenterAWSAccountsResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityMonitoringAWSIdentityCenterAWSAccountsResourceType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityMonitoringAWSIdentityCenterAWSAccountsResourceType fromValue(String value) {
    return new SecurityMonitoringAWSIdentityCenterAWSAccountsResourceType(value);
  }
}
