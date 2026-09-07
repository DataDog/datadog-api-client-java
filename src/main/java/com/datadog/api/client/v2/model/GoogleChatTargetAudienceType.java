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

/** Google Chat target audience resource type. */
@JsonSerialize(using = GoogleChatTargetAudienceType.GoogleChatTargetAudienceTypeSerializer.class)
public class GoogleChatTargetAudienceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("google-chat-target-audience"));

  public static final GoogleChatTargetAudienceType GOOGLE_CHAT_TARGET_AUDIENCE_TYPE =
      new GoogleChatTargetAudienceType("google-chat-target-audience");

  GoogleChatTargetAudienceType(String value) {
    super(value, allowedValues);
  }

  public static class GoogleChatTargetAudienceTypeSerializer
      extends StdSerializer<GoogleChatTargetAudienceType> {
    public GoogleChatTargetAudienceTypeSerializer(Class<GoogleChatTargetAudienceType> t) {
      super(t);
    }

    public GoogleChatTargetAudienceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GoogleChatTargetAudienceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GoogleChatTargetAudienceType fromValue(String value) {
    return new GoogleChatTargetAudienceType(value);
  }
}
