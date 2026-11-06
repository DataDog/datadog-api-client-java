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

/** How the signing keys are discovered. */
@JsonSerialize(using = OIDCCloudAuthDiscoveryType.OIDCCloudAuthDiscoveryTypeSerializer.class)
public class OIDCCloudAuthDiscoveryType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("oidc_discovery", "direct_jwks"));

  public static final OIDCCloudAuthDiscoveryType OIDC_DISCOVERY =
      new OIDCCloudAuthDiscoveryType("oidc_discovery");
  public static final OIDCCloudAuthDiscoveryType DIRECT_JWKS =
      new OIDCCloudAuthDiscoveryType("direct_jwks");

  OIDCCloudAuthDiscoveryType(String value) {
    super(value, allowedValues);
  }

  public static class OIDCCloudAuthDiscoveryTypeSerializer
      extends StdSerializer<OIDCCloudAuthDiscoveryType> {
    public OIDCCloudAuthDiscoveryTypeSerializer(Class<OIDCCloudAuthDiscoveryType> t) {
      super(t);
    }

    public OIDCCloudAuthDiscoveryTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OIDCCloudAuthDiscoveryType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OIDCCloudAuthDiscoveryType fromValue(String value) {
    return new OIDCCloudAuthDiscoveryType(value);
  }
}
