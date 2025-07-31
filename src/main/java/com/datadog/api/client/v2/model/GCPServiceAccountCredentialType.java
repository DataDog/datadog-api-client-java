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

/** The definition of the <code>GCPServiceAccount</code> object. */
@JsonSerialize(
    using = GCPServiceAccountCredentialType.GCPServiceAccountCredentialTypeSerializer.class)
public class GCPServiceAccountCredentialType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("GCPServiceAccount"));

  public static final GCPServiceAccountCredentialType GCPSERVICEACCOUNT =
      new GCPServiceAccountCredentialType("GCPServiceAccount");

  GCPServiceAccountCredentialType(String value) {
    super(value, allowedValues);
  }

  public static class GCPServiceAccountCredentialTypeSerializer
      extends StdSerializer<GCPServiceAccountCredentialType> {
    public GCPServiceAccountCredentialTypeSerializer(Class<GCPServiceAccountCredentialType> t) {
      super(t);
    }

    public GCPServiceAccountCredentialTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GCPServiceAccountCredentialType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GCPServiceAccountCredentialType fromValue(String value) {
    return new GCPServiceAccountCredentialType(value);
  }
}
