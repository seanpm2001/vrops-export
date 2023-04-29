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
package com.vmware.vropsexport.models;

import java.util.Map;
import java.util.Objects;

public class NamedResource {
  private String identifier;

  private Map<String, Object> resourceKey;

  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(final String identifier) {
    this.identifier = identifier;
  }

  public Map<String, Object> getResourceKey() {
    return resourceKey;
  }

  public void setResourceKey(final Map<String, Object> resourceKey) {
    this.resourceKey = resourceKey;
  }

  @Override
  public boolean equals(final Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    final NamedResource that = (NamedResource) o;
    return Objects.equals(identifier, that.identifier)
        && Objects.equals(resourceKey, that.resourceKey);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identifier, resourceKey);
  }
}
