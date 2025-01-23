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
@JsonSerialize(using = RuleTypesItems.RuleTypesItemsSerializer.class)
public class RuleTypesItems extends ModelEnum<String> {

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

  public static final RuleTypesItems APPLICATION_CODE_VULNERABILITY =
      new RuleTypesItems("application_code_vulnerability");
  public static final RuleTypesItems APPLICATION_LIBRARY_VULNERABILITY =
      new RuleTypesItems("application_library_vulnerability");
  public static final RuleTypesItems ATTACK_PATH = new RuleTypesItems("attack_path");
  public static final RuleTypesItems CONTAINER_IMAGE_VULNERABILITY =
      new RuleTypesItems("container_image_vulnerability");
  public static final RuleTypesItems HOST_VULNERABILITY = new RuleTypesItems("host_vulnerability");
  public static final RuleTypesItems IDENTITY_RISK = new RuleTypesItems("identity_risk");
  public static final RuleTypesItems MISCONFIGURATION = new RuleTypesItems("misconfiguration");
  public static final RuleTypesItems API_SECURITY = new RuleTypesItems("api_security");

  RuleTypesItems(String value) {
    super(value, allowedValues);
  }

  public static class RuleTypesItemsSerializer extends StdSerializer<RuleTypesItems> {
    public RuleTypesItemsSerializer(Class<RuleTypesItems> t) {
      super(t);
    }

    public RuleTypesItemsSerializer() {
      this(null);
    }

    @Override
    public void serialize(RuleTypesItems value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static RuleTypesItems fromValue(String value) {
    return new RuleTypesItems(value);
  }
}
