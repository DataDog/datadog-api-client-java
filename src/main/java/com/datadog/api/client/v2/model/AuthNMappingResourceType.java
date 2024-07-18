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

/** The type of resource being mapped to. */
@JsonSerialize(using = AuthNMappingResourceType.AuthNMappingResourceTypeSerializer.class)
public class AuthNMappingResourceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("role", "team"));

  public static final AuthNMappingResourceType ROLE = new AuthNMappingResourceType("role");
  public static final AuthNMappingResourceType TEAM = new AuthNMappingResourceType("team");

  AuthNMappingResourceType(String value) {
    super(value, allowedValues);
  }

  public static class AuthNMappingResourceTypeSerializer
      extends StdSerializer<AuthNMappingResourceType> {
    public AuthNMappingResourceTypeSerializer(Class<AuthNMappingResourceType> t) {
      super(t);
    }

    public AuthNMappingResourceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AuthNMappingResourceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AuthNMappingResourceType fromValue(String value) {
    return new AuthNMappingResourceType(value);
  }
}
