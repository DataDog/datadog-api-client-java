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

/** The definition of the <code>CloudflareAPIToken</code> object. */
@JsonSerialize(using = CloudflareAPITokenType.CloudflareAPITokenTypeSerializer.class)
public class CloudflareAPITokenType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("CloudflareAPIToken"));

  public static final CloudflareAPITokenType CLOUDFLAREAPITOKEN =
      new CloudflareAPITokenType("CloudflareAPIToken");

  CloudflareAPITokenType(String value) {
    super(value, allowedValues);
  }

  public static class CloudflareAPITokenTypeSerializer
      extends StdSerializer<CloudflareAPITokenType> {
    public CloudflareAPITokenTypeSerializer(Class<CloudflareAPITokenType> t) {
      super(t);
    }

    public CloudflareAPITokenTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        CloudflareAPITokenType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static CloudflareAPITokenType fromValue(String value) {
    return new CloudflareAPITokenType(value);
  }
}
