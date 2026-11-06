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

/** Resource type returned by the existing Custom OIDC persona mapping API. */
@JsonSerialize(
    using = OIDCCloudAuthPersonaMappingType.OIDCCloudAuthPersonaMappingTypeSerializer.class)
public class OIDCCloudAuthPersonaMappingType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("custom_oidc_identity_mapping"));

  public static final OIDCCloudAuthPersonaMappingType CUSTOM_OIDC_IDENTITY_MAPPING =
      new OIDCCloudAuthPersonaMappingType("custom_oidc_identity_mapping");

  OIDCCloudAuthPersonaMappingType(String value) {
    super(value, allowedValues);
  }

  public static class OIDCCloudAuthPersonaMappingTypeSerializer
      extends StdSerializer<OIDCCloudAuthPersonaMappingType> {
    public OIDCCloudAuthPersonaMappingTypeSerializer(Class<OIDCCloudAuthPersonaMappingType> t) {
      super(t);
    }

    public OIDCCloudAuthPersonaMappingTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OIDCCloudAuthPersonaMappingType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OIDCCloudAuthPersonaMappingType fromValue(String value) {
    return new OIDCCloudAuthPersonaMappingType(value);
  }
}
