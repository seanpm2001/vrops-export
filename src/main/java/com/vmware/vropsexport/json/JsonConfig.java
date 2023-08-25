/*
 * Copyright 2017-2023 VMware, Inc. All Rights Reserved.
 *
 * SPDX-License-Identifier:	Apache-2.0
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.vmware.vropsexport.json;

public class JsonConfig {
  public enum JsonFormat {
    chatty,
    compact,
    elastic,
  }

  private boolean pretty;

  private JsonFormat format = JsonFormat.compact;

  public JsonFormat getFormat() {
    return format;
  }

  public void setFormat(final JsonFormat format) {
    this.format = format;
  }

  public boolean isPretty() {
    return pretty;
  }

  public void setPretty(final boolean pretty) {
    this.pretty = pretty;
  }
}
