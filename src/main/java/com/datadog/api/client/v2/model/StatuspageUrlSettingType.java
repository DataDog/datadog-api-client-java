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

/** Statuspage URL setting resource type. */
@JsonSerialize(using = StatuspageUrlSettingType.StatuspageUrlSettingTypeSerializer.class)
public class StatuspageUrlSettingType extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("statuspage-url-setting"));

  public static final StatuspageUrlSettingType STATUSPAGE_URL_SETTING =
      new StatuspageUrlSettingType("statuspage-url-setting");

  StatuspageUrlSettingType(String value) {
    super(value, allowedValues);
  }

  public static class StatuspageUrlSettingTypeSerializer
      extends StdSerializer<StatuspageUrlSettingType> {
    public StatuspageUrlSettingTypeSerializer(Class<StatuspageUrlSettingType> t) {
      super(t);
    }

    public StatuspageUrlSettingTypeSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        StatuspageUrlSettingType value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static StatuspageUrlSettingType fromValue(String value) {
    return new StatuspageUrlSettingType(value);
  }
}
