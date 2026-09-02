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

/** OIDC scope a client may be restricted to. */
@JsonSerialize(using = OAuthOidcScope.OAuthOidcScopeSerializer.class)
public class OAuthOidcScope extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("openid", "profile", "email", "offline_access"));

  public static final OAuthOidcScope OPENID = new OAuthOidcScope("openid");
  public static final OAuthOidcScope PROFILE = new OAuthOidcScope("profile");
  public static final OAuthOidcScope EMAIL = new OAuthOidcScope("email");
  public static final OAuthOidcScope OFFLINE_ACCESS = new OAuthOidcScope("offline_access");

  OAuthOidcScope(String value) {
    super(value, allowedValues);
  }

  public static class OAuthOidcScopeSerializer extends StdSerializer<OAuthOidcScope> {
    public OAuthOidcScopeSerializer(Class<OAuthOidcScope> t) {
      super(t);
    }

    public OAuthOidcScopeSerializer() {
      this(null);
    }

    @Override
    public void serialize(OAuthOidcScope value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OAuthOidcScope fromValue(String value) {
    return new OAuthOidcScope(value);
  }
}
