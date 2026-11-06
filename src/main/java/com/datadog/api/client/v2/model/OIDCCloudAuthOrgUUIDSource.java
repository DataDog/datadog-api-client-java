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
 * Source of the organization UUID in the signed token. The <code>aud</code> source accepts a
 * datadog/{org_uuid} audience.
 */
@JsonSerialize(using = OIDCCloudAuthOrgUUIDSource.OIDCCloudAuthOrgUUIDSourceSerializer.class)
public class OIDCCloudAuthOrgUUIDSource extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("dd_org_uuid", "aud"));

  public static final OIDCCloudAuthOrgUUIDSource DD_ORG_UUID =
      new OIDCCloudAuthOrgUUIDSource("dd_org_uuid");
  public static final OIDCCloudAuthOrgUUIDSource AUD = new OIDCCloudAuthOrgUUIDSource("aud");

  OIDCCloudAuthOrgUUIDSource(String value) {
    super(value, allowedValues);
  }

  public static class OIDCCloudAuthOrgUUIDSourceSerializer
      extends StdSerializer<OIDCCloudAuthOrgUUIDSource> {
    public OIDCCloudAuthOrgUUIDSourceSerializer(Class<OIDCCloudAuthOrgUUIDSource> t) {
      super(t);
    }

    public OIDCCloudAuthOrgUUIDSourceSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        OIDCCloudAuthOrgUUIDSource value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static OIDCCloudAuthOrgUUIDSource fromValue(String value) {
    return new OIDCCloudAuthOrgUUIDSource(value);
  }
}
