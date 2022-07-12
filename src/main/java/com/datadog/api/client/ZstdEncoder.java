/*
 * Unless explicitly stated otherwise all files in this repository are licensed under the Apache-2.0 License.
 * This product includes software developed at Datadog (https://www.datadoghq.com/).
 * Copyright 2019-Present Datadog, Inc.
 */
package com.datadog.api.client;

import com.github.luben.zstd.ZstdInputStream;
import com.github.luben.zstd.ZstdOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import org.glassfish.jersey.spi.ContentEncoder;

/** Zstd encoding support */
@Priority(Priorities.ENTITY_CODER)
public class ZstdEncoder extends ContentEncoder {
  public ZstdEncoder() {
    super("zstd", "zstd1");
  }

  @Override
  public InputStream decode(String contentEncoding, InputStream encodedStream) throws IOException {
    return new ZstdInputStream(encodedStream);
  }

  @Override
  public OutputStream encode(String contentEncoding, OutputStream entityStream) throws IOException {
    return new ZstdOutputStream(entityStream);
  }
}
