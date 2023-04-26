/*
 *
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
 *
 */

package com.vmware.vropsexport;

import java.util.regex.Matcher;

public class Field {
  enum Kind {
    METRIC,
    PROPERTY,
    TAG
  }

  enum RelationshipType {
    SELF,
    CHILD,
    PARENT,
  }

  protected static final String TAG_PROP_PREFIX = "summary|tagJson#";

  private String alias;
  private String name;
  private String localName;
  private String relatedResourceKind;
  private String relatedAdapterKind = "VMWARE";
  private RelationshipType relationshipType = RelationshipType.SELF;
  private Kind kind;

  public Field() {}

  public Field(
      final String alias,
      final String name,
      final Kind kind,
      final String relatedAdapterKind,
      final String relatedResourceKind,
      final RelationshipType relationshipType) {
    super();
    this.alias = alias;
    this.relatedResourceKind = relatedResourceKind;
    this.relationshipType = relationshipType;
    this.relatedAdapterKind = relatedAdapterKind;
    switch (kind) {
      case METRIC:
        setMetric(name);
        break;
      case PROPERTY:
        setProp(name);
        break;
      case TAG:
        setTag(name);
        break;
    }
  }

  public String getName() {
    return name;
  }

  public void setName(final String name) {
    this.name = name;
    final Matcher m = Patterns.parentPattern.matcher(name);
    if (m.matches()) {
      relationshipType = RelationshipType.PARENT;
      localName = m.group(2);
      relatedResourceKind = m.group(1);
    }
  }

  public String getAlias() {
    return alias;
  }

  public void setAlias(final String alias) {
    this.alias = alias;
  }

  public String getMetric() {
    return hasMetric() ? name : null;
  }

  public boolean hasMetric() {
    return kind == Kind.METRIC;
  }

  public void setMetric(final String metric) {
    name = metric;
    kind = Kind.METRIC;
  }

  public String getProp() {
    return hasProp() ? name : null;
  }

  public void setProp(final String prop) {
    name = prop;
    kind = Kind.PROPERTY;
  }

  public void setTag(final String tag) {
    name = TAG_PROP_PREFIX + tag;
    kind = Kind.TAG;
  }

  public boolean hasProp() {
    return kind == Kind.PROPERTY;
  }

  public String getLocalName() {
    return localName;
  }

  public void setLocalName(final String localName) {
    this.localName = localName;
  }

  public String getRelatedResourceKind() {
    return relatedResourceKind;
  }

  public void setRelatedResourceKind(final String relatedResourceKind) {
    this.relatedResourceKind = relatedResourceKind;
  }

  public RelationshipType getRelationshipType() {
    return relationshipType;
  }

  public void setRelationshipType(final RelationshipType relationshipType) {
    this.relationshipType = relationshipType;
  }

  public Kind getKind() {
    return kind;
  }

  public void setKind(final Kind kind) {
    this.kind = kind;
  }

  public String getRelatedAdapterKind() {
    return relatedAdapterKind;
  }
}
