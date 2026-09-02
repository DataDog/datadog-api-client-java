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

/** The type of security finding that the automation rule applies to. */
@JsonSerialize(using = SecurityFindingType.SecurityFindingTypeSerializer.class)
public class SecurityFindingType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "api_security",
              "attack_path",
              "host_and_container_vulnerability",
              "iac_misconfiguration",
              "identity_risk",
              "library_vulnerability",
              "misconfiguration",
              "runtime_code_vulnerability",
              "secret",
              "static_code_vulnerability",
              "workload_activity"));

  public static final SecurityFindingType API_SECURITY = new SecurityFindingType("api_security");
  public static final SecurityFindingType ATTACK_PATH = new SecurityFindingType("attack_path");
  public static final SecurityFindingType HOST_AND_CONTAINER_VULNERABILITY =
      new SecurityFindingType("host_and_container_vulnerability");
  public static final SecurityFindingType IAC_MISCONFIGURATION =
      new SecurityFindingType("iac_misconfiguration");
  public static final SecurityFindingType IDENTITY_RISK = new SecurityFindingType("identity_risk");
  public static final SecurityFindingType LIBRARY_VULNERABILITY =
      new SecurityFindingType("library_vulnerability");
  public static final SecurityFindingType MISCONFIGURATION =
      new SecurityFindingType("misconfiguration");
  public static final SecurityFindingType RUNTIME_CODE_VULNERABILITY =
      new SecurityFindingType("runtime_code_vulnerability");
  public static final SecurityFindingType SECRET = new SecurityFindingType("secret");
  public static final SecurityFindingType STATIC_CODE_VULNERABILITY =
      new SecurityFindingType("static_code_vulnerability");
  public static final SecurityFindingType WORKLOAD_ACTIVITY =
      new SecurityFindingType("workload_activity");

  SecurityFindingType(String value) {
    super(value, allowedValues);
  }

  public static class SecurityFindingTypeSerializer extends StdSerializer<SecurityFindingType> {
    public SecurityFindingTypeSerializer(Class<SecurityFindingType> t) {
      super(t);
    }

    public SecurityFindingTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityFindingType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityFindingType fromValue(String value) {
    return new SecurityFindingType(value);
  }
}
