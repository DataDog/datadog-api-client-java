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

/** The user's status. */
@JsonSerialize(using = UserAttributesStatus.UserAttributesStatusSerializer.class)
public class UserAttributesStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("active", "deactivated", "pending"));

  public static final UserAttributesStatus ACTIVE = new UserAttributesStatus("active");
  public static final UserAttributesStatus DEACTIVATED = new UserAttributesStatus("deactivated");
  public static final UserAttributesStatus PENDING = new UserAttributesStatus("pending");

  UserAttributesStatus(String value) {
    super(value, allowedValues);
  }

  public static class UserAttributesStatusSerializer extends StdSerializer<UserAttributesStatus> {
    public UserAttributesStatusSerializer(Class<UserAttributesStatus> t) {
      super(t);
    }

    public UserAttributesStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        UserAttributesStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static UserAttributesStatus fromValue(String value) {
    return new UserAttributesStatus(value);
  }
}
