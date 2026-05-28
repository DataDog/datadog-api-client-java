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

/** JSON:API resource type for an OAuth2 client scopes restriction. */
@JsonSerialize(using = OAuthScopesRestrictionType.OAuthScopesRestrictionTypeSerializer.class)
public class OAuthScopesRestrictionType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("scopes_restriction"));

  public static final OAuthScopesRestrictionType SCOPES_RESTRICTION =
      new OAuthScopesRestrictionType("scopes_restriction");

  OAuthScopesRestrictionType(String value) {
    super(value, allowedValues);
  }

  public static class OAuthScopesRestrictionTypeSerializer
      extends StdSerializer<OAuthScopesRestrictionType> {
    public OAuthScopesRestrictionTypeSerializer(Class<OAuthScopesRestrictionType> t) {
      super(t);
    }

    public OAuthScopesRestrictionTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OAuthScopesRestrictionType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OAuthScopesRestrictionType fromValue(String value) {
    return new OAuthScopesRestrictionType(value);
  }
}
