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

/** Owner resource type. Either a user or a service account. */
@JsonSerialize(using = AccessTokenOwnerType.AccessTokenOwnerTypeSerializer.class)
public class AccessTokenOwnerType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("users", "service_account"));

  public static final AccessTokenOwnerType USERS = new AccessTokenOwnerType("users");
  public static final AccessTokenOwnerType SERVICE_ACCOUNT =
      new AccessTokenOwnerType("service_account");

  AccessTokenOwnerType(String value) {
    super(value, allowedValues);
  }

  public static class AccessTokenOwnerTypeSerializer extends StdSerializer<AccessTokenOwnerType> {
    public AccessTokenOwnerTypeSerializer(Class<AccessTokenOwnerType> t) {
      super(t);
    }

    public AccessTokenOwnerTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AccessTokenOwnerType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AccessTokenOwnerType fromValue(String value) {
    return new AccessTokenOwnerType(value);
  }
}
