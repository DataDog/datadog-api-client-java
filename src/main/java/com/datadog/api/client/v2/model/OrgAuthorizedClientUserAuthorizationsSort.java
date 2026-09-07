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

/** Field to sort user authorizations by. */
@JsonSerialize(
    using =
        OrgAuthorizedClientUserAuthorizationsSort
            .OrgAuthorizedClientUserAuthorizationsSortSerializer.class)
public class OrgAuthorizedClientUserAuthorizationsSort extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("user.name", "user.email", "oauth2_client.name"));

  public static final OrgAuthorizedClientUserAuthorizationsSort USER_NAME =
      new OrgAuthorizedClientUserAuthorizationsSort("user.name");
  public static final OrgAuthorizedClientUserAuthorizationsSort USER_EMAIL =
      new OrgAuthorizedClientUserAuthorizationsSort("user.email");
  public static final OrgAuthorizedClientUserAuthorizationsSort OAUTH2_CLIENT_NAME =
      new OrgAuthorizedClientUserAuthorizationsSort("oauth2_client.name");

  OrgAuthorizedClientUserAuthorizationsSort(String value) {
    super(value, allowedValues);
  }

  public static class OrgAuthorizedClientUserAuthorizationsSortSerializer
      extends StdSerializer<OrgAuthorizedClientUserAuthorizationsSort> {
    public OrgAuthorizedClientUserAuthorizationsSortSerializer(
        Class<OrgAuthorizedClientUserAuthorizationsSort> t) {
      super(t);
    }

    public OrgAuthorizedClientUserAuthorizationsSortSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OrgAuthorizedClientUserAuthorizationsSort value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OrgAuthorizedClientUserAuthorizationsSort fromValue(String value) {
    return new OrgAuthorizedClientUserAuthorizationsSort(value);
  }
}
