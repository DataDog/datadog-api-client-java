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

/** The status of the postmortem. */
@JsonSerialize(using = PostmortemStatus.PostmortemStatusSerializer.class)
public class PostmortemStatus extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("draft", "in_review", "completed"));

  public static final PostmortemStatus DRAFT = new PostmortemStatus("draft");
  public static final PostmortemStatus IN_REVIEW = new PostmortemStatus("in_review");
  public static final PostmortemStatus COMPLETED = new PostmortemStatus("completed");

  PostmortemStatus(String value) {
    super(value, allowedValues);
  }

  public static class PostmortemStatusSerializer extends StdSerializer<PostmortemStatus> {
    public PostmortemStatusSerializer(Class<PostmortemStatus> t) {
      super(t);
    }

    public PostmortemStatusSerializer() {
      this(null);
    }

    @Override
    public void serialize(PostmortemStatus value, JsonGenerator jgen, SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static PostmortemStatus fromValue(String value) {
    return new PostmortemStatus(value);
  }
}
