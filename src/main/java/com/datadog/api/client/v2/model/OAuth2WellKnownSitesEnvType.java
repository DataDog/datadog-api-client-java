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

/** JSON:API resource type for OAuth2 well-known sites environment. */
@JsonSerialize(using = OAuth2WellKnownSitesEnvType.OAuth2WellKnownSitesEnvTypeSerializer.class)
public class OAuth2WellKnownSitesEnvType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("env"));

  public static final OAuth2WellKnownSitesEnvType ENV = new OAuth2WellKnownSitesEnvType("env");

  OAuth2WellKnownSitesEnvType(String value) {
    super(value, allowedValues);
  }

  public static class OAuth2WellKnownSitesEnvTypeSerializer
      extends StdSerializer<OAuth2WellKnownSitesEnvType> {
    public OAuth2WellKnownSitesEnvTypeSerializer(Class<OAuth2WellKnownSitesEnvType> t) {
      super(t);
    }

    public OAuth2WellKnownSitesEnvTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OAuth2WellKnownSitesEnvType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OAuth2WellKnownSitesEnvType fromValue(String value) {
    return new OAuth2WellKnownSitesEnvType(value);
  }
}
