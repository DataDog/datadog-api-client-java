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

/** Resource type for secure embed create responses. */
@JsonSerialize(using = SecureEmbedCreateResponseType.SecureEmbedCreateResponseTypeSerializer.class)
public class SecureEmbedCreateResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("secure_embed_create_response"));

  public static final SecureEmbedCreateResponseType SECURE_EMBED_CREATE_RESPONSE =
      new SecureEmbedCreateResponseType("secure_embed_create_response");

  SecureEmbedCreateResponseType(String value) {
    super(value, allowedValues);
  }

  public static class SecureEmbedCreateResponseTypeSerializer
      extends StdSerializer<SecureEmbedCreateResponseType> {
    public SecureEmbedCreateResponseTypeSerializer(Class<SecureEmbedCreateResponseType> t) {
      super(t);
    }

    public SecureEmbedCreateResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecureEmbedCreateResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecureEmbedCreateResponseType fromValue(String value) {
    return new SecureEmbedCreateResponseType(value);
  }
}
