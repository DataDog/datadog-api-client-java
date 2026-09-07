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

/** Type of the anonymize users response. */
@JsonSerialize(using = AnonymizeUsersResponseType.AnonymizeUsersResponseTypeSerializer.class)
public class AnonymizeUsersResponseType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("anonymize_users_response"));

  public static final AnonymizeUsersResponseType ANONYMIZE_USERS_RESPONSE =
      new AnonymizeUsersResponseType("anonymize_users_response");

  AnonymizeUsersResponseType(String value) {
    super(value, allowedValues);
  }

  public static class AnonymizeUsersResponseTypeSerializer
      extends StdSerializer<AnonymizeUsersResponseType> {
    public AnonymizeUsersResponseTypeSerializer(Class<AnonymizeUsersResponseType> t) {
      super(t);
    }

    public AnonymizeUsersResponseTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AnonymizeUsersResponseType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AnonymizeUsersResponseType fromValue(String value) {
    return new AnonymizeUsersResponseType(value);
  }
}
