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

/** Google Chat delegated user resource type. */
@JsonSerialize(using = GoogleChatDelegatedUserType.GoogleChatDelegatedUserTypeSerializer.class)
public class GoogleChatDelegatedUserType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("google-chat-delegated-user"));

  public static final GoogleChatDelegatedUserType GOOGLE_CHAT_DELEGATED_USER_TYPE =
      new GoogleChatDelegatedUserType("google-chat-delegated-user");

  GoogleChatDelegatedUserType(String value) {
    super(value, allowedValues);
  }

  public static class GoogleChatDelegatedUserTypeSerializer
      extends StdSerializer<GoogleChatDelegatedUserType> {
    public GoogleChatDelegatedUserTypeSerializer(Class<GoogleChatDelegatedUserType> t) {
      super(t);
    }

    public GoogleChatDelegatedUserTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GoogleChatDelegatedUserType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GoogleChatDelegatedUserType fromValue(String value) {
    return new GoogleChatDelegatedUserType(value);
  }
}
