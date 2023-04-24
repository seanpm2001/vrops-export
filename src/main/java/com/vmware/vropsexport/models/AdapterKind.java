/*
 * Copyright 2017-2021 VMware, Inc. All Rights Reserved.
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

import java.util.List;

public class AdapterKind {
  private String key;
  private String name;
  private String description;
  private String adapterKindType;
  private Integer describeVersion;
  private List<String> resourceKinds;

  public String getKey() {
    return key;
  }

  public void setKey(final String key) {
    this.key = key;
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(final String description) {
    this.description = description;
  }

  public String getAdapterKindType() {
    return adapterKindType;
  }

  public void setAdapterKindType(final String adapterKindType) {
    this.adapterKindType = adapterKindType;
  }

  public Integer getDescribeVersion() {
    return describeVersion;
  }

  public void setDescribeVersion(final Integer describeVersion) {
    this.describeVersion = describeVersion;
  }

  public List<String> getResourceKinds() {
    return resourceKinds;
  }

  public void setResourceKinds(final List<String> resourceKinds) {
    this.resourceKinds = resourceKinds;
  }
}
