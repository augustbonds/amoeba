/*
 * Copyright (C) 2015 hops.io.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.hops.metadata.yarn.dal;

import io.hops.exception.StorageException;
import io.hops.metadata.common.EntityDataAccess;
import io.hops.metadata.yarn.entity.RMNodeApplication;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public interface RMNodeApplicationsDataAccess<T> extends EntityDataAccess {

  List<T> findByRMNode(String id) throws StorageException;

  Map<String, List<RMNodeApplication>> getAll() throws StorageException;

  public void addAll(Collection<T> applications) throws StorageException;

  public void add(T application) throws StorageException;
  
  public void removeAll(Collection<T> applications) throws StorageException;

  public void remove(T application) throws StorageException;
}
