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

/** The resource type for user authorized clients. */
@JsonSerialize(using = UserAuthorizedClientType.UserAuthorizedClientTypeSerializer.class)
public class UserAuthorizedClientType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("user_authorized_clients"));

  public static final UserAuthorizedClientType USER_AUTHORIZED_CLIENTS =
      new UserAuthorizedClientType("user_authorized_clients");

  UserAuthorizedClientType(String value) {
    super(value, allowedValues);
  }

  public static class UserAuthorizedClientTypeSerializer
      extends StdSerializer<UserAuthorizedClientType> {
    public UserAuthorizedClientTypeSerializer(Class<UserAuthorizedClientType> t) {
      super(t);
    }

    public UserAuthorizedClientTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UserAuthorizedClientType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UserAuthorizedClientType fromValue(String value) {
    return new UserAuthorizedClientType(value);
  }
}
