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

/** The bucket key prefix indicating the type of file upload. */
@JsonSerialize(
    using =
        SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix
            .SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefixSerializer.class)
public class SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix
    extends ModelEnum<String> {

  private static final Set<String> allowedValues =
      new HashSet<String>(Arrays.asList("api-upload-file", "browser-upload-file-step"));

  public static final SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix
      API_UPLOAD_FILE =
          new SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix("api-upload-file");
  public static final SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix
      BROWSER_UPLOAD_FILE_STEP =
          new SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix(
              "browser-upload-file-step");

  SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix(String value) {
    super(value, allowedValues);
  }

  public static class SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefixSerializer
      extends StdSerializer<SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix> {
    public SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefixSerializer(
        Class<SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix> t) {
      super(t);
    }

    public SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefixSerializer() {
      this(null);
    }

    @Override
    public void serialize(
        SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix value,
        JsonGenerator jgen,
        SerializerProvider provider)
        throws IOException, JsonProcessingException {
      jgen.writeObject(value.value);
    }
  }

  @JsonCreator
  public static SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix fromValue(
      String value) {
    return new SyntheticsTestFileMultipartPresignedUrlsRequestBucketKeyPrefix(value);
  }
}
