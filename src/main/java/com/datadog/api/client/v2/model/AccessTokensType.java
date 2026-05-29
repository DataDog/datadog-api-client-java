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
 * Resource type returned by the access tokens list endpoint. Includes both personal and service
 * access tokens.
 */
@JsonSerialize(using = AccessTokensType.AccessTokensTypeSerializer.class)
public class AccessTokensType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("personal_access_tokens", "service_access_tokens"));

  public static final AccessTokensType PERSONAL_ACCESS_TOKENS =
      new AccessTokensType("personal_access_tokens");
  public static final AccessTokensType SERVICE_ACCESS_TOKENS =
      new AccessTokensType("service_access_tokens");

  AccessTokensType(String value) {
    super(value, allowedValues);
  }

  public static class AccessTokensTypeSerializer extends StdSerializer<AccessTokensType> {
    public AccessTokensTypeSerializer(Class<AccessTokensType> t) {
      super(t);
    }

    public AccessTokensTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(AccessTokensType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AccessTokensType fromValue(String value) {
    return new AccessTokensType(value);
  }
}
