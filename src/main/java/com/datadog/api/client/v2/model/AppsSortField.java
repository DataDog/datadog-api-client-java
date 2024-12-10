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

/** The field and direction to sort apps by */
@JsonSerialize(using = AppsSortField.AppsSortFieldSerializer.class)
public class AppsSortField extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "name",
              "created_at",
              "updated_at",
              "user_name",
              "-name",
              "-created_at",
              "-updated_at",
              "-user_name"));

  public static final AppsSortField NAME = new AppsSortField("name");
  public static final AppsSortField CREATED_AT = new AppsSortField("created_at");
  public static final AppsSortField UPDATED_AT = new AppsSortField("updated_at");
  public static final AppsSortField USER_NAME = new AppsSortField("user_name");
  public static final AppsSortField NAME_DESC = new AppsSortField("-name");
  public static final AppsSortField CREATED_AT_DESC = new AppsSortField("-created_at");
  public static final AppsSortField UPDATED_AT_DESC = new AppsSortField("-updated_at");
  public static final AppsSortField USER_NAME_DESC = new AppsSortField("-user_name");

  AppsSortField(String value) {
    super(value, allowedValues);
  }

  public static class AppsSortFieldSerializer extends StdSerializer<AppsSortField> {
    public AppsSortFieldSerializer(Class<AppsSortField> t) {
      super(t);
    }

    public AppsSortFieldSerializer() {
      this(null);
    }

    @Override
    public void serialize(AppsSortField value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AppsSortField fromValue(String value) {
    return new AppsSortField(value);
  }
}
