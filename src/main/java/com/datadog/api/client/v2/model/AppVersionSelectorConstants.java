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

/** Constants that always select a particular version of an app. */
@JsonSerialize(using = AppVersionSelectorConstants.AppVersionSelectorConstantsSerializer.class)
public class AppVersionSelectorConstants extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("latest", "deployed"));

  public static final AppVersionSelectorConstants LATEST =
      new AppVersionSelectorConstants("latest");
  public static final AppVersionSelectorConstants DEPLOYED =
      new AppVersionSelectorConstants("deployed");

  AppVersionSelectorConstants(String value) {
    super(value, allowedValues);
  }

  public static class AppVersionSelectorConstantsSerializer
      extends StdSerializer<AppVersionSelectorConstants> {
    public AppVersionSelectorConstantsSerializer(Class<AppVersionSelectorConstants> t) {
      super(t);
    }

    public AppVersionSelectorConstantsSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        AppVersionSelectorConstants value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static AppVersionSelectorConstants fromValue(String value) {
    return new AppVersionSelectorConstants(value);
  }
}
