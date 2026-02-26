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

/** Supported teams field. */
@JsonSerialize(using = TeamsField.TeamsFieldSerializer.class)
public class TeamsField extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(
          Arrays.asList(
              "id",
              "name",
              "handle",
              "summary",
              "description",
              "avatar",
              "banner",
              "visible_modules",
              "hidden_modules",
              "created_at",
              "modified_at",
              "user_count",
              "link_count",
              "team_links",
              "user_team_permissions"));

  public static final TeamsField ID = new TeamsField("id");
  public static final TeamsField NAME = new TeamsField("name");
  public static final TeamsField HANDLE = new TeamsField("handle");
  public static final TeamsField SUMMARY = new TeamsField("summary");
  public static final TeamsField DESCRIPTION = new TeamsField("description");
  public static final TeamsField AVATAR = new TeamsField("avatar");
  public static final TeamsField BANNER = new TeamsField("banner");
  public static final TeamsField VISIBLE_MODULES = new TeamsField("visible_modules");
  public static final TeamsField HIDDEN_MODULES = new TeamsField("hidden_modules");
  public static final TeamsField CREATED_AT = new TeamsField("created_at");
  public static final TeamsField MODIFIED_AT = new TeamsField("modified_at");
  public static final TeamsField USER_COUNT = new TeamsField("user_count");
  public static final TeamsField LINK_COUNT = new TeamsField("link_count");
  public static final TeamsField TEAM_LINKS = new TeamsField("team_links");
  public static final TeamsField USER_TEAM_PERMISSIONS = new TeamsField("user_team_permissions");

  TeamsField(String value) {
    super(value, allowedValues);
  }

  public static class TeamsFieldSerializer extends StdSerializer<TeamsField> {
    public TeamsFieldSerializer(Class<TeamsField> t) {
      super(t);
    }

    public TeamsFieldSerializer() {
      this(null);
    }

    @Override
    public void serialize(TeamsField value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static TeamsField fromValue(String value) {
    return new TeamsField(value);
  }
}
