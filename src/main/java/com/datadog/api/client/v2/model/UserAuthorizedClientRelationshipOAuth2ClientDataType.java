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

/** OAuth2 client resource type. */
@JsonSerialize(
    using =
        UserAuthorizedClientRelationshipOAuth2ClientDataType
            .UserAuthorizedClientRelationshipOAuth2ClientDataTypeSerializer.class)
public class UserAuthorizedClientRelationshipOAuth2ClientDataType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("oauth2_clients"));

  public static final UserAuthorizedClientRelationshipOAuth2ClientDataType OAUTH2_CLIENTS =
      new UserAuthorizedClientRelationshipOAuth2ClientDataType("oauth2_clients");

  UserAuthorizedClientRelationshipOAuth2ClientDataType(String value) {
    super(value, allowedValues);
  }

  public static class UserAuthorizedClientRelationshipOAuth2ClientDataTypeSerializer
      extends StdSerializer<UserAuthorizedClientRelationshipOAuth2ClientDataType> {
    public UserAuthorizedClientRelationshipOAuth2ClientDataTypeSerializer(
        Class<UserAuthorizedClientRelationshipOAuth2ClientDataType> t) {
      super(t);
    }

    public UserAuthorizedClientRelationshipOAuth2ClientDataTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UserAuthorizedClientRelationshipOAuth2ClientDataType value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UserAuthorizedClientRelationshipOAuth2ClientDataType fromValue(String value) {
    return new UserAuthorizedClientRelationshipOAuth2ClientDataType(value);
  }
}
