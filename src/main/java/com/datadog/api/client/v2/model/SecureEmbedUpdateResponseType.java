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

/** Resource type for secure embed update responses. */
@JsonSerialize(using = SecureEmbedUpdateResponseType.SecureEmbedUpdateResponseTypeSerializer.class)
public class SecureEmbedUpdateResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("secure_embed_update_response"));

  public static final SecureEmbedUpdateResponseType SECURE_EMBED_UPDATE_RESPONSE =
      new SecureEmbedUpdateResponseType("secure_embed_update_response");

  SecureEmbedUpdateResponseType(String value) {
    super(value, allowedValues);
  }

  public static class SecureEmbedUpdateResponseTypeSerializer
      extends StdSerializer<SecureEmbedUpdateResponseType> {
    public SecureEmbedUpdateResponseTypeSerializer(Class<SecureEmbedUpdateResponseType> t) {
      super(t);
    }

    public SecureEmbedUpdateResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SecureEmbedUpdateResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SecureEmbedUpdateResponseType fromValue(String value) {
    return new SecureEmbedUpdateResponseType(value);
  }
}
