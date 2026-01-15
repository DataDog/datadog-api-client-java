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

/** Google Chat app named space resource type. */
@JsonSerialize(using = GoogleChatAppNamedSpaceType.GoogleChatAppNamedSpaceTypeSerializer.class)
public class GoogleChatAppNamedSpaceType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("google-chat-app-named-space"));

  public static final GoogleChatAppNamedSpaceType GOOGLE_CHAT_APP_NAMED_SPACE_TYPE =
      new GoogleChatAppNamedSpaceType("google-chat-app-named-space");

  GoogleChatAppNamedSpaceType(String value) {
    super(value, allowedValues);
  }

  public static class GoogleChatAppNamedSpaceTypeSerializer
      extends StdSerializer<GoogleChatAppNamedSpaceType> {
    public GoogleChatAppNamedSpaceTypeSerializer(Class<GoogleChatAppNamedSpaceType> t) {
      super(t);
    }

    public GoogleChatAppNamedSpaceTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        GoogleChatAppNamedSpaceType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static GoogleChatAppNamedSpaceType fromValue(String value) {
    return new GoogleChatAppNamedSpaceType(value);
  }
}
