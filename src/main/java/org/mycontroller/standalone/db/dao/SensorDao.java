/**
 * Copyright (C) 2015 Jeeva Kandasamy (jkandasa@gmail.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *         http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.mycontroller.standalone.db.dao;

import java.util.List;

import org.mycontroller.standalone.db.tables.Sensor;

import com.j256.ormlite.dao.Dao;

/**
 * @author Jeeva Kandasamy (jkandasa)
 * @since 0.0.1
 */
public interface SensorDao {
    boolean create(Sensor sensor);

    boolean create(Integer nodeId, Sensor sensor);

    void create(Integer nodeId, Integer sensorId);

    void createOrUpdate(Sensor sensor);

    void createOrUpdate(Integer nodeId, Sensor sensor);

    void delete(Sensor sensor);

    void delete(Integer nodeId, Integer sensorId);

    void updateWithEnableSendPayload(Sensor sensor);

    void update(Sensor sensor);

    void update(Integer nodeId, Sensor sensor);

    List<Sensor> getAll(Integer nodeId);

    List<Sensor> getByType(String typeString);

    List<Sensor> getAll();

    Sensor get(Sensor sensor);

    Sensor get(Integer id);

    Sensor get(Integer nodeId, Integer sensorId);

    Dao<Sensor, Integer> getDao();
}
