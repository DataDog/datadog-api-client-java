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

/** Personal access tokens resource type. */
@JsonSerialize(using = PersonalAccessTokenType.PersonalAccessTokenTypeSerializer.class)
public class PersonalAccessTokenType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("personal_access_tokens"));

  public static final PersonalAccessTokenType PERSONAL_ACCESS_TOKENS =
      new PersonalAccessTokenType("personal_access_tokens");

  PersonalAccessTokenType(String value) {
    super(value, allowedValues);
  }

  public static class PersonalAccessTokenTypeSerializer
      extends StdSerializer<PersonalAccessTokenType> {
    public PersonalAccessTokenTypeSerializer(Class<PersonalAccessTokenType> t) {
      super(t);
    }

    public PersonalAccessTokenTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PersonalAccessTokenType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PersonalAccessTokenType fromValue(String value) {
    return new PersonalAccessTokenType(value);
  }
}
