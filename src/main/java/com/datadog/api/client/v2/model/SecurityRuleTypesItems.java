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

/** Security rule type */
@JsonSerialize(using = SecurityRuleTypesItems.SecurityRuleTypesItemsSerializer.class)
public class SecurityRuleTypesItems extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "application_code_vulnerability",
              "application_library_vulnerability",
              "attack_path",
              "container_image_vulnerability",
              "host_vulnerability",
              "identity_risk",
              "misconfiguration",
              "api_security"));

  public static final SecurityRuleTypesItems APPLICATION_CODE_VULNERABILITY =
      new SecurityRuleTypesItems("application_code_vulnerability");
  public static final SecurityRuleTypesItems APPLICATION_LIBRARY_VULNERABILITY =
      new SecurityRuleTypesItems("application_library_vulnerability");
  public static final SecurityRuleTypesItems ATTACK_PATH =
      new SecurityRuleTypesItems("attack_path");
  public static final SecurityRuleTypesItems CONTAINER_IMAGE_VULNERABILITY =
      new SecurityRuleTypesItems("container_image_vulnerability");
  public static final SecurityRuleTypesItems HOST_VULNERABILITY =
      new SecurityRuleTypesItems("host_vulnerability");
  public static final SecurityRuleTypesItems IDENTITY_RISK =
      new SecurityRuleTypesItems("identity_risk");
  public static final SecurityRuleTypesItems MISCONFIGURATION =
      new SecurityRuleTypesItems("misconfiguration");
  public static final SecurityRuleTypesItems API_SECURITY =
      new SecurityRuleTypesItems("api_security");

  SecurityRuleTypesItems(String value) {
    super(value, allowedValues);
  }

  public static class SecurityRuleTypesItemsSerializer
      extends StdSerializer<SecurityRuleTypesItems> {
    public SecurityRuleTypesItemsSerializer(Class<SecurityRuleTypesItems> t) {
      super(t);
    }

    public SecurityRuleTypesItemsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecurityRuleTypesItems value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecurityRuleTypesItems fromValue(String value) {
    return new SecurityRuleTypesItems(value);
  }
}
