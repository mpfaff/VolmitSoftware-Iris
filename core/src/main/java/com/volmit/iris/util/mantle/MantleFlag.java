/*
 * Iris is a World Generator for Minecraft Bukkit Servers
 * Copyright (c) 2022 Arcane Arts (Volmit Software)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package com.volmit.iris.util.mantle;

import com.volmit.iris.util.collection.StateList;

public enum MantleFlag {
    OBJECT,
    UPDATE,
    JIGSAW,
    FEATURE,
    INITIAL_SPAWNED,
    REAL,
    CARVED,
    FLUID_BODIES,
    INITIAL_SPAWNED_MARKER,
    CLEANED,
    PLANNED,
    ETCHED,
    TILE,
    CUSTOM,
    DISCOVERED,
    CUSTOM_ACTIVE;

    static StateList getStateList() {
        return new StateList(MantleFlag.values());
    }
}
