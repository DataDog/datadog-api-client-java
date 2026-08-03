/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */

package com.datadog.api.client.v2.model;

import java.io.File;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.UUID;
import java.time.OffsetDateTime;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.openapitools.jackson.nullable.JsonNullable;

import com.datadog.api.client.JsonTimeSerializer;

import com.datadog.api.client.ModelEnum;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.ser.std.StdSerializer;
import java.io.IOException;

import java.util.Set;
import java.util.HashSet;

/**
   * <p>Resource type for secure embed update responses.</p>
 */
@JsonSerialize(using = SecureEmbedUpdateResponseType.SecureEmbedUpdateResponseTypeSerializer.class)
public class SecureEmbedUpdateResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues = new HashSet<String>(Arrays.asList("secure_embed_update_response"));

  public static final SecureEmbedUpdateResponseType SECURE_EMBED_UPDATE_RESPONSE = new SecureEmbedUpdateResponseType("secure_embed_update_response");


  SecureEmbedUpdateResponseType(String value) {
    super(value, allowedValues);
  }

  public static class SecureEmbedUpdateResponseTypeSerializer extends StdSerializer<SecureEmbedUpdateResponseType> {
      public SecureEmbedUpdateResponseTypeSerializer(Class<SecureEmbedUpdateResponseType> t) {
          super(t);
      }

      public SecureEmbedUpdateResponseTypeSerializer() {
          this(null);
      }

      @Override
      public void serialize(SecureEmbedUpdateResponseType value, JsonGenerator jgen, SerializerProvider provider) throws IOException, JsonProcessingException {
          jgen.writeObject(value.value);
      }
  }

  @JsonCreator
  public static SecureEmbedUpdateResponseType fromValue(String value) {
    return new SecureEmbedUpdateResponseType(value);
  }
}
