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

/** The location where the postmortem is created and stored. */
@JsonSerialize(using = PostmortemTemplateLocation.PostmortemTemplateLocationSerializer.class)
public class PostmortemTemplateLocation extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("datadog_notebooks", "confluence", "google_docs"));

  public static final PostmortemTemplateLocation DATADOG_NOTEBOOKS =
      new PostmortemTemplateLocation("datadog_notebooks");
  public static final PostmortemTemplateLocation CONFLUENCE =
      new PostmortemTemplateLocation("confluence");
  public static final PostmortemTemplateLocation GOOGLE_DOCS =
      new PostmortemTemplateLocation("google_docs");

  PostmortemTemplateLocation(String value) {
    super(value, allowedValues);
  }

  public static class PostmortemTemplateLocationSerializer
      extends StdSerializer<PostmortemTemplateLocation> {
    public PostmortemTemplateLocationSerializer(Class<PostmortemTemplateLocation> t) {
      super(t);
    }

    public PostmortemTemplateLocationSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        PostmortemTemplateLocation value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PostmortemTemplateLocation fromValue(String value) {
    return new PostmortemTemplateLocation(value);
  }
}
